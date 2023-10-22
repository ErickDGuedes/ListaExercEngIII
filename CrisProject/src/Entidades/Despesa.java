package Entidades;

public class Despesa {
	
	private Apartamento apto;
	private Competencia comp;
	
	public Despesa(Apartamento apto, Competencia comp) {
		super();
		this.apto = apto;
		this.comp = comp;
	}

	public Apartamento getApto() {
		return apto;
	}

	public void setApto(Apartamento apto) {
		this.apto = apto;
	}

	public Competencia getComp() {
		return comp;
	}

	public void setComp(Competencia comp) {
		this.comp = comp;
	}
	

}
