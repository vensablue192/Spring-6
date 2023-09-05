package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class Example2 {

	public static void main(String[] args) {
		
		var ctx=new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Vehicle veh=ctx.getBean("vehicle1",Vehicle.class);
		
		System.out.println("Vehicle name from spring context is :"+ veh.getName());
		

	}

}
