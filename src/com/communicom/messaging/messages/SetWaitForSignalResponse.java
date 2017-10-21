package com.communicom.messaging.messages;

import java.time.LocalDateTime;

import com.communicom.messaging.messages.signals.SignalType;

public class SetWaitForSignalResponse extends IMessage{

	private SignalType signal;
	private String signalExpectedValue;
	private String signalReceivedValue;
	
	public SetWaitForSignalResponse(){

	}

	public SetWaitForSignalResponse(int messageNumber, String sourceAddress, String targetAddress,
			LocalDateTime emisionTime, String messageName) {
		super(messageNumber, sourceAddress, targetAddress, emisionTime, messageName);
		// TODO Auto-generated constructor stub
	}

	public SignalType getSignal() {
		return signal;
	}

	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalExpectedValue() {
		return signalExpectedValue;
	}

	public void setSignalExpectedValue(String signalExpectedValue) {
		this.signalExpectedValue = signalExpectedValue;
	}

	public String getSignalReceivedValue() {
		return signalReceivedValue;
	}

	public void setSignalReceivedValue(String signalReceivedValue) {
		this.signalReceivedValue = signalReceivedValue;
	}

	@Override
	public String toString() {
		return "SetWaitForSignalResponse [signal=" + signal + ", signalExpectedValue=" + signalExpectedValue
				+ ", signalReceivedValue=" + signalReceivedValue + "]";
	}
	
	
	
}
