package africa.semicolon.myEmailApp.data.repositories;

import africa.semicolon.myEmailApp.data.models.User;

import java.util.List;

public interface UserRepository {

    User save(User user);

    User findById(int id);

    long count();

    List<User> findAll();

    void delete(int id);

    void delete(User user);

    void deleteAll();

    User findByUserName(String username);


}
