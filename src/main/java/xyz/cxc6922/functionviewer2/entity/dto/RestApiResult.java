package xyz.cxc6922.functionviewer2.entity.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RestApiResult {
    private int code = 0;
    private String msg = "";
    private Object info = null;


    public RestApiResult(Object info) {
        this.info = info;
    }

}
