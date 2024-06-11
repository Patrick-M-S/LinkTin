package com.br.LinkTin.LinkTin.model.repository;

import com.br.LinkTin.LinkTin.model.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
