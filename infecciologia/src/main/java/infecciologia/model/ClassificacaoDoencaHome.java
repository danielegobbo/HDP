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
 * Home object for domain model class ClassificacaoDoenca.
 * @see model.ClassificacaoDoenca
 * @author Hibernate Tools
 */
public class ClassificacaoDoencaHome {

    private static final Log log = LogFactory.getLog(ClassificacaoDoencaHome.class);

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
    
    public void persist(ClassificacaoDoenca transientInstance) {
        log.debug("persisting ClassificacaoDoenca instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(ClassificacaoDoenca instance) {
        log.debug("attaching dirty ClassificacaoDoenca instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(ClassificacaoDoenca instance) {
        log.debug("attaching clean ClassificacaoDoenca instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(ClassificacaoDoenca persistentInstance) {
        log.debug("deleting ClassificacaoDoenca instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public ClassificacaoDoenca merge(ClassificacaoDoenca detachedInstance) {
        log.debug("merging ClassificacaoDoenca instance");
        try {
            ClassificacaoDoenca result = (ClassificacaoDoenca) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public ClassificacaoDoenca findById( int id) {
        log.debug("getting ClassificacaoDoenca instance with id: " + id);
        try {
            ClassificacaoDoenca instance = (ClassificacaoDoenca) sessionFactory.getCurrentSession()
                    .get("model.ClassificacaoDoenca", id);
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
    
    public List<ClassificacaoDoenca> findByExample(ClassificacaoDoenca instance) {
        log.debug("finding ClassificacaoDoenca instance by example");
        try {
            List<ClassificacaoDoenca> results = (List<ClassificacaoDoenca>) sessionFactory.getCurrentSession()
                    .createCriteria("model.ClassificacaoDoenca")
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

