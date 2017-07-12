package Web.Controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by shuoshuo on 2017/7/11.
 */
public class HelloWorldController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
            ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World!");
        mv.setViewName("hello");
        return mv;
    }
}
