package Main;

import Entidades.Apartamento;
import Entidades.Cobranca;
import Entidades.Competencia;
import Entidades.Despesa;

public class LancarDespesas {
	public static void main(String[] args) {
		
		//Apartamento 101
		Apartamento apto101 = new Apartamento (101);
		Competencia comp101 = new Competencia("07", "2023", "08", "2023", 250.59);
		Despesa desp101 = new Despesa(apto101, comp101);
		Cobranca cobr101 = new Cobranca();
		
		//Apartamento 102
		Apartamento apto102 = new Apartamento (102);
		Competencia comp102 = new Competencia("06", "2023", "07", "2023", 179.99);
		Despesa desp102 = new Despesa(apto102, comp102);
		Cobranca cobr102 = new Cobranca();
		
		//Gerando Boleto
		cobr101.boleto(apto101, comp101, desp101);
		System.out.println();
		cobr102.boleto(apto102, comp102, desp102);
		
	}

}
