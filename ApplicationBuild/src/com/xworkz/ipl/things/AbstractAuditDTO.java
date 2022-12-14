package com.xworkz.ipl.things;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AbstractAuditDTO implements Serializable {

	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updatedDate;
	
	public AbstractAuditDTO() {
		System.out.println("Running default constructor");
	}
	
	
	
	@Override
	public String toString() {
		return "AbstractAuditDTO [createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}



	public String getcreatedBy() {
		return createdBy;
	}
	
	public void setcreatedBy(String createdBy) {
		this.createdBy=createdBy;
	}
	
	public LocalDateTime getcreatedDate() {
		return createdDate;
	}
	
	public void setcreatedDate(LocalDateTime createdDate) {
		this.createdDate=createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public void showOff() {
		System.out.println("Created By");
		System.out.println("Created Date");
		System.out.println("Updated By");
		System.out.println("Updated Date");
	}
	
	
}
