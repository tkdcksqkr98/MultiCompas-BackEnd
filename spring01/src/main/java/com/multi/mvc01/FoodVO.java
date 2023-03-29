package com.multi.mvc01;

public class FoodVO {
	//MemberV0가방에 넣은 데이터는 Member테이블에 들어갈 예정
	//각 컬럼과 일치시켜 줌.
	private String like;
	private String dislike;
	
	
	
	public String getLike() {
		return like;
	}
	@Override
	public String toString() {
		return "FoodVO [like=" + like + ", dislike=" + dislike + "]";
	}
	public void setLike(String like) {
		this.like = like;
	}
	public String getDislike() {
		return dislike;
	}
	public void setDislike(String dislike) {
		this.dislike = dislike;
	}

	
	
	

	
	
	
	
}
