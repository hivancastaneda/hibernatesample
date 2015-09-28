package com.castaneda.hibernatesample.app;

import java.util.Date;

import org.hibernate.Session;

import com.castaneda.hibernatesample.model.Post;
import com.castaneda.hibernatesample.util.HibernateUtil;

public class MainClass {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Post myPost = new Post();
		myPost.setDate(new Date());
		myPost.setAuthor("Ivan CastanedaHector Ivan C");
		myPost.setMessage("Post message");
		session.saveOrUpdate(myPost);
		
		session.getTransaction().commit();					
	}
}
