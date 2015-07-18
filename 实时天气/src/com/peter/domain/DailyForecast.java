package com.peter.domain;

/**
 * 7������Ԥ��
 * 
 * @author Administrator
 * 
 */
public class DailyForecast {
	private String date;// Ԥ������
	private String hum;// ���ʪ�ȣ�%��
	private String pcpn;// ��ˮ����mm��
	private String pop;// ��ˮ����
	private String pres;// ��ѹ
	private String vis;// �ܼ��ȣ�km��
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
	 * ������ֵ
	 * 
	 * @author Administrator
	 * 
	 */
	public class Astro {
		private String sr;// �ճ�ʱ��
		private String ss;// ����ʱ��

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
	 * ����״��
	 * 
	 * @author Administrator
	 * 
	 */
	public class Cond {
		private String code_d;// ��������״������
		private String code_n;// ҹ������״������
		private String txt_d;// ��������״������
		private String txt_n;// ҹ������״������

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
	 * �¶�
	 * 
	 * @author Administrator
	 * 
	 */
	 public class Temp {
		private String max;// ����¶�
		private String min;// ����¶�

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
	 * ��������
	 * 
	 * @author Administrator
	 * 
	 */
	public class Wind {
		private String deg;// "339", //����360�ȣ�
		private String dir;// ����
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
