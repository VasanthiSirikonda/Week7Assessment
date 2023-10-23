package com.infinite.service;

import java.util.List;

import com.infinite.model.Complaint;

public interface IComplaintService {
	public List<Complaint> getAllComplaints();

	public Complaint getComplaints(int id);

	public Complaint addMComplaint(Complaint Complaint);

	public void updateComplaint(Complaint Complaint);

	public void deleteComplaint(int id);

}
