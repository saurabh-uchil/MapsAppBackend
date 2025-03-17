package com.example.PROA.Backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController {

	@Autowired
	WeatherStationsRepo weatherstationsRepo;
	
	
	@GetMapping("/weatherstations")
	public List<WeatherStations> showWeatherStations() {
		
		List<WeatherStations> weatherStationsList = weatherstationsRepo.findAll();
		return weatherStationsList;
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
