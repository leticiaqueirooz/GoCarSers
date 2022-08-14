package ServerReservation;



import carreservation.CarReservationGrpc.CarReservationImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import jmDNS.SimpleServiceRegistration;

public class CarReservationServer extends CarReservationImplBase {

	public static void main(String[] args) {
		CarReservationServer CarResevationServer = new CarReservationServer();

    	System.out.println("Starting gRPC CarReservation service server.");
    	
    	//Define the port
		int port = 8081;
		
		// jmDNS
		String service_type = "_CarReservation._tcp.local.";
		String service_name = "GrpcServer";
		SimpleServiceRegistration ssr = new SimpleServiceRegistration();
		ssr.run(port, service_type, service_name);

		try {		
			Server server = ServerBuilder.forPort(port)
					
					//Implementing the interface
					
					.addService(new CarReservationImpl()) 
					.build()
					.start();
			System.out.println("Server started, listening on " + port);
			server.awaitTermination();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}

