package org.telcodev.dsl.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.telcodev.dsl.generator.Config;
import org.telcodev.dsl.generator.PhpGenerator;
import org.telcodev.dsl.generator.XMLfile;

@SuppressWarnings("all")
public class DimeGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
      Config _readConfig = XMLfile.readConfig("res/config.xml");
      Config config = _readConfig;
      boolean _operator_and = false;
      String _language = config.getLanguage();
      boolean _operator_equals = ObjectExtensions.operator_equals(_language, "tropo");
      if (!_operator_equals) {
        _operator_and = false;
      } else {
        String _languageGenerated = config.getLanguageGenerated();
        boolean _operator_equals_1 = ObjectExtensions.operator_equals(_languageGenerated, "php");
        _operator_and = BooleanExtensions.operator_and(_operator_equals, _operator_equals_1);
      }
      if (_operator_and) {
        String _languageGenerated_1 = config.getLanguageGenerated();
        boolean _operator_equals_2 = ObjectExtensions.operator_equals(_languageGenerated_1, "php");
        if (_operator_equals_2) {
          PhpGenerator.generateTropoPhp(resource, fsa, config);
        }
      }
  }
}
