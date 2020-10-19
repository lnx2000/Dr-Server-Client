package sdl_project;

import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

public class MainClass {
	static receptionist rep;
	public static String menu = "1.add\n2.exit\n";
	static Scanner sc = new Scanner(System.in);
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		rep = new receptionist();
		rep.patients = new ArrayList<Patient>();
		
		Thread t = new Thread(rep);
		t.start();
		while(true){
			log(menu);
			int choice =get_int();
			switch(choice){
			case 1: 
				rep.add();
				break;
			case 2:
				if(rep.patients.size()!=0){
					rep.log("You cant exit");
				}
				else{
					rep.exit = true;
					return;
					
				}
			}
		}
	}
	public static <T> void log(T msg){
		System.out.println(msg);
	}
	public static int get_int(){
		//Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
	}
	


}
