package com.samehadar.springsecurityapp.service;

import com.samehadar.springsecurityapp.model.User;

/**
 * Service class for {@link com.samehadar.springsecurityapp.model.User}
 *
 * @author Vitaly Lyutarevich
 * @version 1.0
 */
public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
