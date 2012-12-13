package org.telcodev.dsl.generator;

public class VoiceXML {
	private String token;
	private String language;
	private String user;
	private String password;
	private String botkey;
	private String number;

	public VoiceXML() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VoiceXML(String token, String language, String user,
			String password, String botkey, String number) {
		super();
		this.token = token;
		this.language = language;
		this.user = user;
		this.password = password;
		this.botkey = botkey;
		this.number = number;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBotkey() {
		return botkey;
	}

	public void setBotkey(String botkey) {
		this.botkey = botkey;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "VoiceXML [token=" + token + ", language=" + language
				+ ", user=" + user + ", password=" + password + ", botkey="
				+ botkey + ", number=" + number + "]";
	}

	

}
