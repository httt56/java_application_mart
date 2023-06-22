package com.greedy.section01.singleton.javaconfig;

import java.util.ArrayList;
import java.util.List;



public class Shoopingcard {
	 private final List<Product> items;

	public Shoopingcard() {
		this.items = new ArrayList<>();
	}

	public void getItems() {
		for(Product product : items) {
			System.out.println(product.getName());
		}
	}
	
	 public void addItem(Product item) {
	      this.items.add(item);
	   }
	 
	 public void addPay() {
		 int pp = 0;
		 for(Product product : items) {
				pp += product.getPrice();
			}
		 System.out.println(pp);
	 }
	   
	@Override
	public String toString() {
		return "Shoopingcard [items=" + items + "]";
	}
	 
	 
}
