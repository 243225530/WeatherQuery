package com.peter.domain;

/**
 * ÿСʱ����Ԥ������ѽӿ�Ϊÿ��СʱԤ��
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

	private String date;// ʱ��
	private String hum;// ���ʪ�ȣ�%��
	private String pop;// ��ˮ����
	private String pres;// ��ѹ
	private String tmp;// �¶�
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
	 * ��������
	 * 
	 * @author Administrator
	 * 
	 */
	public class Wind {
		private String deg;// ����360��
		private String dir;// /����
		private String sc;// ����
		private String spd;// ���٣�kmph��

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
