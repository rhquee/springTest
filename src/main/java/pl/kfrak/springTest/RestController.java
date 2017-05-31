package pl.kfrak.springTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-05-30.
 */
@Controller
public class RestController {
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    @ResponseBody
    public String hello(){
        return "Hello world";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello2/{name}")
    @ResponseBody
    public String helloPathParam(@PathVariable String name){
        return "Hello" + name;
}

    @RequestMapping(method = RequestMethod.GET, value = "/hello3")
    @ResponseBody
    public String helloRequestParam(@RequestParam String name, @RequestParam String surname){
        return "Hello" + name + surname;
    }
}
