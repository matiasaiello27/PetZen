package com.petzen.petzen;

import org.hibernate.exception.JDBCConnectionException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetzenApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(PetzenApplication.class, args);
			System.out.println("Conexión realizada con éxito.");
		} catch (JDBCConnectionException e) {
			System.err.println("Hubo un error al querer conectarse a la base de datos.\n" + e.getLocalizedMessage());
		}

	}

}
