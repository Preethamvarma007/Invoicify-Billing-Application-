package com.billingapplication.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") // Allow all paths
				.allowedOrigins("http://localhost:3000") // Allow your React app's origin
				.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allow HTTP methods
				.allowedHeaders("*"); // Allow all headers
	}
}