package kosta1200.todayroom.dto;

import java.io.Serializable;

/**
 * 팔로우 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Follow implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 팔로우번호. */
	private Integer followSeq;

	/**
	 * 생성자.
	 */
	public Follow() {
	}
	
	

	public Follow(Integer followSeq) {
		super();
		this.followSeq = followSeq;
	}



	/**
	 * 팔로우번호을 설정합니다..
	 * 
	 * @param followSeq
	 *            팔로우번호
	 */
	public void setFollowSeq(Integer followSeq) {
		this.followSeq = followSeq;
	}

	/**
	 * 팔로우번호을 가져옵니다..
	 * 
	 * @return 팔로우번호
	 */
	public Integer getFollowSeq() {
		return this.followSeq;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((followSeq == null) ? 0 : followSeq.hashCode());
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
		Follow other = (Follow) obj;
		if (followSeq == null) {
			if (other.followSeq != null) {
				return false;
			}
		} else if (!followSeq.equals(other.followSeq)) {
			return false;
		}
		return true;
	}

}
