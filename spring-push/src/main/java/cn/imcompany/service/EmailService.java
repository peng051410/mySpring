package cn.imcompany.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sendEmail(String name, String content) {

        System.out.println("恭喜" + name + "成为我们的vip!" + content);
    }
}
