import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sun May 21 13:35:48 IST 2023
 */



/**
 * @author ramanathan
 */
public class Register {
    public Register() {
        initComponents();
    }

    private void submit(ActionEvent e) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/RegisterForm?jdbcCompliantTruncation=false", "root", "SaiGanesh@(11)");
            Statement st=conn.createStatement();
            if(passwordField2.getText().equals(passwordField1.getText())){
                int i=st.executeUpdate("insert into Form(firstname,lastname,username,password)values('"+fnfield.getText()+"','"+lnfield.getText()+"','"+unfield.getText()+"','"+passwordField1.getText()+"')");
            }
            else{
                result.setText("wrong password");
            }
        }
        catch(Exception E)
        {
            System.out.print(E);
        }
    }

    private void fnfieldFocusLost(FocusEvent e) {
        // TODO add your code here
    }




    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Ramanathan M
        RegisterForm = new JPanel();
        firstname = new JLabel();
        fnfield = new JTextField();
        lastname = new JLabel();
        lnfield = new JTextField();
        username = new JLabel();
        unfield = new JTextField();
        password = new JLabel();
        passwordField1 = new JPasswordField();
        password2 = new JLabel();
        passwordField2 = new JPasswordField();
        submitbutton = new JButton();
        result = new JTextField();

        //======== RegisterForm ========
        {
            RegisterForm.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[119,fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[52]" +
                "[52]" +
                "[49]" +
                "[57]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- firstname ----
            firstname.setText("First Name");
            RegisterForm.add(firstname, "cell 0 2,alignx center,grow 0 100");
            RegisterForm.add(fnfield, "cell 1 2");

            //---- lastname ----
            lastname.setText("Last Name");
            RegisterForm.add(lastname, "cell 0 3,alignx center,grow 0 100");
            RegisterForm.add(lnfield, "cell 1 3");

            //---- username ----
            username.setText("Username");
            RegisterForm.add(username, "cell 0 4,alignx center,grow 0 100");
            RegisterForm.add(unfield, "cell 1 4");

            //---- password ----
            password.setText("Password");
            RegisterForm.add(password, "cell 0 5,alignx center,grow 0 100");
            RegisterForm.add(passwordField1, "cell 1 5");

            //---- password2 ----
            password2.setText("Confirm Password");
            RegisterForm.add(password2, "cell 0 6,alignx center,grow 0 100");
            RegisterForm.add(passwordField2, "cell 1 6");

            //---- submitbutton ----
            submitbutton.setText("SUBMIT");
            submitbutton.addActionListener(e -> submit(e));
            RegisterForm.add(submitbutton, "cell 0 7 2 1,align right center,grow 0 0");
            RegisterForm.add(result, "cell 1 8 1 2,aligny center,grow 100 0");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Ramanathan M
    private JPanel RegisterForm;
    private JLabel firstname;
    private JTextField fnfield;
    private JLabel lastname;
    private JTextField lnfield;
    private JLabel username;
    private JTextField unfield;
    private JLabel password;
    private JPasswordField passwordField1;
    private JLabel password2;
    private JPasswordField passwordField2;
    private JButton submitbutton;
    private JTextField result;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public static void main(String [] args){

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Registration Form");
            Register R=new Register();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(R.RegisterForm);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
