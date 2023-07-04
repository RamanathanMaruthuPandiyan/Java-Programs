import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sun May 21 00:25:31 IST 2023
 */



/**
 * @author ramanathan
 */
public class FactorialCalculator{
    public FactorialCalculator() {
        initComponents();
    }

    private void CalculateFactorial(ActionEvent e) {
        long fact=1;
        for(long i = 1; i<=Long.parseLong(inputfield.getText()); i++){
            fact=fact*i;
        }
        outputfield.setText(String.valueOf(fact));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Ramanathan M
        FactorialOfNumber = new JPanel();
        n = new JLabel();
        inputfield = new JTextField();
        button1 = new JButton();
        outputfield = new JTextField();

        //======== FactorialOfNumber ========
        {
            FactorialOfNumber.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- n ----
            n.setText("n");
            FactorialOfNumber.add(n, "cell 0 1,align center center,grow 0 0");
            FactorialOfNumber.add(inputfield, "cell 1 1,grow");

            //---- button1 ----
            button1.setText("Factorial(n)");
            button1.addActionListener(this::CalculateFactorial);
            FactorialOfNumber.add(button1, "cell 2 1,grow");
            FactorialOfNumber.add(outputfield, "cell 3 1,grow");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Ramanathan M
    private JPanel FactorialOfNumber;
    private JLabel n;
    private JTextField inputfield;
    private JButton button1;
    private JTextField outputfield;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public static void main(String [] args){
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Factorial Calculator");
            FactorialCalculator F = new FactorialCalculator();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(F.FactorialOfNumber);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
