package CarsOptions;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import jmDNS.SimpleServiceDiscovery;


public class CarsOptions_Client {
    private static CarsOptionsGrpc.CarsOptionsBlockingStub bStub;    

	public static void main(String[] args) throws InterruptedException {

		// jmdns
		ServiceInfo serviceInfo;
		String service_type = "_CarOptions._tcp.local.";
		serviceInfo = SimpleServiceDiscovery.run(service_type);
		
		// port & host
		int port = 5010;
		String host = "localhost";
		
    	// build a channel
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host , port)
				.usePlaintext()
				.build();
		
		// stub
		bStub = CarsOptionsGrpc.newBlockingStub(channel);

		RequestCar();
		
		System.out.println("Shutting down channel!");
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);

	}
    
    // method one - REQUEST CAR
    public static void RequestCar() {
    	// GUI
		JFrame f;
		f = new JFrame();
		
		// method 1.				
		int a = JOptionPane.showConfirmDialog(f,
				"CarsOptions\nHi, we searched the cars near to your location\n"
				+ "Would you like to know them? ");
		if (a != JOptionPane.YES_OPTION) {
			return;
		}
		
		CarRequest request = CarRequest.newBuilder().setCar("Volvo").build();
		Iterator<CarResponse> response;

		try {
			response = bStub.requestCar(request);
			for(int i = 1; response.hasNext(); i++) {
				CarResponse result = response.next();
				JOptionPane.showMessageDialog(f, "RESPONSE # " + i + " : " + result);
				System.out.println("RESPONSE # " + i + " : " + result);
			}			
		} catch (StatusRuntimeException e) {
			// logInfo("RPC failed: {0}", e.getStatus());
			System.out.println("RPC failed: {0} " + e.getStatus());
			return;
		}
				
    }
    
}

