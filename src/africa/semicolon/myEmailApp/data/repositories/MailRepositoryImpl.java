package africa.semicolon.myEmailApp.data.repositories;

import africa.semicolon.myEmailApp.data.models.Mails;

import java.util.ArrayList;
import java.util.List;

public class MailRepositoryImpl implements MailRepository {

    private List<Mails> mails = new ArrayList<>();

    private int count;

    @Override
    public Mails save(Mails mail) {

        if (mail.getId() == 0) {
            mail.setId(generateMailId());
            mails.add(mail);
            count++;
        }
        return mail;
    }

    private int generateMailId() {
        return count + 1;
    }

    @Override
    public Mails findById(int id) {
        for (Mails mail : mails) {
            if (mail.getId() == id) {
                return mail;
            }
        }
        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<Mails> findAll() {
        return mails;
    }

    @Override
    public void delete(int id) {
        for (Mails mail : mails) {
            if (mail.getId() == id)
                mails.remove(mail);
            count--;
            break;
        }
    }

    @Override
    public void delete(Mails mails) {

    }

    @Override
    public void deleteAll() {
        mails.clear();
        count = 0;
    }
}
