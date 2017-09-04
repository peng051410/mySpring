package cn.imcompany.observer;

import cn.imcompany.model.LDOrder;
import cn.imcompany.model.User;
import cn.imcompany.service.VipUserService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class VIPUserDetector {

    @Resource
    private VipUserService vipUserService;

    @EventListener(condition = "#order.amount > 500")
    public void handleOrder(LDOrder order) {

        System.out.println("来订单了" + order);
        User user = new User();
        user.setName("lzp");
        user.setVip(true);
        vipUserService.addVip(user);
    }
}
