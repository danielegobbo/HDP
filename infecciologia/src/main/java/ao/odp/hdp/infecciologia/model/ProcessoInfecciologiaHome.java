package ao.odp.hdp.infecciologia.model;
// Generated 10/set/2016 23:09:32 by Hibernate Tools 5.1.0.Beta1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProcessoInfecciologia.
 * @see ao.odp.hdp.infecciologia.model.ProcessoInfecciologia
 * @author Hibernate Tools
 */
@Stateless
public class ProcessoInfecciologiaHome {

	private static final Log log = LogFactory.getLog(ProcessoInfecciologiaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProcessoInfecciologia transientInstance) {
		log.debug("persisting ProcessoInfecciologia instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProcessoInfecciologia persistentInstance) {
		log.debug("removing ProcessoInfecciologia instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProcessoInfecciologia merge(ProcessoInfecciologia detachedInstance) {
		log.debug("merging ProcessoInfecciologia instance");
		try {
			ProcessoInfecciologia result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProcessoInfecciologia findById(int id) {
		log.debug("getting ProcessoInfecciologia instance with id: " + id);
		try {
			ProcessoInfecciologia instance = entityManager.find(ProcessoInfecciologia.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
