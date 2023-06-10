package org.binar.kamihikoukiairlines.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.binar.kamihikoukiairlines.Exception.UserNotFoundException;
import org.binar.kamihikoukiairlines.response.MessageResponse;
import org.binar.kamihikoukiairlines.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reset")
@Tag(name = "Password", description = "Password Controller | contains : change password")
public class ResetPasswordController {
    @Autowired
    UserService userService;

    @PostMapping("/change-password")
    public ResponseEntity<?> changePassword(@RequestParam("email") String email,
                                            @RequestParam("currentPassword") String currentPassword,
                                            @RequestParam("newPassword") String newPassword) {
        try {
            userService.changePassword(email, currentPassword, newPassword);
            return ResponseEntity.ok(new MessageResponse("Password Berhasil Dirubah!"));
        } catch (UserNotFoundException e) {
            return ResponseEntity.badRequest().body("Pengguna dengan email tersebut tidak ditemukan");
        }
    }
}
