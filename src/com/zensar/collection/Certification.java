package com.zensar.collection;

public class Certification extends Student {
	private String certif;

	public Certification(String certif) {
		super();
		this.certif = certif;
	}

	
	public Certification() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getCertif() {
		return certif;
	}

	public void setCertif(String certif) {
		this.certif = certif;
	}


	@Override
	public String toString() {
		return "Certification [certif=" + certif + "]";
	}
	
	
	

}




