package io.test.www.security;

import io.test.www.domain.member.User;
import io.test.www.dto.member.SocialUserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;


/**
 * @author Petri Kainulainen
 */
public class SecurityUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityUtil.class);

    public static void logInUser(User user) {
        LOGGER.info("Logging in user: {}", user);
        SocialUserDetails userDetails = SocialUserDetails.getBuilder()
                .userId(user.getUserId())
                .userNo(user.getUserNo())
                .userName(user.getUserName())
                .password(user.getUserPassword())
                .userRole(user.getUserRole())
                .socialSignInProvider(user.getSignInProvider())
                .build();
        LOGGER.debug("Logging in principal: {}", userDetails);

        Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);

        LOGGER.info("User: {} has been logged in.", userDetails);
    }
}
