package cn.imcompany.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class LDOrder {

    private int id;
    private int amount;
    private String desc;
    private String owner;
}
