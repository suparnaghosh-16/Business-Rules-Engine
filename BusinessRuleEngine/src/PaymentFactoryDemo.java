import java.util.Scanner;

public class PaymentFactoryDemo {
	
	public static void main(String[] args) {
		PaymentFactory paymentFactory = new PaymentFactory();

	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter product type: /n");
	     String prodtype= sc.nextLine();
	     Payment payment = paymentFactory.getPayment(prodtype);
	     payment.description();
	     if(prodtype.equalsIgnoreCase("physical product") || prodtype.equalsIgnoreCase("book")) {
			Payment commision = paymentFactory.getPayment("commision");
			commision.description();
	     }
	     if(prodtype.equalsIgnoreCase("membership") || prodtype.equalsIgnoreCase("upgrade")) {
				Payment email = paymentFactory.getPayment("email");
				email.description();
		     }
	     
			/*
			 * Payment physical = paymentFactory.getPayment("physical product");
			 * physical.description(); // Payment comision =
			 * paymentFactory.getPayment("commission"); physical.description();
			 * 
			 * Payment book = paymentFactory.getPayment("book"); book.description();
			 * 
			 * Payment video = paymentFactory.getPayment("Learning to Ski");
			 * video.description();
			 * 
			 * 
			 * Payment membership = paymentFactory.getPayment("membership");
			 * membership.description();
			 * 
			 * Payment upgrade = paymentFactory.getPayment("upgrade");
			 * upgrade.description();
			 */
	      
	   }

}
