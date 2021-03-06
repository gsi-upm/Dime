package org.telcodev.dsl.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.telcodev.dsl.generator.Config;
import org.telcodev.dsl.generator.Tropo_php_generator;
import org.telcodev.dsl.generator.Twilio_php_generator;
import org.telcodev.dsl.generator.VoiceXML_generator;
import org.telcodev.dsl.generator.XMLfile;

@SuppressWarnings("all")
public class DimeGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Config config = XMLfile.readConfig("res/config.xml");
    String _language = config.getLanguage();
    boolean _equals = Objects.equal(_language, "tropo");
    if (_equals) {
      String _scriptLanguage = config.getScriptLanguage();
      boolean _equals_1 = Objects.equal(_scriptLanguage, "php");
      if (_equals_1) {
        Tropo_php_generator.generateTropoPhp(resource, fsa, config);
      }
    } else {
      String _language_1 = config.getLanguage();
      boolean _equals_2 = Objects.equal(_language_1, "twilio");
      if (_equals_2) {
        String _scriptLanguage_1 = config.getScriptLanguage();
        boolean _equals_3 = Objects.equal(_scriptLanguage_1, "php");
        if (_equals_3) {
          Twilio_php_generator.generateTwilioPhp(resource, fsa, config);
        }
      } else {
        String _scriptLanguage_2 = config.getScriptLanguage();
        boolean _equals_4 = Objects.equal(_scriptLanguage_2, "vxml");
        if (_equals_4) {
          VoiceXML_generator.generateVoiceXML(resource, fsa, config);
        }
      }
    }
  }
}
