
package cafe;

import java.awt.Image;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Combo extends javax.swing.JFrame {

    private double vat = 0.0;
    private double total = 0.0;
    private int x = 0;
    public Combo() {
        initComponents();
        init();
        
    }
        public void init() {
        setImage();
        setTime();
    }

    public void setImage() {
        ImageIcon icon = new ImageIcon(getClass().getResource("combo1.jpg"));
        ImageIcon icon1 = new ImageIcon(getClass().getResource("combo2.jpg"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("combo3.jpg"));
        ImageIcon icon3 = new ImageIcon(getClass().getResource("combo4.jpg"));
        ImageIcon icon4 = new ImageIcon(getClass().getResource("combo5.jpg"));
        ImageIcon icon5 = new ImageIcon(getClass().getResource("combo6.jpg"));
        ImageIcon icon6 = new ImageIcon(getClass().getResource("clock.png"));
        ImageIcon icon7 = new ImageIcon(getClass().getResource("cafe.png"));


        Image img = icon.getImage().getScaledInstance(combo1lbl.getWidth(), combo1lbl.getHeight(), Image.SCALE_SMOOTH);
        Image img1 = icon1.getImage().getScaledInstance(combo2lbl.getWidth(), combo2lbl.getHeight(), Image.SCALE_SMOOTH);
        Image img2 = icon2.getImage().getScaledInstance(combo3lbl.getWidth(), combo3lbl.getHeight(), Image.SCALE_SMOOTH);
        Image img3 = icon3.getImage().getScaledInstance(combo4lbl.getWidth(), combo4lbl.getHeight(), Image.SCALE_SMOOTH);
        Image img4 = icon4.getImage().getScaledInstance(combo5lbl.getWidth(), combo5lbl.getHeight(), Image.SCALE_SMOOTH);
        Image img5 = icon5.getImage().getScaledInstance(combo6lbl.getWidth(), combo6lbl.getHeight(), Image.SCALE_SMOOTH);
        Image img6 = icon6.getImage().getScaledInstance(clock_lb.getWidth(), clock_lb.getHeight(), Image.SCALE_SMOOTH);
        Image img7 = icon7.getImage().getScaledInstance(iconlb.getWidth(), iconlb.getHeight(), Image.SCALE_SMOOTH);

        combo1lbl.setIcon(new ImageIcon(img));
        combo2lbl.setIcon(new ImageIcon(img1));
        combo3lbl.setIcon(new ImageIcon(img2));
        combo4lbl.setIcon(new ImageIcon(img3));
        combo5lbl.setIcon(new ImageIcon(img4));
        combo6lbl.setIcon(new ImageIcon(img5));
        clock_lb.setIcon(new ImageIcon(img6));
        iconlb.setIcon(new ImageIcon(img7));
    }

    public void reset() {
        total = 0.0;
        x = 0;
        vat = 0.0;
        totalbtn.setEnabled(true);
        count1.setValue(0);
        count2.setValue(0);
        count3.setValue(0);
        count4.setValue(0);
        count5.setValue(0);
        count6.setValue(0);
        vat_txtf.setText("0.0 EGP");
        subtotal_txtf.setText("0.0 EGP");
        total_txtf.setText("0.0 EGP");
        bill.setText("");
        combo1_chbx.setSelected(false);
        combo2_chbx.setSelected(false);
        combo3_chbx.setSelected(false);
        combo4_chbx.setSelected(false);
        combo5_chbx.setSelected(false);
        combo6_chbx.setSelected(false);

    }
       public void dudate() {
        vat_txtf.setText(String.valueOf(vat));
        subtotal_txtf.setText(String.valueOf(total));
        total_txtf.setText(String.valueOf(total + vat));

    }

    public void getVat(int v) {
        if (v >= 400 && v <= 550) {
            vat = 40.0;
        } else if (v > 550 && v <= 800) {
            vat = 50.0;
        } else if (v >= 1000) {
            vat = 70.0;
        }
    }

    public void jaxonCafe() {
        int purchaseid = 15020 + (int) (Math.random() * 80800);
        bill.setText("********************** Jaxon Cafe **************************\n"
                + " Time: " + clockk1_lb.getText() + "         Date: " + date_lb.getText() + "\n"
                + "Purchase Id: " + purchaseid +"\n"       
                + "****************************************************************\n"
                + " Item Name: \t\t" + "   Price: \n");

    }

    public boolean qtyIsZero(int qty) {
        if (qty == 0) {
            JOptionPane.showMessageDialog(null, "Please Choose an Item!");
            return true;
        }
        return false;
    }

     public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Drinks.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("hh:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE, dd:MM:yyyy");
                    String time = tf.format(date);
                    clockk1_lb.setText(time);
                    date_lb.setText(df.format(date));

                }
            }
        }).start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        iconlb = new javax.swing.JLabel();
        clock_lb = new javax.swing.JLabel();
        clockk1_lb = new javax.swing.JLabel();
        date_lb = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        combo1lbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        count1 = new javax.swing.JSpinner();
        combo1_chbx = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        combo2lbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        count2 = new javax.swing.JSpinner();
        combo2_chbx = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        combo3lbl = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        count3 = new javax.swing.JSpinner();
        combo3_chbx = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        combo5lbl = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        count5 = new javax.swing.JSpinner();
        combo5_chbx = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        combo6lbl = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        count6 = new javax.swing.JSpinner();
        combo6_chbx = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        combo4lbl = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        count4 = new javax.swing.JSpinner();
        combo4_chbx = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        totalbtn = new javax.swing.JButton();
        reciept_btn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        vat_lb = new javax.swing.JLabel();
        vat_txtf = new javax.swing.JTextField();
        subtotal_lb = new javax.swing.JLabel();
        subtotal_txtf = new javax.swing.JTextField();
        total_lb = new javax.swing.JLabel();
        total_txtf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(225, 225, 225));

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel1.setText("JAXON Café");

        clockk1_lb.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N

        date_lb.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        date_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconlb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 491, Short.MAX_VALUE)
                .addComponent(clock_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clockk1_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(iconlb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clockk1_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clock_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(235, 235, 235));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel3.setPreferredSize(new java.awt.Dimension(886, 473));

        jLabel2.setBackground(new java.awt.Color(235, 235, 235));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Combos Special Price");

        jPanel6.setBackground(new java.awt.Color(250, 250, 250));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Price:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Quantity:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Purchase:");

        lbl1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Combo 1");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("420 EGP");

        count1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        combo1_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        combo1_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(combo1lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo1_chbx)
                            .addComponent(count1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(combo1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(count1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combo1_chbx)))
        );

        jPanel7.setBackground(new java.awt.Color(250, 250, 250));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Price:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Quantity:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Purchase:");

        lbl2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("Combo 2");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("455 EGP");

        count2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        combo2_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        combo2_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(combo2lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8))
                .addGap(53, 53, 53)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo2_chbx)
                    .addComponent(count2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(combo2lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(count2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(combo2_chbx)))
        );

        jPanel8.setBackground(new java.awt.Color(250, 250, 250));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Price:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Quantity:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Purchase:");

        lbl3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("Combo 3");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("410 EGP");

        count3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        combo3_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        combo3_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo3_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(combo3lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(52, 52, 52)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo3_chbx)
                    .addComponent(count3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(combo3lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16))
                .addGap(7, 7, 7)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(count3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(combo3_chbx)))
        );

        jPanel10.setBackground(new java.awt.Color(250, 250, 250));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Price:");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("Quantity:");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Purchase:");

        lbl5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setText("Combo 5");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("480 EGP");

        count5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        combo5_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        combo5_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo5_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(combo5lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(53, 53, 53)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(count5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo5_chbx)
                    .addComponent(jLabel24))
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(combo5lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel24))
                .addGap(7, 7, 7)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(count5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(combo5_chbx)))
        );

        jPanel11.setBackground(new java.awt.Color(250, 250, 250));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("Price:");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("Quantity:");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("Purchase:");

        lbl6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setText("Combo 6");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("520 EGP");

        count6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        combo6_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        combo6_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo6_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(combo6lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel27)))
                .addGap(53, 53, 53)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo6_chbx)
                    .addComponent(count6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(lbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(combo6lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel28))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(count6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(combo6_chbx))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(250, 250, 250));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("Price:");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("Quantity:");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Purchase:");

        lbl4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("Combo 4");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setText("500 EGP");

        count4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        combo4_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        combo4_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo4_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(combo4lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(combo4_chbx)
                        .addComponent(count4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(combo4lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel32))
                .addGap(7, 7, 7)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(count4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(combo4_chbx)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(235, 235, 235));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));
        jPanel4.setPreferredSize(new java.awt.Dimension(886, 61));

        totalbtn.setBackground(new java.awt.Color(0, 153, 0));
        totalbtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        totalbtn.setForeground(new java.awt.Color(255, 255, 255));
        totalbtn.setText("Total");
        totalbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        totalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbtnActionPerformed(evt);
            }
        });

        reciept_btn.setBackground(new java.awt.Color(0, 51, 255));
        reciept_btn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        reciept_btn.setForeground(new java.awt.Color(255, 255, 255));
        reciept_btn.setText("Reciept");
        reciept_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reciept_btnActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(204, 204, 0));
        resetbtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(204, 0, 51));
        exitbtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(0, 0, 0));
        backbtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(totalbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(reciept_btn)
                .addGap(25, 25, 25)
                .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reciept_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel5.setBackground(new java.awt.Color(235, 235, 235));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));

        vat_lb.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vat_lb.setText("VAT:");

        vat_txtf.setEditable(false);
        vat_txtf.setBackground(new java.awt.Color(255, 255, 255));
        vat_txtf.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vat_txtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vat_txtf.setText("0.0 EGP");
        vat_txtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vat_txtfActionPerformed(evt);
            }
        });

        subtotal_lb.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        subtotal_lb.setText("Subtotal:");

        subtotal_txtf.setEditable(false);
        subtotal_txtf.setBackground(new java.awt.Color(255, 255, 255));
        subtotal_txtf.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        subtotal_txtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subtotal_txtf.setText("0.0 EGP");

        total_lb.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        total_lb.setText("Total:");

        total_txtf.setEditable(false);
        total_txtf.setBackground(new java.awt.Color(255, 255, 255));
        total_txtf.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        total_txtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_txtf.setText("0.0 EGP");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        bill.setColumns(20);
        bill.setRows(5);
        jScrollPane1.setViewportView(bill);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtotal_lb)
                            .addComponent(total_lb))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subtotal_txtf)
                            .addComponent(total_txtf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(vat_lb)
                        .addGap(88, 88, 88)
                        .addComponent(vat_txtf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vat_lb)
                    .addComponent(vat_txtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtotal_lb)
                    .addComponent(subtotal_txtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_txtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_lb))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void combo1_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1_chbxActionPerformed
        int qty = Integer.parseInt(count1.getValue().toString());
        if (!qtyIsZero(qty) && combo1_chbx.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 120;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + "-" + lbl1.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
            combo1_chbx.setSelected(false);
        }
    }//GEN-LAST:event_combo1_chbxActionPerformed

    private void combo2_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2_chbxActionPerformed
        int qty = Integer.parseInt(count2.getValue().toString());
        if (!qtyIsZero(qty) && combo2_chbx.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 145;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + "-" + lbl2.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
            combo2_chbx.setSelected(false);
        }
    }//GEN-LAST:event_combo2_chbxActionPerformed

    private void combo3_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo3_chbxActionPerformed
        int qty = Integer.parseInt(count3.getValue().toString());
        if (!qtyIsZero(qty) && combo3_chbx.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 135;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + "-" + lbl3.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
            combo3_chbx.setSelected(false);
        }
    }//GEN-LAST:event_combo3_chbxActionPerformed

    private void combo5_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo5_chbxActionPerformed
        int qty = Integer.parseInt(count5.getValue().toString());
        if (!qtyIsZero(qty) && combo5_chbx.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 180;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + "-" + lbl5.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
            combo5_chbx.setSelected(false);
        }
    }//GEN-LAST:event_combo5_chbxActionPerformed

    private void combo6_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo6_chbxActionPerformed
        int qty = Integer.parseInt(count6.getValue().toString());
        if (!qtyIsZero(qty) && combo6_chbx.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 175;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + "-" + lbl6.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
            combo6_chbx.setSelected(false);
        }
    }//GEN-LAST:event_combo6_chbxActionPerformed

    private void combo4_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo4_chbxActionPerformed
        int qty = Integer.parseInt(count4.getValue().toString());
        if (!qtyIsZero(qty) && combo4_chbx.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 200;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + "-" + lbl4.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
            combo4_chbx.setSelected(false);
        }
    }//GEN-LAST:event_combo4_chbxActionPerformed

    private void totalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbtnActionPerformed
        if (total == 0.0) {
            JOptionPane.showMessageDialog(null, "You Have Not Selected any Item!");
        } else {
            bill.setText(bill.getText()
                + "\n*************************************************************\n"
                + " Vat: \t\t" + vat + "\n"
                + " Subtotal: \t\t" + total + "\n"
                + " Total: \t\t" + (total + vat) + "\n\n"
                + "********************** Thank You! ************************\n"
            );
        }
    }//GEN-LAST:event_totalbtnActionPerformed

    private void reciept_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciept_btnActionPerformed
        if (total != 0) {
            if (totalbtn.isEnabled()) {
                try {
                    bill.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(Drinks.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "First, You Should Calculate The Total Price. ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You Have Not Purchased any Product!");
        }
    }//GEN-LAST:event_reciept_btnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        reset();
    }//GEN-LAST:event_resetbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        this.hide();
        welcome welc = new welcome();
        welc.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void vat_txtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vat_txtfActionPerformed

    }//GEN-LAST:event_vat_txtfActionPerformed
int xx ,xy;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Combo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JTextArea bill;
    private javax.swing.JLabel clock_lb;
    private javax.swing.JLabel clockk1_lb;
    private javax.swing.JCheckBox combo1_chbx;
    private javax.swing.JLabel combo1lbl;
    private javax.swing.JCheckBox combo2_chbx;
    private javax.swing.JLabel combo2lbl;
    private javax.swing.JCheckBox combo3_chbx;
    private javax.swing.JLabel combo3lbl;
    private javax.swing.JCheckBox combo4_chbx;
    private javax.swing.JLabel combo4lbl;
    private javax.swing.JCheckBox combo5_chbx;
    private javax.swing.JLabel combo5lbl;
    private javax.swing.JCheckBox combo6_chbx;
    private javax.swing.JLabel combo6lbl;
    private javax.swing.JSpinner count1;
    private javax.swing.JSpinner count2;
    private javax.swing.JSpinner count3;
    private javax.swing.JSpinner count4;
    private javax.swing.JSpinner count5;
    private javax.swing.JSpinner count6;
    private javax.swing.JLabel date_lb;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel iconlb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JButton reciept_btn;
    private javax.swing.JButton resetbtn;
    private javax.swing.JLabel subtotal_lb;
    private javax.swing.JTextField subtotal_txtf;
    private javax.swing.JLabel total_lb;
    private javax.swing.JTextField total_txtf;
    private javax.swing.JButton totalbtn;
    private javax.swing.JLabel vat_lb;
    private javax.swing.JTextField vat_txtf;
    // End of variables declaration//GEN-END:variables
}
