package io.test.www.dao.member;

import java.util.ArrayList;
import java.util.List;

import io.test.www.domain.member.User;
import io.test.www.domain.member.UserRole;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public User findByUserId(String userId) {
        List<User> users = new ArrayList<User>();

        users = getSessionFactory().getCurrentSession()
                .createQuery("from User where userId=?")
                .setParameter(0, userId).list();

        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public int insertUser(User user) {
        Session session = getSessionFactory().getCurrentSession();
        session.save(user);

        return user.getUserNo();
    }

    @Override
    @SuppressWarnings("unchecked")
    public int insertUserRole(User user) {

        UserRole userRole = new UserRole();
        Session session = getSessionFactory().getCurrentSession();
        userRole.setUser(user);
        userRole.setRole("ROLE_USER");
        session.save(userRole);

        return 1;
    }

    @Override
    public int updateUser(User user) throws Exception {
        Session session = getSessionFactory().getCurrentSession();
        session.update(user);
        return 1;
    }

    @Override
    @SuppressWarnings("unchecked")
    public int selectNoByUserId(String userId) throws Exception {
        Session session = getSessionFactory().getCurrentSession();
        int userNo = (Integer)session
                .createQuery("select userNo from User where userId=?")
                .setParameter(0, userId).list().get(0);
        return userNo;
    }

    @Override
    public User selectByAuthKey(String authKey) throws Exception {
        List<User> users = new ArrayList<User>();

        users = getSessionFactory().getCurrentSession()
                .createQuery("from User where authKey=?")
                .setParameter(0, authKey).list();

        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }

    @Override
    public User selectByPasswordKey(String passwordKey) throws Exception {
        List<User> users = new ArrayList<User>();

        users = getSessionFactory().getCurrentSession()
                .createQuery("from User where passwordKey=?")
                .setParameter(0, passwordKey).list();
        for(User user : users){
            Hibernate.initialize(user.getUserRole());
        }
        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }

    @Override
    public User selectByUserId(String userId) throws Exception {
        List<User> users = new ArrayList<User>();

        users = getSessionFactory().getCurrentSession()
                .createQuery("from User where userId=?")
                .setParameter(0, userId).list();
        for(User user : users){
            Hibernate.initialize(user.getUserRole());
        }
        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}