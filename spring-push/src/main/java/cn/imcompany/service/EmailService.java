package cn.imcompany.service;

import cn.imcompany.model.UserEmail;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;

@Service
public class EmailService {

    @EventListener
    public void sendEmail(UserEmail userEmail) {

        System.out.println(MethodHandles.lookup().lookupClass() + "说：我们系统发出了一封邮件，邮件为:" + userEmail);
    }
}
