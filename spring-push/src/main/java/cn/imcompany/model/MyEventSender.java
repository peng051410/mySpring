package cn.imcompany.model;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MyEventSender {

    @Resource
    private ApplicationEventPublisher publisher;

    public void createEvent() {

        MyEvent myEvent = new MyEvent();
        myEvent.setId(1);
        myEvent.setMessage("test");
        myEvent.setVip(true);

        publisher.publishEvent(myEvent);
    }
}
