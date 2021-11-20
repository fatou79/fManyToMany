package com.fatou.ManyToMany2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyToMany2Application implements CommandLineRunner {
	
	@Autowired
	StudentRepository sr;

	public static void main(String[] args) {
		SpringApplication.run(ManyToMany2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		sr.inserHardcodesStudentANDCOURSE();
		
	}

}
