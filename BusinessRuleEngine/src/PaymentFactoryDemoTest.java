import static org.junit.Assert.assertSame;

import org.junit.Test;

public class PaymentFactoryDemoTest {
    
    private PaymentFactory paymentFactory = new PaymentFactory();

    @Test
    public final void payExample1() {
        // given
       String paymentType = "book";

        // when
        Payment pay = paymentFactory.getPayment(paymentType);
        
       
        // then
        assertSame("Test for Example 1 failed", new PackingSlip("royalty"), pay );
    }

	

}
