package org.commerceproject.cleartrip.Service;

import org.commerceproject.cleartrip.Models.User;

import java.util.List;

public interface UserServiceInterface {
    public List<User> findByName(String userName);
}
