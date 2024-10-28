package com.tesis.dropout_student_api.controller;

import com.tesis.dropout_student_api.model.ApiResponse;
import com.tesis.dropout_student_api.model.User;
import com.tesis.dropout_student_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public User createUser(@RequestBody User user) {
        // Verificar si el usuario ya existe
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new IllegalArgumentException("El nombre de usuario ya está en uso");
        }

        // Encriptar la contraseña antes de guardar el usuario
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Asignar un rol predeterminado si no se especifica
        if (user.getRole() == null || user.getRole().isEmpty()) {
            user.setRole("ROLE_USER"); // Rol por defecto
        }

        return userRepository.save(user);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable String username) {
        User user = userRepository.findByUsername(username);
        ApiResponse response = new ApiResponse();

        if (user != null ) {
            userRepository.delete(user);
            response.setStatus("success");
            response.setMessage("Usuario eliminado exitosamente");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            response.setStatus("error");
            response.setMessage("Usuario no encontrado");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }
}
