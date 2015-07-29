package org.n3tsolution.webapp.controller.test;

import junit.framework.TestCase;
import org.n3tsolution.webapp.controller.HomeController;
import org.springframework.web.servlet.ModelAndView;

public class HomeControllerTest extends TestCase {

	public void testHandleRequestView() throws Exception{		
        HomeController controller = new HomeController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("index.jsp", modelAndView.getViewName());
    }
}
