package com.triadWebService.Plume.Server;

import java.util.Date;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;


import com.triadWebService.Plume.GeneratePlume;
import com.triadWebService.Plume.GeneratePlumeImp;



public class Server {




	public static void main(String[] args) {
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		//��ַ
		factoryBean.setAddress("http://0.0.0.0:8888/GeneratePlume");
		//�ӿ�
		factoryBean.setServiceClass(GeneratePlume.class);
		//ʵ�ֶ���
		factoryBean.setServiceBean(new GeneratePlumeImp());
		//��������
		factoryBean.create();
		System.out.println("Release Success! "+new Date().toString());
			
		
	}
	
	
	
}
