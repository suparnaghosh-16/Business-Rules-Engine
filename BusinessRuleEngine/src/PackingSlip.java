
public class PackingSlip implements Payment{
	String productType;
	PackingSlip(String productType){
		this.productType=productType;
		System.out.println("Generate Slip for: " +productType);
	}
	
	/*
	 * public void generateSlip(String productType) {
	 * System.out.println("Generate Slip for: " +productType);
	 * 
	 * }
	 */

@Override
public void description() {
	// TODO Auto-generated method stub
	System.out.println("Slip generated ");
	
}
}
