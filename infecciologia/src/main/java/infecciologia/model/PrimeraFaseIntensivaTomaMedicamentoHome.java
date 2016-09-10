package model;
// Generated 10/set/2016 13:22:45 by Hibernate Tools 5.1.0.Beta1


import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class 1aFaseIntensivaTomaMedicamento.
 * @see model.1aFaseIntensivaTomaMedicamento
 * @author Hibernate Tools
 */
public class 1aFaseIntensivaTomaMedicamentoHome {

    private static final Log log = LogFactory.getLog(1aFaseIntensivaTomaMedicamentoHome.class);

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
    
    public void persist(1aFaseIntensivaTomaMedicamento transientInstance) {
        log.debug("persisting 1aFaseIntensivaTomaMedicamento instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(1aFaseIntensivaTomaMedicamento instance) {
        log.debug("attaching dirty 1aFaseIntensivaTomaMedicamento instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(1aFaseIntensivaTomaMedicamento instance) {
        log.debug("attaching clean 1aFaseIntensivaTomaMedicamento instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(1aFaseIntensivaTomaMedicamento persistentInstance) {
        log.debug("deleting 1aFaseIntensivaTomaMedicamento instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public 1aFaseIntensivaTomaMedicamento merge(1aFaseIntensivaTomaMedicamento detachedInstance) {
        log.debug("merging 1aFaseIntensivaTomaMedicamento instance");
        try {
            1aFaseIntensivaTomaMedicamento result = (1aFaseIntensivaTomaMedicamento) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public 1aFaseIntensivaTomaMedicamento findById( model.1aFaseIntensivaTomaMedicamentoId id) {
        log.debug("getting 1aFaseIntensivaTomaMedicamento instance with id: " + id);
        try {
            1aFaseIntensivaTomaMedicamento instance = (1aFaseIntensivaTomaMedicamento) sessionFactory.getCurrentSession()
                    .get("model.1aFaseIntensivaTomaMedicamento", id);
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
    
    public List<1aFaseIntensivaTomaMedicamento> findByExample(1aFaseIntensivaTomaMedicamento instance) {
        log.debug("finding 1aFaseIntensivaTomaMedicamento instance by example");
        try {
            List<1aFaseIntensivaTomaMedicamento> results = (List<1aFaseIntensivaTomaMedicamento>) sessionFactory.getCurrentSession()
                    .createCriteria("model.1aFaseIntensivaTomaMedicamento")
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
