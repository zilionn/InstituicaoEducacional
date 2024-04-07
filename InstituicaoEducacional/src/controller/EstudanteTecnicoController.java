package controller;

import model.Estudante;

public class EstudanteTecnicoController implements IEstudanteController{

	public EstudanteTecnicoController() {
		super();
	}

	@Override
	public void percentualRendimento(Estudante est) {
		float percenRend = est.getMediaNotas() * est.getQtdAprovacoes() * 0.931f;
		System.out.println("O percentual de rendimento do estudante técnico é de: " + percenRend);
	}

	@Override
	public void percentualProgressao(Estudante est) {
		float percenPro = est.getQtdAprovacoes() / 3;
		System.out.println("O percentual de progressão do estudante técnico é de: " + percenPro);
		
	}
	
	

}
