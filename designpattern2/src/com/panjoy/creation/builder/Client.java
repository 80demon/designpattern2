package com.panjoy.creation.builder;

public class Client {
	public static void main(String[] args) {
		House.Builder builder = new House.Builder();
		builder.setBadRoom("27平米").setBookRoom("10平米").setCoookRoom("15")
				.setWcRoom("10");
		House house = builder.build();
		System.out.println(house);
	}
}
