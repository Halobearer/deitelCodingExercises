package services;
import africa.semicolon.myEmailApp.data.models.Mails;
import africa.semicolon.myEmailApp.dtos.requests.CreateMailRequest;
public interface MailService {

    Mails createNewMail(CreateMailRequest createMailRequest);

    Mails findMail(int id);

    long count();

}
