package hi;

import jade.core.Agent;

import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class CashierAgent extends Agent {
    @Override
    protected void setup() {
        System.out.println("CashierAgent " + getLocalName() + " is ready.");

        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage msg = receive();
                if (msg != null) {
                    System.out.println("Processing payment for: " + msg.getContent());
                } else {
                    block();
                }
            }
        });
    }
}
