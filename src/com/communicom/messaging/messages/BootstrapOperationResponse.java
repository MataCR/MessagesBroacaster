package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class BootstrapOperationResponse extends IMessage{
	private boolean result;
	private boolean errorMessage;
	public BootstrapOperationResponse() {

	}
	
	public BootstrapOperationResponse(int messageNumber, String sourceAddress, String targetAddress,
			LocalDateTime emisionTime, String messageName) {
		super(messageNumber, sourceAddress, targetAddress, emisionTime, messageName);
		// TODO Auto-generated constructor stub	}
	
}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public boolean isErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(boolean errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "BootstrapOperationResponse [result=" + result + ", errorMessage=" + errorMessage + "]";
	}
	
	
}
