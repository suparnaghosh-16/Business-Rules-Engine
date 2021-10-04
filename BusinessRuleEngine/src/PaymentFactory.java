public class PaymentFactory {
	
   //use getShape method to get object of type shape 
   public Payment getPayment(String productType){
      if(productType == null){
         return null;
      }		
      if(productType.equalsIgnoreCase("physical product")){
        return new PackingSlip("shipping");
         
      } 
      if(productType.equalsIgnoreCase("book")){
         return new PackingSlip("royalty");
         
      } 
      
      if(productType.equalsIgnoreCase("commision") ){
          return new CommissionPayment();
          
       }
       if(productType.equalsIgnoreCase("Learning to Ski")){
         return new FirstAidVideo();
      }
       
       if(productType.equalsIgnoreCase("membership")){
           return new ActivateMembership();
        }
       if(productType.equalsIgnoreCase("upgrade")){
           return new UpgradeMembership();
        }
       if(productType.equalsIgnoreCase("email") ){
           return new EmailOwner();
           
        }
      return null;
   }
}