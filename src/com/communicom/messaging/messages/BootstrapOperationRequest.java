package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class BootstrapOperationRequest extends IMessage {
	private String version;

	public BootstrapOperationRequest() {

	}

	public BootstrapOperationRequest(int messageNumber, String sourceAddress, String targetAddress,
			LocalDateTime emisionTime, String messageName) {
		super(messageNumber, sourceAddress, targetAddress, emisionTime, messageName);

	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "BootstrapOperationRequest [version=" + version + "]";
	}
	
	
}
