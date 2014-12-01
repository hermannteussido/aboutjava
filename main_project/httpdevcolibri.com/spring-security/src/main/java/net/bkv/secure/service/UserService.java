package net.bkv.secure.service;

import net.bkv.secure.entity.User;

/**
 * Created by balin.k.v on 28.11.2014.
 */
public interface UserService {
    User getUser(String login);
}
