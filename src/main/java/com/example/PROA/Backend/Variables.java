package com.example.PROA.Backend;

import org.springframework.stereotype.Component;

@Component
public class Variables {
	int var_id;
	int id;
	String name;
	String unit;
	String long_name;
	
	public Variables() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Variables(int var_id, int id, String name, String unit, String long_name) {
		super();
		this.var_id = var_id;
		this.id = id;
		this.name = name;
		this.unit = unit;
		this.long_name = long_name;
	}

	public int getVar_id() {
		return var_id;
	}

	public void setVar_id(int var_id) {
		this.var_id = var_id;
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

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getLong_name() {
		return long_name;
	}

	public void setLong_name(String long_name) {
		this.long_name = long_name;
	}

	@Override
	public String toString() {
		return "Variables [var_id=" + var_id + ", id=" + id + ", name=" + name + ", unit=" + unit + ", long_name="
				+ long_name + "]";
	}
	
	
	
	
}
