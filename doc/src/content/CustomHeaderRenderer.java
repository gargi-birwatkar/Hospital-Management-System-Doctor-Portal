/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package content;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.*;

class CustomHeaderRenderer extends DefaultTableCellRenderer {
    public CustomHeaderRenderer() {
        setFont(new Font("Segoe UI", Font.BOLD, 50));
        setBackground(new Color (0,51,153));
        setForeground(Color.WHITE);
        
        setHorizontalAlignment(SwingConstants.CENTER);
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        ((JLabel) comp).setText(value.toString());
        return comp;
    }
}

