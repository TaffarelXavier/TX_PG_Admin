/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Classes;

/**
 *
 * @author Taffarel <taffarel_deus@hotmail.com>
 */

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

@SuppressWarnings("serial")
public class TableWithMultCombos extends JPanel {
    private static final String[] COLUMN_NAMES = { "Day of Week" };
    private Map<String, List<String>> dataMap = new LinkedHashMap<>();
    private DefaultTableModel tblModel = new DefaultTableModel(COLUMN_NAMES, 5);
    private JTable table = new JTable(tblModel);
    private DefaultComboBoxModel<Object> combo2Model = new DefaultComboBoxModel<>();
    private JComboBox<Object> combo0 = null;
    private JComboBox<Object> combo1 = new JComboBox<>(combo2Model);

    public TableWithMultCombos() {
        
        dataMap.put("Monday", Arrays.asList(new String[] { "Mon - 1", "Mon - 2", "Mon - 3", "Mon - 4" }));

        combo0 = new JComboBox<>(dataMap.keySet().toArray());

        TableColumn column0 = table.getColumnModel().getColumn(0);
        
        column0.setCellEditor(new DefaultCellEditor(combo0));

        table.setFillsViewportHeight(true);
        this.add(new JScrollPane(table));
    }

    private static void createAndShowGui() {
        TableWithMultCombos mainPanel = new TableWithMultCombos();
        JFrame frame = new JFrame("TableWithMultCombos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGui());
    }
}