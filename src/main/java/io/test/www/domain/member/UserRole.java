package io.test.www.domain.member;


import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.*;

@Entity
@Table(name="user_role", catalog="spacedb",
        uniqueConstraints = @UniqueConstraint(
                columnNames = { "role", "user_no" }))
public class UserRole {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "user_role_id", unique = true, nullable = false)
    private Integer userRoleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_no", nullable = false)
    private User user;
    @Column(name="role", length=45)
    private String role;

    public Integer getUserRoleId() {
        return userRoleId;
    }
    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

}