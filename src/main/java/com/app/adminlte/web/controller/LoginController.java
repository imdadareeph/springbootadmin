/**
 * 
 */
package com.app.adminlte.web.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author imdadareeph
 *
 */
@Controller
public class LoginController {

	@RequestMapping(value={"/", "/login","/web/login"})
    public String index() {
        return "web/login";
    }
	
	@RequestMapping(value={"/gmap","/web/gmap"})
    public String gmap() {
        return "web/gmap";
    }
    

    // Added to test 500 page
    @RequestMapping(path = "/tigger-error", produces = MediaType.APPLICATION_JSON_VALUE)
    public void error500() throws Exception {
        throw new Exception();
    }
}
