package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;


public class Comissoes {

	@XStreamAlias("Comissionamento")
	public Comissionamento comissionamento;

	public Comissoes comComissionamento(Comissionamento comissionamento) {
		this.comissionamento = comissionamento;
		return this;
	}
	
}
