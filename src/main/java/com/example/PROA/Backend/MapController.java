package com.example.PROA.Backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController {

	@Autowired
	WeatherStationsRepo weatherstationsRepo;
	
	@Autowired
	VariablesRepo variablesRepo;
	
	@Autowired
	DataRepo dataRepo;
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/weatherstations")
	public List<WeatherStationsSample> getDetailedData() {
		List<WeatherStations> ws =  weatherstationsRepo.findAll();
		List<Variables> variables = variablesRepo.findAll();
		List<WeatherStationsSample> weatherStationList = new ArrayList<WeatherStationsSample>();
		
		for(WeatherStations station: ws) {
			
			List<Variables> vsList = new ArrayList<Variables>();
			for(Variables variable: variables) {
				
				if(station.getId() == variable.getId()) {
					Variables vs =  new Variables(variable.getVar_id(), variable.getId(), variable.getName(),variable.getUnit(), variable.getLong_name());
					vsList.add(vs);
				}
			}
			
			List<Object> dataList = dataRepo.findAllRows(station.getId());
			
			WeatherStationsSample wsSample = new WeatherStationsSample(station.getId(), station.getName(),station.getSite(), station.portfolio, station.getState(), station.getLatitude(), station.getLongitude(), vsList, dataList);
			weatherStationList.add(wsSample);
			}
		
		return weatherStationList; 
	}
}
