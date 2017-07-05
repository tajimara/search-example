package io.test.www.dao.member;

import io.test.www.domain.member.User;

public interface UserDao {

    User findByUserId(String userId);
    public int insertUser (User user) throws Exception;
    public int insertUserRole (User user) throws Exception;
    public int updateUser(User user) throws Exception;
    public int selectNoByUserId(String userId) throws Exception;
    public User selectByAuthKey(String authKey) throws Exception;
    public User selectByPasswordKey(String passwordKey) throws Exception;
    public User selectByUserId(String userId) throws Exception;
}