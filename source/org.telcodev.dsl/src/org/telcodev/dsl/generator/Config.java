package org.telcodev.dsl.generator;

public class Config {
	private String language;
	private String languageGenerated;
	private String sidAccount;
	private String token;
	private String voice;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((language == null) ? 0 : language.hashCode());
		result = prime
				* result
				+ ((languageGenerated == null) ? 0 : languageGenerated
						.hashCode());
		result = prime * result
				+ ((sidAccount == null) ? 0 : sidAccount.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
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
		Config other = (Config) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (languageGenerated == null) {
			if (other.languageGenerated != null)
				return false;
		} else if (!languageGenerated.equals(other.languageGenerated))
			return false;
		if (sidAccount == null) {
			if (other.sidAccount != null)
				return false;
		} else if (!sidAccount.equals(other.sidAccount))
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		if (voice == null) {
			if (other.voice != null)
				return false;
		} else if (!voice.equals(other.voice))
			return false;
		return true;
	}

	public Config() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguageGenerated() {
		return languageGenerated;
	}

	public void setLanguageGenerated(String languageGenerated) {
		this.languageGenerated = languageGenerated;
	}

	public String getSidAccount() {
		return sidAccount;
	}

	public void setSidAccount(String sidAccount) {
		this.sidAccount = sidAccount;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public Config(String language, String languageGenerated, String sidAccount,
			String token, String voice) {
		super();
		this.language = language;
		this.languageGenerated = languageGenerated;
		this.sidAccount = sidAccount;
		this.token = token;
		this.voice = voice;
	}

	@Override
	public String toString() {
		return "Config [language=" + language + ", languageGenerated="
				+ languageGenerated + ", sidAccount=" + sidAccount + ", token="
				+ token + ", voice=" + voice + "]";
	}

}
