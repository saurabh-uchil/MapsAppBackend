package com.example.PROA.Backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherStationsRepo extends JpaRepository<WeatherStations, Integer>{

}
