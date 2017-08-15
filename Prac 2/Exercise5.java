import javax.swing.*;

public class Exercise5 {
    public static void main(String[] args)
    {
        String nMilesString;
        double nMiles;
        double miles;
        double km;
        final double nMilesToMiles = 1.150779;
        final double nMilesToKm = 1.852;
        nMilesString = JOptionPane.showInputDialog(null, "Enter the number of Nautical Miles to convert", "Nautical Miles to Miles and Kilometers",
                JOptionPane.INFORMATION_MESSAGE);
        nMiles = Integer.parseInt(nMilesString);
        JOptionPane.showMessageDialog(null,nMiles + " Nautical Miles is equal to " + (nMiles * nMilesToMiles) + " Miles.\nWhile " + nMiles + " Nautical Miles is equal to " + (nMiles * nMilesToKm) + " Kilometers");
    }
}
