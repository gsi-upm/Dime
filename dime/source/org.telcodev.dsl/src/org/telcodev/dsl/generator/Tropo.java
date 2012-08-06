package org.telcodev.dsl.generator;

public class Tropo {

	private String voice;

	public Tropo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tropo(String voice) {
		super();
		this.voice = voice;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Tropo other = (Tropo) obj;
		if (voice == null) {
			if (other.voice != null)
				return false;
		} else if (!voice.equals(other.voice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tropo [voice=" + voice + "]";
	};

}
