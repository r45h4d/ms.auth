package az.ingress.controller;

import az.ingress.model.dto.UserResponseDto;
import az.ingress.service.concrete.UserServiceHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/users")
public class UserController {
    private final UserServiceHandler userService;

    @GetMapping()
    @ResponseStatus(OK)
    UserResponseDto getUserDetails(@RequestParam String username){
        return userService.getUserDetails(username);
    }
}