package services;

import africa.semicolon.myEmailApp.data.models.User;
import africa.semicolon.myEmailApp.dtos.requests.RegisterUserRequest;
import africa.semicolon.myEmailApp.dtos.responses.FindUserResponse;

public interface UserService {

    User register(RegisterUserRequest registerUserRequest);

    FindUserResponse findUser(int id);

    void delete(User user);

    User findId(int id);

    FindUserResponse findByUsername(String userName);
}
