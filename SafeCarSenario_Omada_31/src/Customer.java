import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Customer {
	private String Name;
	private String LastName;
	private String Phone;
	private String Email;
	private String Arithmos_Taftotitas;
	
	public static ArrayList<Customer> Customers = new ArrayList<>();
	public static Set<String> CustomersId = new HashSet<>();
	
	public Customer(String Name, String LastName, String Phone, String Email, String Arithmos_Taftotitas) {
		this.Name = Name;
		this.LastName = LastName;
		this.Phone = Phone;
		this.Email = Email;
		this.Arithmos_Taftotitas = Arithmos_Taftotitas;
	}
	
	public String getArithmos_Taftotitas() {
		return Arithmos_Taftotitas;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public static void addCustomer(Customer customer) {
		if (!CustomersId.contains(customer.getArithmos_Taftotitas())) {
			CustomersId.add(customer.getArithmos_Taftotitas());
			Customers.add(customer);
		}
	}
	
	public void printInfo(List<InsuranceContract> contracts) {
		double total = 0;
		List<String> customerVehicles = new ArrayList<>();
		for (InsuranceContract contract : contracts) {
			if (contract.getCustomer().equals(this)) {
				customerVehicles.add(contract.getVehicle().getVehicleInfo());
				total += contract.getCost();
			}
		}
		System.out.println("Pelaths : " + this.getName() + " " + this.getLastName() + ", Asfalismena Oximata : " + customerVehicles + ", Synoliko Kostos : " + total);
	}
	
}
