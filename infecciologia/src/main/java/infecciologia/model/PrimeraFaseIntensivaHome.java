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
 * Home object for domain model class PrimeraFaseIntensiva.
 * @see model.PrimeraFaseIntensiva
 * @author Hibernate Tools
 */
public class PrimeraFaseIntensivaHome {

    private static final Log log = LogFactory.getLog(PrimeraFaseIntensivaHome.class);

    private final SessionFactory sessionFactory = getSessionFactory();
    
    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup("SessionFactory");
        }
        catch (Exception e) {
            log.error("Could not locate SessionFactory in JNDI", e);
            throw new IllegalStateException("Could not locate SessionFactory in JNDI");
        }
    }
    
    public void persist(PrimeraFaseIntensiva transientInstance) {
        log.debug("persisting PrimeraFaseIntensiva instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(PrimeraFaseIntensiva instance) {
        log.debug("attaching dirty PrimeraFaseIntensiva instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(PrimeraFaseIntensiva instance) {
        log.debug("attaching clean PrimeraFaseIntensiva instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(PrimeraFaseIntensiva persistentInstance) {
        log.debug("deleting PrimeraFaseIntensiva instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public PrimeraFaseIntensiva merge(PrimeraFaseIntensiva detachedInstance) {
        log.debug("merging PrimeraFaseIntensiva instance");
        try {
            PrimeraFaseIntensiva result = (PrimeraFaseIntensiva) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public PrimeraFaseIntensiva findById( infecciologia.model.PrimeraFaseIntensivaId id) {
        log.debug("getting PrimeraFaseIntensiva instance with id: " + id);
        try {
            PrimeraFaseIntensiva instance = (PrimeraFaseIntensiva) sessionFactory.getCurrentSession()
                    .get("model.PrimeraFaseIntensiva", id);
            if (instance==null) {
                log.debug("get successful, no instance found");
            }
            else {
                log.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    public List<PrimeraFaseIntensiva> findByExample(PrimeraFaseIntensiva instance) {
        log.debug("finding PrimeraFaseIntensiva instance by example");
        try {
            List<PrimeraFaseIntensiva> results = (List<PrimeraFaseIntensiva>) sessionFactory.getCurrentSession()
                    .createCriteria("model.PrimeraFaseIntensiva")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        }
        catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    } 
}
