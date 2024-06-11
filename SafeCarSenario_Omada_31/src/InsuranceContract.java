
public class InsuranceContract {
	private Customer customer;
	private Vehicle vehicle;
	private InsurancePolicy insurancepolicy;
	double cost;
	
	public InsuranceContract(Customer customer, Vehicle vehicle, InsurancePolicy insurancepolicy, double cost) {
		this.customer = customer;
		this.vehicle = vehicle;
		this.insurancepolicy = insurancepolicy;
		this.cost = cost;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public InsurancePolicy getInsurancePolicy() {
		return insurancepolicy;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void printData() {
		System.out.println( "Onoma Pelath : " + customer.getName() + ", Arithmos Pinakidas : " + vehicle.getArithmos_Plaisiou() + ", Perigrafi : " + insurancepolicy.getPerigrafi() + ", Kostos : " + cost);
	}
	
}
