import javax.swing.JOptionPane; 

class Contas {
    public static void main(String args []) {
        JOptionPane jop = new JOptionPane();

        int N1 = Integer.parseInt(jop.showInputDialog( null, "Primeiro número"));
        int N2 = Integer.parseInt(jop.showInputDialog( null, "Segundo número"));

        double P1 = Math.pow(N1,5);
        double P2 = Math.pow(N2,5);
        int D  = N1 / N2 ;
        double Re = N1 % N2 ;
        double R1 = Math.sqrt(N1);
        double R2 = Math.sqrt(N2);

        jop.showMessageDialog(null, "A primeira exponenciação é " +  P1 + ".\n A segunda exponenciação é " + P2 + ".\n O resultado da divisão é " + D + " e o resto é " + Re + ".\n A primeira raiz é igual a " + R1 + ".\n A segunda raiz é " + R2 + ".");


        
    }
    
}
