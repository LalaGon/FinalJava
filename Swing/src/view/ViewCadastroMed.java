package view;

/*
 * Aluna: La�s Gon�alves Senna
 * Matr�cula: 0050015880
 */
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import dao.MedicoDAO;
import model.Medico;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

public class ViewCadastroMed extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMedicos;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtEspecializacao;

   
    public ViewCadastroMed() {
    	getContentPane().setBackground(Color.WHITE);
    	setBackground(Color.WHITE);
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel)  jTMedicos.getModel();
        jTMedicos.setRowSorter(new TableRowSorter(modelo));

        readJTable();

    }

    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTMedicos.getModel();
        modelo.setNumRows(0);
        MedicoDAO pdao = new MedicoDAO();

        for (Medico p : pdao.readAll()) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getEspecializacao(),
               
            });

        }

    }
    /*public void readJTableForDesc(String desc) {
        
        DefaultTableModel modelo = (DefaultTableModel)  jTPessoas.getModel();
        modelo.setNumRows(0);
        PessoaDAO pdao = new PessoaDAO();

        for (Pessoa p : pdao.readForDesc(desc)) {

            modelo.addRow(new Object[]{
                p.getId(),
                p.getDescricao(),
                p.getQtd(),
                p.getPreco()
            });

        }

    }
     */
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(Color.WHITE);
        txtNome = new javax.swing.JTextField();
        txtNome.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 12));
        txtEspecializacao = new javax.swing.JTextField();
        txtEspecializacao.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 12));
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 14));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 14));
        jButton1 = new javax.swing.JButton();
        jButton1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 12));
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2 = new javax.swing.JButton();
        jButton2.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 12));
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3 = new javax.swing.JButton();
        jButton3.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 12));
        jButton3.setBackground(Color.LIGHT_GRAY);
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBackground(Color.WHITE);
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMedicos = new javax.swing.JTable();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        jLabel1.setText("NOME");

        jLabel2.setText("ESPECIALIZACAO");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Atualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel1))
        					.addGap(18)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtEspecializacao, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jButton1)
        					.addGap(18)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
        			.addGap(217))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(31)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jLabel2))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtEspecializacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2)
        				.addComponent(jButton3))
        			.addGap(19))
        );
        jPanel1.setLayout(jPanel1Layout);

        jTMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "ESPECIALIZACAO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	jTMedicosMouseClicked(evt);
            }
        });
        jTMedicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
            	jTPMedicosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView( jTMedicos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
  
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
       
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Medico p = new Medico();
        MedicoDAO dao = new MedicoDAO();

        p.setNome(txtNome.getText());
        p.setEspecializacao(txtEspecializacao.getText());
      
        
        dao.create(p);

        txtNome.setText("");
        txtEspecializacao.setText("");
       

        readJTable();


    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

//        System.out.println("Linha selecionada: "+jTProdutos.getSelectedRow());
        if (jTMedicos.getSelectedRow() != -1) {

            Medico p = new Medico();
            MedicoDAO dao = new MedicoDAO();

            p.setId((int) jTMedicos.getValueAt(jTMedicos.getSelectedRow(), 0));
            
            dao.delete(p);

            txtNome.setText("");
            txtEspecializacao.setText("");
            

            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um medico para excluir.");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosMouseClicked
        // TODO add your handling code here:

        if (jTMedicos.getSelectedRow() != -1) {

            txtNome.setText(jTMedicos.getValueAt(jTMedicos.getSelectedRow(), 1).toString());
            txtEspecializacao.setText(jTMedicos.getValueAt(jTMedicos.getSelectedRow(), 2).toString());
          

        }

    }//GEN-LAST:event_jTProdutosMouseClicked

    private void jTPMedicosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdutosKeyReleased
        // TODO add your handling code here:

        if (jTMedicos.getSelectedRow() != -1) {

            txtNome.setText(jTMedicos.getValueAt(jTMedicos.getSelectedRow(), 1).toString());
            txtEspecializacao.setText(jTMedicos.getValueAt(jTMedicos.getSelectedRow(), 2).toString());
          

        }

    }//GEN-LAST:event_jTProdutosKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        if (jTMedicos.getSelectedRow() != -1) {

            Medico p = new Medico();
            MedicoDAO dao = new MedicoDAO();

            p.setNome(txtNome.getText());
            p.setEspecializacao(txtEspecializacao.getText());
            
            
            p.setId((int) jTMedicos.getValueAt(jTMedicos.getSelectedRow(), 0));
            dao.update(p);

            txtNome.setText("");
            txtEspecializacao.setText("");
           

            readJTable();

        }


    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadastroMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastroMed().setVisible(true);
            }
        });
    }
}

