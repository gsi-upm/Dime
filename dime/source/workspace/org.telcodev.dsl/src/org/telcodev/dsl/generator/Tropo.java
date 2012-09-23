package org.telcodev.dsl.generator;

public class Tropo {

	private String voice;
	private String user;
	private String token;
	private String password;
	
	
	public Tropo(String voice, String user, String token, String password) {
		super();
		this.voice = voice;
		this.user = user;
		this.token = token;
		this.password = password;
	}
	public Tropo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Tropo [voice=" + voice + ", user=" + user + ", token=" + token
				+ ", password=" + password + "]";
	}

	

}
