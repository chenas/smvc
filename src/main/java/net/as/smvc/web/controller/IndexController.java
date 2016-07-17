package net.as.smvc.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.as.smvc.web.entity.IndexEntity;
import net.as.smvc.web.entity.SubIndex;
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
        mav.addObject("user", indexService.getIndex("100"));
        mav.addObject("userList", indexService.getIndexList());
        List<IndexEntity> indexList = indexService.getWithChildren(); 
        mav.addObject("userList2", indexList);
        for (IndexEntity ie : indexList){
        	System.out.println(ie.getId());
        	for (SubIndex si:ie.getSubIndexs()){
        		System.out.println(si.getName());
        	}
        }
        
        return mav;
    }
    
}
