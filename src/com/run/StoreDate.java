package com.run;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StoreDate {
	Logger logger=Logger.getLogger(StoreDate.class);	
	public static void main(String[] args) {
      Configuration config=new Configuration().configure("hibernate.cfg.xml");
      SessionFactory sessionfactory=config.buildSessionFactory(); 
      Session session=sessionfactory.openSession();
      String query="from Actor";
      Query qur=session.createQuery(query);
      List list=qur.list();
      System.out.println("list  = "+list);
      for(int i=0;i<list.size();i++){
    	 System.out.println(list.get(i)); 
      }
	}
}
