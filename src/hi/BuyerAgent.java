package hi;

import jade.core.Agent;

public class BuyerAgent extends Agent {
    @Override
    protected void setup() {
        System.out.println("BuyerAgent " + getLocalName() + " is ready.");
    }

    @Override
    protected void takeDown() {
        System.out.println("BuyerAgent " + getLocalName() + " is terminating.");
    }
}
