package cn.imcompany.service;

import cn.imcompany.model.User;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class VipUserService {

    @Resource
    private ApplicationEventPublisher publisher;

    public void addVip(User user) {
        System.out.println("新的vip产生了,它是:" + user.getName());
        publisher.publishEvent(user);
    }
}
