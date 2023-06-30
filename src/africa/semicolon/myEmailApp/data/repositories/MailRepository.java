package africa.semicolon.myEmailApp.data.repositories;

import africa.semicolon.myEmailApp.data.models.Mails;

import java.util.List;

public interface MailRepository {

    Mails save(Mails mails);

    Mails findById(int id);

    long count();

    List<Mails> findAll();

    void deleteAll();

    void delete(Mails mails);

    void delete(int id);
}
