package org.model;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) {
		Contact contact = new Contact();
		contact.setId(12);
		contact.setFirstName("Balaji ");
		contact.setLastName("venkatraman");
		contact.setEmailId("rslbalaji@gmail.com");
		contact.setPhoneNo(9578309780L);
		contact.setDateOfBirth(new Date());
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(contact);
		session.getTransaction().commit();
		session.close();
	}

}
