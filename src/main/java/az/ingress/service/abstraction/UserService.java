package az.ingress.service.abstraction;

import az.ingress.model.dto.UserResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResponseDto getUserDetails(String username);
}
