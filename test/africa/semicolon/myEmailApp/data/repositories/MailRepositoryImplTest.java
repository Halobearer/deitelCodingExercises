package africa.semicolon.myEmailApp.data.repositories;

import africa.semicolon.myEmailApp.data.models.Mails;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MailRepositoryImplTest {

    private MailRepository mailRepository;

    private Mails mails;

    @BeforeEach
    public void setUp() {
        mailRepository = new MailRepositoryImpl();
        mails = new Mails();
        mails.setTitle("School Credit Status");
        mails.setBody("You Failed");
    }

    @Test
    public void saveAMailWillShow_OneMailSavedTest() {
        Mails mails1 = new Mails();
        mailRepository.save(mails1);
        assertEquals(1, mailRepository.count());
    }

    @Test
    public void saveOneMail_IdOfMailIsOneTest() {
        Mails savedMail = mailRepository.save(mails);
//    or    Mails savedMail = new Mails();
//        mailRepository.save(savedMail);
        assertEquals(1, savedMail.getId());
    }

    @Test
    public void mailSavedTwiceWithSameId_WillUpdate() {
        Mails savedMail1 = new Mails();
        mailRepository.save(savedMail1);
        assertEquals(1, mailRepository.count());
        savedMail1.setTitle("Never Give Up");
        savedMail1.setBody("D-Federate please");
        mailRepository.save(savedMail1);
        assertEquals(1, mailRepository.count());
    }

    @Test
    public void findByMailIdAfter_SavingTest() {
        Mails savedMail = mailRepository.save(mails);
        assertEquals(1, savedMail.getId());
        Mails foundMail = mailRepository.findById(1);
        assertEquals(savedMail, foundMail);
    }

    @Test
    public void countIsZeroAfterDeletingTest() {
        Mails mails1 = mailRepository.save(mails);
        assertEquals(1, mailRepository.count());
        mailRepository.delete(1);
        assertEquals(0, mailRepository.count());
    }

    @Test
    public void testThatDeleteAllWWorks() {
        Mails mails1 = new Mails();
        mailRepository.save(mails1);
        Mails mails2 = new Mails();
        mailRepository.save(mails2);
        Mails mails3 = new Mails();
        mailRepository.save(mails3);
        assertEquals(3, mailRepository.count());
        mailRepository.deleteAll();
        assertEquals(0, mailRepository.count());

    }

    @Test
    public void btuh(){
        Mails savedUser = mailRepository.save(mails);
        assertEquals(1, savedUser.getId());
        savedUser.setSenderName("are you talking to me?!");
        mailRepository.save(savedUser);
        assertEquals(1, mailRepository.count());
    }
}