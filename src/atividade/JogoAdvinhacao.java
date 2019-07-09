package atividade;

import javax.swing.JOptionPane;

public class JogoAdvinhacao {

    public static void main(String[] args) {
        try {

            int variavel = (int) (Math.random() * 100),
                    chute = Integer.parseInt(JOptionPane.showInputDialog(
                            "Olá, caro usuário,\n"
                            + "Eu gerei um número aleatório entre 0 e 100.\n"
                            + "Arrisque um chute."));

            //Para você testar, professor.
            System.out.println(variavel);

            boolean acertou = false;

            while (!acertou) {

                if (chute < variavel) {
                    chute = Integer.parseInt(JOptionPane.showInputDialog("Você errou! Digite valor maior."));
                } else if (chute > variavel) {
                    chute = Integer.parseInt(JOptionPane.showInputDialog("Você errou! Digite um valor menor."));
                } else {
                    JOptionPane.showMessageDialog(null, "Você"
                            + "acertou! Parabéns");
                    return;
                }

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Houve um erro! Tente novamente.", "Atenção", 1);
        }
    }

}
