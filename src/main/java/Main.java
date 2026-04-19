

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int A = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
        int soma = A+B;
        if (soma > 10){
            JOptionPane.showMessageDialog(null, "O a soma é: " + soma);
        }
    }
}
