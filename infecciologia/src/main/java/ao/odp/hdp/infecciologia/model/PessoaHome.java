package ao.odp.hdp.infecciologia.model;
// Generated 10/set/2016 23:09:32 by Hibernate Tools 5.1.0.Beta1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Pessoa.
 * @see ao.odp.hdp.infecciologia.model.Pessoa
 * @author Hibernate Tools
 */
@Stateless
public class PessoaHome {

	private static final Log log = LogFactory.getLog(PessoaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Pessoa transientInstance) {
		log.debug("persisting Pessoa instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Pessoa persistentInstance) {
		log.debug("removing Pessoa instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Pessoa merge(Pessoa detachedInstance) {
		log.debug("merging Pessoa instance");
		try {
			Pessoa result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Pessoa findById(int id) {
		log.debug("getting Pessoa instance with id: " + id);
		try {
			Pessoa instance = entityManager.find(Pessoa.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
