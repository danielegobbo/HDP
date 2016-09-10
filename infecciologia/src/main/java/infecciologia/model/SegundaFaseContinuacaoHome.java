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
 * Home object for domain model class 2aFaseContinuacao.
 * @see model.2aFaseContinuacao
 * @author Hibernate Tools
 */
public class 2aFaseContinuacaoHome {

    private static final Log log = LogFactory.getLog(2aFaseContinuacaoHome.class);

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
    
    public void persist(2aFaseContinuacao transientInstance) {
        log.debug("persisting 2aFaseContinuacao instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(2aFaseContinuacao instance) {
        log.debug("attaching dirty 2aFaseContinuacao instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(2aFaseContinuacao instance) {
        log.debug("attaching clean 2aFaseContinuacao instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(2aFaseContinuacao persistentInstance) {
        log.debug("deleting 2aFaseContinuacao instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public 2aFaseContinuacao merge(2aFaseContinuacao detachedInstance) {
        log.debug("merging 2aFaseContinuacao instance");
        try {
            2aFaseContinuacao result = (2aFaseContinuacao) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public 2aFaseContinuacao findById( java.lang.Integer id) {
        log.debug("getting 2aFaseContinuacao instance with id: " + id);
        try {
            2aFaseContinuacao instance = (2aFaseContinuacao) sessionFactory.getCurrentSession()
                    .get("model.2aFaseContinuacao", id);
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
    
    public List<2aFaseContinuacao> findByExample(2aFaseContinuacao instance) {
        log.debug("finding 2aFaseContinuacao instance by example");
        try {
            List<2aFaseContinuacao> results = (List<2aFaseContinuacao>) sessionFactory.getCurrentSession()
                    .createCriteria("model.2aFaseContinuacao")
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
