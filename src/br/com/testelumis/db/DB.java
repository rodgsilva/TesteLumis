package br.com.testelumis.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class DB {
	private static final String USUARIO = "root";
	private static final String SENHA =	"root";
	private static final String URL = "jdbc:mysql://localhost:3306/dblumis";
	
	private static Properties loadProporties() {
		try(FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
	public static Connection connection() {
		return null;
	}

}
