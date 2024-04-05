package org.commerceproject.cleartrip.Service;

import org.commerceproject.cleartrip.DTOS.UserDto;
import org.commerceproject.cleartrip.Models.User;
import org.commerceproject.cleartrip.Repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService implements UserServiceInterface {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findByName(String userName) {
        return userRepository.findByName(userName);
    }

    // Save User method
    public UserDto saveUser(UserDto user) {
        return userRepository.save(user);
    }

    // Update User method
    public UserDto updateUser(UUID id, UserDto userUpdates) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(userUpdates.getName() != null ? userUpdates.getName() : user.getName());
                    // Continue for all fields you want to be able to update...

                    // Save the updated User object to the database
                    return userRepository.save(user);
                })
                .orElseThrow(() -> new IllegalArgumentException("Invalid user id: " + id));
    }
}