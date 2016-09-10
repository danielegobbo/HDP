package infecciologia.model;
// Generated 10/set/2016 13:22:45 by Hibernate Tools 5.1.0.Beta1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class TipoDoente.
 * @see model.TipoDoente
 * @author Hibernate Tools
 */
public class TipoDoenteHome {

	private static final Log log = LogFactory.getLog(TipoDoenteHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(TipoDoente transientInstance) {
		log.debug("persisting TipoDoente instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TipoDoente instance) {
		log.debug("attaching dirty TipoDoente instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TipoDoente instance) {
		log.debug("attaching clean TipoDoente instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TipoDoente persistentInstance) {
		log.debug("deleting TipoDoente instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TipoDoente merge(TipoDoente detachedInstance) {
		log.debug("merging TipoDoente instance");
		try {
			TipoDoente result = (TipoDoente) sessionFactory.getCurrentSession().merge(detachedInstance);
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
			TipoDoente instance = (TipoDoente) sessionFactory.getCurrentSession().get("model.TipoDoente", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TipoDoente> findByExample(TipoDoente instance) {
		log.debug("finding TipoDoente instance by example");
		try {
			List<TipoDoente> results = (List<TipoDoente>) sessionFactory.getCurrentSession()
					.createCriteria("model.TipoDoente").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
