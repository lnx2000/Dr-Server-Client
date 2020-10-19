package sdl_project;
import java.util.ArrayList;
public class Patient {

private String name;
private char gender;
private String date;
private int weight;
private String address;
private String problem;
private String priority;
private ArrayList<Medicines> meds;


public Patient(String name, char gender, String date, int weight, String address, String problem,String priority){
this.name = name;
this.gender = gender;
this.date = date;
this.weight = weight;
this.address = address;
this.problem = problem;
this.priority = priority;

meds = new ArrayList<Medicines>();

}

public String get_name(){
return this.name;
}

public String get_priority(){
return this.priority;
}

public char get_gender(){
return this.gender;
}

public String get_date(){
return this.date;
}

public int get_weight(){
return this.weight;
}

public String get_address(){
return this.address;
}

public String get_problem(){
return this.problem;
}

public void set_problem(String problem){
this.problem = problem;
}

public void set_meds(ArrayList<Medicines> meds){
this.meds = meds;
}

public ArrayList<Medicines> get_meds(){
return this.meds;
}




}
