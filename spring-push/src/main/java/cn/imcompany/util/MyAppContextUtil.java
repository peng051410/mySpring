package cn.imcompany.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyAppContextUtil {

    private static ApplicationContext applicationContext;

    @EventListener
    public void setApplicationContext(ContextRefreshedEvent event) {
        applicationContext = event.getApplicationContext();
    }

    public static <T> T getBean(Class<T> tClass) {
        return applicationContext.getBean(tClass);
    }
}
