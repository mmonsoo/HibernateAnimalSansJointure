package com.mmonsoor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mmonsoor.entity.Animal;
import com.mmonsoor.entity.Territoire;

public class MainProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure().buildSessionFactory();
		//Ouverture session
		Session session = sessionFactory.openSession() ;
		//CreateNewAnimals(session);
		//Animal animal3=new Animal("Maurice", "DODO", (short) 80);
		//addAnimal(session,animal3);
		//Territoire t1=new Territoire("Foret tropicale", 40);
		Territoire t2=new Territoire("Mon lit", 100);
		addTerritoire(session,t2);
		//addTerritoire(session,t2);
		
		
	}
	
public static void addAnimal(Session session,Animal animal) {
		//Fermeture session
		session.beginTransaction();
		session.save(animal);
		session.getTransaction().commit();
		session.close();		
	}

public static void addTerritoire(Session session,Territoire t) {
	//Fermeture session
	session.beginTransaction();
	session.save(t);
	session.getTransaction().commit();
	session.close();		
}


	

}
