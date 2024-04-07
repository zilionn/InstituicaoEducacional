package view;

import controller.EstudanteSuperiorController;
import controller.EstudanteTecnicoController;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class Principal {

	public static void main(String[] args) {
		EstudanteSuperior estS = new EstudanteSuperior();
		estS.setNome("José");
		estS.setAnoConclusaoSegundoGrau(2025);
		estS.setEmail("lady@gaga.com");
		estS.setInstituicaoSegundoGrau("Fatec");
		estS.setMediaNotas(7);
		estS.setQtdAprovacoes(10);
		estS.setRa("111202589");

		EstudanteTecnico estT = new EstudanteTecnico();
		estT.setEmail("gaga@lady.com");
		estT.setMediaNotas(9);
		estT.setNome("Maria");
		estT.setQtdAprovacoes(10);
		estT.setRa("01101100 01100001 01100100 01111001 00100000 01100111 01100001 01100111 01100001");
		
		EstudanteSuperiorController estSC = new EstudanteSuperiorController();
		estSC.percentualProgressao(estS);
		estSC.percentualRendimento(estS);
		
		System.out.println("-------------------------------------------------------------");
		
		EstudanteTecnicoController estTC = new EstudanteTecnicoController();
		estTC.percentualProgressao(estT);
		estTC.percentualRendimento(estT);
		
	}

}
