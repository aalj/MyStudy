import com.wdsunday.Course;
import com.wdsunday.OrderEntiry;
import com.wdsunday.Student;
import com.wdsunday.UserEntiry;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.apache.log4j.Logger;
import utils.HibernateUtils;

import java.util.List;

/**
 * Created by liangjun on 2017/1/19.
 */
public class wdsunday {

    Logger logger = Logger.getLogger(wdsunday.class);


    @Test
    //联系使用多对多的关系
    public void demo5() {
        Session session = HibernateUtils.openSession();
        Transaction tx = session.beginTransaction();
        //保存的保存多对多关系

        Student student = new Student();
        student.setStuname("小明");

        Course course = new Course();
        course.setCouName("语文");
        student.getCourses().add(course);

        course.getStudents().add(student);

        session.save(student);
//        session.save(course);

        tx.commit();
        session.close();

    }

    @Test
    //联系使用多对多的关系
    public void demo3() {
        Session session = HibernateUtils.openSession();
        Transaction tx = session.beginTransaction();
        //保存的保存多对多关系

        Student student = new Student();
        student.setStuname("小明");

        Course course = new Course();
        course.setCouName("语文");
        student.getCourses().add(course);

        course.getStudents().add(student);

        session.save(student);
        session.save(course);

        tx.commit();
        session.close();

    }


    @Test
//练习查询和关联修改
    public void demo4() {
        Session session = HibernateUtils.openSession();
        Transaction tx = session.beginTransaction();

        Criteria criteria = session.createCriteria(UserEntiry.class);
        List<UserEntiry> list = criteria.add(Restrictions.eq("name", "立偲")).list();

        OrderEntiry orderEntiry = new OrderEntiry();
        orderEntiry.setOname("说过");

        list.get(0).getOrders().add(orderEntiry);


//        System.out.println(list.get(0).toString());

        tx.commit();
        session.close();
    }


    @Test
    //练习使用一对多关系
    public void demo2() {
        Session session = HibernateUtils.openSession();
        Transaction tx = session.beginTransaction();

//        OrderEntiry orderEntiry  = new OrderEntiry();
//        orderEntiry.setOname("didanyi");

        UserEntiry userEntiry = new UserEntiry();
        userEntiry.setName("立偲");

//        userEntiry.getOrders().add(orderEntiry);

        session.save(userEntiry);


        tx.commit();
        session.close();

    }

    @Test
    public void demo() {
        Configuration configuration = new Configuration().configure();
        // 2.构建Session工厂
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // 3.通过工厂创建Session
        Session session = sessionFactory.openSession();
        // 4.开启事务
        Transaction tx = session.beginTransaction();
//        User user
//                 = new User();
//        user.setName("第一个人");
//        user.setAge("18");
//        session.save(user);
//        logger.warn("保存成功");

        // 6.事务提交
        tx.commit();
        // 7.释放资源
        session.close();
        sessionFactory.close();

    }


}
