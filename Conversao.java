import javax.swing.JOptionPane; 

class Conversao {
    public static void main(String args[]) {
        JOptionPane jop = new JOptionPane();

        double Real = Double.parseDouble(jop.showInputDialog(null, "O valor a ser convertido: "));
        double Dolar = Double.parseDouble(jop.showInputDialog(null, "O valor valor do dolar: "));

        double Vfinal = Dolar / Real;

        jop.showMessageDialog(null, "O valor convertido é: " + Vfinal);
    }
    
}
