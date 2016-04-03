package tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Martin on 02/04/2016.
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String test(){
    return "view";
    }

}
