package com.AngularWeb;

import java.util.Map;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerWeb {
	
	@PostMapping(value="/authenticate")
	public ResponseEntity<Object> view(@RequestBody( required = false) String postBody)
	{
		 HttpStatus retStat = HttpStatus.INTERNAL_SERVER_ERROR;
		String[] temp = postBody.split("\\|");
		System.out.println("userName : " + temp[0] );
		System.out.println("password : " + temp[1] );
		
		if("rajadurai".equalsIgnoreCase(temp[0]) && "12341234".equalsIgnoreCase(temp[1])) {
			 retStat =HttpStatus.OK;
		}
		
		return new ResponseEntity<Object>(retStat);
	}

}
