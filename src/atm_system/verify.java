

package atm_system;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class verify extends javax.swing.JFrame {


    public verify() {
        initComponents();
        seticon();
    }
    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ATM.png")));
    }
    String fnamez;
int balancz;
int operation;
Connection con;
ResultSet rs;
Statement st;
  
    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        widthraw = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        note = new javax.swing.JLabel();
        note1 = new javax.swing.JLabel();
        note3 = new javax.swing.JLabel();
        pin = new javax.swing.JPasswordField();
        jButton11 = new javax.swing.JButton();
        balance = new javax.swing.JButton();
        favourite = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(21, 8, -10, 8, new java.awt.Color(204, 204, 255)));

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("7");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("4");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("8");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("2");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("0");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("9");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("6");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("3");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 215, -1, 278));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(21, 8, -10, 8, new java.awt.Color(204, 204, 204)));

        cancel.setBackground(new java.awt.Color(255, 0, 0));
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        enter.setBackground(new java.awt.Color(0, 153, 153));
        enter.setForeground(new java.awt.Color(255, 255, 255));
        enter.setText("ENTER");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(204, 204, 0));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(102, 255, 255));
        jButton14.setFont(new java.awt.Font("sansserif", 1, 14)); 
        jButton14.setForeground(new java.awt.Color(0, 0, 204));
        jButton14.setText("!");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 215, -1, -1));

        widthraw.setText(">>>>");
        widthraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthrawActionPerformed(evt);
            }
        });
        jPanel1.add(widthraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 48, -1, -1));

        deposit.setText(">>>>");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });
        jPanel1.add(deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 129, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 51, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(18, 6, -12, 6, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        note.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        note.setText("PLEASE ENTER YOUR PIN");
        jPanel4.add(note, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 54, 221, 29));

        note1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        note1.setForeground(new java.awt.Color(0, 0, 51));
        note1.setText("welcome");
        jPanel4.add(note1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 29, 190, -1));

        note3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        note3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(note3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 115, 143, 15));

        pin.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 89, 108, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jButton11.setForeground(new java.awt.Color(255, 0, 102));
        jButton11.setText("X");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 0, -1, -1));

        balance.setText("<<<<");
        balance.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });
        jPanel1.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 48, 67, 26));

        favourite.setText("<<<<");
        favourite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favouriteActionPerformed(evt);
            }
        });
        jPanel1.add(favourite, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 142, -1, -1));

        jPanel9.setBackground(new java.awt.Color(153, 153, 255));

        jLabel10.setFont(new java.awt.Font("Impact", 1, 24)); 
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bangko Iniduro");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel2.setText("BANK");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))
        );

        pack();
    }

    private void favouriteActionPerformed(java.awt.event.ActionEvent evt) {
   note1.setText("This feature is");
   note.setText("NOT availlable!!!");
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {

        note.setText("SEE YOU BACK AGAIN");
        note3.setText("***ATM MACHINE***");
        note1.setText("****ATM MACHINE***");
        
       pin.setVisible(false);
       clear.setEnabled(false);
       enter.setEnabled(false);
       
        
        
      
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
       String num=pin.getText()+"1";
       pin.setText(num);
       
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
String num=pin.getText()+"2";
       pin.setText(num); 
      
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
String num=pin.getText()+"3";
       pin.setText(num);
      
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
String num=pin.getText()+"4";
       pin.setText(num); 
      
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
String num=pin.getText()+"5";
       pin.setText(num); 
     
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
String num=pin.getText()+"6";
       pin.setText(num);
      
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
String num=pin.getText()+"7";
       pin.setText(num); 
  
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
String num=pin.getText()+"8";
       pin.setText(num); 
     
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
String num=pin.getText()+"9";
       pin.setText(num);

    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
String num=pin.getText()+"0";
       pin.setText(num); 
    }

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {
pin.setText("");
    }

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {

        try{
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
    st = con.createStatement();
    String query = "SELECT * FROM customer WHERE pin = '"+pin.getText()+"'";
    rs = st.executeQuery(query);
     if(rs.next()){
     
     balancz =rs.getInt("balance");
    
     widthraw.setText("Widthraw");
     deposit.setText("Deposit");
     fnamez=rs.getString("fname");
     note.setText("Welcome " + rs.getString("fname") +" "+  rs.getString("lname") +"" );
     favourite.setText("*****");
     balance.setText("Balance");
    
     note3.setText("*************************");
     note1.setText("_________________________");
     pin.setVisible(false);
    
        widthraw.setEnabled(true);
        
        deposit.setEnabled(true);
        favourite.setEnabled(true);
        balance.setEnabled(true);
        
        
        operation=0;
     }
     else{
         note3.setVisible(true);
         pin.setText("");
         note3.setText("no such user!");
         operation=1;
         
     }
    }catch(Exception e){
        pin.setVisible(false);
        note.setText("_______________");
        note3.setText("***************");
    note1.setText("Oooops!!! connection problem");
    
   
}
        if(operation==0){
            
            
        
         
         
        }
    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
     System.exit(0);
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {
      
        widthraw.setEnabled(false);
        
        deposit.setEnabled(false);
        favourite.setEnabled(false);
        balance.setEnabled(false);
       
        
       

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {
  note1.setText("Current available");
  note.setText("balance: Php "+balancz);
   
    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        note1.setText("ATM: quickmode");
  note.setText("VERSION: 9.1.1.1");
    }

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {
        deposit depositer= new deposit();
        depositer.setVisible(true);
        depositer.setLocationRelativeTo(null);
        depositer.notes1.setText(fnamez);
        this.dispose();
        
    }

    private void widthrawActionPerformed(java.awt.event.ActionEvent evt) {
       widthraw wed=new widthraw();
       wed.setVisible(true);
       wed.setLocationRelativeTo(null);
       wed.note1.setText(fnamez);
       this.dispose();
    }/

  
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verify().setVisible(true);
            }
        });
    }

  
    private javax.swing.JButton balance;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JButton deposit;
    private javax.swing.JButton enter;
    private javax.swing.JButton favourite;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel note;
    private javax.swing.JLabel note1;
    private javax.swing.JLabel note3;
    private javax.swing.JPasswordField pin;
    private javax.swing.JButton widthraw;
   
}
