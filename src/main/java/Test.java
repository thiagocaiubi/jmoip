import br.com.moip.client.Boleto;
import br.com.moip.client.CartaoCredito;
import br.com.moip.client.Comissionado;
import br.com.moip.client.Comissionamento;
import br.com.moip.client.Comissoes;
import br.com.moip.client.Endereco;
import br.com.moip.client.EnviarInstrucao;
import br.com.moip.client.InstrucaoUnica;
import br.com.moip.client.Pagador;
import br.com.moip.client.PagamentoDireto;
import br.com.moip.client.Portador;
import br.com.moip.client.Recebedor;
import br.com.moip.client.Valores;

public class Test {

	public static void main(final String[] args) {
		EnviarInstrucao enviarInstrucao = new EnviarInstrucao()
				.comInstrucaoUnica(new InstrucaoUnica()
						.comRazao("Uma motivo pela compra")
						.comIdProprio("teste")
						.com(new Pagador()
								.comNome("Breno Oliveira")
								.comEmail("breno26@gmail.com")
								.comIdentidade("222.222.222-22")
								.comTelefoneCelular("(61)9999-9999")
								.comEnderecoCobranca(
										new Endereco()
												.comLogradouro("Rua Vergueiro")
												.comNumero("853")
												.comBairro("Vila Mariano")
												.comCep("04600-021")
												.comCidade("Sao Paulo")
												.comEstado("SP")
												.comPais("BRA")
												.comTelefoneFixo(
														"(22)2222-2222")))
						.com(new PagamentoDireto()
								.comForma("BoletoBancario")
								.comCartaoCredito(
										new CartaoCredito()
												.comNumero("3456789012345640")
												.comExpiracao("08/11")
												.comCodigoSeguranca("123")
												.comPortador(
														new Portador()
																.comDataNascimento("12/12/2012")
																.comNome("Breno Oliveira")
																.comIdentidade("22222222222")
																.comTipoDocumento("cpf"))))
						.com(new Boleto().comDiasParaExpiracao("5"))
						.com(new Valores().comValor("15.00"))
						.com(new Recebedor().comLoginMoip("teste"))
						.com(new Comissoes().comComissionamento(
								new Comissionamento()
										.comComissionado(
												new Comissionado().comissionado("likestore"))
													.comValorPercentual("2")
													.comRazao("Percentual LikeStore"))));

		System.out.println(enviarInstrucao);

//		EnviarInstrucaoUnicaResponse response = new SandboxMoip().comHash("SEU_HASH").send(enviarInstrucao);
//		
//		System.out.println(response);
	}
}