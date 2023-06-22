package com.greedy.section01.singleton.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(ContextConfiguration.class);
		String[] beanNames = context.getBeanDefinitionNames();
		
		Product beef =context.getBean("beef", Meat.class);
		Product pork =context.getBean("pork", Meat.class);
		Product lettuce =context.getBean("lettuce", Vegetable.class);
		Product Cabbage =context.getBean("Cabbage", Vegetable.class);
		Product indianbob =context.getBean("indianbob", Snacks.class);
		Product homerunball =context.getBean("homerunball", Snacks.class);
		
		Shoopingcard minyoung = context.getBean("cart", Shoopingcard.class);
		Shoopingcard minji= context.getBean("cart", Shoopingcard.class);
		
		minyoung.addItem(pork);
		minyoung.addItem(beef);
		
		System.out.println("minyoung:");
		minyoung.getItems();
		
		
		minji.addItem(pork);
		minji.addItem(Cabbage);
		
		minji.addItem(homerunball);
		
		System.out.println("minji:");
		minji.getItems();
		
		System.out.println("price:");
		minji.addPay();
		
		
	}

}
