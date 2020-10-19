package sdl_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ServerMain {
	static Server s;
	static JFrame frame;
	static JButton button;
	static JLabel label;
	public static void main(String[] args){
		s = new Server();
		s.connect();
		System.out.println("connected");
		frame = new JFrame("Server");
		button = new JButton("Next");
		label = new JLabel("Text");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		button.setBounds(0, 0, 100, 100);
		label.setBounds(100, 100, 400,500);
        // adds button in JFrame 
        frame.add(button);
        frame.add(label);
  
        // sets 500 width and 600 height 
        frame.setSize(500, 600); 
          
        // uses no layout managers 
        frame.setLayout(null); 
          
        // makes the frame visible 
        frame.setVisible(true); 
		
		
		
		
		button.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				String data = s.request_data();
				label.setText(data);
				
			}
			
		});

	}

}
