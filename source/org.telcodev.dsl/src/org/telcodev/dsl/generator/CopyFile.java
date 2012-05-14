package org.telcodev.dsl.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CopyFile {

	public static String readFile(String url) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String linea = "";
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(url);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero

			String ultima;

			while ((ultima = br.readLine()) != null) {

				linea = linea + ultima;

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();

				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
		return linea;
	}

}
