package com.solid;

public class Test {

	public static void main(String[] args) {
		
		VehicleInfo vehicleInfo = new VehicleInfo();
		int vehicleNumber = vehicleInfo.vehicleNumber(new Truck());
		System.out.println(vehicleNumber);
	}
}
