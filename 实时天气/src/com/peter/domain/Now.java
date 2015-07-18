package com.peter.domain;

/**
 * 实况天气
 * 
 * @author Administrator
 * 
 */
public class Now {
	private String fl;// 体感温度
	private String hum;// 相对湿度（%）
	private String pcpn;// 降水量（mm）
	private String pres;// 气压
	private String tmp;// 温度
	private String vis;// 能见度（km）
	private Cond cond;
	private Wind wind;
	

	public Cond getCond() {
		return cond;
	}

	public void setCond(Cond cond) {
		this.cond = cond;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public String getFl() {
		return fl;
	}

	public void setFl(String fl) {
		this.fl = fl;
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

	public String getVis() {
		return vis;
	}

	public void setVis(String vis) {
		this.vis = vis;
	}

	/**
	 * 天气状况
	 * 
	 * @author Administrator
	 * 
	 */
	public class Cond {
		private String code;// 天气状况代码
		private String txt;// 天气状况描述

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getTxt() {
			return txt;
		}

		public void setTxt(String txt) {
			this.txt = txt;
		}
	}

	/**
	 * 风力风向
	 * 
	 * @author Administrator
	 * 
	 */
	public class Wind {
		private String deg;// 风向（360度）
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
