package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String name =JOptionPane.showInputDialog("What Is Your Name?");
//test
JOptionPane.showMessageDialog(null,"Hello" + name);
}

}
