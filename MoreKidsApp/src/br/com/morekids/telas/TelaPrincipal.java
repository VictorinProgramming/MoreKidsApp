package br.com.morekids.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        morekids_Logo = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_data = new javax.swing.JLabel();
        lblBemvindo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menu_Bar = new javax.swing.JMenu();
        cliente_Cadastro_Menu_Bar = new javax.swing.JMenuItem();
        venda_Cadastro_Menu_Bar = new javax.swing.JMenuItem();
        usuario_Cadastro_Menu_Bar = new javax.swing.JMenuItem();
        produto_Cadastro_Menu_Bar = new javax.swing.JMenuItem();
        relatorio_Bar = new javax.swing.JMenu();
        vendas_Relatorio_Menu_Bar = new javax.swing.JMenuItem();
        clientes_Relatorio_Menu_Bar = new javax.swing.JMenuItem();
        vendedores_Relatorio_Menu_Bar = new javax.swing.JMenuItem();
        estoque_Produtos = new javax.swing.JMenuItem();
        ajuda_Bar = new javax.swing.JMenu();
        sobre_Ajuda_Menu_Bar = new javax.swing.JMenuItem();
        help_Ajuda_Menu_Bar = new javax.swing.JMenuItem();
        opcoes_Bar = new javax.swing.JMenu();
        sair_Opcoes_Menu_Bar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("More Kid's - Controle de Vendas");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 796, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        morekids_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/Morekids_resized.png"))); // NOI18N

        lbl_usuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbl_usuario.setText("Usuário");

        lbl_data.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        lbl_data.setText("Data");

        lblBemvindo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblBemvindo.setText("BEM VINDO!");

        menu_Bar.setBorder(null);
        menu_Bar.setText("Cadastro");
        menu_Bar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu_Bar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        cliente_Cadastro_Menu_Bar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cliente_Cadastro_Menu_Bar.setText("Cliente");
        cliente_Cadastro_Menu_Bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliente_Cadastro_Menu_BarActionPerformed(evt);
            }
        });
        menu_Bar.add(cliente_Cadastro_Menu_Bar);

        venda_Cadastro_Menu_Bar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        venda_Cadastro_Menu_Bar.setText("Venda");
        venda_Cadastro_Menu_Bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venda_Cadastro_Menu_BarActionPerformed(evt);
            }
        });
        menu_Bar.add(venda_Cadastro_Menu_Bar);

        usuario_Cadastro_Menu_Bar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        usuario_Cadastro_Menu_Bar.setText("Usuários");
        usuario_Cadastro_Menu_Bar.setEnabled(false);
        usuario_Cadastro_Menu_Bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_Cadastro_Menu_BarActionPerformed(evt);
            }
        });
        menu_Bar.add(usuario_Cadastro_Menu_Bar);

        produto_Cadastro_Menu_Bar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        produto_Cadastro_Menu_Bar.setText("Produto");
        produto_Cadastro_Menu_Bar.setEnabled(false);
        produto_Cadastro_Menu_Bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produto_Cadastro_Menu_BarActionPerformed(evt);
            }
        });
        menu_Bar.add(produto_Cadastro_Menu_Bar);

        menuBar.add(menu_Bar);

        relatorio_Bar.setText("Relatório");
        relatorio_Bar.setEnabled(false);
        relatorio_Bar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        vendas_Relatorio_Menu_Bar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        vendas_Relatorio_Menu_Bar.setText("Vendas");
        relatorio_Bar.add(vendas_Relatorio_Menu_Bar);

        clientes_Relatorio_Menu_Bar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        clientes_Relatorio_Menu_Bar.setText("Clientes");
        relatorio_Bar.add(clientes_Relatorio_Menu_Bar);

        vendedores_Relatorio_Menu_Bar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        vendedores_Relatorio_Menu_Bar.setText("Vendedores");
        relatorio_Bar.add(vendedores_Relatorio_Menu_Bar);

        estoque_Produtos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        estoque_Produtos.setText("Estoque");
        relatorio_Bar.add(estoque_Produtos);

        menuBar.add(relatorio_Bar);

        ajuda_Bar.setText("Ajuda");
        ajuda_Bar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        sobre_Ajuda_Menu_Bar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        sobre_Ajuda_Menu_Bar.setText("Sobre");
        sobre_Ajuda_Menu_Bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobre_Ajuda_Menu_BarActionPerformed(evt);
            }
        });
        ajuda_Bar.add(sobre_Ajuda_Menu_Bar);

        help_Ajuda_Menu_Bar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        help_Ajuda_Menu_Bar.setText("Help");
        ajuda_Bar.add(help_Ajuda_Menu_Bar);

        menuBar.add(ajuda_Bar);

        opcoes_Bar.setText("Opções");
        opcoes_Bar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        sair_Opcoes_Menu_Bar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        sair_Opcoes_Menu_Bar.setText("Sair");
        sair_Opcoes_Menu_Bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_Opcoes_Menu_BarActionPerformed(evt);
            }
        });
        opcoes_Bar.add(sair_Opcoes_Menu_Bar);

        menuBar.add(opcoes_Bar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 73, Short.MAX_VALUE)
                                .addComponent(morekids_Logo)
                                .addGap(80, 80, 80))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_usuario)
                                    .addComponent(lblBemvindo))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_data)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblBemvindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(lbl_data)
                .addGap(37, 37, 37)
                .addComponent(morekids_Logo)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1173, 732));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void venda_Cadastro_Menu_BarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venda_Cadastro_Menu_BarActionPerformed
        // Chamando a Tela de Venda;
        TelaVenda venda = new TelaVenda();
        venda.setVisible(true);
        desktop.add(venda);
    }//GEN-LAST:event_venda_Cadastro_Menu_BarActionPerformed

    private void usuario_Cadastro_Menu_BarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_Cadastro_Menu_BarActionPerformed
        // as linhas abaixo irão abri o form Tela de Usuário dentro do desktop Pane;
        TelaUsuarios usuarios = new TelaUsuarios();
        usuarios.setVisible(true);
        desktop.add(usuarios);
    }//GEN-LAST:event_usuario_Cadastro_Menu_BarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // As linhas abaixo substitui a label de Data pela data atual do sistema, ao inicializar o form;
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
        lbl_data.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void sair_Opcoes_Menu_BarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_Opcoes_Menu_BarActionPerformed
        // Exibe uma caixa de diálogo
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atençao", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_sair_Opcoes_Menu_BarActionPerformed

    private void sobre_Ajuda_Menu_BarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobre_Ajuda_Menu_BarActionPerformed
        // Chamando a Tela Sobre;
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);

    }//GEN-LAST:event_sobre_Ajuda_Menu_BarActionPerformed

    private void cliente_Cadastro_Menu_BarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliente_Cadastro_Menu_BarActionPerformed
        TelaClientes clientes = new TelaClientes();
        clientes.setVisible(true);
        desktop.add(clientes);
    }//GEN-LAST:event_cliente_Cadastro_Menu_BarActionPerformed

    private void produto_Cadastro_Menu_BarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produto_Cadastro_Menu_BarActionPerformed
        // Chamando a Tela Produto
        TelaProduto produto = new TelaProduto();
        produto.setVisible(true);
        desktop.add(produto);
    }//GEN-LAST:event_produto_Cadastro_Menu_BarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ajuda_Bar;
    private javax.swing.JMenuItem cliente_Cadastro_Menu_Bar;
    private javax.swing.JMenuItem clientes_Relatorio_Menu_Bar;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem estoque_Produtos;
    private javax.swing.JMenuItem help_Ajuda_Menu_Bar;
    private javax.swing.JLabel lblBemvindo;
    private javax.swing.JLabel lbl_data;
    public static javax.swing.JLabel lbl_usuario;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menu_Bar;
    private javax.swing.JLabel morekids_Logo;
    private javax.swing.JMenu opcoes_Bar;
    public static javax.swing.JMenuItem produto_Cadastro_Menu_Bar;
    public static javax.swing.JMenu relatorio_Bar;
    private javax.swing.JMenuItem sair_Opcoes_Menu_Bar;
    private javax.swing.JMenuItem sobre_Ajuda_Menu_Bar;
    public static javax.swing.JMenuItem usuario_Cadastro_Menu_Bar;
    private javax.swing.JMenuItem venda_Cadastro_Menu_Bar;
    private javax.swing.JMenuItem vendas_Relatorio_Menu_Bar;
    private javax.swing.JMenuItem vendedores_Relatorio_Menu_Bar;
    // End of variables declaration//GEN-END:variables
}
