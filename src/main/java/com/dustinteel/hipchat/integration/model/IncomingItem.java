package com.dustinteel.hipchat.integration.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IncomingItem {
	private String id;
	private List<String> mentions;
	private IncomingMessage incomingMessage;
	private IncomingRoom room;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getMentions() {
		return mentions;
	}
	public void setMentions(List<String> mentions) {
		this.mentions = mentions;
	}
	@JsonProperty("message")
	public IncomingMessage getIncomingMessage() {
		return incomingMessage;
	}
	@JsonProperty("message")
	public void setIncomingMessage(IncomingMessage incomingMessage) {
		this.incomingMessage = incomingMessage;
	}
	public IncomingRoom getRoom() {
		return room;
	}
	public void setRoom(IncomingRoom room) {
		this.room = room;
	}
}
