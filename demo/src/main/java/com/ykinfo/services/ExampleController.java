/**
 * 
 */
package com.ykinfo.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class ExampleController {
	
	@RequestMapping("/example")
	public String example()
	{
		return "example";
	}
	
	

}
