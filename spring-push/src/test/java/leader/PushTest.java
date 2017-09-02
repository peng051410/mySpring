package leader;

import cn.imcompany.model.MyEventReceiver;
import cn.imcompany.model.MyEventSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
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
    private MyEventSender sender;

    @Resource
    private MyEventReceiver receiver;

    @Test
    public void testPushMe() {

        System.out.println(username);
        sender.createEvent();
    }

}
