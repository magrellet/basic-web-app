package tutorial.mvc;

import org.omg.CORBA.Object;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tutorial.entity.BlogEntry;

/**
 * Created by Martin on 03/04/2016.
 */
@Controller
public class BlogEntryController {
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public @ResponseBody BlogEntry test(@RequestBody BlogEntry entry){
        return entry;
    }
}
