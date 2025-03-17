package com.example.PROA.Backend;

import org.springframework.stereotype.Component;

@Component
public class Data {
	double GHI_inst;
	double AirT_inst;
	String timestamp;
	
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Data(double gHI_inst, double airT_inst, String timestamp) {
		super();
		GHI_inst = gHI_inst;
		AirT_inst = airT_inst;
		this.timestamp = timestamp;
	}
	public double getGHI_inst() {
		return GHI_inst;
	}
	public void setGHI_inst(double gHI_inst) {
		GHI_inst = gHI_inst;
	}
	public double getAirT_inst() {
		return AirT_inst;
	}
	public void setAirT_inst(double airT_inst) {
		AirT_inst = airT_inst;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Data [GHI_inst=" + GHI_inst + ", AirT_inst=" + AirT_inst + ", timestamp=" + timestamp + "]";
	}
	
}
