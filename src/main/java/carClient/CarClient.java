package carClient;

import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;
import javax.swing.JOptionPane;

import carreservation.CarReservationGrpc;
import carreservation.UnlockCarRequest;
import carreservation.UnlockCarResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import jmDNS.SimpleServiceDiscovery;


public class CarClient {
     public static void main(String[] args) throws InterruptedException {
        
      
     // jmdns
     		@SuppressWarnings("unused")
     		ServiceInfo serviceInfo;
     		String service_type = "_CarReservation._tcp.local.";
     		String service_name = "GrpcServer";
     		serviceInfo = SimpleServiceDiscovery.run(service_type);
     		
     		// port & host
     		int port = 8081;
     		String host = "localhost";
     				
         	// build a channel
     		ManagedChannel channel = ManagedChannelBuilder
     				.forAddress(host , port)
     				.usePlaintext()
     				.build();
        
   
        CarReservationGrpc.CarReservationBlockingStub stub = CarReservationGrpc.newBlockingStub(channel);
        String nome = JOptionPane.showInputDialog("Please insert your Car Id/login");
        String sobrenome = JOptionPane.showInputDialog("Please insert your password");

        // Procedure Remote Call (RPC)
        UnlockCarResponse respostaDoServidor = stub.unlockCar(UnlockCarRequest.newBuilder()
            .setKey(nome).setPassword(sobrenome).build());

        JOptionPane.showMessageDialog(null, respostaDoServidor.getUnloocked());                
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
}

