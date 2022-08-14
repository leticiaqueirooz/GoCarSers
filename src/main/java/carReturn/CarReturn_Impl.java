package carReturn;

import java.util.ArrayList;


import carReturn.CarReturnGrpc.CarReturnImplBase;
import io.grpc.stub.StreamObserver;

public class CarReturn_Impl extends CarReturnImplBase{
	
		String previousAddress = "Returning Adress";
		String photo = "photoCar";
    	ArrayList sampleList = new ArrayList();
	
	@Override
	public StreamObserver<CarReturnRequest> carReturn(StreamObserver<CarReturnResponse> responseObserver) {
		StreamObserver<CarReturnRequest> requestObserver = new StreamObserver<CarReturnRequest>()
        {
 
            @Override
            public void onNext(CarReturnRequest value)
            {   int i = 0;

            	sampleList.add(value.getItem());
            	         	
            }
            @Override
            public void onError(Throwable t)
            {            }
            @Override
            public void onCompleted()
            {	int i = 0;
            	String response = "";
            	if(sampleList.get(i).equals(previousAddress) && sampleList.get(i+1).equals("photoCar")) {
            		response = "Thank you for using our services!";
            	}else {
            		response = "Please deliver the car back to where it was";
            	}
            	
            	
                responseObserver.onNext(CarReturnResponse.newBuilder().setReturnOk(response).build());
                responseObserver.onCompleted();
            }
	

        };
        return requestObserver;
    }
	}

	

