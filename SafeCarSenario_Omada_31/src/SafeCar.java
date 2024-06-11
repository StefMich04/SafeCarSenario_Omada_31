import java.util.ArrayList;
import java.util.List;

public class SafeCar {

	public static void main(String[] args) {
		
		//Δημιουργία Πελατών
		Customer Customer1 = new Customer("Maria","Papadopoulou", "2310264368","maria.papadopoulou@gmail.com","AO79432");
		Customer Customer2 = new Customer("Evanthia","Papagianni", "2310245368","evanthia.papagianni@gmail.com","AO77813");
		Customer Customer3 = new Customer("Vasilis","Karagiannis", "2310245668","ioannis.karagiannis@gmail.com","AO45698");

		//Αποθήκευση Πελατών
		Customer1.addCustomer(Customer1);
		Customer2.addCustomer(Customer2);
		Customer3.addCustomer(Customer3);
		
		//Δημιουργία Οχημάτων
		Vehicle Vehicle1 = new Vehicle("Mercedes", "GLC", "XKP8923", "2020", "7C3FR76A515072256");
		Vehicle Vehicle2 = new Vehicle("Subaru", "Forester", "NII4269", "2018", "7C3FR76A555071465");
		Vehicle Vehicle3 = new Vehicle("Ford", "Ranger", "KOH4681", "2022", "7C3FR76A55504645");
		
		//Αποθήκευση Οχημάτων
		Vehicle1.addVehicle(Vehicle1);
		Vehicle2.addVehicle(Vehicle2);
		Vehicle3.addVehicle(Vehicle3);
		
		//Δημιουργία Πολιτικής Ασφάλειας
		InsurancePolicy InsurancePolicy1 = new InsurancePolicy("ΜI93", "Mikti asfalisi", "6");
		InsurancePolicy InsurancePolicy2 = new InsurancePolicy("B56", "Basiki asfalisi", "6");
		InsurancePolicy InsurancePolicy3 = new InsurancePolicy("O58", "Me odiki", "6");
		
		//Δημιουργία Ασφαλιστικών Συμβολαίων
		InsuranceContract InsuranceContract1 = new InsuranceContract(Customer1,Vehicle1,InsurancePolicy2,60);
		InsuranceContract InsuranceContract2 = new InsuranceContract(Customer2,Vehicle2,InsurancePolicy1,120);
		InsuranceContract InsuranceContract3 = new InsuranceContract(Customer2,Vehicle3,InsurancePolicy3,80);
		
		//Δημιουργία Λίστας Ασφαλιστικών Συμβολαίων
		List<InsuranceContract> contracts = new ArrayList<>();
		
		//Προσθήκη Συμβολαίων στην Λίστα Ασφαλιστικών Συμβολαίων
		contracts.add(InsuranceContract1);
		contracts.add(InsuranceContract2);
		contracts.add(InsuranceContract3);
		
		//Εμφάνιση Ασφαλιστικών Συμβολαίων
		for (InsuranceContract contract : contracts) {
			contract.printData();
		}
		System.out.println();
		
		//Εμφάνιση Στοιχείων Ασφαλισμένων Πελατών
		for (Customer customer : Customer.Customers) {
			customer.printInfo(contracts);
		}
	}
}