package controller;

import model.Estudante;

public class EstudanteSuperiorController implements IEstudanteController{

	public EstudanteSuperiorController() {
		super();
	}

	@Override
	public void percentualRendimento(Estudante est) {
		float percenRend = est.getMediaNotas() * est.getQtdAprovacoes() * 0.972f;
		System.out.println("Percentual de rendimento do estudante superior é de: " + percenRend);
		
	}

	@Override
	public void percentualProgressao(Estudante est) {
		float percenPro = est.getQtdAprovacoes() / 6;
		System.out.println("Percentual de progressão do estudante superior é de: " + percenPro);
		
	}

}
