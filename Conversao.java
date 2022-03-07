import javax.swing.JOptionPane; 

class Conversao {
    public static void main(String args[]) {
        JOptionPane jop = new JOptionPane();

        double Valor = Double.parseDouble(jop.showInputDialog(null, "O valor a ser convertido: "));
        double Dolar = Double.parseDouble(jop.showInputDialog(null, "O valor valor do dolar: "));

        double Vfinal = Valor * Dolar;

        jop.showMessageDialog(null, "O valor convertido é: " + Vfinal);
    }
    
}