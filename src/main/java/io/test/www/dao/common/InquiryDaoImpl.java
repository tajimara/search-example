package io.test.www.dao.common;

import io.test.www.domain.common.Inquiry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 작성일자 : 2015년 06월 03일
 * 작성자 : 장종철
 * 목적 : 문의사항 내용 DAO
 */
@Repository
public class InquiryDaoImpl implements InquiryDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int insert(Inquiry inquiry) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        return (Integer)session.save(inquiry);
    }
}
