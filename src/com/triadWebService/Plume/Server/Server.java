package com.triadWebService.Plume.Server;

import java.util.Date;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;


import com.triadWebService.Plume.GeneratePlume;
import com.triadWebService.Plume.GeneratePlumeImp;



public class Server {




	public static void main(String[] args) {
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		//地址
		factoryBean.setAddress("http://0.0.0.0:8888/GeneratePlume");
		//接口
		factoryBean.setServiceClass(GeneratePlume.class);
		//实现对象
		factoryBean.setServiceBean(new GeneratePlumeImp());
		//创建服务
		factoryBean.create();
		System.out.println("Release Success! "+new Date().toString());
			
		
	}
	
	
	
}
