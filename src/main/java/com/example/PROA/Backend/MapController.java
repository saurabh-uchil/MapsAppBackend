package com.example.PROA.Backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController {

	
	@GetMapping("/weatherstations")
	public WeatherStations showWeatherStations() {
		WeatherStations ws1 =  new WeatherStations(1, "Cohuna North", "Cohuna Solar Farm", "Enel Green Power", "VIC", -35.882762, 144.217208);
		return ws1;
	}
	
	@GetMapping("/variables")
	public Variables showVariables() {
		Variables var1 = new Variables(11, 1, "AirT_inst", "Deg C", "Air Temp.");
		return var1;
	}
	
	@GetMapping("/data")
	public Data showData() {
		Data d1 = new Data(120.9, 21.88, "29/08/2023  2:05:00 AM" );
		return d1;
	}
}
