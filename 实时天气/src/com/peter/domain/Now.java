package com.peter.domain;

/**
 * ʵ������
 * 
 * @author Administrator
 * 
 */
public class Now {
	private String fl;// ����¶�
	private String hum;// ���ʪ�ȣ�%��
	private String pcpn;// ��ˮ����mm��
	private String pres;// ��ѹ
	private String tmp;// �¶�
	private String vis;// �ܼ��ȣ�km��
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
	 * ����״��
	 * 
	 * @author Administrator
	 * 
	 */
	public class Cond {
		private String code;// ����״������
		private String txt;// ����״������

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
	 * ��������
	 * 
	 * @author Administrator
	 * 
	 */
	public class Wind {
		private String deg;// ����360�ȣ�
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
