package com.br.LinkTin.LinkTin.model.controller;

import com.br.LinkTin.LinkTin.model.domain.UserWithUserInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.br.LinkTin.LinkTin.model.domain.User;
import com.br.LinkTin.LinkTin.model.service.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/users")
@Tag(name = "User Controller", description = "Controladora relacionada a operações de usuário candidato")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping
    @Operation(summary = "Lista todos os usuários candidatos", description = "Retorna uma lista de todos os usuários.")
    public List<User> getAllCandidatos() {
        return userService.findAll();
    }
    
    @GetMapping("/{id}")
    @Operation(summary = "Retorna o usuário candidato relacionado ao ID informado", description = "Retorna um usuário candidato especfico.")
    public Optional<User> getCandidatoById(@PathVariable Long id) {
        return userService.findById(id);
    }
    
    @PostMapping
    @Operation(summary = "Cria um novo usuário candidato", description = "Adiciona um novo usuário ao sistema.")
    public User createCandidato(@RequestBody User user) {
        return userService.save(user);
    }
    
    @PutMapping("/{id}")
    @Operation(summary = "Atualiza o usuário candidato relacionado ao ID informado", description = "Atualiza um usuário candidato especfico.")
    public User updateCandidato(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return userService.save(user);
    }
    
    @DeleteMapping("/{id}")
    @Operation(summary = "Deleta o usuário candidato relacionado ao ID informado", description = "Deleta um usuário candidato especfico.")
    public void deleteCandidato(@PathVariable Long id) {
        userService.deleteById(id);
    }

    @GetMapping("/withUserInfo")
    @Operation(summary = "Lista todos os usuários candidatos com suas repectivas Users Infos", description = "Retorna uma lista de todos os usuários com o adicional de User Info")
    public ResponseEntity<List<UserWithUserInfoDTO>> getAllUsersWithUserInfo() {
        List<UserWithUserInfoDTO> users = userService.getAllUsersWithUserInfo();
        return ResponseEntity.ok(users);
    }
}
