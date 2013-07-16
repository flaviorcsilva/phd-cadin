/*
 * PhD Software do Brasil / Universa Escola de Gestão.
 * email - professor.flavio.roberto@gmail.com
 *
 * CADIN - Simulador do Cadastro de Inadimplentes do Governo Federal.
 *
 * OBS: Todos os códigos estão sendo oferecidos com a intenção única de
 * estimular o aprendizado. Não podem ser usados com fins comerciais sem
 * autorização prévia do autor. Se redistribuídos para outros sites, o autor e
 * a fonte devem ser sempre citados.
 */
package br.com.phd.cadin.servico;

class CadinMediator {

	private static final int CODIGO_RETORNO_SUCESSO = 0;
	private static final int CODIGO_RETORNO_DADOS_INSUFICIENTES = 1;
	private static final int CODIGO_RETORNO_CPF_INVALIDO = 2;
	private static final int CODIGO_RETORNO_CLIENTE_PRESENTE_NO_CADIN = 3;
	private static final int CODIGO_RETORNO_CLIENTE_AUSENTE_NO_CADIN = 4;

	private static CadinMediator instancia = null;

	private CadinMediator() {
		// Construtor privado
	}

	public static CadinMediator get() {
		if (instancia == null) {
			instancia = new CadinMediator();
		}

		return instancia;
	}

	public int notificaAtualizacaoCadastral(String cpf,
			MotivoDaAtualizacaoCadastral motivo) {
		if (!Util.isCampoPreenchido(cpf) || motivo == null)
			return CODIGO_RETORNO_DADOS_INSUFICIENTES;

		if (!Util.isCpfValido(cpf))
			return CODIGO_RETORNO_CPF_INVALIDO;

		return CODIGO_RETORNO_SUCESSO;
	}

	public int isCpfPresenteNoCadin(String cpf) {
		if (!Util.isCpfValido(cpf))
			return CODIGO_RETORNO_CPF_INVALIDO;

		if (cpf.equals("02728594430"))
			return CODIGO_RETORNO_CLIENTE_PRESENTE_NO_CADIN;

		return CODIGO_RETORNO_CLIENTE_AUSENTE_NO_CADIN;
	}
}
