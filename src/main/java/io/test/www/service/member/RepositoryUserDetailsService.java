package io.test.www.service.member;

import io.test.www.dao.member.UserDao;
import io.test.www.domain.member.User;
import io.test.www.domain.member.UserRole;
import io.test.www.dto.member.SocialUserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("userDetailsService")
public class RepositoryUserDetailsService implements UserDetailsService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RepositoryUserDetailsService.class);

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(final String userId)
            throws UsernameNotFoundException,DisabledException {

        //별로 이쁜 코드가 아니다.. 나중에 변경 요망 by jihoon
        User user = userDao.findByUserId(userId);
        if (user == null) {
            throw new BadCredentialsException("fail");
        }
        if (!user.isAuthFlag()) {  //인증이 되어 있지 않으면.
            throw new DisabledException("disabled");
        }
        SocialUserDetails userDetails = SocialUserDetails.getBuilder()
                .userId(user.getUserId())
                .userNo(user.getUserNo())
                .userName(user.getUserName())
                .password(user.getUserPassword())
                .userRole(user.getUserRole())
                .socialSignInProvider(user.getSignInProvider())
                .build();
        return userDetails;

    }


    private org.springframework.security.core.userdetails.User buildUserForAuthentication(User user,
                                                                                          List<GrantedAuthority> authorities) {
        return new org.springframework.security.core.userdetails.User(user.getUserId(), user.getUserPassword(), authorities);
    }

    private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {

        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

        // Build user's authorities
        for (UserRole userRole : userRoles) {
            setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
        }

        List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

        return Result;
    }

}