import com.wdsunday.model.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by liangjun on 2017/1/11.
 */
public class MyTest {
    private Session session;
    private Transaction transaction;
    private SessionFactory ourSessionFactory;


    @Before
    public void init() {

        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).buildServiceRegistry();
        ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        session = ourSessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    @After
    public void after() {
        transaction.commit();
        session.clear();
        ourSessionFactory.close();
    }

    @Test
    public void shiyong() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(3);
        userEntity.setName("第一个人");
        userEntity.setAge("20");
//        session.save(userEntity);
        session.save(userEntity);

    }
}
