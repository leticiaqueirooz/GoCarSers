package CarsOptions;

import java.util.LinkedList;

import CarsOptions.CarsOptionsGrpc.CarsOptionsImplBase;
import io.grpc.stub.StreamObserver;

public class CarOptions_Impl extends CarsOptionsImplBase{

	@Override
	public void requestCar(CarRequest request, StreamObserver<CarResponse> responseObserver) {
		 LinkedList<CarResponse> Cars = new LinkedList<CarResponse>();
		  
		  Cars.add(CarResponse.newBuilder()
				  .setModel("Mercedes")
				  .setPrice(50)
	              .build());
		  
		  Cars.add(CarResponse.newBuilder()
				  .setModel("Aldi")
				  .setPrice(100)
	              .build());
		 
	      for (int i = 0; i < 2; i++) {
	    	  CarResponse stockQuote = CarResponse.newBuilder()
	    			  .setModel(Cars.get(i).getModel())
	    			  .setPrice(Cars.get(i).getPrice())
	         
	                  .build();

	          responseObserver.onNext(stockQuote);
	      }
	      responseObserver.onCompleted();
	  }
	  
	}