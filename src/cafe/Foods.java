/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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

/**
 *
 * @author HP
 */
public class Foods extends javax.swing.JFrame {
private double vat = 0.0;
    private double total = 0.0;
    int x = 0;
    public Foods() {
        initComponents();
        init();
    }
      public void init() {
        setImage();
        setTime();
    }
        public void setImage() {
        ImageIcon icon = new ImageIcon(getClass().getResource("noodles.jpg"));
        ImageIcon icon1 = new ImageIcon(getClass().getResource("chickenburger.jpg"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("pizza.jpg"));
        ImageIcon icon3 = new ImageIcon(getClass().getResource("meat.jpg"));
        ImageIcon icon4 = new ImageIcon(getClass().getResource("chicken.jpg"));
        ImageIcon icon5 = new ImageIcon(getClass().getResource("shrimps.jpg"));
        ImageIcon icon6 = new ImageIcon(getClass().getResource("pasta.jpg"));
        ImageIcon icon7 = new ImageIcon(getClass().getResource("redpasta.jpg"));
        ImageIcon icon8 = new ImageIcon(getClass().getResource("meatballs.jpg"));
        ImageIcon icon9 = new ImageIcon(getClass().getResource("chickengr.jpg"));
        ImageIcon icon10 = new ImageIcon(getClass().getResource("clock.png"));
        ImageIcon icon11 = new ImageIcon(getClass().getResource("cafe.png"));

        Image img = icon.getImage().getScaledInstance(noodleslbl.getWidth(), noodleslbl.getHeight(), Image.SCALE_SMOOTH);
        Image img1 = icon1.getImage().getScaledInstance(chickenburgerlbl.getWidth(), chickenburgerlbl.getHeight(), Image.SCALE_SMOOTH);
        Image img2 = icon2.getImage().getScaledInstance(pizzalbl.getWidth(), pizzalbl.getHeight(), Image.SCALE_SMOOTH);
        Image img3 = icon3.getImage().getScaledInstance(meatlbl.getWidth(), meatlbl.getHeight(), Image.SCALE_SMOOTH);
        Image img4 = icon4.getImage().getScaledInstance(chickenlbl.getWidth(), chickenlbl.getHeight(), Image.SCALE_SMOOTH);
        Image img5 = icon5.getImage().getScaledInstance(shrimplbl.getWidth(), shrimplbl.getHeight(), Image.SCALE_SMOOTH);
        Image img6 = icon6.getImage().getScaledInstance(whitepastalbl.getWidth(), whitepastalbl.getHeight(), Image.SCALE_SMOOTH);
        Image img7 = icon7.getImage().getScaledInstance(redpastalbl.getWidth(), redpastalbl.getHeight(), Image.SCALE_SMOOTH);
        Image img8 = icon8.getImage().getScaledInstance(meatballslbl.getWidth(), meatballslbl.getHeight(), Image.SCALE_SMOOTH);
        Image img9 = icon9.getImage().getScaledInstance(chickengrilledlbl.getWidth(), chickengrilledlbl.getHeight(), Image.SCALE_SMOOTH);
        Image img10 = icon10.getImage().getScaledInstance(clock_lb.getWidth(), clock_lb.getHeight(), Image.SCALE_SMOOTH);
        Image img11 = icon11.getImage().getScaledInstance(iconlb.getWidth(), iconlb.getHeight(), Image.SCALE_SMOOTH);
       
        noodleslbl.setIcon(new ImageIcon(img));
        chickenburgerlbl.setIcon(new ImageIcon(img1));
        pizzalbl.setIcon(new ImageIcon(img2));
        meatlbl.setIcon(new ImageIcon(img3));
        chickenlbl.setIcon(new ImageIcon(img4));
        shrimplbl.setIcon(new ImageIcon(img5));
        whitepastalbl.setIcon(new ImageIcon(img6));
        redpastalbl.setIcon(new ImageIcon(img7));
        meatballslbl.setIcon(new ImageIcon(img8));
        chickengrilledlbl.setIcon(new ImageIcon(img9));
        clock_lb.setIcon(new ImageIcon(img10));
        iconlb.setIcon(new ImageIcon(img11));
    }

       public void resett() {
        total = 0.0;
        x = 0;
        vat = 0.0;
        totalbtn.setEnabled(true);
        count1.setValue(0);
        count2.setValue(0);
        count3.setValue(0);
        count5.setValue(0);
        count6.setValue(0);
        count7.setValue(0);
        count8.setValue(0);
        count9.setValue(0);
        count10.setValue(0);
        count11.setValue(0);
        vat_txtf.setText("0.0 EGP");
        subtotal_txtf.setText("0.0 EGP");
        total_txtf.setText("0.0 EGP");
        bill.setText("");
        noodles_chbx.setSelected(false);
        pizza_chbx.setSelected(false);
        chickenburger_chbx.setSelected(false);
        meat_chbx.setSelected(false);
        chicken_chbx.setSelected(false);
        shrimp_chbx.setSelected(false);
        redpasta_chbx.setSelected(false);
        whitepasta_chbx.setSelected(false);
        meatballs_chbx.setSelected(false);
        chickengr_chbx.setSelected(false);
       }
       
    public boolean qtyIsZero(int qty) {
        if (qty == 0) {
            JOptionPane.showMessageDialog(null, "Please Choose an Item!");
            return true;
        }
        return false;
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
        noodleslbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        count1 = new javax.swing.JSpinner();
        noodles_chbx = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        chickenburgerlbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        count2 = new javax.swing.JSpinner();
        chickenburger_chbx = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        pizzalbl = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        count3 = new javax.swing.JSpinner();
        pizza_chbx = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        meatlbl = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        count5 = new javax.swing.JSpinner();
        meat_chbx = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        chickenlbl = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        count6 = new javax.swing.JSpinner();
        chicken_chbx = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        shrimplbl = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        count7 = new javax.swing.JSpinner();
        shrimp_chbx = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        whitepastalbl = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        count8 = new javax.swing.JSpinner();
        whitepasta_chbx = new javax.swing.JCheckBox();
        jPanel14 = new javax.swing.JPanel();
        redpastalbl = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        count9 = new javax.swing.JSpinner();
        redpasta_chbx = new javax.swing.JCheckBox();
        jPanel15 = new javax.swing.JPanel();
        meatballslbl = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        count10 = new javax.swing.JSpinner();
        meatballs_chbx = new javax.swing.JCheckBox();
        jPanel16 = new javax.swing.JPanel();
        chickengrilledlbl = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        count11 = new javax.swing.JSpinner();
        chickengr_chbx = new javax.swing.JCheckBox();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jLabel2.setText("Menu Foods Items");

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
        lbl1.setText("Chicken Noodels");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("120 EGP");

        count1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        noodles_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        noodles_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noodles_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(noodleslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(noodles_chbx))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(noodleslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(noodles_chbx)))
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
        lbl2.setText("Chicken Burger");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("145 EGP");

        count2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        chickenburger_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chickenburger_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenburger_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chickenburgerlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(chickenburger_chbx))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel12)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(chickenburgerlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(chickenburger_chbx)))
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
        lbl3.setText("Pizza");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("135 EGP");

        count3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        pizza_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pizza_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizza_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pizzalbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(pizza_chbx))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel16)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(pizzalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(pizza_chbx)))
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
        lbl5.setText("Meat & Zucchini");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("180 EGP");

        count5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        meat_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        meat_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meat_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meatlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(meat_chbx))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel24)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(meatlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(meat_chbx)))
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
        lbl6.setText("Chicken & Potatots");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("175 EGP");

        count6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        chicken_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chicken_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chicken_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chickenlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(chicken_chbx))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel28)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addComponent(lbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(chickenlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel28))
                .addGap(7, 7, 7)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(count6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(chicken_chbx)))
        );

        jPanel12.setBackground(new java.awt.Color(250, 250, 250));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("Price:");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("Quantity:");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Purchase:");

        lbl7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setText("Shrimp & Rice");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setText("220 EGP");

        count7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        shrimp_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        shrimp_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shrimp_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shrimplbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(shrimp_chbx))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel32)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(lbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(shrimplbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel32))
                .addGap(7, 7, 7)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(count7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(shrimp_chbx)))
        );

        jPanel13.setBackground(new java.awt.Color(250, 250, 250));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setText("Price:");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setText("Quantity:");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel35.setText("Purchase:");

        lbl8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.setText("White Pasta");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setText("130 EGP");

        count8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        whitepasta_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        whitepasta_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whitepasta_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whitepastalbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(whitepasta_chbx))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel36)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addComponent(lbl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(whitepastalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel36))
                .addGap(7, 7, 7)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(count8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(whitepasta_chbx)))
        );

        jPanel14.setBackground(new java.awt.Color(250, 250, 250));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setText("Price:");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setText("Quantity:");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel39.setText("Purchase:");

        lbl9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.setText("Red Pasta ");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel40.setText("100 EGP");

        count9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        redpasta_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        redpasta_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redpasta_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(redpastalbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addComponent(redpasta_chbx))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel40)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(redpastalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel40))
                .addGap(7, 7, 7)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(count9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(redpasta_chbx)))
        );

        jPanel15.setBackground(new java.awt.Color(250, 250, 250));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel41.setText("Price:");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel42.setText("Quantity:");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setText("Purchase:");

        lbl10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl10.setText("Meatballs");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel44.setText("180 EGP");

        count10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        meatballs_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        meatballs_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatballs_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meatballslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addComponent(meatballs_chbx))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel44)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addComponent(lbl10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(meatballslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel44))
                .addGap(7, 7, 7)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(count10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(meatballs_chbx)))
        );

        jPanel16.setBackground(new java.awt.Color(250, 250, 250));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel45.setText("Price:");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel46.setText("Quantity:");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel47.setText("Purchase:");

        lbl11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl11.setText("Chicken Grilled");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel48.setText("250 EGP");

        count11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        count11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        chickengr_chbx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chickengr_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickengr_chbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chickengrilledlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(count11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(18, 18, 18)
                        .addComponent(chickengr_chbx))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel48)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addComponent(lbl11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(chickengrilledlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel48))
                .addGap(7, 7, 7)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(count11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(chickengr_chbx)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addComponent(jScrollPane1)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          for(double i =0.0 ; i<1.0 ; i+=0.1){
           String c =i+"";
           float d = Float.valueOf(c);
           this.setOpacity(d);
           try {
               Thread.sleep(50);
           } catch (InterruptedException ex) {
               Logger.getLogger(Drinks.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
    }//GEN-LAST:event_formWindowOpened
int xx, xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

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
       resett();
    }//GEN-LAST:event_resetbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void vat_txtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vat_txtfActionPerformed

    }//GEN-LAST:event_vat_txtfActionPerformed
  public void dudate() {
        vat_txtf.setText(String.valueOf(vat));
        subtotal_txtf.setText(String.valueOf(total));
        total_txtf.setText(String.valueOf(total + vat));

    }
    public void jaxonCafe() {
        int purchaseid = 15020 + (int) (Math.random() * 80800);
        bill.setText("********************** Jaxon Cafe ************************\n"
                + " Time: " + clockk1_lb.getText() + "      Date: " + date_lb.getText() + "\n"
                + " Purchase Id: " + purchaseid +"\n"       
                + "*************************************************************\n"
                + " Item Name: \t\t" +" Price: \n");

    }
  public void getVat(int v) {
        if (v >= 85 && v <= 120) {
            vat = 25.0;
        } else if (v > 120 && v <= 300) {
            vat = 40.0;
        } else if (v >= 300) {
            vat = 60.0;
        }
    }
    private void noodles_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noodles_chbxActionPerformed
        int qty = Integer.parseInt(count1.getValue().toString());
        if (!qtyIsZero(qty) && noodles_chbx.isSelected()) {
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
            noodles_chbx.setSelected(false);
        }
    }//GEN-LAST:event_noodles_chbxActionPerformed

    private void chickenburger_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenburger_chbxActionPerformed
             int qty = Integer.parseInt(count2.getValue().toString());
        if (!qtyIsZero(qty) && chickenburger_chbx.isSelected()) {
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
           chickenburger_chbx.setSelected(false);
        }
    }//GEN-LAST:event_chickenburger_chbxActionPerformed

    private void pizza_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizza_chbxActionPerformed
        int qty = Integer.parseInt(count3.getValue().toString());
        if (!qtyIsZero(qty) && pizza_chbx.isSelected()) {
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
            pizza_chbx.setSelected(false);
        }
    }//GEN-LAST:event_pizza_chbxActionPerformed

    private void meat_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meat_chbxActionPerformed
        int qty = Integer.parseInt(count5.getValue().toString());
        if (!qtyIsZero(qty) && meat_chbx.isSelected()) {
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
            meat_chbx.setSelected(false);
        }
    }//GEN-LAST:event_meat_chbxActionPerformed

    private void chicken_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chicken_chbxActionPerformed
        int qty = Integer.parseInt(count6.getValue().toString());
        if (!qtyIsZero(qty) && chicken_chbx.isSelected()) {
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
            chicken_chbx.setSelected(false);
        }
    }//GEN-LAST:event_chicken_chbxActionPerformed

    private void shrimp_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shrimp_chbxActionPerformed
                int qty = Integer.parseInt(count7.getValue().toString());
        if (!qtyIsZero(qty) && shrimp_chbx.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 200;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + "-" + lbl7.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
           shrimp_chbx.setSelected(false);
        }
    }//GEN-LAST:event_shrimp_chbxActionPerformed

    private void whitepasta_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whitepasta_chbxActionPerformed
                int qty = Integer.parseInt(count8.getValue().toString());
        if (!qtyIsZero(qty) && whitepasta_chbx.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 130;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + "-" + lbl8.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
            whitepasta_chbx.setSelected(false);
        }
    }//GEN-LAST:event_whitepasta_chbxActionPerformed

    private void redpasta_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redpasta_chbxActionPerformed
                int qty = Integer.parseInt(count9.getValue().toString());
        if (!qtyIsZero(qty) && redpasta_chbx.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 100;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + "-" + lbl9.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
            redpasta_chbx.setSelected(false);
        }
    }//GEN-LAST:event_redpasta_chbxActionPerformed

    private void meatballs_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatballs_chbxActionPerformed
                int qty = Integer.parseInt(count10.getValue().toString());
        if (!qtyIsZero(qty) && meatballs_chbx.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 180;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + "-" + lbl10.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
           meatballs_chbx.setSelected(false);
        }
    }//GEN-LAST:event_meatballs_chbxActionPerformed

    private void chickengr_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickengr_chbxActionPerformed
                int qty = Integer.parseInt(count11.getValue().toString());
        if (!qtyIsZero(qty) && meatballs_chbx.isSelected()) {
            x++;
            if (x == 1) {
                jaxonCafe();
            }
            double price = qty * 250;
            total += price;
            getVat((int) total);
            dudate();
            bill.setText(bill.getText() + x + "-" + lbl11.getText() + "\t\t" + price + " EGP" + "\n");
        } else {
            meatballs_chbx.setSelected(false);
        }
    }//GEN-LAST:event_chickengr_chbxActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        this.hide();
        welcome welc = new welcome();
        welc.setVisible(true);

    }//GEN-LAST:event_backbtnActionPerformed
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
            java.util.logging.Logger.getLogger(Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Foods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JTextArea bill;
    private javax.swing.JCheckBox chicken_chbx;
    private javax.swing.JCheckBox chickenburger_chbx;
    private javax.swing.JLabel chickenburgerlbl;
    private javax.swing.JCheckBox chickengr_chbx;
    private javax.swing.JLabel chickengrilledlbl;
    private javax.swing.JLabel chickenlbl;
    private javax.swing.JLabel clock_lb;
    private javax.swing.JLabel clockk1_lb;
    private javax.swing.JSpinner count1;
    private javax.swing.JSpinner count10;
    private javax.swing.JSpinner count11;
    private javax.swing.JSpinner count2;
    private javax.swing.JSpinner count3;
    private javax.swing.JSpinner count5;
    private javax.swing.JSpinner count6;
    private javax.swing.JSpinner count7;
    private javax.swing.JSpinner count8;
    private javax.swing.JSpinner count9;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JCheckBox meat_chbx;
    private javax.swing.JCheckBox meatballs_chbx;
    private javax.swing.JLabel meatballslbl;
    private javax.swing.JLabel meatlbl;
    private javax.swing.JCheckBox noodles_chbx;
    private javax.swing.JLabel noodleslbl;
    private javax.swing.JCheckBox pizza_chbx;
    private javax.swing.JLabel pizzalbl;
    private javax.swing.JButton reciept_btn;
    private javax.swing.JCheckBox redpasta_chbx;
    private javax.swing.JLabel redpastalbl;
    private javax.swing.JButton resetbtn;
    private javax.swing.JCheckBox shrimp_chbx;
    private javax.swing.JLabel shrimplbl;
    private javax.swing.JLabel subtotal_lb;
    private javax.swing.JTextField subtotal_txtf;
    private javax.swing.JLabel total_lb;
    private javax.swing.JTextField total_txtf;
    private javax.swing.JButton totalbtn;
    private javax.swing.JLabel vat_lb;
    private javax.swing.JTextField vat_txtf;
    private javax.swing.JCheckBox whitepasta_chbx;
    private javax.swing.JLabel whitepastalbl;
    // End of variables declaration//GEN-END:variables
}
