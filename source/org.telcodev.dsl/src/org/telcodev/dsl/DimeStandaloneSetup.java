
package org.telcodev.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DimeStandaloneSetup extends DimeStandaloneSetupGenerated{

	public static void doSetup() {
		new DimeStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

