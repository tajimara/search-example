package io.test.www.dao.common;

import io.test.www.domain.common.Inquiry;

/**
 * 작성일자 : 2015년 06월 03일
 * 작성자 : 장종철
 * 문의사항 입력하기 DAO 인터페이스
 */
public interface InquiryDao {
    public int insert(Inquiry inquiry) throws Exception;
}
