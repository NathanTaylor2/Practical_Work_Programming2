import javax.swing.*;

public class Exercise4 {
    public static void main(String[] args)
    {
        String quartsString;
        int quarts;
        final int quartsToGallons = 4;
        quartsString = JOptionPane.showInputDialog(null, "Enter the number of quarts needed for the job.", "Quarts to Gallons",
                JOptionPane.INFORMATION_MESSAGE);
        quarts = Integer.parseInt(quartsString);
        JOptionPane.showMessageDialog(null,"The number of Gallons need is " + (quarts / quartsToGallons));
    }
}
