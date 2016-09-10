package ao.odp.hdp.infecciologia.model;
// Generated 10/set/2016 23:09:32 by Hibernate Tools 5.1.0.Beta1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TipoDoente.
 * @see ao.odp.hdp.infecciologia.model.TipoDoente
 * @author Hibernate Tools
 */
@Stateless
public class TipoDoenteHome {

	private static final Log log = LogFactory.getLog(TipoDoenteHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TipoDoente transientInstance) {
		log.debug("persisting TipoDoente instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TipoDoente persistentInstance) {
		log.debug("removing TipoDoente instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TipoDoente merge(TipoDoente detachedInstance) {
		log.debug("merging TipoDoente instance");
		try {
			TipoDoente result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TipoDoente findById(int id) {
		log.debug("getting TipoDoente instance with id: " + id);
		try {
			TipoDoente instance = entityManager.find(TipoDoente.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
