package com.peter.domain;

import java.util.Arrays;

/**
 * 从服务端获取的信息
 * 
 * @author Administrator
 * 
 */
public class HeWeatherData {
	private Aqi aqi;
	private Basic basic;
	private DailyForecast[] dailyForecast;
	private HourlyForecast[] hourlyForecast;
	private Now now;
	private String status;//
	private Suggestion suggestion;

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "HeWeatherData [aqi=" + aqi + ", basic=" + basic
				+ ", dailyForecast=" + Arrays.toString(dailyForecast)
				+ ", hourlyForecast=" + Arrays.toString(hourlyForecast)
				+ ", now=" + now + ", status=" + status + ", suggestion="
				+ suggestion + "]";
	}

	public void setDailyForecast(DailyForecast[] dailyForecast) {
		this.dailyForecast = dailyForecast;
	}

	public DailyForecast[] getDailyForecast() {
		return dailyForecast;
	}

	public HourlyForecast[] getHourlyForecast() {
		return hourlyForecast;
	}

	public void setHourlyForecast(HourlyForecast[] hourlyForecast) {
		this.hourlyForecast = hourlyForecast;
	}

	public Aqi getAqi() {
		return aqi;
	}

	public void setAqi(Aqi aqi) {
		this.aqi = aqi;
	}

	public Basic getBasic() {
		return basic;
	}

	public void setBasic(Basic basic) {
		this.basic = basic;
	}

	public Now getNow() {
		return now;
	}

	public void setNow(Now now) {
		this.now = now;
	}

	public Suggestion getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(Suggestion suggestion) {
		this.suggestion = suggestion;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
