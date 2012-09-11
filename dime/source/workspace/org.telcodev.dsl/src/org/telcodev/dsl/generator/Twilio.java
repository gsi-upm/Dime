package org.telcodev.dsl.generator;

public class Twilio {

	private String voice;
	private String language;
	private String number;

	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public Twilio(String voice, String language, String number) {
		super();
		this.voice = voice;
		this.language= language;
		this.number=number;
	}

	public Twilio() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((voice == null) ? 0 : voice.hashCode());
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
		Twilio other = (Twilio) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (voice == null) {
			if (other.voice != null)
				return false;
		} else if (!voice.equals(other.voice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Twilio [voice=" + voice + ", language=" + language + "]";
	}


}
