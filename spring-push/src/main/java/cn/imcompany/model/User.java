package cn.imcompany.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User {

    private String name;
    private boolean vip;
}
