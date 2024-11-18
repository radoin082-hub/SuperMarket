package hi;

import javax.swing.*;
import java.awt.*;

public class CustomGUI {
    private JFrame frame;

    public void showGUI() {
        // إعداد واجهة Swing
        frame = new JFrame("Supermarket Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // لوحة رئيسية
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Welcome to the Supermarket System", SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);

        // زر تشغيل
        JButton button = new JButton("Start Simulation");
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Simulation Started! Agents are running."));
        panel.add(button, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }
}
