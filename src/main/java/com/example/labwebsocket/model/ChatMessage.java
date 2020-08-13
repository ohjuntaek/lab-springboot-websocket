package com.example.labwebsocket.model;

import lombok.Data;

@Data
public class ChatMessage {
	private MessageType type;
	private String content;
	private String sender;
}
