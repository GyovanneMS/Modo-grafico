import javax.swing.JOptionPane; 

class Variavell {
    public static void main(String args []) {
        JOptionPane jop = new JOptionPane();

        int N1 = Integer.parseInt(jop.showInputDialog(null, "Primeiro número"));
        int N2 = Integer.parseInt(jop.showInputDialog(null, "Segundo número"));

        jop.showMessageDialog(null, "O primeiro número é: " + N1 + ", e o segundo é: " + N2);

        int N3 = N1;
        N1 = N2;
        N2 = N3;

        
        jop.showMessageDialog(null, "Agora o primeiro número é: " + N1 + ", e o sgndo é: " + N2);
    }
}