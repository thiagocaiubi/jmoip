package br.com.moip.client;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("EnviarInstrucao")
public class EnviarInstrucao {

	@XStreamAlias("InstrucaoUnica")
	private InstrucaoUnica instrucaoUnica;

	public EnviarInstrucao comInstrucaoUnica(final InstrucaoUnica instrucaoUnica) {
		this.instrucaoUnica = instrucaoUnica;
		return this;
	}

	public InstrucaoUnica getInstrucaoUnica() {
		return instrucaoUnica;
	}

	public void setInstrucaoUnica(final InstrucaoUnica instrucaoUnica) {
		this.instrucaoUnica = instrucaoUnica;
	}

	@Override
	public String toString() {
		XStream xstream = new XStream();
		xstream.processAnnotations(EnviarInstrucao.class);
		return xstream.toXML(this);		
	}
}
