import javax.swing.*;

public class kryptGUI {
    private JButton helpButton;
    private JButton openButton;
    private JButton saveButton;
    private JButton enKryptButton;
    private JButton deKryptButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JPanel GUI;

    public static void main(String[] args) {
        JFrame frame = new JFrame("kryptGUI");
        frame.setContentPane(new kryptGUI().GUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
