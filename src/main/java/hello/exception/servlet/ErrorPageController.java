package hello.exception.servlet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class ErrorPageController {

    @RequestMapping("/error-page/404")
    public ModelAndView errorPage404(HttpServletRequest request, HttpServletResponse response) {

        log.info("errorPage 404");

        ModelAndView mv = new ModelAndView();
        mv.setViewName("error-page/404");

        return mv;
    }

    @RequestMapping("/error-page/500")
    public ModelAndView errorPage500(HttpServletRequest request, HttpServletResponse response) {

        log.info("errorPage 500");

        ModelAndView mv = new ModelAndView();
        mv.setViewName("error-page/500");

        return mv;
    }
}
