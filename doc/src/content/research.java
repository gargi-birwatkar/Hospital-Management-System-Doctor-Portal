
package content;

import java.awt.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;



public class research extends javax.swing.JPanel {
    private final String DB_URL ="jdbc:mysql://localhost:3306/gargi";
    private final String USER="root";
    private final String PASS ="gargi*1995";
    public String id;
    
    private String rid,title,status,docid;
    public research(String idd) {
        initComponents();
        addfunction();
        this.id=idd;
        refresh.setBackground(new Color (255,102,0));
        DefaultTableModel model = (DefaultTableModel) view.getModel();
       
        model.setRowCount(0);
        
        MultiLineTableCellRenderer renderer = new MultiLineTableCellRenderer();
    for (int i = 0; i < view.getColumnCount(); i++) {
        view.getColumnModel().getColumn(i).setCellRenderer(renderer);
    }
    view.setGridColor(Color.BLACK);
                           view.setShowVerticalLines(true);            
      JTableHeader header = view.getTableHeader();
      view.setFillsViewportHeight(true);
      header.setPreferredSize(new Dimension(header.getWidth(),90));
    header.setDefaultRenderer(new CustomHeaderRenderer());
        getinfoall(id);
    }
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        view = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        searchtext = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display.setBackground(new java.awt.Color(228, 241, 238));

        javax.swing.GroupLayout displayLayout = new javax.swing.GroupLayout(display);
        display.setLayout(displayLayout);
        displayLayout.setHorizontalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        displayLayout.setVerticalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 1220, 190));

        add.setBackground(new java.awt.Color(0, 51, 153));
        add.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/Screenshot 2024-07-27 002345.png"))); // NOI18N
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 160, 40));

        update.setBackground(new java.awt.Color(0, 51, 153));
        update.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/Screenshot 2024-07-27 002555.png"))); // NOI18N
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 140, 40));

        view.setBackground(new java.awt.Color(228, 241, 238));
        view.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Research ID", "Title", "Status", "Doctor ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        view.setGridColor(new java.awt.Color(204, 255, 255));
        view.setRowHeight(40);
        view.setSelectionBackground(new java.awt.Color(255, 153, 51));
        view.setSelectionForeground(new java.awt.Color(255, 255, 255));
        view.setShowGrid(true);
        jScrollPane1.setViewportView(view);
        if (view.getColumnModel().getColumnCount() > 0) {
            view.getColumnModel().getColumn(0).setHeaderValue("Research ID");
            view.getColumnModel().getColumn(1).setHeaderValue("Title");
            view.getColumnModel().getColumn(2).setHeaderValue("Status");
            view.getColumnModel().getColumn(3).setHeaderValue("Doctor ID");
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 1220, 400));

        delete.setBackground(new java.awt.Color(0, 0, 153));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/Screenshot 2024-07-26 162036.png"))); // NOI18N
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 200, 40));

        refresh.setBackground(new java.awt.Color(204, 255, 204));
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/Screenshot 2024-07-26 161344.png"))); // NOI18N
        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 60, 60));

        searchtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtextActionPerformed(evt);
            }
        });
        searchtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtextKeyReleased(evt);
            }
        });
        add(searchtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 480, 40));

        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/content/Screenshot 2024-08-12 204323.png"))); // NOI18N
        searchbtn.setText("jButton1");
        searchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 30, 46, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
       
        display.removeAll();
        
        JTextField id= new  JTextField();
         id.setFont(new Font("Segoe UI", Font.BOLD, 24));
        JButton del_button= new JButton("DELETE");
        JLabel id_d=new JLabel("Research ID: ");
        id_d.setForeground(new Color(255,153,51));
        id_d.setFont(new Font("Segoe UI", Font.BOLD, 24));
        
         display.add(id_d);
         display.add(id);
         display.add(del_button);
         
         id.setBounds(520,65, 250,50); 
         del_button.setBounds(830,65, 200,50); 
         del_button.setBackground(new Color(255,153,51));
         del_button.setFont(new Font("Segoe UI", Font.BOLD, 20));
         id_d.setBounds(290,65, 200,50);  
         id.setEditable(true); 
         del_button.setForeground(Color.WHITE);
         Cursor cursor = del_button.getCursor();
        del_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
         del_button.addActionListener((ActionEvent e) -> {
              if((id.getText()).isEmpty()){
                JOptionPane.showMessageDialog(this,"Please enter Details in all the Fields!!");
            }
            else{
             String r_id=id.getText();  
              id.setText("");
             deletedoc(r_id);
              }
        });
        
// ActionListener for the changed field to submit the form on Enter key
id.addActionListener((ActionEvent e) -> {
    del_button.doClick(); // Trigger the button action, which submits the form
});
       
        display.revalidate(); // Added to update layout
        display.repaint(); 
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        //title,status
        display.removeAll();
        JLabel id_d=new JLabel("Research ID: ");
        id_d.setBounds(70,20, 150,50);
        id_d.setForeground(new Color(255,153,51));
        id_d.setFont(new Font("Segoe UI", Font.BOLD, 24));
        
        JTextField id= new  JTextField();
        id.setBounds(290,20, 200,50); 
        id.setEditable(true); 

        id.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        id.requestFocusInWindow(); 
       
        JButton up_button= new JButton("UPDATE");
        up_button.setBounds(550,100, 600,50);  
        up_button.setBackground(new Color(255,153,51));
        up_button.setFont(new Font("Segoe UI", Font.BOLD, 20));
        up_button.setForeground(Color.WHITE);
        Cursor cursor = up_button.getCursor();
        up_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        JLabel optiond =new JLabel("Which Field You Want to Change? ");
        optiond.setBounds(550,20, 500,50);
        optiond.setForeground(new Color(255,153,51));
        optiond.setFont(new Font("Segoe UI", Font.BOLD, 24));
        
        String option[]={"title","status"};
        JComboBox cb = new JComboBox(option);
        cb.setBounds(950,20,200,50);
        cb.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        cb.setBackground(Color.WHITE);
        
        JLabel change=new JLabel("Change to what? ");
        change.setBounds(70,100, 200,50);
        change.setForeground(new Color(255,153,51));
        change.setFont(new Font("Segoe UI", Font.BOLD, 24));
        
        JTextField changed= new  JTextField();
        changed.setBounds(290,100, 200,50); 
        changed.setEditable(true);
        changed.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        
         display.add(changed);
         display.add(change);
         display.add(optiond);
         display.add(cb);
         display.add(id_d);
         display.add(id);
         display.add(up_button);
         
         up_button.addActionListener((ActionEvent e) -> {
             
             if((id.getText()).isEmpty()&& (changed.getText()).isEmpty()){
                JOptionPane.showMessageDialog(this,"Please enter Details in all the Fields!!");
            }
            else{
             String colname =(String) cb.getItemAt(cb.getSelectedIndex());  
             String r_id =id.getText();  
             String changeto =changed.getText();
             updatedoc(r_id,changeto,colname);
             }
              id.setText("");
      changed.setText("");
       id.requestFocusInWindow(); 
        });
         
        

id.addActionListener((ActionEvent e) -> {
    cb.requestFocusInWindow(); // Move focus to the combobox
});

// KeyListener for the combobox to move focus to the change field on Enter key
cb.addKeyListener(new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            changed.requestFocusInWindow(); // Move focus to the change field
        }
    }
});

// ActionListener for the changed field to submit the form on Enter key
changed.addActionListener((ActionEvent e) -> {
    up_button.doClick(); // Trigger the button action, which submits the form
});
   
        display.revalidate(); // Added to update layout
        display.repaint(); 
        
    }//GEN-LAST:event_updateActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        display.removeAll();
       
        addfunction();
        
        
    }//GEN-LAST:event_addActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
         view.setRowSorter(null);
        DefaultTableModel model = (DefaultTableModel) view.getModel();
        model.setRowCount(0);
        getinfoall(id);
    }//GEN-LAST:event_refreshActionPerformed

    private void searchtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtextActionPerformed

    private void searchtextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtextKeyReleased
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) view.getModel();
        TableRowSorter<DefaultTableModel>obj=new TableRowSorter<>(model);
        view.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchtext.getText()));
    }//GEN-LAST:event_searchtextKeyReleased

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) view.getModel();
        TableRowSorter<DefaultTableModel>obj=new TableRowSorter<>(model);
        view.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchtext.getText()));
    }//GEN-LAST:event_searchbtnActionPerformed
public void addfunction(){
    JLabel title=new JLabel("Title: ");
        title.setBounds(70,20, 100,50);
       title.setFont(new Font("Segoe UI", Font.BOLD, 24));
       title.setForeground(new Color(255,153,51));
       
        JTextField title_id= new  JTextField();
        title_id.setBounds(250,20, 200,50); 
        title_id.setEditable(true);  
         title_id.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        
        
         JLabel status=new JLabel("Status: ");
        status.setBounds(650,20, 90,50);
        status.setForeground(new Color(255,153,51));
        status.setFont(new Font("Segoe UI", Font.BOLD, 24));
        
        JTextField status_d= new  JTextField();
        status_d.setBounds(800,20, 200,50); 
        status_d.setEditable(true);
        status_d.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        
        JLabel doc_id=new JLabel("Doctor ID: ");
        doc_id.setBounds(70,100, 150,50);
        doc_id.setFont(new Font("Segoe UI", Font.BOLD, 24));
        doc_id.setForeground(new Color(255,153,51));
        
        
        JTextField docid_d= new  JTextField();
        docid_d.setBounds(250,100,200,50); 
        docid_d.setEditable(true);
        docid_d.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        
         JButton add_button= new JButton("ADD");
        add_button.setBounds(650,100, 350,50);  
        add_button.setBackground(new Color(255,153,51));
         add_button.setForeground(Color.WHITE);
        add_button.setFont(new Font("Segoe UI", Font.BOLD, 20));
        Cursor cursor = add_button.getCursor();
        add_button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        display.add(add_button);
        display.add(title);
        display.add(title_id);
       
        display.add(status);
        display.add(status_d);
        display.add(doc_id);
        display.add(docid_d);
        
         add_button.addActionListener((ActionEvent e) -> {
            if((title_id.getText()).isEmpty()&& (status_d.getText()).isEmpty()&&(docid_d.getText()).isEmpty()){
                JOptionPane.showMessageDialog(this,"Please enter Details in all the Fields!!");
            }
            else{
              String titledd=title_id.getText();   
              String statusdd=status_d.getText();
              String docidd=docid_d.getText();
               database(titledd,statusdd,docidd);
            }
    
      status_d.setText("");
      title_id.setText("");
      docid_d.setText("");
      title_id.requestFocusInWindow();
           
        });
         title_id.addActionListener((ActionEvent e) -> {
    status_d.requestFocusInWindow(); // Move focus to the combobox
});

 status_d.addActionListener((ActionEvent e) -> {
     docid_d.requestFocusInWindow();
});
// ActionListener for the changed field to submit the form on Enter key
docid_d.addActionListener((ActionEvent e) -> {
    add_button.doClick(); // Trigger the button action, which submits the form
});
          
         display.revalidate(); // Added to update layout
        display.repaint(); 
}    
    
    public void deletedoc(String r_id){

//open database
          try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);){
                   String sql="delete from research where rid=?";
                   PreparedStatement stmt=conn.prepareStatement(sql);
                   stmt.setString(1,r_id);
                    int count=stmt.executeUpdate();
                 
                  System.out.print("deleted  successfully from Research Table"+count);
                   conn.close();
                   System.out.print("deleted  successfully from Research Table"+count);
                   DefaultTableModel model = (DefaultTableModel) view.getModel();
                   model.setRowCount(0);
                   if(count!=0){
                   getinfoall(id);
                   JOptionPane.showMessageDialog(this,"Record has been Deleted!!");
                   }
                   else{
                       JOptionPane.showMessageDialog(this,"No Record Found");
                   }
              } 
          catch (SQLException e) {
                  System.out.print(e);
                  JOptionPane.showMessageDialog(this,"Invalid Research ID!");
      } 
   

     }
    public void database(String titledd,String statusdd,String docidd){
    
    try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);)
        {
          
           String sql="insert into research (title ,status,docid) values(?,?,?)";
           PreparedStatement stmt=conn.prepareStatement(sql);
   
          stmt.setString(1,titledd);
          stmt.setString(2,statusdd);
          stmt.setString(3,docidd);
          
          
           stmt.execute();
           int count= stmt.getMaxRows();
           System.out.print(count);
          conn.close();
         
          System.out.print("inserted successfully in Research Table");
          DefaultTableModel model = (DefaultTableModel) view.getModel();
        model.setRowCount(0);
         
       JOptionPane.showMessageDialog(this,"Record has been Added!!");
       getinfoall(id);
           
       
        } 
          catch(SQLException e) {
                      System.out.print(e);
                       JOptionPane.showMessageDialog(this,"Error while adding the Research Paper!");
         } 
   
}
    
   public void updatedoc(String rid,String changeto,String change){
//open database
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);){
          
           String sql="update research set %s =? where rid=?";
           PreparedStatement stmt=conn.prepareStatement(String.format(sql,change));
           stmt.setString(1,changeto);
           stmt.setString(2,rid);

            int count= stmt.executeUpdate();
           
            conn.close();
            if(count!=0){
          
            System.out.print("Updated successfully in Research Table");
            DefaultTableModel model = (DefaultTableModel) view.getModel();
        model.setRowCount(0);
        JOptionPane.showMessageDialog(this,"Record has been Updated!!");
        getinfoall(id);
            }
            else{
                JOptionPane.showMessageDialog(this,"No Record Was Updated!!");
            }
            } 
                 catch (SQLException e) {
                       System.out.print(e);
                        JOptionPane.showMessageDialog(this,"Error while updating!");
      } 
}

   public void getinfoall(String id) {
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);){
        
String sql="SELECT * FROM research where docid=?";
           PreparedStatement stmt=conn.prepareStatement(sql);
           stmt.setString(1,id);
              ResultSet rs = stmt.executeQuery();

        // Print rows
        while (rs.next()) {
            rid = String.valueOf(rs.getString("rid"));
            title = rs.getString("title");
            status = rs.getString("status");
            docid = rs.getString("docid");

           String tbData[]={rid,title,status,docid};
           DefaultTableModel tb1model= ( DefaultTableModel)view.getModel();
           tb1model.addRow(tbData);
          adjustTableSize(view);
           
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    private static void adjustTableSize(JTable table) {
        int rowCount = table.getRowCount();
        int rowHeight = table.getRowHeight();
        int headerHeight = table.getTableHeader().getPreferredSize().height;

        int preferredHeight = rowCount * rowHeight + headerHeight;
        table.setPreferredScrollableViewportSize(new Dimension(table.getPreferredSize().width, preferredHeight));
        table.revalidate();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JPanel display;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchtext;
    private javax.swing.JButton update;
    private javax.swing.JTable view;
    // End of variables declaration//GEN-END:variables
}
