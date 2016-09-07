package com.samehadar.springsecurityapp.service;

import com.samehadar.springsecurityapp.dao.RoleDao;
import com.samehadar.springsecurityapp.dao.UserDao;
import com.samehadar.springsecurityapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Implementation of {@link UserService} interface
 *
 * @author Vitaly Lyutarevich
 * @version 1.0
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }
}
