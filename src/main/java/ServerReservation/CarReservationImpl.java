package ServerReservation;

import carreservation.CarReservationGrpc.CarReservationImplBase;
import carreservation.LoginCarRequest;
import carreservation.LoginCarResponse;
import carreservation.UnlockCarRequest;
import carreservation.UnlockCarResponse;
import io.grpc.stub.StreamObserver;

public class CarReservationImpl extends CarReservationImplBase{

	@Override
	public StreamObserver<LoginCarRequest> loginCar(StreamObserver<LoginCarResponse> responseObserver) {
		
		return super.loginCar(responseObserver);
	}

	@Override
	public void unlockCar(UnlockCarRequest request, StreamObserver<UnlockCarResponse> responseObserver) {
		boolean unlocked = false;
		if (request.getKey().equals("123") && request.getPassword().equals("password123!")) {
			unlocked = true;
		} 
		UnlockCarResponse reply = UnlockCarResponse.newBuilder().setUnloocked(unlocked).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
 
}
