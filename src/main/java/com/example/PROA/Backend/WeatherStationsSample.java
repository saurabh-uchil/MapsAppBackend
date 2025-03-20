package com.example.PROA.Backend;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@Component
public class WeatherStationsSample {
	@Id
	int id;
	
	@Column(name="ws_name")
	String name;
	
	String site;
	String portfolio;
	String state;
	double latitude;
	double longitude;
	List<Variables> variables;
	List<Object> data;
	
	public WeatherStationsSample() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WeatherStationsSample(int id, String name, String site, String portfolio, String state, double latitude,
			double longitude, List<Variables>variables,  List<Object>data) {
		super();
		this.id = id;
		this.name = name;
		this.site = site;
		this.portfolio = portfolio;
		this.state = state;
		this.latitude = latitude;
		this.longitude = longitude;
		this.variables = variables;
		this.data = data;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public List<Variables> getVariables() {
		return variables;
	}

	public void setVariables(List<Variables> variables) {
		this.variables = variables;
	}
	
	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "WeatherStationsSample [id=" + id + ", name=" + name + ", site=" + site + ", portfolio=" + portfolio
				+ ", state=" + state + ", latitude=" + latitude + ", longitude=" + longitude + ", variables="
				+ variables + ", data=" + data + "]";
	}

}
