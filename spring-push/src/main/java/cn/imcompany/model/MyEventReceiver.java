package cn.imcompany.model;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventReceiver {

    @EventListener(value = {MyEvent.class, MyEvent2.class})
    public void handleEvent(Object o) {
        System.out.println("收到了事件 " + o);
    }
}
