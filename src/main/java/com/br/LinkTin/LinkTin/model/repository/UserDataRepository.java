package com.br.LinkTin.LinkTin.model.repository;

import com.br.LinkTin.LinkTin.model.domain.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository<UserData, Long> {
}
