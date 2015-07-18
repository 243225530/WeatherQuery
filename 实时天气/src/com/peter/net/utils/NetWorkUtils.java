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
	 * 获取到的信息存储到HeWeatherData中
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
		// 获取HeWeather data service 3.0 JSON数组
		JSONArray jsonArray = jsonObject
				.getJSONArray("HeWeather data service 3.0");
		// 遍历JSOnArray数组，不过由于数组长度为1，所有我没有使用List来存储HeWeatherData
		for (int i = 0; i < jsonArray.length(); i++) {
			if (RESPONSE_STATUS_OK.equals(jsonArray.getJSONObject(i).getString(
					"status"))) {

				// 将HeWeather data service
				// 3.0也就是整个JSON数据通过Gson解析成HeWeatherData数据，但是数组好像不能解析
				// 将JSONObject对象通过toString()方法可以直接获取到里面的数据(value)
				String str = jsonArray.getJSONObject(i).toString();
				// 通过Gson的fromJson方法来将整个的数据存放到HeWeatherData对象中(JSon数据放不进去)
				heWeatherData = gson.fromJson(str, HeWeatherData.class);

				// 解决JSON数组数据不能直接存入的问题
				// 获取JSon数组，遍历它，类似于上一层循环，将数据放到定义好的对象中
				JSONArray jsonDailyForecastArray = jsonArray.getJSONObject(i)
						.getJSONArray("daily_forecast");
				dailyForecasts = new DailyForecast[jsonDailyForecastArray
						.length()];
//				Log.d("长度", "" + jsonDailyForecastArray.length());
				for (int j = 0; j < jsonDailyForecastArray.length(); j++) {
					String strDailyForecast = jsonDailyForecastArray
							.getJSONObject(j).toString();
					dailyForecasts[j] = gson.fromJson(strDailyForecast,
							DailyForecast.class);
				}
				// 将对象数组写进HeWeatherData中
				heWeatherData.setDailyForecast(dailyForecasts);

				// HourlyForecasts是一个数组，不能直接进入heWeatherData中,所以我们手动添加HourlyForecasts到其中
				JSONArray jsonHourlyForecastArray = jsonArray.getJSONObject(i)
						.getJSONArray("hourly_forecast");
				hourlyForecasts = new HourlyForecast[jsonHourlyForecastArray
						.length()];
//				Log.d("长度", "" + jsonHourlyForecastArray.length());
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
		 * 这个JSONObject才是真的有效的信息 JSONObject jsonHeader =
		 * jsonArray.getJSONObject(i); JSONObject jsonAqi =
		 * jsonHeader.getJSONObject("aqi"); String strAqi =
		 * jsonHeader.getString("aqi"); Gson gson =new Gson(); aqi =
		 * gson.fromJson(strAqi, Aqi.class); System.out.println(aqi); aqiCity
		 * =parseJSONByGSON(jsonAqi); 这种方法是可行的 String city =
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
