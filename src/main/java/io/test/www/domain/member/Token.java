package io.test.www.domain.member;

import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="remember_me_token", catalog="spacedb")
public class Token {
    @Id
    @Column(name="series_id", unique=true, nullable=false,length=64)
    private String seriesId;
    @Column(name="user_id", unique=false, nullable=false, length=64)
    private String userId;
    @Column(name="token_value", unique=false, nullable=false, length=64)
    private String tokenValue;
    @Column(name="last_used")
    private Date lastUsed;

    public Token() {
    }
    public Token(PersistentRememberMeToken persistentRememberMeToken) {
        this.userId = persistentRememberMeToken.getUsername();
        this.seriesId = persistentRememberMeToken.getSeries();
        this.lastUsed = persistentRememberMeToken.getDate();
        this.tokenValue = persistentRememberMeToken.getTokenValue();
    }

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    public Date getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(Date lastUsed) {
        this.lastUsed = lastUsed;
    }
}