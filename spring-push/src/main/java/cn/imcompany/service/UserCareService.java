package cn.imcompany.service;

import cn.imcompany.model.User;
import cn.imcompany.model.UserEmail;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;

@Service
public class UserCareService {

    @EventListener(condition = "#user.vip")
    public UserEmail lookVip(User user) {

        System.out.println(MethodHandles.lookup().lookupClass() + "说：新的vip产生了,它是:" + user.getName());
        UserEmail userEmail = new UserEmail();
        userEmail.setTitle("我的金主" + user.getName());
        userEmail.setContent("多多的下单吧");
        return userEmail;
    }

}
