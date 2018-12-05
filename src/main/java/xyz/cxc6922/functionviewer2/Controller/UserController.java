package xyz.cxc6922.functionviewer2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.cxc6922.functionviewer2.entity.dto.RestApiResult;
import xyz.cxc6922.functionviewer2.entity.po.User;

@Controller("user")
@RequestMapping("user")
public class UserController {

    @RequestMapping("getCurrentUserInfo")
    @ResponseBody
    public RestApiResult getCurrentUserInfo() {
        return new RestApiResult(new User());
    }
}
