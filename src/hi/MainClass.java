package hi;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

public class MainClass {
    public static void main(String[] args) {
        // تشغيل منصة JADE
        try {
            Runtime runtime = Runtime.instance();
            Profile profile = new ProfileImpl();
            
            // تعطيل واجهة JADE GUI
            profile.setParameter(Profile.GUI, "false");
            profile.setParameter(Profile.MAIN_PORT, "1099");

            ContainerController container = runtime.createMainContainer(profile);

            // إنشاء الوكلاء
            AgentController sellerAgent = container.createNewAgent("seller", "hi.SellerAgent", null);
            sellerAgent.start();

            AgentController buyerAgent = container.createNewAgent("buyer", "hi.BuyerAgent", null);
            buyerAgent.start();

            AgentController cashierAgent = container.createNewAgent("cashier", "hi.CashierAgent", null);
            cashierAgent.start();

            // عرض واجهة Swing
            javax.swing.SwingUtilities.invokeLater(() -> {
                CustomGUI gui = new CustomGUI();
                gui.showGUI();
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

