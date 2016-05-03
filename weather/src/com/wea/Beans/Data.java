package com.wea.Beans;

import java.util.Date;

public class Data {

	private int id;
	private Date date;
	private String time;
	private float temperature;
	private float humidity;
	private float SO2;
	private float O3;
	private float dust;
	private float voice;
	private String path;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getSO2() {
		return SO2;
	}
	public void setSO2(float sO2) {
		SO2 = sO2;
	}
	public float getO3() {
		return O3;
	}
	public void setO3(float o3) {
		O3 = o3;
	}
	
	public float getDust() {
		return dust;
	}
	public void setDust(float dust) {
		this.dust = dust;
	}
	public float getVoice() {
		return voice;
	}
	public void setVoice(float voice) {
		this.voice = voice;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	
}
