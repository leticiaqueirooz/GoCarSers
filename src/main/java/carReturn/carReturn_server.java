package carReturn;


import carReturn.CarReturnGrpc.CarReturnImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import jmDNS.SimpleServiceRegistration;

public class carReturn_server extends CarReturnImplBase {

	public static void main(String[] args) {
		carReturn_server server4 = new carReturn_server();

    	System.out.println("Starting gRPC CarReturn service server.");
    	
    	//Define the port
		int port = 5015;
		
		// jmDNS
		String service_type = "_CarReturn._tcp.local.";
		String service_name = "GrpcServer";
		SimpleServiceRegistration ssr = new SimpleServiceRegistration();
		ssr.run(port, service_type, service_name);

		try {		
			Server server = ServerBuilder.forPort(port)
					
					//Implementing the interface
					
					.addService(new CarReturn_Impl()) 
					.build()
					.start();
			System.out.println("Server started, listening on " + port);
			server.awaitTermination();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}

