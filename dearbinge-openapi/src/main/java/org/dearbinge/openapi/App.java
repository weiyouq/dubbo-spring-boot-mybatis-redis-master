package org.dearbinge.openapi;

import org.springframework.boot.SpringApplication;

import com.dearbinge.openapi.ParkingSpotDataTrans;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.dearbinge.*")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(ParkingSpotDataTrans.class, args);
	}
}
