package org.telcodev.dsl.generator;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLfile {

	public static Config readConfig(String uri) {
		// get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		Tropo tropo ;
		Twilio twilio;
		VoiceXML vxml;

		try {

			// Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();

			// parse using builder to get DOM representation of the XML file
			Document dom = db.parse(uri);

			Element docEle = dom.getDocumentElement();

			String language = getTextValue(docEle, "language");
			String scriptlanguage = getTextValue(docEle, "scriptlanguage");
			String url = getTextValue(docEle, "url");
			if (language.equals("tropo")) {
				tropo = new Tropo(getTextVoiceValue(docEle, "voice", language),getTextVoiceValue(docEle, "user", language),getTextVoiceValue(docEle, "token", language),getTextVoiceValue(docEle, "password", language));
				twilio = new Twilio();
				vxml= new VoiceXML();
			}else if(language.equals("twilio")){
				tropo= new Tropo();
				vxml= new VoiceXML();
				twilio = new Twilio(getTextVoiceValue(docEle, "voice", language), getTextVoiceValue(docEle, "language", language), getTextVoiceValue(docEle, "number", language), getTextVoiceValue(docEle, "accountSid", language), getTextVoiceValue(docEle, "token", language));
			}else{
				tropo=new Tropo();
				twilio= new Twilio();
				vxml = new VoiceXML(getTextVoiceValue(docEle, "token", language),getTextVoiceValue(docEle, "language", language), getTextVoiceValue(docEle, "user", language),getTextVoiceValue(docEle, "password", language),getTextVoiceValue(docEle, "botkey", language),getTextVoiceValue(docEle, "number", language));
			}

			Config conf = new Config(language, scriptlanguage, url, tropo,
					twilio, vxml);
			System.out.println(conf.toString());
			return conf;

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (SAXException se) {
			se.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return null;
	}

	private static String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if (nl != null && nl.getLength() > 0) {
			Element el = (Element) nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}

		return textVal;
	}

	private static String getTextVoiceValue(Element ele, String tagName,
			String langName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(langName);
		if (nl != null && nl.getLength() > 0) {
			Element el = (Element) nl.item(0);

			NodeList nl2 = el.getElementsByTagName(tagName);
			if (nl2 != null && nl2.getLength() > 0) {
				Element el2 = (Element) nl2.item(0);
				textVal = el2.getFirstChild().getNodeValue();
			}

		}

		return textVal;
	}

}