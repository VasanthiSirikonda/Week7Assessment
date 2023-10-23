package com.infinite.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.model.Complaint;
import com.infinite.repository.ComplaintDaoImpl;

@Service
public class ComplaintServiceImpl implements IComplaintService { //implementing the interface 
	private static final Logger logger= Logger.getLogger(ComplaintServiceImpl.class);
	
	@Autowired
	ComplaintDaoImpl cdao;  //variable declaration
	// methods are described here 
	@Override
	@Transactional
	public List<Complaint> getAllComplaints() {
		// TODO Auto-generated method stub
		return cdao.getAllComplains();  
	}

	@Override
	@Transactional
	public Complaint getComplaints(int id) {
		// TODO Auto-generated method stub
		return cdao.getComplaint(id);
	}

	
	@Transactional
	public Complaint addComplaint(Complaint complaint) {
		// TODO Auto-generated method stub
		return cdao.addComplaint(complaint);
	}

	@Override
	@Transactional
	public void updateComplaint(Complaint complaint) {
		// TODO Auto-generated method stub
		cdao.updateComplaint(complaint);
		
	}

	@Override
	@Transactional
	public void deleteComplaint(int id) {
		// TODO Auto-generated method stub
		cdao.deleteComplaint(id);
	}

}
