package com.triadWebService.Plume;
import javax.jws.WebService;


@WebService
public interface GeneratePlume {
	
	public String GeneratePlume(double x, double y, String UnitAmount);

}