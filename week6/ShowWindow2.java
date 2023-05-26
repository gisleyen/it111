import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {

    public static void main(String[] args) {
        // Declare our variables (constants)
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

        // Create a window
        JFrame window = new JFrame();

        // Set the title
        window.setTitle("My Simple Window2");

        // Set the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Set the background color to red
        window.getContentPane().setBackground(Color.RED);

        // Center the window on the screen
        window.setLocationRelativeTo(null);

        // Set the layout to FlowLayout
        window.setLayout(new FlowLayout());

        // Create a label control
        JLabel myLabel = new JLabel("My First Big Label!!!");
        myLabel.setFont(myLabel.getFont().deriveFont(Font.BOLD)); // Set font style to bold


        // Create a text field control
        JTextField MyTextField = new JTextField(20);

        // Add the label, text field, and button to the window
        window.add(myLabel);
        window.add(MyTextField);

        JLabel myLabel2 = new JLabel("My Second Big Label!");
        myLabel2.setFont(myLabel2.getFont().deriveFont(Font.BOLD, 20)); // Set font size to 20 and style to bold



        // Create a text field control
        JTextField MyTextField2 = new JTextField(20);

        window.add(myLabel2);
        window.add(MyTextField2);

        // Close the window and exit the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the window
        window.setVisible(true);
    }
}


