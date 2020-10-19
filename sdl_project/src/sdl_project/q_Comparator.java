package sdl_project;

import java.util.Comparator;

public class q_Comparator implements Comparator<Patient> {
	public int compare(Patient p1,Patient p2){
		String str1 = p1.get_priority();
		String str2 = p2.get_priority();
		//receptionist.log(priority_1);
		//receptionist.log(priority_2);
		//System.out.println(p1.get_name());
		//System.out.println(p2.get_name());
		if (str1.length() < str2.length())
			return -1;
        else if(str1.length()>str2.length()) return 1;
		return 0;
		
	}
	

}
