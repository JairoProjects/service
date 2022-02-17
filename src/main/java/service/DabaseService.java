package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import modelo.Student;
import repository.H2repo;

@Service
@Profile("A")
public class DabaseService implements MyDatabase {
	@Autowired
	H2repo repo;

	public void insert(Student student) {
		System.out.println("simulando el metodo insertar de la base de datos");
		repo.insertar(student);

	}

	public void nollamar() {
		// TODO Auto-generated method stub

	}

}
