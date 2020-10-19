package sdl_project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

import com.google.gson.Gson;

public class receptionist implements Runnable{
	
	public ArrayList<Patient> patients;
	public String menu = "1.add\n2.exit\n";
	public boolean exit = false;
	
public void add(){
	Patient p = new Patient("name1",'M',"10/08/2020",100, "abc","fever","medium");
	//patients.add(p);
	int index = get_index_in_list("medium");
	patients.add(index+1,p);
	
	
	Patient p1 = new Patient("name2",'M',"10/08/2020",100, "abc","fever","medium");
	index = get_index_in_list("medium");
	patients.add(index+1,p1);

	Patient p2 = new Patient("name3",'M',"10/08/2020",100, "abc","fever","high");
	index = get_index_in_list("high");
	patients.add(index+1,p2);

	Patient p3 = new Patient("name4",'M',"10/08/2020",100, "abc","fever","medium");
	index = get_index_in_list("medium");
	patients.add(index+1,p3);
	
	
	

}	
public void display(){
	//int count = 0;
	for (Patient element : patients){ 
        log(element.get_name());
	//count++;
	}
	//log(count);
}
public int get_int(){
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	sc.close();
	return choice;
}

public <T> void log(T msg){
	System.out.println(msg);
}
public int get_index_in_list(String priority){

	int index = -1;
	for(Patient element: patients){
		if(priority.length()>=element.get_priority().length()){
			index++;
		}
		else break;
	}
	return index;
	
}
public void run() {
	String info=null, str1 = null;
	Client client = new Client();
	client.connect();
	Gson gson = new Gson();
	while(!exit){
		try {
				str1 = client.br.readLine();
				
				System.out.println(str1);
				if(str1.equals("next"))
				{
					if(patients.size()==0)
						info = "modellll";
					else{
						info = gson.toJson(patients.get(0));
						patients.remove(0);
					}
					client.dos.writeBytes(info + "\n");
					info = null;
				}
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	
}

}
