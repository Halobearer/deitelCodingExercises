package services;

import africa.semicolon.myEmailApp.data.models.User;
import africa.semicolon.myEmailApp.data.repositories.UserRepository;
import africa.semicolon.myEmailApp.data.repositories.UserRepositoryImpl;
import africa.semicolon.myEmailApp.dtos.requests.RegisterUserRequest;
import africa.semicolon.myEmailApp.dtos.responses.FindUserResponse;
import utils.Mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserServiceImpl implements UserService {
    private static UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public User register(RegisterUserRequest registerUserRequest) {
        if (userExist(registerUserRequest.getUserName()))
            throw new IllegalArgumentException("The Username " + registerUserRequest.getUserName() + " already exist");
        return userRepository.save(Mapper.map(registerUserRequest));
    }

    private boolean userExist(String userName) {
        User found = userRepository.findByUserName(userName);
        if (found != null) {
            return true;
        }
        return false;
    }

    @Override
    public FindUserResponse findUser(int id) {
        User foundUser = userRepository.findById(id);
        if (foundUser == null) throw new NullPointerException("User does not Exist");
        FindUserResponse response = new FindUserResponse();
        Mapper.map(foundUser, response);
        return response;
    }

    @Override
    public FindUserResponse findByUsername(String userName) {
        User user = userRepository.findByUserName(userName);
        if (user == null) throw new NullPointerException("user with username" + userName + "does not exist");
        FindUserResponse userResponse = new FindUserResponse();
        Mapper.map(user, userResponse);
        return userResponse;
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public User findId(int id) {
        return userRepository.findById(id);
    }


    public void validateDate(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate.parse(date, dateTimeFormatter);
        return;
    }
}
