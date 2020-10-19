package sdl_project;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	Socket s;
	DataOutputStream dos;
	BufferedReader br ;
	public void connect(){
		try {
			s = new Socket("localhost",3232);
			dos = new DataOutputStream(s.getOutputStream()); 
			br= new BufferedReader( new InputStreamReader(s.getInputStream())); 
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.toString());
			//e.printStackTrace();
		}
		
		
	}
}
