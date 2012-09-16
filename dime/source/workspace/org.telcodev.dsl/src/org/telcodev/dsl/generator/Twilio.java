package org.telcodev.dsl.generator;

public class Twilio {

	private String voice;
	private String language;
	private String number;
	private String accountSid;
	private String token;
	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountSid() {
		return accountSid;
	}
	public void setAccountSid(String accountSid) {
		this.accountSid = accountSid;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Twilio(String voice, String language, String number,
			String accountSid, String token) {
		super();
		this.voice = voice;
		this.language = language;
		this.number = number;
		this.accountSid = accountSid;
		this.token = token;
	}
	@Override
	public String toString() {
		return "Twilio [voice=" + voice + ", language=" + language
				+ ", number=" + number + ", accountSid=" + accountSid
				+ ", token=" + token + "]";
	}
	public Twilio() {
		super();
		// TODO Auto-generated constructor stub
	}

	


}
