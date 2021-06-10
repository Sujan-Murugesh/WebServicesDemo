package net.sujan.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello {
	
	@WebMethod
	public String greetings(String name) {
		return "Greeting : "+name;
	}
}
