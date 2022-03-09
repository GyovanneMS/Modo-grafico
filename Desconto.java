import javax.swing.JOptionPane;

class Desconto {
    public static void main(String args[]) {
        JOptionPane jop = new JOptionPane();

        double Vcompra = Double.parseDouble(jop.showInputDialog(null, "Valor da compra:"));
        int Desconto = Integer.parseInt(jop.showInputDialog(null, "Valor do desconto:"));

        double Dcompra = Vcompra / Desconto;
        double Vfinal = Vcompra - Dcompra;

        jop.showMessageDialog(null, "O falor final da compra é: " + Vfinal);
    }
    
}