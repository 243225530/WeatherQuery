package com.peter.domain;
/**
 * ����ָ��
 * @author Administrator
 *
 */
public class Suggestion {
	
	private Comf comf;
	private Cw cw;
	private Drsg drsg;
	private Flu flu;
	private Sport sport;
	private Trav trav;
	private Uv uv;
	public Comf getComf() {
		return comf;
	}
	public void setComf(Comf comf) {
		this.comf = comf;
	}
	public Cw getCw() {
		return cw;
	}
	public void setCw(Cw cw) {
		this.cw = cw;
	}
	public Drsg getDrsg() {
		return drsg;
	}
	public void setDrsg(Drsg drsg) {
		this.drsg = drsg;
	}
	public Flu getFlu() {
		return flu;
	}
	public void setFlu(Flu flu) {
		this.flu = flu;
	}
	public Sport getSport() {
		return sport;
	}
	public void setSport(Sport sport) {
		this.sport = sport;
	}
	public Trav getTrav() {
		return trav;
	}
	public void setTrav(Trav trav) {
		this.trav = trav;
	}
	public Uv getUv() {
		return uv;
	}
	public void setUv(Uv uv) {
		this.uv = uv;
	}
	/**
	 * ���ʶ�ָ��
	 * @author Administrator
	 *
	 */
	public class Comf{
		private String brf;//���
		private String txt;// ��ϸ����

		public String getBrf() {
			return brf;
		}

		public void setBrf(String brf) {
			this.brf = brf;
		}

		public String getTxt() {
			return txt;
		}

		public void setTxt(String txt) {
			this.txt = txt;
		}
	}
	/**
	 * ϴ��ָ��
	 * @author Administrator
	 *
	 */
	public class Cw{
		private String brf;//���
		private String txt;//��ϸ����
		public String getBrf() {
			return brf;
		}
		public void setBrf(String brf) {
			this.brf = brf;
		}
		public String getTxt() {
			return txt;
		}
		public void setTxt(String txt) {
			this.txt = txt;
		}
	}
	/**
	 * ����ָ��
	 * @author Administrator
	 *
	 */
	public class Drsg{
		private String brf;//���
		private String txt;//��ϸ����
		public String getBrf() {
			return brf;
		}
		public void setBrf(String brf) {
			this.brf = brf;
		}
		public String getTxt() {
			return txt;
		}
		public void setTxt(String txt) {
			this.txt = txt;
		}
	}
	/**
	 * ��ðָ��
	 * @author Administrator
	 *
	 */
	public class Flu{
		private String brf;//���
		private String txt;//��ϸ����
		public String getBrf() {
			return brf;
		}
		public void setBrf(String brf) {
			this.brf = brf;
		}
		public String getTxt() {
			return txt;
		}
		public void setTxt(String txt) {
			this.txt = txt;
		}
	}
	/**
	 * �˶�ָ��
	 * @author Administrator
	 *
	 */
	public class Sport{
		private String brf;//���
		private String txt;//��ϸ����
		public String getBrf() {
			return brf;
		}
		public void setBrf(String brf) {
			this.brf = brf;
		}
		public String getTxt() {
			return txt;
		}
		public void setTxt(String txt) {
			this.txt = txt;
		}
	}
	/**
	 * ����ָ��
	 * @author Administrator
	 *
	 */
	public class Trav{
		private String brf;//���
		private String txt;//��ϸ����
		public String getBrf() {
			return brf;
		}
		public void setBrf(String brf) {
			this.brf = brf;
		}
		public String getTxt() {
			return txt;
		}
		public void setTxt(String txt) {
			this.txt = txt;
		}
	}
	/**
	 * ������ָ��
	 * @author Administrator
	 *
	 */
	public class Uv{
		private String brf;//���
		private String txt;//��ϸ����
		public String getBrf() {
			return brf;
		}
		public void setBrf(String brf) {
			this.brf = brf;
		}
		public String getTxt() {
			return txt;
		}
		public void setTxt(String txt) {
			this.txt = txt;
		}
		@Override
		public String toString() {
			return "Uv [brf=" + brf + ", txt=" + txt + "]";
		}
	}
}
