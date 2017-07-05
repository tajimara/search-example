package io.test.www.service.member;
import io.test.www.domain.member.User;

public interface UserService {
    public int insertUser(User user) throws Exception;
    public void updateUser(User user) throws Exception;
    public boolean findByUserId(String userId) throws Exception;
    public int selectNoByUserId(String userId) throws Exception;
    public User selectByAuthKey(String authKey) throws Exception;
    public User selectByPasswordKey(String passwordKey) throws Exception;
    public User selectByUserId(String userId) throws Exception;
}
