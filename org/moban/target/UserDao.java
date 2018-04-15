package org.moban.target;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * userDao
 * 
 * @author aries
 *
 */
public  class UserDao extends AbstractDao {

    public User findUser(int userId) {
        String sql = "select * from t_user where userId = ?";
        Object[] params = new Object[] { userId };
        Object user = super.find(sql, params);
        System.out.println((User) user);
        return (User) user;
    }

    @Override
    protected Object rowMapper(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("userId"));
        user.setName(rs.getString("name"));
        user.setAge(rs.getInt("age"));
        user.setSex(rs.getString("sex"));
        user.setAddress(rs.getString("address"));
        return user;
    }
}