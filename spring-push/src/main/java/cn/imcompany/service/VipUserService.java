package cn.imcompany.service;

import cn.imcompany.model.LDOrder;
import cn.imcompany.model.User;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;

@Service
public class VipUserService {

    public User generateVip(LDOrder order) {

        System.out.println(MethodHandles.lookup().lookupClass() + "说：我们系统多了一个VIP用户");
        User user = new User();
        user.setName(order.getOwner());
        user.setVip(true);
        return user;
    }
}
