package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class Example1 {

	public static void main(String[] args) {
		
		var ctx=new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Vehicle veh=ctx.getBean(Vehicle.class);
		String hello=ctx.getBean(String.class);
		Integer number = ctx.getBean(Integer.class);
		System.out.println("Vehicle name from spring context is :"+ veh.getName());
		System.out.println("Vehicle name from spring context is :"+ hello);
		System.out.println("Vehicle name from spring context is :"+ number);

	}

}
