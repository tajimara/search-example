package io.test.www.domain.common;

import javax.persistence.*;

/**
 * 작성일자 : 2015년 02월 05일
 * 작성자 : 장종철
 * 문의사항 도메인
 */
@Entity
@Table(name = "inquiry", catalog = "spacedb")
public class Inquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "inquiry_no")
    private int inquireNo;
    @Column(name = "name", length = 45)
    private String name;
    @Column(name = "email", length = 45)
    private String email;
    @Column(name = "phone", length = 45)
    private String phone;
    @Column(name = "company", length = 45)
    private String company;
    @Column(name = "comment", length = 500)
    private String comment;

    public int getInquireNo() {
        return inquireNo;
    }

    public void setInquireNo(int inquireNo) {
        this.inquireNo = inquireNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
