package com.br.LinkTin.LinkTin.model.service;

import com.br.LinkTin.LinkTin.model.domain.UserWithUserInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.LinkTin.LinkTin.model.domain.User;
import com.br.LinkTin.LinkTin.model.repository.UserRepository;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public List<User> findAll() {
        return userRepository.findAll();
    }
    
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
    
    public User save(User user) {
        return userRepository.save(user);
    }
    
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public List<UserWithUserInfoDTO> getAllUsersWithUserInfo() {
        return userRepository.findAllUsersWithUserInfo();
    }
}
