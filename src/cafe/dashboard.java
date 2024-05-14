package cafe;

import com.mysql.cj.result.FloatValueFactory;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class dashboard extends javax.swing.JFrame {

    private double vat = 0.0;
    private double total = 0.0;
    private int x = 0;

    public dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        init();
    }

    public void init() {
        setImage();
        setTime();
    }

    public void setImage() {
        ImageIcon icon = new ImageIcon(getClass().getResource("coldcoffee.jpg"));
        ImageIcon icon1 = new ImageIcon(getClass().getResource("cappuccinocoffee.jpg"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("chocolatecoffee.jpg"));
        ImageIcon icon3 = new ImageIcon(getClass().getResource("water.png"));
        ImageIcon icon4 = new ImageIcon(getClass().getResource("greentea.jpg"));
        ImageIcon icon5 = new ImageIcon(getClass().getResource("strawberrycake.jpg"));
        ImageIcon icon6 = new ImageIcon(getClass().getResource("chocolatecake.jpg"));
        ImageIcon icon7 = new ImageIcon(getClass().getResource("fruitscake.jpg"));
        ImageIcon icon8 = new ImageIcon(getClass().getResource("download.jpg"));
        ImageIcon icon9 = new ImageIcon(getClass().getResource("dgownload.jpg"));
        ImageIcon icon10 = new ImageIcon(getClass().getResource("clock.png"));

        Image img = icon.getImage().getScaledInstance(coldcoffelb.getWidth(), coldcoffelb.getHeight(), Image.SCALE_SMOOTH);
        Image img1 = icon1.getImage().getScaledInstance(cappcoffelb.getWidth(), cappcoffelb.getHeight(), Image.SCALE_SMOOTH);
        Image img2 = icon2.getImage().getScaledInstance(chococoffelb.getWidth(), chococoffelb.getHeight(), Image.SCALE_SMOOTH);
        Image img3 = icon3.getImage().getScaledInstance(waterlb.getWidth(), waterlb.getHeight(), Image.SCALE_SMOOTH);
        Image img4 = icon4.getImage().getScaledInstance(greentealb.getWidth(), greentealb.getHeight(), Image.SCALE_SMOOTH);
        Image img5 = icon5.getImage().getScaledInstance(strawcakelb.getWidth(), strawcakelb.getHeight(), Image.SCALE_SMOOTH);
        Image img6 = icon6.getImage().getScaledInstance(chococakelb.getWidth(), chococakelb.getHeight(), Image.SCALE_SMOOTH);
        Image img7 = icon7.getImage().getScaledInstance(fruitcakelb.getWidth(), fruitcakelb.getHeight(), Image.SCALE_SMOOTH);
        Image img8 = icon8.getImage().getScaledInstance(vancakelb.getWidth(), vancakelb.getHeight(), Image.SCALE_SMOOTH);
        Image img9 = icon9.getImage().getScaledInstance(lotcakelb.getWidth(), lotcakelb.getHeight(), Image.SCALE_SMOOTH);
        Image img10 = icon10.getImage().getScaledInstance(clock_lb.getWidth(), clock_lb.getHeight(), Image.SCALE_SMOOTH);

        coldcoffelb.setIcon(new ImageIcon(img));
        cappcoffelb.setIcon(new ImageIcon(img1));
        chococoffelb.setIcon(new ImageIcon(img2));
        waterlb.setIcon(new ImageIcon(img3));
        greentealb.setIcon(new ImageIcon(img4));
        strawcakelb.setIcon(new ImageIcon(img5));
        chococakelb.setIcon(new ImageIcon(img6));
        fruitcakelb.setIcon(new ImageIcon(img7));
        vancakelb.setIcon(new ImageIcon(img8));
        lotcakelb.setIcon(new ImageIcon(img9));
        clock_lb.setIcon(new ImageIcon(img10));
        ImageIcon icon11 = new ImageIcon(getClass().getResource("cafe.png"));
    Image img11 = icon11.getImage().getScaledInstance(iconlb.getWidth(), iconlb.getHeight(), Image.SCALE_SMOOTH);
    iconlb.setIcon(new ImageIcon(img11));
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
        count7.setValue(0);
        count8.setValue(0);
        count9.setValue(0);
        count10.setValue(0);
        vat_txtf.setText("0.0 EGP");
        subtotal_txtf.setText("0.0 EGP");
        total_txtf.setText("0.0 EGP");
        bill.setText("");
        jCheckBox.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox9.setSelected(false);
        jCheckBox10.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clock_lb = new javax.swing.JLabel();
        date_lb = new javax.swing.JLabel();
        clockk1_lb = new javax.swing.JLabel();
        iconlb = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        coldcoffelb = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        count1 = new javax.swing.JSpinner();
        jCheckBox = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        cappcoffelb = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        count2 = new javax.swing.JSpinner();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        chococoffelb = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        count3 = new javax.swing.JSpinner();
        jCheckBox3 = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        greentealb = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        count5 = new javax.swing.JSpinner();
        jCheckBox5 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        waterlb = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        count4 = new javax.swing.JSpinner();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        strawcakelb = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        count6 = new javax.swing.JSpinner();
        jCheckBox6 = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        chococakelb = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        count7 = new javax.swing.JSpinner();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        vancakelb = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        count9 = new javax.swing.JSpinner();
        jCheckBox9 = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        fruitcakelb = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        count8 = new javax.swing.JSpinner();
        jCheckBox8 = new javax.swing.JCheckBox();
        jPanel14 = new javax.swing.JPanel();
        lotcakelb = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        count10 = new javax.swing.JSpinner();
        jCheckBox10 = new javax.swing.JCheckBox();
        jPanel15 = new javax.swing.JPanel();
        totalbtn = new javax.swing.JButton();
        reciept_btn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        vat_txtf = new javax.swing.JTextField();
        subtotal_txtf = new javax.swing.JTextField();
        total_txtf = new javax.swing.JTextField();
        subtotal_lb = new javax.swing.JLabel();
        total_lb = new javax.swing.JLabel();
        vat_lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));

        jPanel2.setBackground(new java.awt.Color(225, 225, 225));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel1.setText("JAXON Café");

        date_lb.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        date_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        clockk1_lb.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconlb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clock_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clockk1_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clockk1_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconlb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(clock_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(235, 235, 235));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));

        jLabel2.setBackground(new java.awt.Color(235, 235, 235));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu Items");

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Price:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Quantity:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Purchase:");

        lbl1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Cold Coffee");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("65 EGP");

        count1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coldcoffelb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(coldcoffelb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(count1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCheckBox)))
        );

        jPanel5.setBackground(new java.awt.Color(250, 250, 250));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Price:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Quantity:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Purchase:");

        lbl2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("Cappuccino Coffee");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("55 EGP");

        count2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cappcoffelb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(cappcoffelb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl2)
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(count2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jCheckBox2)))
        );

        jPanel6.setBackground(new java.awt.Color(250, 250, 250));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Price:");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Quantity:");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Purchase:");

        lbl3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("Chocolate Coffee");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("55 EGP");

        count3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chococoffelb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel23)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(chococoffelb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl3)
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23))
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(count3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jCheckBox3)))
        );

        jPanel8.setBackground(new java.awt.Color(250, 250, 250));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setText("Price:");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setText("Quantity:");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel35.setText("Purchase:");

        lbl5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setText("Green Tea");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setText("35 EGP");

        count5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(greentealb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox5))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel37)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(greentealb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl5)
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel37))
                .addGap(7, 7, 7)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(count5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jCheckBox5)))
        );

        jPanel7.setBackground(new java.awt.Color(250, 250, 250));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("Price:");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("Quantity:");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("Purchase:");

        lbl4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("Water");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("15 EGP");

        count4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(waterlb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox4))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel30)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(waterlb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl4)
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel30))
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(count4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jCheckBox4)))
        );

        jPanel9.setBackground(new java.awt.Color(250, 250, 250));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel40.setText("Price:");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel41.setText("Quantity:");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel42.setText("Purchase:");

        lbl6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setText("Strawberry Cake");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel44.setText("100 EGP");

        count6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(strawcakelb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox6))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel44)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(lbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(strawcakelb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel44))
                .addGap(7, 7, 7)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(count6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jCheckBox6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(250, 250, 250));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel54.setText("Price:");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel55.setText("Quantity:");

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel56.setText("Purchase:");

        lbl7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setText("Chocolate Cake");

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel58.setText("110 EGP");

        count7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chococakelb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox7))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel58)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(lbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(chococakelb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl7)
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel58))
                .addGap(7, 7, 7)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(count7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jCheckBox7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(250, 250, 250));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel61.setText("Price:");

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel62.setText("Quantity:");

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel63.setText("Purchase:");

        lbl9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.setText("Vanilia Cake");

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel65.setText("100 EGP");

        count9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vancakelb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox9))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel65)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(lbl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(vancakelb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl9)
                .addGap(10, 10, 10)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jLabel65))
                .addGap(7, 7, 7)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(count9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jCheckBox9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(250, 250, 250));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel68.setText("Price:");

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel69.setText("Quantity:");

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel70.setText("Purchase:");

        lbl8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.setText("Fruits Cake");

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel72.setText("90 EGP");

        count8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fruitcakelb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox8))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel72)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(fruitcakelb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl8)
                .addGap(10, 10, 10)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel72))
                .addGap(7, 7, 7)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(count8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jCheckBox8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(250, 250, 250));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel75.setText("Price:");

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel76.setText("Quantity:");

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel77.setText("Purchase:");

        lbl10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl10.setText("Lotus Cake");

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel79.setText("145 EGP");

        count10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        jCheckBox10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lotcakelb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox10))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel79)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(lbl10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(lotcakelb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl10)
                .addGap(10, 10, 10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jLabel79))
                .addGap(7, 7, 7)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(count10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jCheckBox10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(235, 235, 235));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225)));

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

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(totalbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(reciept_btn)
                .addGap(22, 22, 22)
                .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(428, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reciept_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(235, 235, 235));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 225, 225), 2));

        bill.setColumns(20);
        bill.setRows(5);
        jScrollPane1.setViewportView(bill);

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

        subtotal_txtf.setEditable(false);
        subtotal_txtf.setBackground(new java.awt.Color(255, 255, 255));
        subtotal_txtf.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        subtotal_txtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subtotal_txtf.setText("0.0 EGP");

        total_txtf.setEditable(false);
        total_txtf.setBackground(new java.awt.Color(255, 255, 255));
        total_txtf.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        total_txtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_txtf.setText("0.0 EGP");

        subtotal_lb.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        subtotal_lb.setText("Subtotal:");

        total_lb.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        total_lb.setText("Total:");

        vat_lb.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vat_lb.setText("VAT:");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtotal_lb)
                            .addComponent(total_lb))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subtotal_txtf, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(total_txtf)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(vat_lb)
                        .addGap(88, 88, 88)
                        .addComponent(vat_txtf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vat_lb)
                    .addComponent(vat_txtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtotal_lb)
                    .addComponent(subtotal_txtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_txtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_lb))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
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

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        reset();
    }//GEN-LAST:event_resetbtnActionPerformed

    private void totalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbtnActionPerformed
        //total = vat * subtotal;  
        if (total == 0.0) {
            JOptionPane.showMessageDialog(null, "You Have Not Selected any Item!");
        } else {
            bill.setText(bill.getText()
                    + "\n***********************************************************\n"
                    + " Vat: \t\t" + vat + "\n"
                    + " Subtotal: \t\t" + total + "\n"
                    + " Total: \t\t" + (total + vat) + "\n\n"
                    + "********************** Thank You! **********************\n"
            );

        }
    }//GEN-LAST:event_totalbtnActionPerformed
    public void dudate() {
        vat_txtf.setText(String.valueOf(vat));
        subtotal_txtf.setText(String.valueOf(total));
        total_txtf.setText(String.valueOf(total + vat));

    }

    public void getVat(int v) {
        if (v >= 15 && v <= 55) {
            vat = 10.0;
        } else if (v > 65 && v <= 90) {
            vat = 20.0;
        } else if (v >= 100) {
            vat = 30.0;
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
    private void jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActionPerformed
        int qty = Integer.parseInt(count1.getValue().toString());
        if (!qtyIsZero(qty) && jCheckBox.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 65;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + "-" + lbl1.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
            jCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBoxActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        int qty = Integer.parseInt(count3.getValue().toString());
        if (!qtyIsZero(qty) && jCheckBox3.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 55;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + " ." + lbl3.getText() + "\t" + price + " EGP" + "\n");

        } else {
            jCheckBox3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        int qty = Integer.parseInt(count2.getValue().toString());
        if (!qtyIsZero(qty) && jCheckBox2.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 55;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText("\n" + bill.getText() + x + " ." + lbl2.getText() + "\t" + price + " EGP" + "\n");
        } else {
            jCheckBox2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        int qty = Integer.parseInt(count4.getValue().toString());
        if (!qtyIsZero(qty) && jCheckBox4.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 15;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + " ." + lbl4.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
            jCheckBox4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        int qty = Integer.parseInt(count5.getValue().toString());
        if (!qtyIsZero(qty) && jCheckBox5.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 35;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + " ." + lbl5.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        int qty = Integer.parseInt(count6.getValue().toString());

        if (!qtyIsZero(qty) && jCheckBox6.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 100;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + " ." + lbl6.getText() + "\t" + price + " EGP" + "\n");

        } else {
            jCheckBox6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        int qty = Integer.parseInt(count7.getValue().toString());

        if (!qtyIsZero(qty) && jCheckBox7.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 110;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + " ." + lbl7.getText() + "\t" + price + " EGP" + "\n");
        } else {
            jCheckBox7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        int qty = Integer.parseInt(count8.getValue().toString());
        if (!qtyIsZero(qty) && jCheckBox8.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 90;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + " ." + lbl8.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
            jCheckBox8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        int qty = Integer.parseInt(count9.getValue().toString());

        if (!qtyIsZero(qty) && jCheckBox9.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 100;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + " ." + lbl9.getText() + "\t" + price + " EGP" + "\n");

        } else {
            jCheckBox9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        int qty = Integer.parseInt(count10.getValue().toString());

        if (!qtyIsZero(qty) && jCheckBox10.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 145;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + " ." + lbl10.getText() + "\t" + price + " EGP" + "\n");
        } else {
            jCheckBox10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void vat_txtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vat_txtfActionPerformed

    }//GEN-LAST:event_vat_txtfActionPerformed
    int xx, xy;
    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void reciept_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciept_btnActionPerformed
        if (total != 0) {
            if (totalbtn.isEnabled()) {
                try {
                    bill.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            
            else {
                JOptionPane.showMessageDialog(null, "First, You Should Calculate The Total Price. ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You Have Not Purchased any Product!");
        }
    }//GEN-LAST:event_reciept_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       for(double i =0.0 ; i<1.0 ; i+=0.1){
           String s =i+"";
           float f = Float.valueOf(s);
           this.setOpacity(f);
           try {
               Thread.sleep(40);
           } catch (InterruptedException ex) {
               Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
    }//GEN-LAST:event_formWindowOpened
    public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bill;
    private javax.swing.JLabel cappcoffelb;
    private javax.swing.JLabel chococakelb;
    private javax.swing.JLabel chococoffelb;
    private javax.swing.JLabel clock_lb;
    private javax.swing.JLabel clockk1_lb;
    private javax.swing.JLabel coldcoffelb;
    private javax.swing.JSpinner count1;
    private javax.swing.JSpinner count10;
    private javax.swing.JSpinner count2;
    private javax.swing.JSpinner count3;
    private javax.swing.JSpinner count4;
    private javax.swing.JSpinner count5;
    private javax.swing.JSpinner count6;
    private javax.swing.JSpinner count7;
    private javax.swing.JSpinner count8;
    private javax.swing.JSpinner count9;
    private javax.swing.JLabel date_lb;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel fruitcakelb;
    private javax.swing.JLabel greentealb;
    private javax.swing.JLabel iconlb;
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lotcakelb;
    private javax.swing.JButton reciept_btn;
    private javax.swing.JButton resetbtn;
    private javax.swing.JLabel strawcakelb;
    private javax.swing.JLabel subtotal_lb;
    private javax.swing.JTextField subtotal_txtf;
    private javax.swing.JLabel total_lb;
    private javax.swing.JTextField total_txtf;
    private javax.swing.JButton totalbtn;
    private javax.swing.JLabel vancakelb;
    private javax.swing.JLabel vat_lb;
    private javax.swing.JTextField vat_txtf;
    private javax.swing.JLabel waterlb;
    // End of variables declaration//GEN-END:variables

}
