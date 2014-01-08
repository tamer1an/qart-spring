//package hello;
//
//        import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//        import org.springframework.boot.SpringApplication;
//        import org.springframework.context.annotation.ComponentScan;
//
//@ComponentScan
//@EnableAutoConfiguration
//public class Application {
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
//}

package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}