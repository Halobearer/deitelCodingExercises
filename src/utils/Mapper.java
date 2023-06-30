package utils;

import africa.semicolon.myEmailApp.data.models.Mails;
import africa.semicolon.myEmailApp.data.models.User;
import africa.semicolon.myEmailApp.dtos.requests.CreateMailRequest;
import africa.semicolon.myEmailApp.dtos.requests.RegisterUserRequest;
import africa.semicolon.myEmailApp.dtos.responses.FindUserResponse;

import java.time.format.DateTimeFormatter;

public class Mapper {

    public static User map(RegisterUserRequest registerUserRequest) {
        User user = new User();
        user.setFirstName(registerUserRequest.getFirstName());
        user.setLastName(registerUserRequest.getLastName());
        user.setUserName(registerUserRequest.getUserName());
        user.setPassword(registerUserRequest.getPassword());
        user.setAge(registerUserRequest.getAge());
        return user;
    }

    public static void map(RegisterUserRequest registerUserRequest, User user) {
        user.setFirstName(registerUserRequest.getFirstName());
        user.setLastName(registerUserRequest.getLastName());
        user.setPassword(registerUserRequest.getPassword());
        user.setAge(registerUserRequest.getAge());
    }

    public static void map(User foundUser, FindUserResponse response) {
        response.setFullName(foundUser.getFirstName() + " " + foundUser.getLastName());
        response.setUserName(foundUser.getUserName());
        response.setUserId(foundUser.getId());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" dd/MM/yyyy, hh:mm ");
        response.setTimeReceived(formatter.format(foundUser.getTimeReceived()));
        DateTimeFormatter registeredFormatter = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a");
        response.setDateRegistered(registeredFormatter.format(foundUser.getDateRegistered()));
        DateTimeFormatter birthFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        response.setTimeReceived(birthFormatter.format(foundUser.getDateOfBirth()));
    }

    public static void map(CreateMailRequest createMailRequest, Mails mails) {
        mails.setTitle(createMailRequest.getTitle());
        mails.setSubject(createMailRequest.getSubject());
        mails.setBody(createMailRequest.getBody());
        mails.setSenderName(createMailRequest.getSenderName());
        mails.setId(createMailRequest.getWriterId());
        mails.setTimeCreated(createMailRequest.getTimeCreated());

    }


}
