package az.ingress.service.concrete;

import az.ingress.exception.NotFoundException;
import az.ingress.mapper.UserMapper;
import az.ingress.model.dto.UserResponseDto;
import az.ingress.repository.UserRepository;
import az.ingress.service.abstraction.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static az.ingress.exception.ExceptionConstants.*;

@Service
@RequiredArgsConstructor
public class UserServiceHandler implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserResponseDto getUserDetails(String username) {
        return UserMapper.buildUserResponse(
                userRepository.findByUsername(username).orElseThrow(
                ()-> new NotFoundException(USER_NOT_FOUND.getMessage(), USER_NOT_FOUND.getCode())
        )
        );
    }
}
