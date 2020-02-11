package pl.idzikdev.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    ApiUser userToApiUser(User user);

    User userApioUser(ApiUser apiUser);
}
