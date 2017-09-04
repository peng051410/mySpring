package cn.imcompany.observer;

import cn.imcompany.model.LDOrder;
import cn.imcompany.model.User;
import cn.imcompany.service.VipUserService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.invoke.MethodHandles;

@Component
public class VIPUserDetector {

    @Resource
    private VipUserService vipUserService;

    @EventListener(condition = "#order.amount > 500")
    public User handleOrder(LDOrder order) {

        System.out.println(MethodHandles.lookup().lookupClass() + "说：来了一个大订单" + order);
        return vipUserService.generateVip(order);
    }
}
