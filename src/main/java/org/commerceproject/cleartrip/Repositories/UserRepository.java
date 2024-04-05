package org.commerceproject.cleartrip.Repositories;

import org.commerceproject.cleartrip.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    List<User> findByName(String userName);

    <S extends User> S saveUser(S entity);
}
