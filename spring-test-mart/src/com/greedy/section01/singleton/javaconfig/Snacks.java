package com.greedy.section01.singleton.javaconfig;

public class Snacks extends Product {
	
	private String capacity;

	public Snacks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Snacks(String name, int price, String capacity) {
		super(name, price);
		this.capacity = capacity;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Snacks [capacity=" + capacity + "]";
	}
	
	
}
