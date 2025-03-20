package com.example.PROA.Backend;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Data {
	
	@Column(nullable=true, name="AirT_inst")
	double variable1;
	
	@Column(nullable=true, name="GHI_inst")
	double variable2;
	
	@Id
	String timestamp;
	
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Data(double variable1, double variable2, String timestamp) {
		super();
		this.variable1 = variable1;
		this.variable2 = variable2;
		this.timestamp = timestamp;
	}

	public double getVariable1() {
		return variable1;
	}

	public void setVariable1(double variable1) {
		this.variable1 = variable1;
	}

	public double getVariable2() {
		return variable2;
	}

	public void setVariable2(double variable2) {
		this.variable2 = variable2;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Data [variable1=" + variable1 + ", variable2=" + variable2 + ", timestamp=" + timestamp + "]";
	}
	
}
