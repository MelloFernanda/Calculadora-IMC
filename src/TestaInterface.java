import javax.swing.*;
import java.awt.*;

public class TestaInterface {

    public static void main(String[] args) {

        //Criação de janela
        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Tornando janela visível
        janela.setVisible(true);
        //Editando tamanho
        janela.setSize(200, 200);
        //Editando posição da janela
        janela.setLocation(600,300);

        //Chamando Layout
        janela.setLayout(new FlowLayout());
        //Criação de botões
        JButton bt = new JButton("Diga olá");
        janela.add(bt);
        janela.add(new JButton("Diga adeus"));

        //Criando e agrupando controles
        JPanel caixaNome = new JPanel();
        caixaNome.setLayout(new FlowLayout());
        caixaNome.add(new JLabel("Nome:"));


    }

}
