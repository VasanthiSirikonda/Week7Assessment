package com.infinite.repository;

import java.util.List;

import com.infinite.model.Complaint;

public interface IComplaintDao {
	
	// methods are declared 
	public List<Complaint> getAllComplains();
	
	public Complaint addComplaint(Complaint Complaintinfo);

	public void updateComplaint(Complaint Complaintinfo);

	public void deleteComplaint(int id);

	public Complaint getComplaint(int id);

	
}
