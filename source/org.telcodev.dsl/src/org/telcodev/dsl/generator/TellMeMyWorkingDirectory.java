package org.telcodev.dsl.generator;

public class TellMeMyWorkingDirectory {
	public static String where() {

		return (new java.io.File("").getAbsolutePath())
				+ TellMeMyWorkingDirectory.class.getClassLoader()
						.getResource("").getPath();
	}
}