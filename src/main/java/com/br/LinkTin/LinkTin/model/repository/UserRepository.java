package com.br.LinkTin.LinkTin.model.repository;

import com.br.LinkTin.LinkTin.model.domain.UserWithUserInfoDTO;
import com.br.LinkTin.LinkTin.model.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT new com.br.LinkTin.LinkTin.model.domain.UserWithUserInfoDTO(u.id, u.name, u.email, u.password, u.cpf, u.address, u.birthDate, u.gender, ui.id, ui.skills, ui.curriculum, ui.level) " +
            "FROM User u LEFT JOIN UserInfo ui ON u.id = ui.user.id")
    List<UserWithUserInfoDTO> findAllUsersWithUserInfo();
}
