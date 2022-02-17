package service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import modelo.Student;

@Service
@Profile("B")
public class AnotherDatabaseService implements MyDatabase {


	public void insert(Student student) {
		System.out.println("ejecutando el servicio alternativo");
	}

}
