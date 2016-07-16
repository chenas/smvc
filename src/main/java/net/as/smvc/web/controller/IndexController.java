package net.as.smvc.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.as.smvc.web.service.IndexService;

@Controller
public class IndexController {

	@Autowired
	private IndexService indexService;

    @RequestMapping(value = "/index.htm")
    public ModelAndView indexPage() {
        ModelAndView mav = new ModelAndView("/WEB-INF/views/index.jsp");
        mav.addObject("theModelKey", "Spring says HI!");
        mav.addObject("Service", indexService.getService());
        return mav;
    }
    
}
