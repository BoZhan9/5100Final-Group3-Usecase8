package group3;
/**
 * @author  Zhehui Yang
 * @date: 2021/4/12
 */
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LeadForm extends JComponent implements MouseListener {
    private JPanel mainPanel;
    private JFrame mainFrame;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextArea textArea1;
    private JLabel label1;
    private JButton respondButton;
    private JLabel message;
    private JLabel model;
    private JLabel year;
    private JLabel color;
    private JButton respondShort;
    private boolean isExpanded;

    public void init(JFrame mainFrame, Lead lead) {
        isExpanded = true;
        this.mainFrame = mainFrame;
        label1.addMouseListener(this);
        textField1.setText(lead.firstName);
        textField2.setText(lead.lastName);
        textField3.setText(lead.email);
        textField4.setText(lead.phoneNumber);
        textField5.setText(lead.carModel);
        textField6.setText(lead.carYear);
        textField7.setText(lead.carColor);
        textArea1.setText(lead.message);
        mouseClicked(null);
    }

    public JTextField getFirstName() {
        return textField1;
    }

    public JTextField getLastName() {
        return textField2;
    }
    public JTextField getEmail() {
        return textField3;
    }


    JPanel getMainPanel() {
        return mainPanel;
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Leads List");
        LeadForm leadForm = new LeadForm();
        leadForm.init(null, null);
        frame.setContentPane(leadForm.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(750, 500);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        isExpanded = !isExpanded;
        textArea1.setVisible(isExpanded);
        message.setVisible(isExpanded);
        model.setVisible(isExpanded);
        textField5.setVisible(isExpanded);
        year.setVisible(isExpanded);
        textField6.setVisible(isExpanded);
        color.setVisible(isExpanded);
        textField7.setVisible(isExpanded);
        respondButton.setVisible(isExpanded);
        respondShort.setVisible(!isExpanded);
        if (isExpanded == false) {
            //mainPanel.setSize(700, 100);
            if (mainFrame != null) {
                mainFrame.setSize(750, -300);
            }
        } else {
            //mainPanel.setSize(700, 400);
            if (mainFrame != null) {
                mainFrame.setSize(750, 300);
            }
        }
        mainPanel.updateUI();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }


}
