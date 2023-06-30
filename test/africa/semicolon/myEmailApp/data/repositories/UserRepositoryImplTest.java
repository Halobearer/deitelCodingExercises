package africa.semicolon.myEmailApp.data.repositories;

import africa.semicolon.myEmailApp.data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {

    private UserRepository userRepository;
    private User user;

    @BeforeEach
    public void setUp() {
        userRepository = new UserRepositoryImpl();
        user = new User();
    }

    @Test
    public void saveAUserWill_ShowOneUserSavedTest() {
        userRepository.save(user);
        assertEquals(1, userRepository.count());
    }

    @Test
    public void SaveOneUserTheId_OfUserWillBeOneTest() {
        userRepository.save(user);
        assertEquals(1, user.getId());
    }

    @Test
    public void UserSavedCanBeFoundBy_IdTest() {
        User savedUser = userRepository.save(user);
        assertEquals(1, savedUser.getId());
        User findUser = userRepository.findById(1);
        assertEquals(findUser, savedUser);
    }

    @Test
    public void ifTwoUserAreSavedWithTheSame_IdCountWillBeOneTest() {
        User savedUser = userRepository.save(user);
        assertEquals(1, savedUser.getId());
        savedUser.setUserName("are you talking to me?!");
        userRepository.save(savedUser);
        assertEquals(1, userRepository.count());
    }

    @Test
    public void DeleteAUserWithId_ThatWasSavedTest(){
        User user1 = userRepository.save(user);
        assertEquals(1,userRepository.count());
        userRepository.delete(1);
        assertEquals(0, userRepository.count());
    }

}