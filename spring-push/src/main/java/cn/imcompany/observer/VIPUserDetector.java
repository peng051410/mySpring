package cn.imcompany.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class VIPUserDetector {

    @EventListener
    public void handleOrder(Object object) {

        System.out.println("来订单了" + object);
    }
}
