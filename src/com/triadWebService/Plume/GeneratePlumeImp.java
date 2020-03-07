package com.triadWebService.Plume;

import java.util.Date;

import javax.jws.WebService;

@WebService
public class GeneratePlumeImp implements GeneratePlume{

	@Override
	public String GeneratePlume(double x, double y, String UnitAmount) {
		// TODO Auto-generated method stub
		String result = new String();
		result = "Hello Business Logic : "+x*y+" . Developing...";
		
		System.out.println("Access time: "+result+new Date().toString());
		return result;
	}

}
