package ao.odp.hdp.infecciologia.model;
// Generated 10/set/2016 23:09:32 by Hibernate Tools 5.1.0.Beta1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Paciente.
 * @see ao.odp.hdp.infecciologia.model.Paciente
 * @author Hibernate Tools
 */
@Stateless
public class PacienteHome {

	private static final Log log = LogFactory.getLog(PacienteHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Paciente transientInstance) {
		log.debug("persisting Paciente instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Paciente persistentInstance) {
		log.debug("removing Paciente instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Paciente merge(Paciente detachedInstance) {
		log.debug("merging Paciente instance");
		try {
			Paciente result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Paciente findById(int id) {
		log.debug("getting Paciente instance with id: " + id);
		try {
			Paciente instance = entityManager.find(Paciente.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
