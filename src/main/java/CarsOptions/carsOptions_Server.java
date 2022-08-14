package CarsOptions;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.logging.Logger;

import CarsOptions.CarsOptionsGrpc.CarsOptionsImplBase;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;
import jmDNS.SimpleServiceRegistration;



public class carsOptions_Server extends CarsOptionsImplBase{
	
    public static void main(String[] args) throws IOException, InterruptedException {
    	
    	// get a reference to the server
    	carsOptions_Server service1 = new carsOptions_Server();	
    	System.out.println("Starting gRPC Car Options service server.");
    	
    	//Define the port
		int port = 5010;
		
		// jmDNS
		String service_type = "_CarOptions._tcp.local.";
		String service_name = "GrpcServer";
		SimpleServiceRegistration ssr = new SimpleServiceRegistration();
		ssr.run(port, service_type, service_name);
		
		try {		
			Server server = ServerBuilder.forPort(port)
					
					//Implementing the interface
					.addService(new CarOptions_Impl())
					.build()
					.start();
			System.out.println("Server started, listening on " + port);
			server.awaitTermination();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}

}
