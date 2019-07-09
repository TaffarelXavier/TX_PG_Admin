/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.PSqlDemo;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Taffarel
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        jTextTabelaNome.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextTabelaNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jSpinnerQuantidadeColuna = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Postgre - Criador de Tabela com Sequências");

        jTextTabelaNome.setText("tbl_");

        jLabel1.setText("Nome da tabela:");

        jLabel2.setText("Qauntidade de Coluna:");

        jButton1.setText("Add Linhas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDEM", "NOME", "TIPO", "VALOR", "NULO", "AUTOINCREMENT", "PRIMARY", "Opções"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jTable1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTable1MouseMoved(evt);
            }
        });
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable1MouseExited(evt);
            }
        });
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable1InputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(70);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(1).setMinWidth(200);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(6).setMinWidth(80);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(80);
        }

        jButton2.setText("Criar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSpinnerQuantidadeColuna.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerQuantidadeColuna.setRequestFocusEnabled(false);

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 255, 0));
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton3.setText("Limpar tabela");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Limpar Saída");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Exportar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Limpar e Criar");

        jButton6.setText("Executar Comando SQL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTabelaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinnerQuantidadeColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)))
                        .addGap(222, 222, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTabelaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jSpinnerQuantidadeColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int quantLinhas = Integer.parseInt(jSpinnerQuantidadeColuna.getValue().toString());

        //Adiciona as linhas
        for (int x = 0; x < quantLinhas; ++x) {
            int modelCountRows = model.getRowCount() + 1;
            model.addRow(new Object[]{modelCountRows, "col_" + modelCountRows, "character varying", "255", "true", "false", "false", "Excluir"});
        }
        //Altera a primeira linha, 1 param=valor, 2 param=linha, 3 param=coluna
        model.setValueAt("bigint", 0, 2);
        model.setValueAt("", 0, 3);
        model.setValueAt("false", 0, 4);
        model.setValueAt("true", 0, 5);
        model.setValueAt("true", 0, 6);

        //Adiciona os combos na primeira coluna
        TableColumn column1 = jTable1.getColumnModel().getColumn(2);

        //Adiciona os combos na segunda coluna
        TableColumn column2 = jTable1.getColumnModel().getColumn(4);

        TableColumn column3 = jTable1.getColumnModel().getColumn(5);

        TableColumn column4 = jTable1.getColumnModel().getColumn(6);

        TableColumn column5 = jTable1.getColumnModel().getColumn(7);

        String[] petStrings = {"bigint", "bigserial", "bit", "bit varying", "boolean", "box", "bytea", "character",
            "character varying", "cidr", "circle", "date", "double precision", "inet", "integer", "interval", "json",
            "line", "lseg", "macaddr", "money", "numeric", "path", "point", "polygon", "real", "smallint", "smallserial",
            "serial", "text", "time", "timestamp", "tsquery", "tsvector", "txid_snapshot", "uuid", "xml"};

        JComboBox petList = new JComboBox(petStrings);
        JCheckBox cb = new JCheckBox("Selecione", false);
        cb.setSelected(false);

        String[] opcoesLista = {"Excluir"};

        JComboBox opcoes = new JComboBox(opcoesLista);

        column1.setCellEditor(new DefaultCellEditor(petList));
        column2.setCellEditor(new DefaultCellEditor(cb));
        column3.setCellEditor(new DefaultCellEditor(cb));
        column4.setCellEditor(new DefaultCellEditor(cb));

    }//GEN-LAST:event_jButton1ActionPerformed

    public String isNullTb(String s, boolean isTrim) {
        if (isTrim == true) {
            return s.equals("false") ? " NOT NULL " : "";
        } else {
            return s.equals("false") ? " NOT NULL" : "";
        }
    }

    public String isPrimary(String s) {
        return s.equals("true") ? "PRIMARY KEY " : "";
    }

    /**
     *
     * @param s
     * @param seqNome
     * @param tableName
     * @param idTablePrimaryAndAutoIncrement
     * @return
     */
    public String criarSequencia(String s, String seqNome, String tableName, String idTablePrimaryAndAutoIncrement) {
        return s.equals("true") ? "CREATE SEQUENCE IF NOT EXISTS " + seqNome + " MINVALUE 0 START WITH 1;\n"
                + "ALTER TABLE " + tableName + " alter " + idTablePrimaryAndAutoIncrement + " set default nextval('" + seqNome + "');\n"
                + "--alter sequence " + seqNome + " MINVALUE 0 start with 1;\n"
                + "SELECT setval('" + seqNome + "', 0); --definir o valor zero como início para o autoincremento mais alto de" + seqNome : "";
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String tableName = jTextTabelaNome.getText().trim();

        DefaultTableModel md = (DefaultTableModel) jTable1.getModel();

        int total = md.getRowCount();

        if (tableName.equals("")) {
            JOptionPane.showMessageDialog(null, "Escolha o nome da tabela.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            jTextTabelaNome.requestFocus();
        } else if (total == 0) {
            JOptionPane.showMessageDialog(null, "Adicone linhas à tabela.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String dados = "--CREATE TABLE " + tableName + "\n";

            dados += "CREATE TABLE IF NOT EXISTS " + tableName + "(\n";

            String sequencia = "";

            boolean isLinhaEmBranco = false;

            for (int count = 0; count < total; count++) {

                String col0 = md.getValueAt(count, 1).toString();
                String col1 = md.getValueAt(count, 2).toString();
                String col2 = md.getValueAt(count, 3).toString();
                String col3 = md.getValueAt(count, 4).toString();
                String col4 = md.getValueAt(count, 5).toString();
                String col5 = md.getValueAt(count, 6).toString();

                if (count == 0) {
                    dados += col0 + " "
                            + col1 + ""
                            + col2 + ""
                            + isNullTb(col3, true)
                            + isPrimary(col5).trim() + ",\n";
                } else if (count < (total - 1)) {
                    dados += col0 + " "
                            + col1 + "("
                            + col2 + ")"
                            + isNullTb(col3, false) + ""
                            + isPrimary(col5).trim() + ",\n";
                } else if (count == (total - 1)) {
                    dados += col0 + " "
                            + col1 + "("
                            + col2 + ")"
                            + isNullTb(col3, false) + " "
                            + isPrimary(col5);
                }
                if (col0.equals("")) {
                    isLinhaEmBranco = true;
                }
                String sequenciaNome = md.getValueAt(count, 1).toString();
                String isSequencia = col4;
                sequencia += criarSequencia(isSequencia, "seq_" + sequenciaNome, tableName, sequenciaNome);
            }

            dados += "\n);\n";

            String saida = dados + "\n" + sequencia + "\n";
            if (isLinhaEmBranco == true) {
                JOptionPane.showMessageDialog(null, "Há alguma linha em branco na coluna \"NOME\".", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            } else {
                //Se a saída estiver em branco.
                if (jCheckBox1.isSelected()) {
                    jTextArea1.setText("");
                    if (jTextArea1.getText().equals("")) {
                        jTextArea1.setText("--SAÍDA\n\n" + jTextArea1.getText() + saida);
                    } else {
                        jTextArea1.setText(jTextArea1.getText() + "\n" + saida);
                    }
                } else {
                    if (jTextArea1.getText().equals("")) {
                        jTextArea1.setText("--SAÍDA\n\n" + jTextArea1.getText() + saida);
                    } else {
                        jTextArea1.setText(jTextArea1.getText() + "\n" + saida);
                    }
                }
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente limpar a tabela?",
                "Atenção",
                JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
            DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
            int rowCount = dm.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                dm.removeRow(i);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1FocusLost

    private void jTable1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1MouseMoved

    private void jTable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseExited
        // TODO add your handling code here:
        jTable1.repaint();

    }//GEN-LAST:event_jTable1MouseExited

    private void jTable1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1InputMethodTextChanged
        // TODO add your handling code here:
        jTable1.repaint();
    }//GEN-LAST:event_jTable1InputMethodTextChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        /*int reply = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente limpar a saída?",
                "Atenção",
                JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
           
        }*/
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();

        jFileChooser.setPreferredSize(new Dimension(900, 590));

        jFileChooser.setAcceptAllFileFilterUsed(false);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo java file(.sql)", "sql");

        jFileChooser.setFileFilter(filter);

        String FileName = "export_" + jTextTabelaNome.getText() + ".sql";

        File fileNameJava = new File(FileName);

        jFileChooser.setSelectedFile(fileNameJava);

        int result = jFileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();

            try (PrintWriter writer = new PrintWriter(file, "UTF-8")) {
                String[] words = jTextArea1.getText().split("\\n");
                for (String word : words) {
                    writer.println(word);
                }
            } catch (FileNotFoundException | UnsupportedEncodingException ex) {
                Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {

            int SelectedRow = jTable1.getSelectedRow();

            int SelectedColumn = jTable1.getSelectedColumn();

            if (SelectedColumn == 7) {

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                model.removeRow(jTable1.convertRowIndexToModel(SelectedRow));

                int quantLinhas = jTable1.getRowCount();

                for (int x = 0; x < quantLinhas; ++x) {
                    model.setValueAt((x + 1), x, 0);
                }

            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja realmente executar esse SQL?", "Anteção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (dialogResult == JOptionPane.YES_OPTION) {
            
            int rs = PSqlDemo.executarQuery(jTextArea1.getText());
            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaInicial().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerQuantidadeColuna;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextTabelaNome;
    // End of variables declaration//GEN-END:variables
}