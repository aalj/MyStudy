package com.bestsnail.databases;


import com.bestsnail.databases.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stone on 16-12-10.
 */
public class UserDao {

    public List<User> queryAllUser(String name ,String pwd){
        Connection connection = DatabaseConnection.getConnection();
        List<User> list = new ArrayList<>();
        String sql = "SELECT * FROM users where _username = ? and _userpwd = ?;";

        PreparedStatement statement =null;
        ResultSet resultSet = null;
        User user = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString("0",name);
              resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                user = new User();
                user.set_id(resultSet.getString("_id"));
                user.set_username(resultSet.getString("_username"));
                user.set_userPwd(resultSet.getString("_userpwd"));
                list.add(user);
            }

            resultSet.close();
            statement.close();
            connection.close();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;

    }


}
