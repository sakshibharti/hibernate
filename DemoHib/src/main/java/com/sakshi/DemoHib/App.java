package com.sakshi.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	studentName sn = new studentName();
    	sn.setFname("Sakshi");
    	sn.setMname("Anil");
    	sn.setLname("Bharti");
    	
        student st= new student();
        st.setSid(9);
        st.setScolor("Black");
        st.setSname(sn);
       
        
        Configuration con = new Configuration().configure().addAnnotatedClass(student.class);
        
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
         session.save(st);
        
        tx.commit();
        
        System.out.println(st);
       
        
    }
}
