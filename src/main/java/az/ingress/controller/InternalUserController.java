package az.ingress.controller;

import az.ingress.model.dto.UserResponseDto;
import az.ingress.service.abstraction.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/internal/users")
public class InternalUserController {
    private final UserService userService;

    @GetMapping
    public UserResponseDto getUserDetails(@RequestParam String username){
        return userService.getUserDetails(username);
    }
}