package kosta1200.todayroom.vo;

import java.io.Serializable;

public class ContractorVO implements Serializable {
	private int contractor_seq;
	private String contractor_bname;
	private String contractor_name;
	private String contractor_address;
	private int member_seq;
	private int admin_seq;
	
	public ContractorVO() {}

	public ContractorVO(int contractor_seq, String contractor_bname, String contractor_name, String contractor_address,
			int member_seq, int admin_seq) {
		super();
		this.contractor_seq = contractor_seq;
		this.contractor_bname = contractor_bname;
		this.contractor_name = contractor_name;
		this.contractor_address = contractor_address;
		this.member_seq = member_seq;
		this.admin_seq = admin_seq;
	}

	public int getContractor_seq() {
		return contractor_seq;
	}

	public void setContractor_seq(int contractor_seq) {
		this.contractor_seq = contractor_seq;
	}

	public String getContractor_bname() {
		return contractor_bname;
	}

	public void setContractor_bname(String contractor_bname) {
		this.contractor_bname = contractor_bname;
	}

	public String getContractor_name() {
		return contractor_name;
	}

	public void setContractor_name(String contractor_name) {
		this.contractor_name = contractor_name;
	}

	public String getContractor_address() {
		return contractor_address;
	}

	public void setContractor_address(String contractor_address) {
		this.contractor_address = contractor_address;
	}

	public int getMember_seq() {
		return member_seq;
	}

	public void setMember_seq(int member_seq) {
		this.member_seq = member_seq;
	}

	public int getAdmin_seq() {
		return admin_seq;
	}

	public void setAdmin_seq(int admin_seq) {
		this.admin_seq = admin_seq;
	}

	@Override
	public String toString() {
		return "Contractor [contractor_seq=" + contractor_seq + ", contractor_bname=" + contractor_bname
				+ ", contractor_name=" + contractor_name + ", contractor_address=" + contractor_address
				+ ", member_seq=" + member_seq + ", admin_seq=" + admin_seq + "]";
	}
	
	
	
}
