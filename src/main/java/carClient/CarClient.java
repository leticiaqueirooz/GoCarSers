package carClient;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import carreservation.CarReservationGrpc;
import carreservation.UnlockCarRequest;
import carreservation.UnlockCarResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class CarClient {
     public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
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

