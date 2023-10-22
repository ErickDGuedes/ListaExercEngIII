package Entidades;

public class Cobranca implements IPagamentos{

	@Override
	public void boleto(Apartamento apto, Competencia comp, Despesa desp) {
		System.out.println("Boleto gerado para o Apartamento: " + apto.getNumAp());
		System.out.println("Data Lançamento = " + comp.getMesLanc() + "/" + comp.getAnoLanc());
		System.out.println("Data Pagamento = " + comp.getMesPag() + "/" + comp.getAnoPag());
		System.out.println("Total de despesas a pagar = " + comp.getTotalDesp());
		
	}

}
