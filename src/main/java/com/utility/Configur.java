package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configur {

	public Properties prop;

	public Properties initialized_prop() {
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(
					"./src/test/resources/confi/condigg.properties");
			prop.load(file);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}

		return prop;
	}
}
