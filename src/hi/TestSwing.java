package hi;



import javax.swing.*;

public class TestSwing {
    public static void main(String[] args) {
        // إعداد نافذة Swing
        JFrame frame = new JFrame("Test Swing");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("هذا اختبار لواجهة Swing فقط", SwingConstants.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }
}
