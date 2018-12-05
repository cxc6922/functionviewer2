package xyz.cxc6922.functionviewer2.entity.po;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name = "未登录用户";

    @JsonIgnore
    private String password;

    private Integer id = 1;
}
