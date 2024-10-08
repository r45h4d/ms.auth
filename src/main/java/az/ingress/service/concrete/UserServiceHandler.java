package az.ingress.service.concrete;

import az.ingress.entity.UserEntity;
import az.ingress.exception.ExceptionConstants;
import az.ingress.exception.NotFoundException;
import az.ingress.model.dto.UserResponseDto;
import az.ingress.repository.UserRepository;
import az.ingress.service.abstraction.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import static az.ingress.exception.ExceptionConstants.*;

@Service
@RequiredArgsConstructor
public class UserServiceHandler implements UserService {
    private final UserRepository userRepository;


    @Override
    public UserResponseDto getUserDetails(String name) {
        UserEntity user = userRepository.findByName(name);
        if(user==null) {
            throw new NotFoundException(USER_NOT_FOUND.getMessage(), USER_NOT_FOUND.getCode());
        }
        return new UserResponseDto(user.getId().toString());
    }
}
