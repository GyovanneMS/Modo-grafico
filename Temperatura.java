import javax.swing.JOptionPane; 

class Temperatura {
    public static void main(String args[]) {
        JOptionPane jop = new JOptionPane();

        int Cel = Integer.parseInt(jop.showInputDialog(null, "Temperatura em Celsius (Sem o simbolo ao lado -°-)"));

        double Fah = (9 * Cel + 160)/5;

        jop.showMessageDialog(null, "A temperatura em fahrenheit é: " + Fah);
    }
}