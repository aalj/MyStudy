package test.com.bestsnail.databases; 

import com.bestsnail.databases.UserDao;
import com.bestsnail.databases.bean.User;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* UserDao Tester. 
* 
* @author <Authors name> 
* @since <pre>十二月 10, 2016</pre> 
* @version 1.0 
*/ 
public class UserDaoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: queryAllUser() 
* 
*/ 
@Test
public void testQueryAllUser() throws Exception {
    UserDao userDao = new UserDao();
    List<User> users = userDao.queryAllUser();
    for (User user : users
         ) {
        System.out.println( user.toString());

    }
} 


} 
