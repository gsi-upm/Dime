package org.telcodev.dsl.generator;

public class Config {
	private String language;
	private String scriptLanguage;
	private String url;
	private Tropo tropo;
	private Twilio twilio;
	private VoiceXML vxml;
	public Config(String language, String scriptLanguage, String url,
			Tropo tropo, Twilio twilio, VoiceXML vxml) {
		super();
		this.language = language;
		this.scriptLanguage = scriptLanguage;
		this.url = url;
		this.tropo = tropo;
		this.twilio = twilio;
		this.vxml = vxml;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getScriptLanguage() {
		return scriptLanguage;
	}
	public void setScriptLanguage(String scriptLanguage) {
		this.scriptLanguage = scriptLanguage;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Tropo getTropo() {
		return tropo;
	}
	public void setTropo(Tropo tropo) {
		this.tropo = tropo;
	}
	public Twilio getTwilio() {
		return twilio;
	}
	public void setTwilio(Twilio twilio) {
		this.twilio = twilio;
	}
	public VoiceXML getVxml() {
		return vxml;
	}
	public void setVxml(VoiceXML vxml) {
		this.vxml = vxml;
	}
	@Override
	public String toString() {
		return "Config [language=" + language + ", scriptLanguage="
				+ scriptLanguage + ", url=" + url + ", tropo=" + tropo
				+ ", twilio=" + twilio + ", vxml=" + vxml + "]";
	}

	
}
