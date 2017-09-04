package leader;

import cn.imcompany.model.LDOrder;
import cn.imcompany.service.LdOrderService;
import cn.imcompany.util.MyAppContextUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.lang.invoke.MethodHandles;

//指定单元测试的runner
@RunWith(SpringJUnit4ClassRunner.class)
//指定单元测试读取的配置文件
@ContextConfiguration("classpath:spring/applicationContext.xml")
@PropertySource("classpath:yml/my.yml")
public class OrderServiceTest {

    @Value("{db.username}")
    private String username;

    @Resource
    private LdOrderService ldOrderService;

    @Test
    public void testAddOrder() throws Exception {

        System.out.println("网站火爆，订单来了,准备好了没？");
        LDOrder ldOrder = MyAppContextUtil.getBean(LDOrder.class);
        System.out.println(ldOrder);
        ldOrder.setId(1);
        ldOrder.setAmount(3000);
        ldOrder.setDesc("先来个小单");
        ldOrder.setOwner("lzp");
        ldOrderService.addOrder(ldOrder);

        Thread.sleep(4000);
        System.out.println("----------------------------------------------------------------------------");

        LDOrder ldBigOrder = MyAppContextUtil.getBean(LDOrder.class);
        System.out.println(ldBigOrder);
        ldBigOrder.setId(1);
        ldBigOrder.setAmount(5000);
        ldBigOrder.setDesc("再来个大单吧");
        ldBigOrder.setOwner("tomyli");
        ldOrderService.addOrder(ldBigOrder);
    }

    @Test
    public void testMethodHandle() {

        MethodHandles.Lookup lookup = MethodHandles.lookup();
    }

}
