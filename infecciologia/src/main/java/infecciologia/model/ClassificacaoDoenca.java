package infecciologia.model;
// Generated 10/set/2016 13:22:45 by Hibernate Tools 5.1.0.Beta1

/**
 * ClassificacaoDoenca generated by hbm2java
 */
public class ClassificacaoDoenca implements java.io.Serializable {

	private int idClassificacaoDoenca;
	private String doenca;
	private String codigoDoenca;

	public ClassificacaoDoenca() {
	}

	public ClassificacaoDoenca(int idClassificacaoDoenca) {
		this.idClassificacaoDoenca = idClassificacaoDoenca;
	}

	public ClassificacaoDoenca(int idClassificacaoDoenca, String doenca, String codigoDoenca) {
		this.idClassificacaoDoenca = idClassificacaoDoenca;
		this.doenca = doenca;
		this.codigoDoenca = codigoDoenca;
	}

	public int getIdClassificacaoDoenca() {
		return this.idClassificacaoDoenca;
	}

	public void setIdClassificacaoDoenca(int idClassificacaoDoenca) {
		this.idClassificacaoDoenca = idClassificacaoDoenca;
	}

	public String getDoenca() {
		return this.doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public String getCodigoDoenca() {
		return this.codigoDoenca;
	}

	public void setCodigoDoenca(String codigoDoenca) {
		this.codigoDoenca = codigoDoenca;
	}

}