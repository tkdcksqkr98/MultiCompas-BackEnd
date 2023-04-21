package com.multi.mvc902;

//서버에서 받은 데이터를 채팅창에 들어와 있는 멤버 브라우저에게
//보낼 데이터를 넣을 vo ==>messageBroker
public class OutputMessage {

	private String from;
	private String text;
	private String time;

	public OutputMessage() {
	}
	public OutputMessage(String from, String text, String time) {
		super();
		this.from = from;
		this.text = text;
		this.time = time;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "OutputMessage [from=" + from + ", text=" + text + ", time=" + time + "]";
	}

}
