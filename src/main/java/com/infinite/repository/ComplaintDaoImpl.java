package com.infinite.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infinite.controller.MainController;
import com.infinite.model.Complaint;


@Repository
public class ComplaintDaoImpl implements IComplaintDao {   //implementing the interface
	
	private static final Logger logger= Logger.getLogger(ComplaintDaoImpl.class);  //logger injection
	
	@Autowired
	private SessionFactory SessionFactory;  //variable  creation

	public void setSfactory(SessionFactory sfactory) {
		this.SessionFactory = sfactory;
	}


	@Override
	public List<Complaint> getAllComplaints() {
		// TODO Auto-generated method stub
		Session session = this.SessionFactory.getCurrentSession();  //session obj 
		List<Complaint> ls = session.createQuery("from Complaint").list();
		return ls;
	}

 

	@Override
	public Complaint getComplaint(int id) {
		// TODO Auto-generated method stub
		Session session = this.SessionFactory.getCurrentSession(); //session obj
		Complaint complaint = (Complaint) session.get(Complaint.class, id);
		return complaint;
	}

 

	@Override
	public Complaint addComplaint(Complaint complaint) {
		// TODO Auto-generated method stub
		Session session = this.SessionFactory.getCurrentSession();
		return null;
	}

 

	@Override
	public void updateMunicipal(Complaint complaint) {
		// TODO Auto-generated method stub
		Session session = this.SessionFactory.getCurrentSession();
		Hibernate.initialize(complaint);
		session.update(complaint);		
	}

 

	@Override
	public void deleteComplaint(int id) {
		// TODO Auto-generated method stub
		Session session = this.SessionFactory.getCurrentSession();
		Complaint m = (Complaint) session.load(Complaint.class, new Integer(id));
		if(null != m){
			session.delete(m);
		}
	}


}
