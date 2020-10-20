package kosta1200.todayroom.dto;

import java.io.Serializable;

public class Member implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer memberSeq;
	private String memberId;
	private String memberNickname;
	private String memberName;
	private String memberAddress;
	private String memberPhone;
	private String memberEmail;
	private String memberRating;
	private String memberPassword;
	private String memberFollows;
	
	public Member() {
	}
	public Member(Integer memberSeq, String memberId, String memberNickname, String memberName, String memberAddress,
			String memberPhone, String memberEmail, String memberRating, String memberPassword, String memberFollows) {
		super();
		this.memberSeq = memberSeq;
		this.memberId = memberId;
		this.memberNickname = memberNickname;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.memberRating = memberRating;
		this.memberPassword = memberPassword;
		this.memberFollows = memberFollows;
	}




	public void setMemberSeq(Integer memberSeq) {
		this.memberSeq = memberSeq;
	}

	public Integer getMemberSeq() {
		return this.memberSeq;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberId() {
		return this.memberId;
	}

	/**
	 * ������ �����մϴ�..
	 * 
	 * @param memberNickname
	 *            ����
	 */
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	/**
	 * ������ �����ɴϴ�..
	 * 
	 * @return ����
	 */
	public String getMemberNickname() {
		return this.memberNickname;
	}

	/**
	 * �̸��� �����մϴ�..
	 * 
	 * @param memberName
	 *            �̸�
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * �̸��� �����ɴϴ�..
	 * 
	 * @return �̸�
	 */
	public String getMemberName() {
		return this.memberName;
	}

	/**
	 * �ּ��� �����մϴ�..
	 * 
	 * @param memberAddress
	 *            �ּ�
	 */
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	/**
	 * �ּ��� �����ɴϴ�..
	 * 
	 * @return �ּ�
	 */
	public String getMemberAddress() {
		return this.memberAddress;
	}

	/**
	 * �ڵ�����ȣ�� �����մϴ�..
	 * 
	 * @param memberPhone
	 *            �ڵ�����ȣ
	 */
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	/**
	 * �ڵ�����ȣ�� �����ɴϴ�..
	 * 
	 * @return �ڵ�����ȣ
	 */
	public String getMemberPhone() {
		return this.memberPhone;
	}

	/**
	 * e-mail�� �����մϴ�..
	 * 
	 * @param memberEmail
	 *            e-mail
	 */
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	/**
	 * e-mail�� �����ɴϴ�..
	 * 
	 * @return e-mail
	 */
	public String getMemberEmail() {
		return this.memberEmail;
	}

	/**
	 * ȸ������� �����մϴ�..
	 * 
	 * @param memberRating
	 *            ȸ�����
	 */
	public void setMemberRating(String memberRating) {
		this.memberRating = memberRating;
	}

	/**
	 * ȸ������� �����ɴϴ�..
	 * 
	 * @return ȸ�����
	 */
	public String getMemberRating() {
		return this.memberRating;
	}

	/**
	 * ��й�ȣ�� �����մϴ�..
	 * 
	 * @param memberPassword
	 *            ��й�ȣ
	 */
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	/**
	 * ��й�ȣ�� �����ɴϴ�..
	 * 
	 * @return ��й�ȣ
	 */
	public String getMemberPassword() {
		return this.memberPassword;
	}

	/**
	 * �ȷο���� �����մϴ�..
	 * 
	 * @param memberFollows
	 *            �ȷο��
	 */
	public void setMemberFollows(String memberFollows) {
		this.memberFollows = memberFollows;
	}

	/**
	 * �ȷο���� �����ɴϴ�..
	 * 
	 * @return �ȷο��
	 */
	public String getMemberFollows() {
		return this.memberFollows;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberSeq == null) ? 0 : memberSeq.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Member other = (Member) obj;
		if (memberSeq == null) {
			if (other.memberSeq != null) {
				return false;
			}
		} else if (!memberSeq.equals(other.memberSeq)) {
			return false;
		}
		return true;
	}

}
