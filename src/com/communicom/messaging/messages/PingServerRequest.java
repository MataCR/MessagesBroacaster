package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerRequest extends IMessage{

	
	public PingServerRequest(int messageNumber, String sourceAddress, String targetAddress, LocalDateTime emisionTime, String messageName) {
		super(messageNumber, sourceAddress, targetAddress, emisionTime, messageName);
		
	}

	public PingServerRequest(){

	}

	@Override
	public String toString() {
		return "PingServerRequest []";
	}
	
	
	
	
	
	
	
}
