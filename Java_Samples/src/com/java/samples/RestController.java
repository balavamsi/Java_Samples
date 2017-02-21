package com.example.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	 @RequestMapping(value = "/getDetails/{person}", method = RequestMethod.GET)
	    public @ResponseBody String createUser(@PathVariable String person) {
		 LocalDateTime date=LocalDateTime.now();
	        return "You "+person+" loged in at  "+date;
	    }
}
