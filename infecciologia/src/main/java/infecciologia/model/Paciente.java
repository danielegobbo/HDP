package infecciologia.model;
// Generated 10/set/2016 13:22:45 by Hibernate Tools 5.1.0.Beta1

/**
 * Paciente generated by hbm2java
 */
public class Paciente implements java.io.Serializable {

	private PacienteId id;

	public Paciente() {
	}

	public Paciente(PacienteId id) {
		this.id = id;
	}

	public PacienteId getId() {
		return this.id;
	}

	public void setId(PacienteId id) {
		this.id = id;
	}

}
