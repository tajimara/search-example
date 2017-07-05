package io.test.www.service.member;

import io.test.www.domain.member.User;
import io.test.www.dao.member.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserDao userDao;

    @Override
    @Transactional
    public int insertUser(User user) throws Exception {
        int userNo = 0;
        long time = System.currentTimeMillis();
        Date today = new Date(time);

        try{
            userNo = this.userDao.insertUser(user);
            this.userDao.insertUserRole(user);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return userNo;
    //return testDao.getToday();
    }

    @Override
    @Transactional
    public void updateUser(User user) throws Exception {
        try{
            this.userDao.updateUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    @Override
    @Transactional(readOnly = true)
    public boolean findByUserId(String userId) throws Exception {
        User user=userDao.findByUserId(userId);
        if (user != null) {
           //아이디가 존재하면 false
           return false;
        } else {
           //존재하지 않으면 true
           return true;
        }
    }

    @Override
    @Transactional(readOnly = true)
    public int selectNoByUserId(String userId) throws Exception {
        return userDao.selectNoByUserId(userId);
    }

    @Override
    @Transactional(readOnly = true)
    public User selectByAuthKey(String authKey) throws Exception {
        User user=userDao.selectByAuthKey(authKey);
        return user;
    }

    @Override
    @Transactional(readOnly = true)
    public User selectByPasswordKey(String passwordKey) throws Exception {
        User user=userDao.selectByPasswordKey(passwordKey);
        return user;
    }

    @Override
    @Transactional(readOnly = true)
    public User selectByUserId(String userId) throws Exception {
        User user=userDao.selectByUserId(userId);
        return user;
    }

}
