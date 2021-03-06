/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import desktoptimer.PlayAlarm;
import ds.desktop.notify.DesktopNotify;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import modelo.Reloj;

/**
 *
 * @author rjbr
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public int i = 0;
    public int s, m, h, count = 0;
    Reloj reloj = new Reloj();
    private Timer timer;
    public boolean isSuspended = false;

    void showSeg() {

        if (s < 10 && s > 0) {
            lblSeg.setText("0" + s);
        } else if (s > 0) {
            lblSeg.setText("" + s);
        }
        if (s < 10) {
            lblSeg.setText("0" + s);// agrega valor cero si es menor de 10 
        }
    }

    void showMin() {
        if (m < 10 && m > 0) {
            lblMin.setText("0" + m);
        } else if (m > 0) {
            lblMin.setText("" + m);
        }
        if (m < 10) {
            lblMin.setText("0" + m);// agrega valor cero si es menor de 10 
        }
    }

    void showHr() {
        if (h < 10 && h > 0) {
            lblHr.setText("0" + h);
        } else if (h > 0) {
            lblHr.setText("" + h);
        }
        if (h < 10) {
            lblHr.setText("0" + h);// agrega valor cero si es menor de 10 
        }
    }
    Thread j = new Thread() {
        @Override
        public void run() {
            try {
                while (true) {
                    s--;
                    if (m < 0) {
                        m = 59;

                        h--;
                    }
                    if (s < 0) {
                        s = 59;
                        m--;
                    }
                    if (h == 0 & m == 0 & s == 0) {
                        DesktopNotify.showDesktopMessage("Tiempo transcurrido", "", DesktopNotify.SUCCESS);
                        j.suspend();
                      
                    }
                    if (s > 0) {
//                        lblMin.setText(String.valueOf(h) + ":" + String.valueOf(m) + ":"
//                                + String.valueOf(s));
                        showSeg();
                        showMin();
                        showHr();
                     
//                        lblHr.setText(String.valueOf(h));
//                        lblMin.setText(String.valueOf(m));
//                        lblSeg.setText(String.valueOf(s));

                    } else {
//                        lblMin.setText(String.valueOf(h) + ":" + String.valueOf(m) + ":"
//                                + String.valueOf(s));
//                        lblHr.setText(String.valueOf(h));
//                        lblMin.setText(String.valueOf(m));
//                        lblSeg.setText(String.valueOf(s));}
                        showSeg();
                        showMin();
                        showHr();
                      
                    }
                    j.sleep(1000);
                }
            } catch (java.lang.InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
            
           
        }
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
      @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/alarm.png"));


        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblHr = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSeg = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnMenosHr = new javax.swing.JButton();
        btnMenosMin = new javax.swing.JButton();
        btnMasMin = new javax.swing.JButton();
        btnMenosSeg = new javax.swing.JButton();
        btnMasSeg = new javax.swing.JButton();
        btnMasHr = new javax.swing.JButton();
        btnEmpezar = new javax.swing.JButton();
        btnOcultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desktop Timer");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        lblHr.setFont(new java.awt.Font("Ubuntu", 0, 80)); // NOI18N
        lblHr.setText("00");
        jPanel2.add(lblHr);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 80)); // NOI18N
        jLabel4.setText(":");
        jPanel2.add(jLabel4);

        lblMin.setFont(new java.awt.Font("Ubuntu", 0, 80)); // NOI18N
        lblMin.setText("00");
        jPanel2.add(lblMin);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 80)); // NOI18N
        jLabel5.setText(":");
        jPanel2.add(jLabel5);

        lblSeg.setFont(new java.awt.Font("Ubuntu", 0, 80)); // NOI18N
        lblSeg.setText("00");
        jPanel2.add(lblSeg);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        btnMenosHr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/less.png"))); // NOI18N
        btnMenosHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosHrActionPerformed(evt);
            }
        });

        btnMenosMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/less.png"))); // NOI18N
        btnMenosMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosMinActionPerformed(evt);
            }
        });

        btnMasMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus_1.png"))); // NOI18N
        btnMasMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasMinActionPerformed(evt);
            }
        });

        btnMenosSeg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/less.png"))); // NOI18N
        btnMenosSeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosSegActionPerformed(evt);
            }
        });

        btnMasSeg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus_1.png"))); // NOI18N
        btnMasSeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasSegActionPerformed(evt);
            }
        });

        btnMasHr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus_1.png"))); // NOI18N
        btnMasHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasHrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenosHr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMasHr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnMenosMin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMasMin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnMenosSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMasSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenosHr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenosMin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMasMin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenosSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMasSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMasHr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        btnEmpezar.setText("Empezar!");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });

        btnOcultar.setText("Minimizar");
        btnOcultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcultarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email.png"))); // NOI18N
        jLabel1.setToolTipText("Correo de contacto");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        jLabel2.setToolTipText("Información.");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnOcultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEmpezar)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEmpezar)
                            .addComponent(btnOcultar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasSegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasSegActionPerformed
        // BOTON MAS SEGUNDOS

        if (s > 49 && s < 59) {
            s++;
            lblSeg.setText("" + s);
        } else if (s < 50) {
            s = s + 10;

            lblSeg.setText("" + s);
        }
        
    }//GEN-LAST:event_btnMasSegActionPerformed

    private void btnMenosSegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosSegActionPerformed
        // BOTON MENOS SEGUNDOS

        if (s < 11 && s > 0) {

            s--;
            lblSeg.setText("0" + s);
        } else if (s > 0) {
            s = s - 10;
            lblSeg.setText("" + s);
        }

        if (s < 10) {

            lblSeg.setText("0" + s);// agrega valor cero si es menor de 10 
        } else {

        }
    }//GEN-LAST:event_btnMenosSegActionPerformed

    private void btnMenosMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosMinActionPerformed
        // BOTON MENOS MINUTOS

        if (m < 11 && m > 0) {

            m--;
            lblMin.setText("0" + m);
        } else if (m > 0) {
            m = m - 10;
            lblMin.setText("" + m);
        }

        if (m < 10) {

            lblMin.setText("0" + m);// agrega valor cero si es menor de 10 
        } else {

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenosMinActionPerformed

    private void btnMasMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasMinActionPerformed
        // BOTON MAS MINUTOS

        if (m > 49 && m < 59) {
            m++;
            lblMin.setText("" + m);
        } else if (m < 50) {
            m = m + 10;

            lblMin.setText("" + m);
        }
    }//GEN-LAST:event_btnMasMinActionPerformed

    private void btnMasHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasHrActionPerformed
        // BOTON MAS HORA

        if (h > 49 && h < 59) {
            h++;
            lblHr.setText("" + h);
        } else if (h < 50) {
            h = h + 10;

            lblHr.setText("" + h);
        }

    }//GEN-LAST:event_btnMasHrActionPerformed

    private void btnMenosHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosHrActionPerformed
        // BOTON MENOS HORA

        if (h < 11 && h > 0) {

            h--;
            lblHr.setText("0" + h);
        } else if (h > 0) {
            h = h - 10;
            lblHr.setText("" + h);
        }

        if (h < 10) {

            lblHr.setText("0" + h);// agrega valor cero si es menor de 10 
        } else {

        }

    }//GEN-LAST:event_btnMenosHrActionPerformed

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed

        // BOTON EMPEZAR
//        reloj.setSegundos(s);
//        reloj.setMinutos(m);
//        reloj.setHora(h);
if((Integer.valueOf(lblSeg.getText())!= null) && 
        (Integer.valueOf(lblMin.getText())!=null) && 
        (Integer.valueOf(lblHr.getText()))!= null) {
        count++;
        if (count == 1) {
            h = Integer.parseInt(lblHr.getText());
            m = Integer.parseInt(lblMin.getText());
            s = Integer.parseInt(lblSeg.getText());
        }
        
      
        if(j.isAlive()==true){
        
            j.resume();
        }else{
        j.start();
        }
    }else{}
        
//       DesktopNotify.showDesktopMessage("Tiempo transcurrido", "", DesktopNotify.SUCCESS);

        //System.out.println("" + reloj.toString());
    }//GEN-LAST:event_btnEmpezarActionPerformed

    private void btnOcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcultarActionPerformed
    this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnOcultarActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
       JOptionPane.showMessageDialog(null,"Contacto: rjbr39@gmail.com");
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
      JOptionPane.showMessageDialog(null,"Software de Cronómetro inverso con alarma recordatoria.");
    }//GEN-LAST:event_jLabel2MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JButton btnMasHr;
    private javax.swing.JButton btnMasMin;
    private javax.swing.JButton btnMasSeg;
    private javax.swing.JButton btnMenosHr;
    private javax.swing.JButton btnMenosMin;
    private javax.swing.JButton btnMenosSeg;
    private javax.swing.JButton btnOcultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblHr;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblSeg;
    // End of variables declaration//GEN-END:variables
}
