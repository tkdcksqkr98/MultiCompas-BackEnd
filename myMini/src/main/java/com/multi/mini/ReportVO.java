package com.multi.mini;

import java.sql.Timestamp;

public class ReportVO {
	//MemberV0가방에 넣은 데이터는 Member테이블에 들어갈 예정
	//각 컬럼과 일치시켜 줌.
	private int no;
	private String content ;
	private String writer;
	private Timestamp writtenTime;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Timestamp getWrittenTime() {
		return writtenTime;
	}
	public void setWrittenTime(Timestamp writtenTime) {
		this.writtenTime = writtenTime;
	}
	@Override
	public String toString() {
		return "ReportVO [no=" + no + ", content=" + content + ", writer=" + writer + ", writtenTime=" + writtenTime
				+ "]";
	}
	
	
	
	
	
	
	
}
