package com.example.demo.resource;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Version;

@RestController
public class exemploResource {
	
	@RequestMapping(value = {"/version"}, method = RequestMethod.GET)
	public ResponseEntity<Version> getVersion(){
		
		Version version;
		version = new Version();
		version.setBuildName("Lucas");
		version.setBuildVersionNumber(123);
		version.setBuildDate(new Date());
		
		return new ResponseEntity<Version>(version, HttpStatus.OK);
	}

}
