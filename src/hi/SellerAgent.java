package hi;

import jade.core.Agent;

public class SellerAgent extends Agent {
    @Override
    protected void setup() {
        System.out.println("SellerAgent " + getLocalName() + " is ready.");
    }

    @Override
    protected void takeDown() {
        System.out.println("SellerAgent " + getLocalName() + " is terminating.");
    }
}
