package com.triadWebService.Plume;

import java.util.Date;

import javax.jws.WebService;

@WebService
public class GeneratePlumeImp implements GeneratePlume{

	@Override
	public String GeneratePlume(double x, double y, String UnitAmount) {
		// TODO Auto-generated method stub
		String result = new String();
		result = "http://70.106.253.97:8089/plume/test.png";
		System.out.println(result);
		
//		System.out.println("F:\\Easy2PHP5\\Easy2PHP5\\WebSite\\plume"+result+" "+new Date().toString());
		return result;
	}

}
