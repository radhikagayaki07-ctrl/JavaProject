package com.radhika.usedcars11.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.radhika.usedcars11.entities.UsedCar;

@Repository
public interface UsedCarsRepo extends JpaRepository<UsedCar, Integer> {

	

}
