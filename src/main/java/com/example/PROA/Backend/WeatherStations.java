package com.example.PROA.Backend;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="weatherstations")
public class WeatherStations {
	@Id
	int id;
	String name;
	String site;
	String portfolio;
	String state;
	double latitude;
	double longitude;
	
	
	public WeatherStations() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WeatherStations(int id, String name, String site, String portfolio, String state, double latitude,
			double longitude) {
		super();
		this.id = id;
		this.name = name;
		this.site = site;
		this.portfolio = portfolio;
		this.state = state;
		this.latitude = latitude;
		this.longitude = longitude;
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

	@Override
	public String toString() {
		return "WeatherStations [id=" + id + ", name=" + name + ", site=" + site + ", portfolio=" + portfolio
				+ ", state=" + state + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
}
