package com.magic.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.social.security.SocialUser;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsServiceImpl implements SocialUserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserDetails userDetails = new User(username, passwordEncoder.encode("123456"), true, true, true, true,
//            AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN"));
//        return userDetails;
//    }

    /**
     * @param userId the user ID used to lookup the user details
     * @return the SocialUserDetails requested
     * @see UserDetailsService#loadUserByUsername(String)
     */
    @Override
    public SocialUserDetails loadUserByUserId(String userId) throws UsernameNotFoundException {
        SocialUserDetails socialUserDetails = new SocialUser(userId, "1111", true, true, true, true,
            AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN"));
        return socialUserDetails;
    }
}
