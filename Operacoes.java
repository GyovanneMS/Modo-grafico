import javax.swing.JOptionPane; 

class Operacoes {
    public static void main(String args[]) {
        JOptionPane jop = new JOptionPane();

        double Nd1 = Double.parseDouble(jop.showInputDialog(null, "Primeiro número decimal"));
        double Nd2 = Double.parseDouble(jop.showInputDialog(null, "Segundo número decimal"));

        double A = Nd1 + Nd2;
        double S = Nd1 - Nd2;
        double M = Nd1 * Nd2;
        double D = Nd1 / Nd2;

        jop.showMessageDialog(null, "\nO resultado da adição é :" + A + "\nO resultado da Subtração é :" + S + "\nO resultado da multiplicação é :" + M + "\nO resultado da divisão é :" + D);
    }
}