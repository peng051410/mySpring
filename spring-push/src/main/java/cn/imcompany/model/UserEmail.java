package cn.imcompany.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserEmail {

    private String title;
    private String content;

}
