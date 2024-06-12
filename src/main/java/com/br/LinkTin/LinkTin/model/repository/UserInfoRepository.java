package com.br.LinkTin.LinkTin.model.repository;

import com.br.LinkTin.LinkTin.model.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
}
