/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class jTableDemo {
   static Object[] columnNames = new Object[] { "Column 1", "Column 2" };
   static Integer[][] rowData = { {1, 2}, {3, 4} };

   private JPanel mainPanel = new JPanel();
   private DefaultTableModel tableModel = new DefaultTableModel(rowData, columnNames);  
   private JTable table = new JTable(tableModel);   

   public jTableDemo() {
      JButton timesTwoBtn = new JButton("Multiply By 2");
      timesTwoBtn.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
            for (int row = 0; row < tableModel.getRowCount(); row++) {
               for (int col = 0; col < tableModel.getColumnCount(); col++) {
                  Integer value = (Integer) tableModel.getValueAt(row, col);
                  value *= 2;
                  tableModel.setValueAt(value, row, col);
               }
            }
         }
      });
      JPanel btnPanel = new JPanel();
      btnPanel.add(timesTwoBtn);      


      mainPanel.setLayout(new BorderLayout());
      mainPanel.add(new JScrollPane(table), BorderLayout.CENTER);
      mainPanel.add(btnPanel, BorderLayout.SOUTH);
   }

   public JPanel getMainPanel() {
      return  mainPanel;
   }

   private static void createAndShowGui() {
      jTableDemo testTables = new jTableDemo();

      JFrame frame = new JFrame("TableFoo");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(testTables.getMainPanel());
      frame.pack();
      frame.setLocationByPlatform(true);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGui();
         }
      });
   }
}