package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerResponse extends IMessage{

	
	public PingServerResponse(int messageNumber, String sourceAddress, String targetAddress,
			LocalDateTime emisionTime, String messageName) {
		super(messageNumber, sourceAddress, targetAddress, emisionTime, messageName);
		// TODO Auto-generated constructor stub
	}

	public PingServerResponse(){

	}

	@Override
	public String toString() {
		return "PingServerResponse []";
	}
	
	
}
