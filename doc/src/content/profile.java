
package content;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.ImageIcon;

public class profile extends javax.swing.JPanel {
 private final String DB_URL ="jdbc:mysql://localhost:3306/gargi";
    private final String USER="root";
    private final String PASS ="gargi*1995";
    public static String id;
     static int in=0;
     static int in2=0;
      static int in3=0;
     static String date = (LocalDate.now()).toString();
      GradientLabel nopat=new GradientLabel("#FDC830","#F37335");
      GradientLabel noapp=new GradientLabel("#FDC830","#F37335");
      GradientLabel busy1=new GradientLabel("#FDC830","#F37335");
      
static String path="";
      
    public profile(String idd) {
        initComponents();
      pic.setBounds(100,20,100,300);
 this.id=idd;
        
       nopat.setBounds(20,550,354,209);
       add(nopat);
       
        noapp.setBounds(450,550,354,209);
       add(noapp);
       
        busy1.setBounds(900,550,354,209);
       add(busy1);
        getpath();
        doctor_info(id);
        doc_app(id);
        doc_pat(id);
        doc_busy(id);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        post = new javax.swing.JLabel();
        study = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sp1 = new javax.swing.JLabel();
        sp2 = new javax.swing.JLabel();
        sp3 = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        typeOf = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Docid = new javax.swing.JLabel();
        sp4 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Profile");

        name.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        name.setForeground(new java.awt.Color(51, 102, 255));
        name.setText("Gargi Desai");

        post.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        post.setText("Surgeon , cardiologist");

        study.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        study.setText("Fellowship , MMBS, BDS");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Experience :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Type Of :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Speciality :");

        sp1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sp1.setText("Surgery");
        sp1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        sp1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sp2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sp2.setText("Implantations");
        sp2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        sp3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sp3.setText("Pediatrician");
        sp3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        year.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        year.setText("9");

        typeOf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        typeOf.setText("Surgeon");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Years");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 102, 255));
        jLabel16.setText("Dr.");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Doctor ID: ");

        Docid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Docid.setText("1");

        sp4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sp4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sp4.setText("Dentist");
        sp4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        sp4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sp4.setIconTextGap(66);

        pic.setBackground(new java.awt.Color(51, 153, 0));
        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(552, 552, 552))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Docid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(typeOf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(post, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(study, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(519, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sp3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(410, 410, 410))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name))
                        .addGap(2, 2, 2)
                        .addComponent(post)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(study, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Docid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(year)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeOf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(376, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
public final void getpath(){
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);)
         {
         String sql="select image from doctor where did=?";
           PreparedStatement stmt=conn.prepareStatement(sql);
           stmt.setString(1,id);
          
            
         ResultSet rs = stmt.executeQuery();
    System.out.println(date);
        // Print rows
      
      while(rs.next()) {
            path=rs.getString("image");
            System.out.println(path);
            ImageIcon image1 = new ImageIcon(path);
      pic.setIcon(image1);
          
      }
      
      
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public final  void doctor_info(String id)

    {   
       
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);)
      {
          
           String sql="select*from doctor where did=?";
           PreparedStatement stmt=conn.prepareStatement(sql);
           stmt.setString(1,id);

                try (ResultSet rs = stmt.executeQuery()) {
                     if (rs.next()) {
                   
                           Docid.setText(rs.getString("did"));
                           name.setText(rs.getString("docname"));
                           post.setText(rs.getString("post"));
                           study.setText(rs.getString("study"));
                           year.setText(rs.getString("experience"));
                           typeOf.setText(rs.getString("typeOf"));
                           sp1.setText(rs.getString("speciality1"));
                           sp2.setText(rs.getString("speciality2"));
                           sp3.setText(rs.getString("speciality3"));
                           sp4.setText(rs.getString("speciality4"));


                } 
                else {System.out.println("No data found for ID: " + id);}
            }

      }
             catch (SQLException e) {
                       System.out.print(e);
        } 
}

public final  void doc_app(String id){
    
           try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);)
         {
          String sql="select aid from appointment where doc_id=? ";
           PreparedStatement stmt=conn.prepareStatement(sql);
           stmt.setString(1, id);
          
         ResultSet rs = stmt.executeQuery();
   
      while(rs.next()) {
          
             in++;
           
      }
      
          String noofapp=Integer.toString(in);
         
         String htmlText = String.format("<html><body style='text-align: center;'>No. of Appointments:- <br><span style='font-size: 68px; text-align: center'>%s</span></body></html>",noofapp);
          noapp.setText( htmlText);
          
      
         }
             catch (SQLException e) {
                       System.out.print(e);
        } 
}

public final void doc_pat(String id){
         
           try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);)
         {
          String sql="select p_id from appointment where doc_id=? ";
           PreparedStatement stmt=conn.prepareStatement(sql);
           stmt.setString(1, id);
          
         ResultSet rs = stmt.executeQuery();
   
      while(rs.next()) {
          
             in2++;
           
      }
      
            String noofpat=Integer.toString(in2);
            String htmlText1 = String.format("<html><body style='text-align: center;'>Total No. of Patients :- <br><span style='font-size: 68px; text-align: center'>%s</span></body></html>", noofpat);
           nopat.setText( htmlText1);
        
      
         }
             catch (SQLException e) {
                       System.out.print(e);
        } 
}

public final  void doc_busy(String id){
   
           try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);)
         {
         String sql="select rid from research where docid=?";
           PreparedStatement stmt=conn.prepareStatement(sql);
           stmt.setString(1, id);
          
            
         ResultSet rs = stmt.executeQuery();
    System.out.println(date);
        // Print rows
      
      while(rs.next()) {
            in3++;
          
      }
      String noofpat=Integer.toString(in3);
            String htmlText2 = String.format("<html><body style='text-align: center;'>Total Number Of Research:- <br><span style='font-size: 68px; text-align: center'>%s</span></body></html>", noofpat);
           
      busy1.setText(htmlText2);
      
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Docid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel name;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel post;
    private javax.swing.JLabel sp1;
    private javax.swing.JLabel sp2;
    private javax.swing.JLabel sp3;
    private javax.swing.JLabel sp4;
    private javax.swing.JLabel study;
    private javax.swing.JLabel typeOf;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
