public class InsurancePolicy {
	private String kodikos_paketou;
	private String perigrafi;
	private String diarkeia;
	
	public InsurancePolicy(String kodikos_paketou, String perigrafi, String diarkeia) {
		this.kodikos_paketou = kodikos_paketou;
		this.perigrafi = perigrafi;
		this.diarkeia = diarkeia;
	}
	
	public String getPerigrafi() {
		return perigrafi;
	}
	
}
