package net.sujan.ws;

import javax.xml.ws.Endpoint;

public class WebServicesServer {

	public static void main(String[] args) {
		String bindingURI ="http://localhost:9898/hellows";
		Hello helloService = new Hello();
		Endpoint.publish(bindingURI, helloService);
		
		System.out.println("Webservices server started:  "+bindingURI);
		//D:\Eclips Projects\WebserviceClient\src
		//http://localhost:9898/hellows?wsdl
	}

}
