/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package content;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

class MultiLineTableCellRenderer extends JTextArea implements TableCellRenderer {
    public MultiLineTableCellRenderer() {
        setLineWrap(true);
        setWrapStyleWord(true);
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (isSelected) {
            setForeground(table.getSelectionForeground());
            setBackground(table.getSelectionBackground());
        } else {
            setForeground(table.getForeground());
            setBackground(table.getBackground());
        }

        setFont(table.getFont());
        setText(value == null ? "" : value.toString());

        // Adjust the row height to match the content
        setSize(table.getColumnModel().getColumn(column).getWidth(), getPreferredSize().height);
        int preferredHeight = getPreferredSize().height;
        if (table.getRowHeight(row) != preferredHeight) {
            table.setRowHeight(row, preferredHeight);
        }

        return this;
    }
}
