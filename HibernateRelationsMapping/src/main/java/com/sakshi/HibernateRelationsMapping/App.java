package com.sakshi.HibernateRelationsMapping;

//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
       Laptop laptop = new Laptop();
       laptop.setLid(103);
       laptop.setLname("Samsung");
       
      
       
       Student s = new Student();
       s.setSid(1);
       s.setSname("Sakshi");
       s.setSmarks(50);
       s.getLaptop().add(laptop);
       
       
       laptop.getStudent().add(s);
      Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
       
       
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory sf = con.buildSessionFactory(reg);
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       session.save(laptop);
       session.save(s);
       
       
       tx.commit();
       
      
      
    }
}
