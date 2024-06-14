package com.br.LinkTin.LinkTin.model.controller;

import com.br.LinkTin.LinkTin.model.domain.UserInfo;
import com.br.LinkTin.LinkTin.model.service.UserInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/userinfos")
@Tag(name = "User-Info Controller", description = "Controladora relacionada a operações de " +
        "informações profissionais do usuário candidato")
public class UserInfoController {

    private final UserInfoService userInfoService;

    @Autowired
    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping("/{id}")
    @Operation(summary = "Retorna informações profissionais do usuário candidato especificado"
            , description = "Retorna informações profissionais do usuário candidato especificado")
    public ResponseEntity<UserInfo> getUserInfoById(@PathVariable Long id) {
        UserInfo userInfo = userInfoService.getUserInfoById(id);
        if (userInfo != null) {
            return ResponseEntity.ok(userInfo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    @Operation(summary = "Cadastra informações profissionais do usuário candidato especificado"
            , description = "Cadastra informações profissionais do usuário candidato especificado")
    public ResponseEntity<UserInfo> createUser(@RequestParam Long userId, @RequestBody UserInfo userInfo) {
        UserInfo createdUserInfo = userInfoService.createUserInfo(userId, userInfo);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUserInfo);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualiza informações profissionais do usuário candidato especificado"
            , description = "Atualiza informações profissionais do usuário candidato especificado")
    public ResponseEntity<UserInfo> updateUserInfo(@PathVariable Long id, @RequestBody UserInfo userInfo) {
        UserInfo updatedUserInfo = userInfoService.updateUserInfo(id, userInfo);
        if (updatedUserInfo != null) {
            return ResponseEntity.ok(updatedUserInfo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    @Operation(summary = "Deleta os dados profissionais do usuário candidato relacionado ao ID informado"
            , description = "Deleta os dados profissionais do usuário candidato relacionado ao ID informado")
    public void deleteUserInfo(@PathVariable Long id) {
        userInfoService.deleteById(id);
    }
}

