package ServerReservation;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class CarReservationServer {
	public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080).addService(new CarReservationImpl()).build();
        System.out.println("Starting server...");
        server.start();
        System.out.println("Server started!");
        server.awaitTermination();
    }
}
