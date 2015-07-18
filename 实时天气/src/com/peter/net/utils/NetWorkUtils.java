package com.peter.net.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import com.google.gson.Gson;
import com.peter.domain.*;

public class NetWorkUtils {

	private static final String RESPONSE_STATUS_OK = "ok";
	private static final String RESPONSE_STATUS_ERROR = "unknown_city";

	/**
	 * ��ȡ������Ϣ�洢��HeWeatherData��
	 * 
	 * @param jsonData
	 * @throws JSONException
	 */
	public static HeWeatherData parseJSONByGSON(String jsonData)
			throws JSONException {
		HeWeatherData heWeatherData = new HeWeatherData();
		DailyForecast[] dailyForecasts;
		HourlyForecast[] hourlyForecasts;
		Gson gson = new Gson();

		JSONObject jsonObject = new JSONObject(jsonData);
		// ��ȡHeWeather data service 3.0 JSON����
		JSONArray jsonArray = jsonObject
				.getJSONArray("HeWeather data service 3.0");
		// ����JSOnArray���飬�����������鳤��Ϊ1��������û��ʹ��List���洢HeWeatherData
		for (int i = 0; i < jsonArray.length(); i++) {
			if (RESPONSE_STATUS_OK.equals(jsonArray.getJSONObject(i).getString(
					"status"))) {

				// ��HeWeather data service
				// 3.0Ҳ��������JSON����ͨ��Gson������HeWeatherData���ݣ�������������ܽ���
				// ��JSONObject����ͨ��toString()��������ֱ�ӻ�ȡ�����������(value)
				String str = jsonArray.getJSONObject(i).toString();
				// ͨ��Gson��fromJson�����������������ݴ�ŵ�HeWeatherData������(JSon���ݷŲ���ȥ)
				heWeatherData = gson.fromJson(str, HeWeatherData.class);

				// ���JSON�������ݲ���ֱ�Ӵ��������
				// ��ȡJSon���飬����������������һ��ѭ���������ݷŵ�����õĶ�����
				JSONArray jsonDailyForecastArray = jsonArray.getJSONObject(i)
						.getJSONArray("daily_forecast");
				dailyForecasts = new DailyForecast[jsonDailyForecastArray
						.length()];
//				Log.d("����", "" + jsonDailyForecastArray.length());
				for (int j = 0; j < jsonDailyForecastArray.length(); j++) {
					String strDailyForecast = jsonDailyForecastArray
							.getJSONObject(j).toString();
					dailyForecasts[j] = gson.fromJson(strDailyForecast,
							DailyForecast.class);
				}
				// ����������д��HeWeatherData��
				heWeatherData.setDailyForecast(dailyForecasts);

				// HourlyForecasts��һ�����飬����ֱ�ӽ���heWeatherData��,���������ֶ����HourlyForecasts������
				JSONArray jsonHourlyForecastArray = jsonArray.getJSONObject(i)
						.getJSONArray("hourly_forecast");
				hourlyForecasts = new HourlyForecast[jsonHourlyForecastArray
						.length()];
//				Log.d("����", "" + jsonHourlyForecastArray.length());
				for (int j = 0; j < jsonHourlyForecastArray.length(); j++) {
					String strHourlyForecast = jsonHourlyForecastArray
							.getJSONObject(j).toString();
					hourlyForecasts[j] = gson.fromJson(strHourlyForecast,
							HourlyForecast.class);
				}
				heWeatherData.setHourlyForecast(hourlyForecasts);

			} else if (RESPONSE_STATUS_ERROR.equals(jsonArray.getJSONObject(i)
					.getString("status"))) {
				return null;
			}
		}
		/*
		 * ���JSONObject���������Ч����Ϣ JSONObject jsonHeader =
		 * jsonArray.getJSONObject(i); JSONObject jsonAqi =
		 * jsonHeader.getJSONObject("aqi"); String strAqi =
		 * jsonHeader.getString("aqi"); Gson gson =new Gson(); aqi =
		 * gson.fromJson(strAqi, Aqi.class); System.out.println(aqi); aqiCity
		 * =parseJSONByGSON(jsonAqi); ���ַ����ǿ��е� String city =
		 * jsonAqi.getString("city"); System.out.println(city); Gson gson =new
		 * Gson(); aqiCity = gson.fromJson(city, Aqi.City.class);
		 * System.out.println(aqiCity); String strBasic =
		 * jsonHeader.getString("basic"); System.out.println(strBasic);
		 * gson.fromJson(json, classOfT) heWeatherData.getAqi()
		 */
		return heWeatherData;
	}

	//
	public static Object parseJSONByGSON(JSONObject jsonObject, Object obj) {
		Gson gson = new Gson();
		gson.toJson(jsonObject, Object.class);
		return gson;

	}
}
