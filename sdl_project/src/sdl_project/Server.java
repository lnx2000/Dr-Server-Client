package sdl_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket ss;
	Socket s;
	PrintStream ps;
	BufferedReader br;
	public void connect(){
		
		try {
			ss = new ServerSocket(3232);
			s = ss.accept();
			ps = new PrintStream(s.getOutputStream()); 
			br = new BufferedReader(new InputStreamReader(s.getInputStream())); 
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	public String request_data(){
		ps.println("next");
		
		String info = "", str = null;
		try {
			str = br.readLine();
				info += str;
				str=null;
				
		} catch (IOException e) {
			System.out.println(e.toString());
			
		}
		return info;
		
	}
	public void close(){
		
		try {
			ps.close();
			br.close();
			ss.close();
			s.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
	}
}
