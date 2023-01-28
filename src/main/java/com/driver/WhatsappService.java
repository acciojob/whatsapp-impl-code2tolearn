package com.driver;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WhatsappService {
    WhatsappRepository whatsappRepository = new WhatsappRepository() ;
    public String createUser(String name, String mobile) throws Exception {
            whatsappRepository.createUser(name , mobile) ;
            return "SUCCESS" ;
    }
    public boolean isNewUser(String mobile){
       return whatsappRepository.isNewUser(mobile);
    }
    //             .........................            //
    public Group createGroup(List<User> users){
        return whatsappRepository.createGroup(users) ;
    }
    public int createMessage(String content){
        return whatsappRepository.createMessage(content);
    }
    //............send msg
    public int sendMessage(Message message, User sender, Group group) throws Exception {
       return whatsappRepository.sendMessage(message,sender,group) ;
    }
    //.............change admin
    public String changeAdmin(User approver, User user, Group group) throws Exception {
        return whatsappRepository.changeAdmin(approver , user , group) ;
    }

 }

