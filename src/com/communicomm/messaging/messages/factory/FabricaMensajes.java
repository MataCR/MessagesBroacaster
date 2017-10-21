package com.communicomm.messaging.messages.factory;

import com.communicom.messaging.messages.BootstrapOperationRequest;
import com.communicom.messaging.messages.BootstrapOperationResponse;
import com.communicom.messaging.messages.IMessage;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;

public class FabricaMensajes {

	public static IMessage crearMensajes(int type)throws Exception{
		if (type == 1){
			return new PingServerRequest();
		}
		if (type == 2) {
			return new PingServerResponse();
		}
		if (type == 3) {
			return new SetWaitForSignalRequest();
		}
		if (type == 4){ 
			return new SetWaitForSignalResponse();
		}
		if (type == 5){ 
			return new BootstrapOperationRequest();
		}
		if (type == 6){ 
			return new BootstrapOperationResponse();
		}
		throw new Exception("Error unknow message");
	}

}
