package cn.imcompany.service;

import cn.imcompany.model.User;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserCareService {

    @Resource
    private EmailService emailService;

    @EventListener(condition = "#user.vip")
    public void lookVip(User user) {
        emailService.sendEmail(user.getName(), "我自己，哈哈");
    }

}
