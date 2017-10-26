package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  cainebourne
 * 
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name: (Format: First Last)");
        String lastName = "";
        String msg = "";
        try {
            lastName = nameService.extractLastName(fullName);
            msg = "Based on your input, Your last name should be: " + lastName;
        } catch (IllegalArgumentException iae) {
            msg = iae.getMessage();
        }
        JOptionPane.showMessageDialog(null, msg);
    }
     
}