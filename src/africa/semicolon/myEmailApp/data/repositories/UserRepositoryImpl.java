package africa.semicolon.myEmailApp.data.repositories;

import africa.semicolon.myEmailApp.data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private final List<User> users = new ArrayList<>();
    private int count;

    @Override
    public User save(User user) {
        if (user.getId() == 0) {
            user.setId(generateUserId());
            users.add(user);
            count++;
        }
        return user;
    }

    private int generateUserId() {
        return count + 1;
    }

    @Override
    public User findById(int id) {
        for (User userId : users) {
            if (userId.getId() == id)
                return userId;
        }
        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public void delete(int id) {
        for (User user : users) {
            if (user.getId() == id)
                users.remove(user);
            count--;
            break;
        }
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void deleteAll() {
        users.clear();
        count = 0;
    }

    @Override
    public User findByUserName(String username) {
        for (User user : users) {
            if (user.getUserName().equalsIgnoreCase(username)) return user;
        }
        return null;
    }

}
