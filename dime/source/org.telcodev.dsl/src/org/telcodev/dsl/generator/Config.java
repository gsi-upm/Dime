package org.telcodev.dsl.generator;

public class Config {
	private String language;
	private String scriptLanguage;
	private String url;
	private Tropo tropo;
	private Twilio twilio;

	public Config(String language, String scriptLanguage, String url,
			Tropo tropo, Twilio twilio) {
		super();
		this.language = language;
		this.scriptLanguage = scriptLanguage;
		this.url = url;
		this.tropo = tropo;
		this.twilio = twilio;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((language == null) ? 0 : language.hashCode());
		result = prime * result
				+ ((scriptLanguage == null) ? 0 : scriptLanguage.hashCode());
		result = prime * result + ((tropo == null) ? 0 : tropo.hashCode());
		result = prime * result + ((twilio == null) ? 0 : twilio.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Config other = (Config) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (scriptLanguage == null) {
			if (other.scriptLanguage != null)
				return false;
		} else if (!scriptLanguage.equals(other.scriptLanguage))
			return false;
		if (tropo == null) {
			if (other.tropo != null)
				return false;
		} else if (!tropo.equals(other.tropo))
			return false;
		if (twilio == null) {
			if (other.twilio != null)
				return false;
		} else if (!twilio.equals(other.twilio))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Config [language=" + language + ", scriptLanguage="
				+ scriptLanguage + ", url=" + url + ", tropo="
				+ tropo.toString() + ", twilio=" + twilio.toString() + "]";
	}

}
