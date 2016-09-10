package ao.odp.hdp.infecciologia.model;
// Generated 10/set/2016 23:09:31 by Hibernate Tools 5.1.0.Beta1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Paciente generated by hbm2java
 */
@Entity
@Table(name = "paciente", schema = "public")
public class Paciente implements java.io.Serializable {

	private int idPaciente;
	private Pessoa pessoa;
	private String numeroProcesso;
	private Set<ProcessoInfecciologia> processoInfecciologias = new HashSet<ProcessoInfecciologia>(0);

	public Paciente() {
	}

	public Paciente(int idPaciente, String numeroProcesso) {
		this.idPaciente = idPaciente;
		this.numeroProcesso = numeroProcesso;
	}

	public Paciente(int idPaciente, Pessoa pessoa, String numeroProcesso,
			Set<ProcessoInfecciologia> processoInfecciologias) {
		this.idPaciente = idPaciente;
		this.pessoa = pessoa;
		this.numeroProcesso = numeroProcesso;
		this.processoInfecciologias = processoInfecciologias;
	}

	@Id

	@Column(name = "id_paciente", unique = true, nullable = false)
	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pessoa")
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Column(name = "numero_processo", nullable = false)
	public String getNumeroProcesso() {
		return this.numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paciente")
	public Set<ProcessoInfecciologia> getProcessoInfecciologias() {
		return this.processoInfecciologias;
	}

	public void setProcessoInfecciologias(Set<ProcessoInfecciologia> processoInfecciologias) {
		this.processoInfecciologias = processoInfecciologias;
	}

}