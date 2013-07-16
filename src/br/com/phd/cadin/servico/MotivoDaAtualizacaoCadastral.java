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

public enum MotivoDaAtualizacaoCadastral {

	CREDENCIAMENTO_DE_CLIENTE(1,
			"Credenciamento de cliente junto a instituição"), ATUALIZACAO_DE_DADOS_CADASTRAIS(
			2, "Atualização de dados cadastrais"), DESCREDENCIAMENTO_DE_CLIENTE(
			3, "Descredenciamento de cliente junto a instituição");

	private int chave;
	private String valor;

	private MotivoDaAtualizacaoCadastral(int chave, String valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public int getChave() {
		return chave;
	}

	public String getValor() {
		return valor;
	}

}
