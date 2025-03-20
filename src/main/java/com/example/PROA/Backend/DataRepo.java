package com.example.PROA.Backend;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DataRepo extends JpaRepository<Data, String>{
	
	@Query(value = "SELECT * FROM data_?1 ORDER BY timestamp DESC LIMIT 1", nativeQuery = true)
    List<Object> findAllRows(@Param("tableNumber") int tableNumber);

}

	
