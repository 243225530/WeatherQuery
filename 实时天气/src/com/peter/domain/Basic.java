package com.peter.domain;

/**
 * ������Ϣ
 * 
 * @author Administrator
 * 
 */
public class Basic {
	private String city;// ��������
	private String cnty;// ����
	private String id;// ����ID
	private String lat;// ����ά��
	private String lon;// ���о���
	private Update update;

	public Update getUpdate() {
		return update;
	}

	public void setUpdate(Update update) {
		this.update = update;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCnty() {
		return cnty;
	}

	public void setCnty(String cnty) {
		this.cnty = cnty;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	/**
	 * ����ʱ��
	 * 
	 * @author Administrator
	 * 
	 */
	public class Update {
		private String loc;// ����ʱ��
		private String utc;// UTCʱ��

		public String getLoc() {
			return loc;
		}

		public void setLoc(String loc) {
			this.loc = loc;
		}

		public String getUtc() {
			return utc;
		}

		public void setUtc(String utc) {
			this.utc = utc;
		}
	}
}
