package com.greedy.section01.singleton.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {
	
	@Bean
	public Product beef() {
		return new Meat("소고기", 9900, "400g");
	}
	@Bean
	public Product pork() {
		return new Meat("돼지고기", 8800, "200g");
	}
	@Bean
	public Product lettuce() {
		return new Vegetable("상추", 3000, "100g");
	}
	@Bean
	public Product Cabbage() {
		return new Vegetable("배추", 5000, "1000g");
	}
	@Bean
	public Product indianbob() {
		return new Snacks("인디안밥", 2000, "100g");
	}
	@Bean
	public Product homerunball() {
		return new Snacks("홈런볼", 3000, "250g");
	}
	
	@Bean
	@Scope("prototype")
	public Shoopingcard cart() {
		return new Shoopingcard();
	}
}
