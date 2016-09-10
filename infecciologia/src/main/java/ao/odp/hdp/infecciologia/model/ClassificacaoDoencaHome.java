package ao.odp.hdp.infecciologia.model;
// Generated 10/set/2016 23:09:32 by Hibernate Tools 5.1.0.Beta1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ClassificacaoDoenca.
 * @see ao.odp.hdp.infecciologia.model.ClassificacaoDoenca
 * @author Hibernate Tools
 */
@Stateless
public class ClassificacaoDoencaHome {

	private static final Log log = LogFactory.getLog(ClassificacaoDoencaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ClassificacaoDoenca transientInstance) {
		log.debug("persisting ClassificacaoDoenca instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ClassificacaoDoenca persistentInstance) {
		log.debug("removing ClassificacaoDoenca instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ClassificacaoDoenca merge(ClassificacaoDoenca detachedInstance) {
		log.debug("merging ClassificacaoDoenca instance");
		try {
			ClassificacaoDoenca result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ClassificacaoDoenca findById(int id) {
		log.debug("getting ClassificacaoDoenca instance with id: " + id);
		try {
			ClassificacaoDoenca instance = entityManager.find(ClassificacaoDoenca.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
