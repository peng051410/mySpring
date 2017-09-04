package leader;

import cn.imcompany.model.LDOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//指定单元测试的runner
@RunWith(SpringJUnit4ClassRunner.class)
//指定单元测试读取的配置文件
@ContextConfiguration("classpath:spring/applicationContext.xml")
@PropertySource("classpath:yml/my.yml")
public class PushTest {

    @Value("{db.username}")
    private String username;

    @Resource
    private ApplicationEventPublisher publisher;


    @Test
    public void testPushMe() {

        System.out.println("网站火爆，订单来了");
        LDOrder ldOrder = new LDOrder();
        ldOrder.setId(1);
        ldOrder.setAmount(30);
        ldOrder.setDesc("先来个小单");
        publisher.publishEvent(ldOrder);

        LDOrder ldBigOrder = new LDOrder();
        ldBigOrder.setId(1);
        ldBigOrder.setAmount(5000);
        ldBigOrder.setDesc("再来个大单吧");
        publisher.publishEvent(ldBigOrder);
    }

}
