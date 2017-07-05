package io.test.www.service.common;

import io.test.www.dao.common.InquiryDao;
import io.test.www.domain.common.Inquiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 작성일자 : 2015년 02월 05일
 * 작성자 : 장종철
 * 문의사항 서비스 구현체
 */
@Service
public class InquiryServiceImpl implements InquiryService {
    @Autowired
    InquiryDao inquiryDao;

    @Override
    @Transactional
    public int insert(Inquiry inquiry) throws Exception {
        return inquiryDao.insert(inquiry);
    }
}
