package com.communicom.messaging.messages;

import java.time.LocalDateTime;

import com.communicom.messaging.messages.signals.SignalType;

public class SetWaitForSignalRequest extends IMessage {

	private SignalType signal;
	private String signalValue;
	
	
	
	public SetWaitForSignalRequest(int messageNumber, String sourceAddress, String targetAddress,
			LocalDateTime emisionTime, String messageName) {
		super(messageNumber, sourceAddress, targetAddress, emisionTime, messageName);
		// TODO Auto-generated constructor stub
	}



	public SetWaitForSignalRequest(){

	}



	public SignalType getSignal() {
		return signal;
	}



	public void setSignal(SignalType signal) {
		this.signal = signal;
	}



	public String getSignalValue() {
		return signalValue;
	}



	public void setSignalValue(String signalValue) {
		this.signalValue = signalValue;
	}



	@Override
	public String toString() {
		return "SetWaitForSignalRequest [signal=" + signal + ", signalValue=" + signalValue + "]";
	}
	
	
	
}
