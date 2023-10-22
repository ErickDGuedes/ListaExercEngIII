package Entidades;

public class Competencia {
	
	private String mesLanc;
	private String anoLanc;
	private String mesPag;
	private String anoPag;
	private Double totalDesp;
	
	public Competencia(String mesLanc, String anoLanc, String mesPag, String anoPag, Double totalDesp) {
		super();
		this.mesLanc = mesLanc;
		this.anoLanc = anoLanc;
		this.mesPag = mesPag;
		this.anoPag = anoPag;
		this.totalDesp = totalDesp;
	}

	public String getMesLanc() {
		return mesLanc;
	}

	public void setMesLanc(String mesLanc) {
		this.mesLanc = mesLanc;
	}

	public String getAnoLanc() {
		return anoLanc;
	}

	public void setAnoLanc(String anoLanc) {
		this.anoLanc = anoLanc;
	}

	public String getMesPag() {
		return mesPag;
	}

	public void setMesPag(String mesPag) {
		this.mesPag = mesPag;
	}

	public String getAnoPag() {
		return anoPag;
	}

	public void setAnoPag(String anoPag) {
		this.anoPag = anoPag;
	}

	public Double getTotalDesp() {
		return totalDesp;
	}

	public void setTotalDesp(Double totalDesp) {
		this.totalDesp = totalDesp;
	}
	
	
	
	
	

}
