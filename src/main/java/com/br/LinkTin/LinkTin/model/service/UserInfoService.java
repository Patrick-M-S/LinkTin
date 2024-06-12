package com.br.LinkTin.LinkTin.model.service;

import com.br.LinkTin.LinkTin.model.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.LinkTin.LinkTin.model.domain.UserInfo;
import com.br.LinkTin.LinkTin.model.repository.UserInfoRepository;
import com.br.LinkTin.LinkTin.model.repository.UserRepository;

import java.util.List;

@Service
public class UserInfoService {

    private final UserInfoRepository userInfoRepository;
    private final UserRepository userRepository;

    @Autowired
    public UserInfoService(UserInfoRepository userInfoRepository, UserRepository userRepository) {
        this.userInfoRepository = userInfoRepository;
        this.userRepository = userRepository;
    }

    public UserInfo createUserInfo(Long userId, UserInfo userInfo) {
        // Verificar se o usuário existe
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));

        // Associar os detalhes do usuário ao usuário existente
        userInfo.setUser(user);

        // Salvar os detalhes do usuário
        return userInfoRepository.save(userInfo);
    }

    public UserInfo getUserInfoById(Long id) {
        return userInfoRepository.findById(id).orElse(null);
    }

    public List<UserInfo> getAllUserInfo() {
        return userInfoRepository.findAll();
    }

    public UserInfo updateUserInfo(Long id, UserInfo newUserInfo) {
        UserInfo existingUserInfo = userInfoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("UserInfo não encontrada"));

        // Atualizar os detalhes da UserInfo com os novos detalhes
        existingUserInfo.setSkills(newUserInfo.getSkills());
        existingUserInfo.setCurriculum(newUserInfo.getCurriculum());
        existingUserInfo.setLevel(newUserInfo.getLevel());

        // Salvar e retornar a UserInfo atualizada
        return userInfoRepository.save(existingUserInfo);
    }
}
