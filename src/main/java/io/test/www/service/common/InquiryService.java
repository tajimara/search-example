package io.test.www.service.common;

import io.test.www.domain.common.Inquiry;

/**
 * 작성일자 : 2015년 02월 05일
 * 작성자 : 장종철
 * 문의사항 Service
 */
public interface InquiryService {
    public int insert(Inquiry inquiry) throws Exception;
}
