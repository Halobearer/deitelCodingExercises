package services;

import africa.semicolon.myEmailApp.data.models.User;
import africa.semicolon.myEmailApp.dtos.requests.RegisterUserRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {

    private UserService userService;
    private RegisterUserRequest registerUserRequest;

    @BeforeEach
    public void setUp() {
        userService = new UserServiceImpl();
        registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setFirstName("Damian");
        registerUserRequest.setLastName("Ndebueze");
        registerUserRequest.setUserName("the name");
        registerUserRequest.setUserName("the name");
        registerUserRequest.setAge(900);
        registerUserRequest.setPassword("password");
    }

    @Test
    public void ifNewUserIsSaved_IdShould_BeOneTest() {
        RegisterUserRequest userRequest = new RegisterUserRequest();
        userRequest.setFirstName("Damian");
        userRequest.setUserName("king");
        userRequest.setLastName("Ndebueze");
        userRequest.setAge(17);
        userRequest.setPassword("password");
        System.out.println(userRequest);
        User savedUser = userService.register(userRequest);
        assertEquals(1, savedUser.getId());
    }

    @Test
    public void creatingAUserWithTheSameUsername_WillThrowAnExceptionTest() {
        //the test should fail if it's right
        userService.register(registerUserRequest);
        userService.register(registerUserRequest);
        assertThrows(IllegalArgumentException.class, () -> userService.register(registerUserRequest));

    }

    @Test
    public void testThatFindUser_ByIdWorks(){}
}