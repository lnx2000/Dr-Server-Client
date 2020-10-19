package sdl_project;

public class Medicines {
	private String name;
	private boolean dosage_morning;
	private boolean dosage_afternoon;
	private boolean dosage_night;
	private double qty_morning;
	private double qty_afternoon;
	private double qty_night;

	public Medicines(String name, boolean dm, boolean da, boolean dn, double d, double e, double f){

	this.name = name;
	dosage_morning = dm;
	dosage_afternoon = da;
	dosage_night = dn;
	qty_morning= d;
	qty_afternoon = e;
	qty_night = f;
	}

	

}
