            
package content;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.table.JTableHeader;


public class appointment extends javax.swing.JPanel {
    private final String DB_URL ="jdbc:mysql://localhost:3306/gargi";
    private final String USER="root";
    private final String PASS ="gargi*1995";
    private String status, pid, docid, aid,p_name,time,notes,disease;
    static String date2;
    static String date = (LocalDate.now()).toString();
    static String id;
    static int count=0;
    private JLabel previouslySelectedLabel = null;
     
    public static editappointment ep;
    
    public appointment(){

    }
    public appointment(String idd) {
        initComponents();
       this.id=idd;
       ep= new editappointment(id); 
       jPanel1.add(ep);
    ep.setVisible(false);
               
        
      for (int j = 0; j < g1.dayLabel.length; j++) {
			for (int i = 0; i < g1.dayLabel[j].length; i++) {
                            
                            for (MouseListener listener : g1.dayLabel[j][i].getMouseListeners()) {
                    g1.dayLabel[j][i].removeMouseListener(listener);
                }
                                g1.dayLabel[j][i].addMouseListener(new MouseAdapter() {
                                                 public void mousePressed(MouseEvent e) {  
              JLabel label = (JLabel) e.getSource(); 
              
              String dayText = label.getText();  
              if (!dayText.isEmpty()) {  
                int day = Integer.parseInt(dayText);  
                int month = g1.monthComboBox.getSelectedIndex();  
                int year = Integer.parseInt(g1.yearField.getText());  
                LocalDate selectedDate = LocalDate.of(year, month + 1, day);  
               
                // Save the selected date in a variable  
                DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
               date  = selectedDate.format(pattern);
               datedisplay.setText(date);
               count++;
                //appointmentInstance.datadisplay(date);
              
              
              } 
               if (previouslySelectedLabel != null) {
                        previouslySelectedLabel.setBackground(null);
                    }

                    // Set the background color of the clicked label
                    label.setBackground(Color.CYAN);
                    previouslySelectedLabel = label;
                    DefaultTableModel tb1model= ( DefaultTableModel)view1.getModel();
                    tb1model.setRowCount(0);
                    appointment_info(date,id);
      
                        }
       });
                                
                                        }
}
                        MultiLineTableCellRenderer renderer = new MultiLineTableCellRenderer();
    for (int i = 0; i < view1.getColumnCount(); i++) {
        view1.getColumnModel().getColumn(i).setCellRenderer(renderer);
    }
    view1.setGridColor(Color.BLACK);
                           view1.setShowVerticalLines(true);            
      JTableHeader header = view1.getTableHeader();
      header.setPreferredSize(new Dimension(header.getWidth(),90));
    header.setDefaultRenderer(new CustomHeaderRenderer());
    view1.addMouseListener(new MouseListener() {
        @Override
        public void mouseReleased(MouseEvent e) {
        }
        @Override
        public void mousePressed(MouseEvent e) {
             String name11 = (String) view1.getValueAt(view1.getSelectedRow() , 1);
             ep.setName(name11);
             
        }
        @Override
        public void mouseExited(MouseEvent e) {
        }
        @Override
        public void mouseEntered(MouseEvent e) {
        }
        @Override
        public void mouseClicked(MouseEvent e) {
        }
    });
   }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        view1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        g1 = new content.CalendarGUI();
        jButton1 = new javax.swing.JButton();
        datedisplay = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1306, 940));

        view1.setAutoCreateRowSorter(true);
        view1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        view1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        view1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "Patient Name", "Disease", "Status", "Note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        view1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        view1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view1.setGridColor(new java.awt.Color(255, 255, 255));
        view1.setRowHeight(100);
        view1.setSelectionBackground(new java.awt.Color(255, 174, 61));
        view1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        view1.setShowGrid(true);
        jScrollPane2.setViewportView(view1);

        jPanel1.setLayout(new java.awt.CardLayout());

        g1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g1, "card2");

        jButton1.setBackground(new java.awt.Color(255, 174, 61));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("EDIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        datedisplay.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/Screenshot 2024-07-26 161344.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(datedisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datedisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ep.setVisible(true);
        g1.setVisible(false);
        
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         appointment_info(date,id);
    }//GEN-LAST:event_jButton2ActionPerformed

public void called(String id2,String date2){
    this.id=id2;
    this.date2=date2;
    appointment_info(date2,id);
    System.out.println("HIIII");
}
public void appointment_info(String date, String id)

    {   DefaultTableModel tb1model= ( DefaultTableModel)view1.getModel();
        tb1model.setRowCount(0);
        System.out.println(count);
           boolean hasData = false;
           try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);)
         {
         String sql="select*from appointment where date=? and doc_id=?";
           PreparedStatement stmt=conn.prepareStatement(sql);
           stmt.setString(1,date);
           stmt.setString(2,id);
          
            
         ResultSet rs = stmt.executeQuery();
    System.out.println(date+"   "+date2+"   "+id);
        // Print rows
      
      while(rs.next()) {
           
             aid=String.valueOf(rs.getInt("aid"));
                           pid=String.valueOf(rs.getInt("p_id"));
                           notes = rs.getString("notes");
                           time = rs.getString("time");
                           status= rs.getString("status");
                           disease = patientname(pid,"disease");
                           p_name= patientname(pid,"p_name");
           String tbData[]={time,p_name,disease,status,notes};
           
             
          
           tb1model.addRow(tbData);
            hasData = true;
         
      }
          
          
          
      if(!hasData){
          
          JOptionPane.showMessageDialog(this, "No appointments found for the selected date.");
      }
      
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
          

                          
}




public String patientname(String pid,String col){
   
try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);)
      {
           
          
           String sql="select %s from patient where p_id=?";
           PreparedStatement stmt=conn.prepareStatement(String.format(sql,col));
           stmt.setString(1,pid);
          

                try (ResultSet rs = stmt.executeQuery()) {
                     if (rs.next()) {
                   
                          
                           return rs.getString(col);
                      

                } 
                else {System.out.println("No data found for ID: " + pid);}
            }

      }
             catch (SQLException e) {
                       System.out.print(e);
        } 

return null;
}
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datedisplay;
    public static content.CalendarGUI g1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable view1;
    // End of variables declaration//GEN-END:variables
}
