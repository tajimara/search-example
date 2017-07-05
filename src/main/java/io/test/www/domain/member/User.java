package io.test.www.domain.member;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="user", catalog="spacedb")
public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="user_no", unique=true, nullable=false)
    private int userNo;
    @Column(name="user_id", unique=true, nullable=false, length=50)
    private String userId;
    @Column(name="user_password", nullable=false, length=128)
    private String userPassword;
    @Column(name="user_name", nullable=false, length=20)
    private String userName;
    @Column(name="auth_flag", columnDefinition = "TINYINT", length = 1)
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean authFlag;
    @Column(name="auth_key", length=128)
    private String authKey;
    @Column(name="password_key")
    private String passwordKey;
    @Column(name="joined_date")
    private Date joinedDate;
    @Column(name="authenticated_date")
    private Date authenticatedDate;
    @Column(name="last_login_date")
    private Date lastLoginDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "sign_in_provider", length = 20)
    private SocialMediaService signInProvider;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<UserRole> userRole = new HashSet<UserRole>(0);

    @Transient
    private int membershipTermNo;
    @Transient
    private int privacyTermNo;

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isAuthFlag() {
        return authFlag;
    }

    public void setAuthFlag(boolean authFlag) {
        this.authFlag = authFlag;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public String getPasswordKey() {
        return passwordKey;
    }

    public void setPasswordKey(String passwordKey) {
        this.passwordKey = passwordKey;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public Date getAuthenticatedDate() {
        return authenticatedDate;
    }

    public void setAuthenticatedDate(Date authenticatedDate) {
        this.authenticatedDate = authenticatedDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public SocialMediaService getSignInProvider() {
        return signInProvider;
    }

    public void setSignInProvider(SocialMediaService signInProvider) {
        this.signInProvider = signInProvider;
    }

    public Set<UserRole> getUserRole() {
        return userRole;
    }

    public void setUserRole(Set<UserRole> userRole) {
        this.userRole = userRole;
    }

    public int getMembershipTermNo() {
        return membershipTermNo;
    }

    public void setMembershipTermNo(int membershipTermNo) {
        this.membershipTermNo = membershipTermNo;
    }

    public int getPrivacyTermNo() {
        return privacyTermNo;
    }

    public void setPrivacyTermNo(int privacyTermNo) {
        this.privacyTermNo = privacyTermNo;
    }
}