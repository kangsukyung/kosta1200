package kosta1200.todayroom.vo;

import java.io.Serializable;

public class FollowVO implements Serializable {
	private int follow_seq;
	private int member_seq_me;
	private int member_seq_other;
	
	public FollowVO() {}

	public FollowVO(int follow_seq, int member_seq_me, int member_seq_other) {
		super();
		this.follow_seq = follow_seq;
		this.member_seq_me = member_seq_me;
		this.member_seq_other = member_seq_other;
	}

	public int getFollow_seq() {
		return follow_seq;
	}

	public void setFollow_seq(int follow_seq) {
		this.follow_seq = follow_seq;
	}

	public int getMember_seq_me() {
		return member_seq_me;
	}

	public void setMember_seq_me(int member_seq_me) {
		this.member_seq_me = member_seq_me;
	}

	public int getMember_seq_other() {
		return member_seq_other;
	}

	public void setMember_seq_other(int member_seq_other) {
		this.member_seq_other = member_seq_other;
	}

	@Override
	public String toString() {
		return "Follow [follow_seq=" + follow_seq + ", member_seq_me=" + member_seq_me + ", member_seq_other="
				+ member_seq_other + "]";
	}
	
	
	

}
