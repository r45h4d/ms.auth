package az.ingress.mapper;

import az.ingress.entity.UserEntity;
import az.ingress.model.dto.UserResponseDto;

public class UserMapper {
    public static UserResponseDto buildUserResponse(UserEntity userEntity) {
        return UserResponseDto.builder()
                .id(userEntity.getId().toString())
                .username(userEntity.getUsername())
                .password(userEntity.getPassword())
                .build();
    }
}
