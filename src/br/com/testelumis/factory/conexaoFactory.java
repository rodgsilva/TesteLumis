package br.com.testelumis.factory;

import java.sql.Connection;

public class conexaoFactory {
	private static final String USUARIO = "root";
	private static final String SENHA =	"root";
	private static final String URL = "jdbc:mysql://localhost:3306/dblumis";
	
	public static Connection connection() {
		return null;
	}

}
