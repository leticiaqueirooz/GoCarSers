package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import io.grpc.StatusRuntimeException;

import java.awt.Insets;

import javax.swing.JTextField;

import javax.swing.Box;
import javax.swing.BoxLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import java.util.Iterator;

import javax.swing.JPanel;

import CarsOptions.CarRequest;
import CarsOptions.CarResponse;
import CarsOptions.CarsOptionsGrpc;

import java.awt.Dimension;

import javax.swing.border.EmptyBorder;



public class ServiceGUI implements ActionListener{
	
	private static int CarPort = 5000;

	private JTextField entry1, reply1;

	
	private JPanel getService1JPanel() {
		JPanel panel = new JPanel();
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		
		// create an instance of a label
		JLabel label = new JLabel("Request a car");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry1 = new JTextField("cars", 10);
		panel.add(entry1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Service 1");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply1 = new JTextField("", 10);
		reply1.setEditable(false);
		panel.add(reply1);
		panel.setLayout(boxlayout);
		
		return panel;
	}
	
	
	
	private JPanel closeJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.PAGE_AXIS);

		JButton button = new JButton("Exit here");
		button.addActionListener(this);
		panel.add(button);

		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});

		panel.setLayout(boxlayout);
		return panel;
	}
	
// ---------------------------------------------------------------------------------------------- //


	public static void main(String[] args) throws InterruptedException, IOException {

		ServiceGUI gui = new ServiceGUI();
		gui.build();
		
	}
	private void build() {

		// create an instance of frame
		JFrame frame = new JFrame("GoCar Service");
			
		// Set the panel to add buttons
		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.PAGE_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(100, 100, 100, 100)));

		panel.add(getService1JPanel());
		panel.add(closeJPanel());

		// Set size for the frame
		frame.setSize(420, 420);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();

		// make frame visible
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		JButton button = (JButton) e.getSource();
		String label = button.getActionCommand();
		
		if (label.equals("Invoke Service 1")) {	
			
			ManagedChannel channel = ManagedChannelBuilder
					.forAddress("localhost", CarPort)
					.usePlaintext()
					.build();
			
			System.out.println(" ===================================================="
					+ "\n Checking Cars close to you ...");
			
			CarsOptionsGrpc.CarsOptionsBlockingStub stub = CarsOptionsGrpc
					.newBlockingStub(channel);
			
			CarRequest request = CarRequest
					.newBuilder()
					.setCar("")
					.build();

			Iterator<CarResponse> responseIterator;

			try {
				responseIterator = stub.requestCar(request);
				reply1.setText("CAR NEAR FROM YOU in : " + request.getCar());
				// only last response is returned in gui
				for (int i = 1; responseIterator.hasNext(); i++) {
					CarResponse result = responseIterator.next();
					System.out.println("RESPONSE # " + i + ": " + result);
				}
			} catch (StatusRuntimeException e1) {
				// logInfo("RPC failed: {0}", e.getStatus());
				System.out.println("RPC failed: {0} " + e1.getStatus());
			}
			
			System.out.println("REQUEST COMPLETE! "
					+ "\n ===============================================");

		
		} 

	}
}
	

				


