import javax.swing.SwingUtilities;
import clicker.ApplicationLogic.ClickEffect;

public class main {
  public static void main(String args[]) {
    ClickEffect io = new ClickEffect();
    SwingUtilities.invokeLater(io);
  }
}