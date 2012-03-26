package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Comissionado {

	@XStreamAlias("LoginMoIP")
	private String loginMoIP;

	public Comissionado comissionado(final String loginMoip) {
		this.loginMoIP = loginMoip;
		return this;
	}

	public String getLoginMoIP() {
		return loginMoIP;
	}

	public void setLoginMoIP(final String loginMoIP) {
		this.loginMoIP = loginMoIP;
	}

}
