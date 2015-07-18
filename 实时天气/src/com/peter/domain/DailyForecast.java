package com.peter.domain;

/**
 * 7天天气预报
 * 
 * @author Administrator
 * 
 */
public class DailyForecast {
	private String date;// 预报日期
	private String hum;// 相对湿度（%）
	private String pcpn;// 降水量（mm）
	private String pop;// 降水概率
	private String pres;// 气压
	private String vis;// 能见度（km）
	@Override
	public String toString() {
		return "DailyForecast [dasdasdadate=" + date + ", hum=" + hum + ", pcpn="
				+ pcpn + ", pop=" + pop + ", pres=" + pres + ", vis=" + vis
				+ ", astro=" + astro + ", cond=" + cond + ", temp=" + temp
				+ ", wind=" + wind + "]";
	}

	private Astro astro;
	private Cond cond;
	private Temp temp;
	private Wind wind;

	public Astro getAstro() {
		return astro;
	}

	public void setAstro(Astro astro) {
		this.astro = astro;
	}

	public Cond getCond() {
		return cond;
	}

	public void setCond(Cond cond) {
		this.cond = cond;
	}

	public Temp getTemp() {
		return temp;
	}

	public void setTemp(Temp temp) {
		this.temp = temp;
	}

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

	public String getPcpn() {
		return pcpn;
	}

	public void setPcpn(String pcpn) {
		this.pcpn = pcpn;
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

	public String getVis() {
		return vis;
	}

	public void setVis(String vis) {
		this.vis = vis;
	}

	/**
	 * 天文数值
	 * 
	 * @author Administrator
	 * 
	 */
	public class Astro {
		private String sr;// 日出时间
		private String ss;// 日落时间

		public String getSr() {
			return sr;
		}

		public void setSr(String sr) {
			this.sr = sr;
		}

		public String getSs() {
			return ss;
		}

		public void setSs(String ss) {
			this.ss = ss;
		}
	}

	/**
	 * 天气状况
	 * 
	 * @author Administrator
	 * 
	 */
	public class Cond {
		private String code_d;// 白天天气状况代码
		private String code_n;// 夜间天气状况代码
		private String txt_d;// 白天天气状况描述
		private String txt_n;// 夜间天气状况描述

		public String getCode_d() {
			return code_d;
		}

		public void setCode_d(String code_d) {
			this.code_d = code_d;
		}

		public String getCode_n() {
			return code_n;
		}

		public void setCode_n(String code_n) {
			this.code_n = code_n;
		}

		public String getTxt_d() {
			return txt_d;
		}

		public void setTxt_d(String txt_d) {
			this.txt_d = txt_d;
		}

		public String getTxt_n() {
			return txt_n;
		}

		public void setTxt_n(String txt_n) {
			this.txt_n = txt_n;
		}
	}

	/**
	 * 温度
	 * 
	 * @author Administrator
	 * 
	 */
	 public class Temp {
		private String max;// 最高温度
		private String min;// 最低温度

		public String getMax() {
			return max;
		}

		public void setMax(String max) {
			this.max = max;
		}

		public String getMin() {
			return min;
		}

		public void setMin(String min) {
			this.min = min;
		}
	}

	/**
	 * 风力风向
	 * 
	 * @author Administrator
	 * 
	 */
	public class Wind {
		private String deg;// "339", //风向（360度）
		private String dir;// 风向
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
