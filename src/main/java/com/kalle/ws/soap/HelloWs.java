package com.kalle.ws.soap;

import javax.jws.*;

import org.apache.cxf.feature.Features;

@WebService
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class HelloWs {
	
	@WebMethod
	public String hello() {
		return "Hello";
	}

}
