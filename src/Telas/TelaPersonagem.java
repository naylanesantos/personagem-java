package Telas;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPersonagem {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            // cadastro do personagem
            JFrame frame = new JFrame("Cadastro do Personagem");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setLocationRelativeTo(null);

            // Labels nome, idade, descrição
            JLabel lblNome = new JLabel("Nome:");
            lblNome.setBounds(30, 30, 80, 25);
            frame.add(lblNome);

            JTextField txtNome = new JTextField();
            txtNome.setBounds(120, 30, 200, 25);
            frame.add(txtNome);

            JLabel lblIdade = new JLabel("Idade:");
            lblIdade.setBounds(30, 70, 80, 25);
            frame.add(lblIdade);

            JTextField txtIdade = new JTextField();
            txtIdade.setBounds(120, 70, 200, 25);
            frame.add(txtIdade);


            JLabel lblDescricao = new JLabel("Descrição:");
            lblDescricao.setBounds(30, 110, 80, 25);
            frame.add(lblDescricao);

            JTextField txtDescricao = new JTextField();
            txtDescricao.setBounds(120, 110, 200, 25);
            frame.add(txtDescricao);

            // Botão para salvar
            JButton btnSalvar = new JButton("Salvar");
            btnSalvar.setBounds(140, 170, 100, 30);
            frame.add(btnSalvar);

            // Cor de fundo
            frame.getContentPane().setBackground(new Color(245, 247, 250));

            // Ação do botão
            btnSalvar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String nome = txtNome.getText();
                    String idadeTexto = txtIdade.getText();
                    String classe = txtDescricao.getText();

                    JOptionPane.showMessageDialog(frame,
                            "Personagem cadastrado!\n\n" +
                                    "Nome: " + nome +
                                    "\nIdade: " + idadeTexto +
                                    "\nClasse: " + classe);
                }
            });

            frame.setVisible(true);

        });
    }
}
