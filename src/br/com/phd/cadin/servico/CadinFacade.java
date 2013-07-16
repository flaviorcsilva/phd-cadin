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

public class CadinFacade {

	private static CadinFacade instancia = null;

	private CadinFacade() {
		// Construtor vazio;
	}

	public static CadinFacade get() {
		if (instancia == null) {
			instancia = new CadinFacade();
		}

		return instancia;
	}

	public int cpfPresenteNoCadin(String cpf) {
		return CadinMediator.get().isCpfPresenteNoCadin(cpf);
	}

	public int notificaAtualizacaoCadastral(String cpf,
			MotivoDaAtualizacaoCadastral motivo) {
		return CadinMediator.get().notificaAtualizacaoCadastral(cpf, motivo);
	}
}