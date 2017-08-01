package example.spring.soap.controller;

import javax.jws.WebMethod;
import javax.jws.WebService;

import example.spring.soap.service.IService;

@WebService

public class ServiceController {
	
/*	IService soapService ;

	public IService getSoapService() {
		return soapService;
	}

	public void setSoapService(IService soapService) {
		this.soapService = soapService;
	}*/
	
	@WebMethod
	public String serviceCall(String a){
		System.out.println(a);
		return a;
	}
}
