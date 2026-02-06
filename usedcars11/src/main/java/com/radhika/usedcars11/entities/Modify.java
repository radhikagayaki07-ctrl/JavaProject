package com.radhika.usedcars11.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="modcars")
public class Modify {
	
	@Id
	@Column(name="carid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int carId;
	
	@Column(nullable=false)
	private String brand;
	
	@Column(nullable=false)
	private String model;
	
	@Column(name="mfgyear",nullable=false)
	private int mfgYear;
	
	@Column(name="kilometers",nullable=false)
	private int kilometers;
	
	@Column(name="fueltype", nullable=false)
	private String fuelType;
	
	@Column(nullable=false)
	private String color;
	
	private String status="AVAILABLE";
		
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMfgYear() {
		return mfgYear;
	}
	public void setMfgYear(int mfgYear) {
		this.mfgYear = mfgYear;
	}
	public int getKilometers() {
		return kilometers;
	}
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
