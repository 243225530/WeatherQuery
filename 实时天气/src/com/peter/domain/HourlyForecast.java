package com.peter.domain;

/**
 * 每小时天气预报，免费接口为每三小时预报
 * 
 * @author Administrator
 * 
 */
public class HourlyForecast {
	@Override
	public String toString() {
		return "HourlyForecast [zhend?date=" + date + ", hum=" + hum + ", pop=" + pop
				+ ", pres=" + pres + ", tmp=" + tmp + ", wind=" + wind + "]";
	}

	private String date;// 时间
	private String hum;// 相对湿度（%）
	private String pop;// 降水概率
	private String pres;// 气压
	private String tmp;// 温度
	private Wind wind;

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHum() {
		return hum;
	}

	public void setHum(String hum) {
		this.hum = hum;
	}

	public String getPop() {
		return pop;
	}

	public void setPop(String pop) {
		this.pop = pop;
	}

	public String getPres() {
		return pres;
	}

	public void setPres(String pres) {
		this.pres = pres;
	}

	public String getTmp() {
		return tmp;
	}

	public void setTmp(String tmp) {
		this.tmp = tmp;
	}

	/**
	 * 风力风向
	 * 
	 * @author Administrator
	 * 
	 */
	public class Wind {
		private String deg;// 风向（360度
		private String dir;// /风向
		private String sc;// 风力
		private String spd;// 风速（kmph）

		public String getDeg() {
			return deg;
		}

		public void setDeg(String deg) {
			this.deg = deg;
		}

		public String getDir() {
			return dir;
		}

		public void setDir(String dir) {
			this.dir = dir;
		}

		public String getSc() {
			return sc;
		}

		public void setSc(String sc) {
			this.sc = sc;
		}

		public String getSpd() {
			return spd;
		}

		public void setSpd(String spd) {
			this.spd = spd;
		}
	}
}
