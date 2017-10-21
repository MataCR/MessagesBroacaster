package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class  IMessage {
	private int messageNumber;
	private String sourceAddress;
	private String targetAddress;
	private LocalDateTime emisionTime;
	private String messageName;
	public IMessage() {
		messageNumber = 0;
		sourceAddress = "";
		targetAddress = "";
	}

	public IMessage(int messageNumber, String sourceAddress, String targetAddress, LocalDateTime emisionTime, String messageName) {
		super();
		this.messageNumber = messageNumber;
		this.sourceAddress = sourceAddress;
		this.targetAddress = targetAddress;
		this.emisionTime = emisionTime;
		this.messageName = messageName;
	}

	public int getMessageNumber() {
		return messageNumber;
	}

	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}

	public String getSourceAddress() {
		return sourceAddress;
	}

	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	public String getTargetAddress() {
		return targetAddress;
	}

	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}

	public LocalDateTime getEmisionTime() {
		return emisionTime;
	}

	public void setEmisionTime(LocalDateTime emisionTime) {
		this.emisionTime = emisionTime;
	}

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	@Override
	public String toString() {
		return "IMessage [messageNumber=" + messageNumber + ", sourceAddress=" + sourceAddress + ", targetAddress="
				+ targetAddress + ", emisionTime=" + emisionTime + ", messageName=" + messageName + "]";
	}
	
	
	
}
