package com.globomatics.bike.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.globomatics.bike.models.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {
	
	
	
    @Query("SELECT b.id,b.name,bd.country FROM Bike b JOIN BikeDetail bd on  b.id= bd.bikeId")
     List<Bike> l();
    
    


}
