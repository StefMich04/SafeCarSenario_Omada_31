import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Vehicle {
	private String Marka;
	private String Modelo;
	private String Year;
	private String Pinakida;
	private String Arithmos_Plaisiou;
	
	public static ArrayList<Vehicle> Vehicles = new ArrayList<>();
	public static Set<String> Plaisia_Vehicles = new HashSet<>();
	
	public Vehicle(String Marka, String Modelo, String Year, String Pinakida, String Arithmos_Plaisiou) {
		this.Marka = Marka;
		this.Modelo = Modelo;
		this.Year = Year;
		this.Pinakida = Pinakida;
		this.Arithmos_Plaisiou = Arithmos_Plaisiou;
	}
	
	public String getArithmos_Plaisiou() {
		return Arithmos_Plaisiou;
	}
	
	public String getVehicleInfo() {
		return Marka + " " + Modelo;
	}
	
	public void addVehicle(Vehicle vehicle) {
		if (!Plaisia_Vehicles.contains(vehicle.getArithmos_Plaisiou())) {
			Plaisia_Vehicles.add(vehicle.Arithmos_Plaisiou);
			Vehicles.add(vehicle);
		}
	}
	
}


