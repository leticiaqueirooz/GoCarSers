package carReturn;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import jmDNS.SimpleServiceDiscovery;

public class CarReturn_client {   

	public static void main(String[] args) throws InterruptedException {

		// jmdns
		@SuppressWarnings("unused")
		ServiceInfo serviceInfo;
		String service_type = "_CarReturn._tcp.local.";
		String service_name = "GrpcServer";
		serviceInfo = SimpleServiceDiscovery.run(service_type);
		
		// port & host
		int port = 5015;
		String host = "localhost";
				
    	// build a channel
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host , port)
				.usePlaintext()
				.build();
		
		//Calling the BiDirectionalMethod
		doClientStreamingCall(channel);
		
		// Shutting down the client!
		System.out.println("Shutting down channel");
		channel.shutdown().awaitTermination(15, TimeUnit.SECONDS);
	}
	
	
	//Client Streaming
    private static void doClientStreamingCall(ManagedChannel channel)
    {   //synchronous >> //SmartwatchServiceGrpc.SmartwatchServiceBlockingStub stub = SmartwatchServiceGrpc.newBlockingStub(channel);
        //asynchronous client
    	System.out.println("Starting client streaming...");
        CarReturnGrpc.CarReturnStub asyncClient = CarReturnGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<CarReturnRequest> requestObsever = asyncClient.carReturn(new StreamObserver<CarReturnResponse>() {
            @Override
            public void onNext(CarReturnResponse value)
            {
                System.out.println("Received a response from the server.");
                System.out.println("Reveived your data about the return: "+value.getReturnOk());
            }
            @Override
            public void onError(Throwable t)
            {            }
            @Override
            public void onCompleted()
            {                
                latch.countDown();
            }

        });
        String[] sampleList = {"Returning Adress", "photoCar"};
        
        for (int i = 0; i<2; i++) {
        	
        	String item = sampleList[i];
        	System.out.println("Sending  to server item "+ item +" to be verified!");        	
            requestObsever.onNext(CarReturnRequest.newBuilder()
            		.setItem(item).build());
        }        
        requestObsever.onCompleted();        
        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
