package com.db.DataBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.db.DataBase.Model.DataModel;
import com.db.DataBase.Repository.DataRepository;

@SpringBootApplication
public class DataBaseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DataBaseApplication.class, args);
	}
	
	@Autowired
	private DataRepository dataRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		DataModel student1 = new DataModel("john", "jack", "john@gmail.com");
		dataRepository.save(student1);
		
		DataModel student2 = new DataModel("joh", "jak", "joh@gmail.com");
		dataRepository.save(student2);
		
		DataModel student3 = new DataModel("jon", "jac", "jon@gmail.com");
		dataRepository.save(student3);
		
	}

}
