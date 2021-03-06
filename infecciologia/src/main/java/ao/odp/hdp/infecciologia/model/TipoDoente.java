package ao.odp.hdp.infecciologia.model;
// Generated 10/set/2016 23:09:31 by Hibernate Tools 5.1.0.Beta1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoDoente generated by hbm2java
 */
@Entity
@Table(name = "tipo_doente", schema = "public")
public class TipoDoente implements java.io.Serializable {

	private int idTipoDoente;
	private String codigoTipoDoente;
	private String tipoDoente;
	private Set<ProcessoInfecciologia> processoInfecciologias = new HashSet<ProcessoInfecciologia>(0);

	public TipoDoente() {
	}

	public TipoDoente(int idTipoDoente) {
		this.idTipoDoente = idTipoDoente;
	}

	public TipoDoente(int idTipoDoente, String codigoTipoDoente, String tipoDoente,
			Set<ProcessoInfecciologia> processoInfecciologias) {
		this.idTipoDoente = idTipoDoente;
		this.codigoTipoDoente = codigoTipoDoente;
		this.tipoDoente = tipoDoente;
		this.processoInfecciologias = processoInfecciologias;
	}

	@Id

	@Column(name = "id_tipo_doente", unique = true, nullable = false)
	public int getIdTipoDoente() {
		return this.idTipoDoente;
	}

	public void setIdTipoDoente(int idTipoDoente) {
		this.idTipoDoente = idTipoDoente;
	}

	@Column(name = "codigo_tipo_doente")
	public String getCodigoTipoDoente() {
		return this.codigoTipoDoente;
	}

	public void setCodigoTipoDoente(String codigoTipoDoente) {
		this.codigoTipoDoente = codigoTipoDoente;
	}

	@Column(name = "tipo_doente")
	public String getTipoDoente() {
		return this.tipoDoente;
	}

	public void setTipoDoente(String tipoDoente) {
		this.tipoDoente = tipoDoente;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoDoente")
	public Set<ProcessoInfecciologia> getProcessoInfecciologias() {
		return this.processoInfecciologias;
	}

	public void setProcessoInfecciologias(Set<ProcessoInfecciologia> processoInfecciologias) {
		this.processoInfecciologias = processoInfecciologias;
	}

}
