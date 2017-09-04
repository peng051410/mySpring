package cn.imcompany.service;

import cn.imcompany.model.LDOrder;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LdOrderService {

    @Resource
    private ApplicationEventPublisher publisher;

    public void addOrder(LDOrder order) {
        publisher.publishEvent(order);
    }
}
