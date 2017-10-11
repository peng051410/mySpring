package cn.imcompany.model;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Data
public class LDOrder1 {

    private int id;
    private int amount;
    private String desc;
    private String owner;
}
