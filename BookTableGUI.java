package project.uas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BookTableGUI extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField[] textFields;
    private String[] columnNames = {"No", "Nama Buku", "Penulis", "Penerbit", "Tahun"};

    public BookTableGUI() {
        setTitle("Input Buku");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        createTable();
        createInputPanel();
        createAddButton();
        arrangeComponents();
        setLocationRelativeTo(null);
    }

    private void createTable() {
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void createInputPanel() {
        JPanel inputPanel = new JPanel(new GridLayout(1, columnNames.length));
        textFields = new JTextField[columnNames.length];
        for (int i = 0; i < columnNames.length; i++) {
            textFields[i] = new JTextField();
            inputPanel.add(textFields[i]);
        }
        add(inputPanel, BorderLayout.SOUTH);
    }

    private void createAddButton() {
        JButton addButton = new JButton("Tambahkan Data");
        addButton.addActionListener(this::addDataToTable);
        add(addButton, BorderLayout.NORTH);
    }

    private void addDataToTable(ActionEvent e) {
        String[] rowData = new String[columnNames.length];
        for (int i = 0; i < columnNames.length; i++) {
            rowData[i] = textFields[i].getText();
            textFields[i].setText(""); // Kosongkan field setelah memasukkan data
        }
        tableModel.addRow(rowData); // Tambahkan data ke dalam tabel
    }

    private void arrangeComponents() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BookTableGUI bookTableGUI = new BookTableGUI();
            bookTableGUI.setVisible(true);
        });
    }
}

