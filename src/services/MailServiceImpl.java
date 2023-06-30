package services;

import africa.semicolon.myEmailApp.data.models.Mails;
import africa.semicolon.myEmailApp.data.repositories.MailRepositoryImpl;
import africa.semicolon.myEmailApp.dtos.requests.CreateMailRequest;
import utils.Mapper;

public class MailServiceImpl implements MailService {
    MailRepositoryImpl mailRepository = new MailRepositoryImpl();

    UserService userService = new UserServiceImpl();


    @Override
    public Mails createNewMail(CreateMailRequest createMailRequest) {
        Mails mails = new Mails();
        Mapper.map(createMailRequest, mails);
        return mailRepository.save(mails);
    }

    private void convert(CreateMailRequest createMailRequest, Mails mails){
        mails.setTitle(createMailRequest.getTitle());
        mails.setBody(createMailRequest.getBody());
        mails.setSubject(createMailRequest.getSubject());
        mails.setSenderName(createMailRequest.getSenderName());
        mails.setId(createMailRequest.getWriterId());
    }

    @Override
    public Mails findMail(int  id) {
        return mailRepository.findById(id);
    }

    @Override
    public long count() {
        return mailRepository.count();
    }
}
