
package blockchain;

import javax.swing.*;
import java.awt.*;

import javax.swing.JOptionPane;

import java.security.InvalidKeyException;
import java.security.MessageDigest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;

import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Block extends javax.swing.JFrame {
    private String username;
    private String password;
    private int balance=0;
    private int coin=0;
    private boolean isclick=false;
    private String selectedcrypto="";
    private double left=0;
    private int bit=1500;
    private int ripple=1200;
    private int eth=1000;
    private boolean buttonClick=false;
    private static int totalCoin = 0;
    private float NumOfCoin=0;
    String retrievedName = "";
    int retrievedAmount =0;
    float retrievedbit = 0;
    float retrievedripple = 0;
    float retrievedetherium = 0;
    int retrievedTransaction =0;
    String RecieverName="";
    String retrievedPassword="";
    String chainname="";
    
    static String chainname1 = "";

    static String dbName = "blockchain";
    static Connection c = null;
    static PreparedStatement ps;
    static ResultSet rs=null;
    static String URL = "jdbc:mysql://localhost:3306/" + dbName;
    static String username1 = "root";
    static String password1 = "";
    
    String SignupFullname="";
    
    private static float changingBit;
    private static float changingRipple;
    private static float changingetherium;
    private static long lastChangeTime;
    
    private boolean clicked=false;
    private long lastClickTime=0;
    public Block() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel71 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jButton3 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton32 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jButton38 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton20 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jButton36 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jButton37 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(57, 225, 20));
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(1070, 600));

        jPanel11.setBackground(new java.awt.Color(15, 25, 33));

        jLabel38.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(57, 225, 20));
        jLabel38.setText("Public Ledger");

        jLabel39.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(57, 225, 20));
        jLabel39.setText("_________________________________________________________________________________________");

        jButton22.setBackground(new java.awt.Color(57, 225, 20));
        jButton22.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        jButton22.setText("Show Records");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(57, 225, 20));
        jButton33.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton33.setText("Back");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton33)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(278, 278, 278))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel38)
                .addGap(98, 98, 98)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton22)
                .addGap(18, 18, 18)
                .addComponent(jButton33)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab11", jPanel11);

        jPanel15.setBackground(new java.awt.Color(17, 23, 33));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(57, 225, 20));
        jLabel52.setText("Rate with time");

        jButton29.setBackground(new java.awt.Color(57, 225, 20));
        jButton29.setText("show previous record");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(57, 225, 20));
        jButton31.setText("Show current rate");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(57, 225, 20));
        jLabel53.setText("________________________________________________________________");
        jLabel53.setToolTipText("");

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(57, 225, 20));
        jLabel56.setText("Bitcoin price");

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(57, 225, 20));
        jLabel57.setText("Ripple price");

        jLabel59.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(57, 225, 20));
        jLabel59.setText("Etherium price");

        jButton34.setBackground(new java.awt.Color(57, 225, 20));
        jButton34.setText("<--------");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(57, 225, 20));
        jLabel55.setText("Time    bitcoin    ethereum     ripple ");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel56)
                        .addGap(127, 127, 127)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton34))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel52))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jButton29))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jButton31)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton31)
                .addGap(36, 36, 36)
                .addComponent(jButton29)
                .addGap(106, 106, 106)
                .addComponent(jButton34)
                .addGap(25, 25, 25))
        );

        jTabbedPane2.addTab("tab15", jPanel15);

        jPanel2.setBackground(new java.awt.Color(17, 23, 33));
        jPanel2.setForeground(new java.awt.Color(57, 225, 20));

        jLabel2.setForeground(new java.awt.Color(57, 225, 20));
        jLabel2.setText("Password");

        jLabel3.setForeground(new java.awt.Color(57, 225, 20));
        jLabel3.setText("Username");

        jButton1.setBackground(new java.awt.Color(57, 225, 20));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(25, 34, 49));
        jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(57, 225, 20));
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton5.setBackground(new java.awt.Color(57, 225, 20));
        jButton5.setText("JOIN NOW");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 225, 20));
        jLabel5.setText("Login");

        jButton11.setBackground(new java.awt.Color(57, 225, 20));
        jButton11.setText("BACK");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(57, 225, 20));
        jLabel69.setText("Sign in to your account");

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(57, 225, 20));
        jLabel70.setText("Forgot password?");

        jCheckBox1.setBackground(new java.awt.Color(15, 25, 33));
        jCheckBox1.setForeground(new java.awt.Color(57, 225, 20));
        jCheckBox1.setText("Keep me signed in ");

        jLabel71.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(57, 225, 20));
        jLabel71.setText("Don't have an account?");

        jPasswordField3.setBackground(new java.awt.Color(25, 34, 49));
        jPasswordField3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        jPasswordField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(344, 344, 344)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(341, 341, 341)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(100, 100, 100)
                                            .addComponent(jLabel70))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                        .addComponent(jPasswordField3))))
                            .addGap(2, 2, 2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(329, 329, 329)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jLabel5)))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab2", jPanel2);

        jPanel1.setBackground(new java.awt.Color(15, 25, 33));
        jPanel1.setForeground(new java.awt.Color(225, 225, 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 600));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(15, 25, 33));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(57, 225, 20));
        jButton2.setText("Signup");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(580, 450, 76, 25);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("as we can");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 600, 60, 30);
        jPanel1.add(filler1);
        filler1.setBounds(0, 0, 0, 0);

        jButton3.setBackground(new java.awt.Color(17, 23, 33));
        jButton3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(57, 225, 20));
        jButton3.setText("Login");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(400, 450, 90, 24);

        jLabel60.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(57, 255, 20));
        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blockchain/images/WhatsApp Image 2024-01-17 at 13.04.51_1cae72a0.jpg"))); // NOI18N
        jPanel1.add(jLabel60);
        jLabel60.setBounds(420, 200, 212, 223);

        jLabel61.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(57, 255, 20));
        jLabel61.setText("Welcome!");
        jPanel1.add(jLabel61);
        jLabel61.setBounds(440, 150, 181, 47);

        jLabel62.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(57, 255, 20));
        jLabel62.setText("Contact");
        jPanel1.add(jLabel62);
        jLabel62.setBounds(900, 530, 80, 30);

        jLabel58.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 10)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(238, 238, 238));
        jLabel58.setText("Radeel Ahmed 221544");
        jPanel1.add(jLabel58);
        jLabel58.setBounds(880, 620, 150, 30);

        jLabel63.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 10)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(238, 238, 238));
        jLabel63.setText("In which we tried to replicate as many functionalities");
        jLabel63.setToolTipText("");
        jPanel1.add(jLabel63);
        jLabel63.setBounds(70, 580, 270, 30);

        jLabel64.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(57, 255, 20));
        jLabel64.setText("About");
        jPanel1.add(jLabel64);
        jLabel64.setBounds(160, 530, 60, 30);

        jLabel65.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 10)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(238, 238, 238));
        jLabel65.setText("DSA final semester project replicating block chain.");
        jPanel1.add(jLabel65);
        jLabel65.setBounds(70, 560, 250, 30);

        jLabel66.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 10)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(238, 238, 238));
        jLabel66.setText("Muhammad Abdullah 221546");
        jPanel1.add(jLabel66);
        jLabel66.setBounds(860, 560, 150, 30);

        jLabel67.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 10)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(238, 238, 238));
        jLabel67.setText("Muhammad Munib Nawaz 221522");
        jPanel1.add(jLabel67);
        jLabel67.setBounds(850, 580, 180, 30);

        jLabel68.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 10)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(238, 238, 238));
        jLabel68.setText("Hasnain Tahir 221546");
        jPanel1.add(jLabel68);
        jLabel68.setBounds(880, 600, 150, 30);

        jTabbedPane2.addTab("tab1", jPanel1);

        jPanel4.setBackground(new java.awt.Color(15, 25, 33));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(57, 225, 20));
        jLabel9.setText("Username");

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(57, 225, 20));
        jLabel10.setText("B I T C O I N");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(57, 225, 20));
        jLabel11.setText("Balance");

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(57, 225, 20));
        jLabel13.setText("____________");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(57, 225, 20));
        jLabel14.setText("____________");

        jButton6.setBackground(new java.awt.Color(57, 225, 20));
        jButton6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton6.setText("Show Detail");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(15, 25, 33));
        jButton9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(236, 236, 236));
        jButton9.setText("Logout");
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(15, 25, 33));
        jButton12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(236, 236, 236));
        jButton12.setText("Buy Coin");
        jButton12.setBorder(null);
        jButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blockchain/images/WhatsApp Image 2024-01-17 at 13.04.51_1cae72a0.jpg"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(57, 225, 20));
        jLabel27.setText("____________");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(57, 225, 20));
        jLabel28.setText("Transactions");

        jButton4.setBackground(new java.awt.Color(15, 25, 33));
        jButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(236, 236, 236));
        jButton4.setText("Go To Chain");
        jButton4.setBorder(null);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(15, 25, 33));
        jButton10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(236, 236, 236));
        jButton10.setText("Transaction");
        jButton10.setBorder(null);
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(57, 225, 20));
        jLabel31.setText("E T H E R I U M");

        jLabel32.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(57, 225, 20));
        jLabel32.setText("____________");

        jLabel33.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(57, 225, 20));
        jLabel33.setText("R I P P L E");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(57, 225, 20));
        jLabel34.setText("____________");

        jButton24.setBackground(new java.awt.Color(57, 225, 20));
        jButton24.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton24.setText("Ledger");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(15, 25, 33));
        jButton28.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton28.setForeground(new java.awt.Color(236, 236, 236));
        jButton28.setText("Sell Coin");
        jButton28.setBorder(null);
        jButton28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(15, 25, 33));
        jButton30.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton30.setForeground(new java.awt.Color(236, 236, 236));
        jButton30.setText("Coin Rate");
        jButton30.setBorder(null);
        jButton30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton40.setBackground(new java.awt.Color(15, 25, 33));
        jButton40.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jButton40.setForeground(new java.awt.Color(236, 236, 236));
        jButton40.setText("Refresh");
        jButton40.setBorder(null);
        jButton40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(57, 225, 20));
        jLabel12.setText("____________");

        jLabel72.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(57, 225, 20));
        jLabel72.setText("User Profile");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(148, 148, 148)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel9))
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))
                                .addGap(126, 126, 126)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addGap(99, 99, 99)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel13)))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel72)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton40)
                                .addGap(177, 177, 177)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel34))
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton24))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jButton28)
                                .addGap(18, 18, 18)
                                .addComponent(jButton30)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton12)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel33))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel10))))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel32)
                    .addComponent(jLabel13))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab14", jPanel4);

        jPanel8.setBackground(new java.awt.Color(15, 25, 33));

        jLabel23.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(57, 225, 20));
        jLabel23.setText("Join Thousands Other! ");

        jLabel24.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(57, 225, 20));
        jLabel24.setText("First Name");

        jLabel25.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(57, 225, 20));
        jLabel25.setText("Password");

        jButton19.setBackground(new java.awt.Color(57, 225, 20));
        jButton19.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        jButton19.setText("Register");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(25, 34, 49));
        jTextField5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(57, 225, 20));
        jTextField5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel26.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(57, 225, 20));
        jLabel26.setText("Last Name");

        jTextField7.setBackground(new java.awt.Color(25, 34, 49));
        jTextField7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(57, 225, 20));
        jTextField7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPasswordField2.setBackground(new java.awt.Color(25, 34, 49));
        jPasswordField2.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(57, 225, 20));
        jPasswordField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton32.setBackground(new java.awt.Color(57, 225, 20));
        jButton32.setForeground(new java.awt.Color(0, 0, 0));
        jButton32.setText("BACK");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(238, 238, 238));
        jLabel73.setText("Creat your account");

        jLabel74.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(238, 238, 238));
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blockchain/images/WhatsApp Image 2024-01-17 at 13.04.51_1cae72a0.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField7)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                        .addComponent(jLabel74))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton32))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(182, 182, 182))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jButton19)
                        .addGap(17, 17, 17))
                    .addComponent(jLabel74))
                .addGap(18, 18, 18)
                .addComponent(jButton32)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab8", jPanel8);

        jPanel14.setBackground(new java.awt.Color(15, 25, 33));

        jLabel48.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(57, 225, 20));
        jLabel48.setText("Select coin");

        jButton27.setBackground(new java.awt.Color(57, 225, 20));
        jButton27.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton27.setText("Click To Sell");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jTextField13.setBackground(new java.awt.Color(25, 34, 49));
        jTextField13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(57, 225, 20));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel49.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(57, 225, 20));
        jLabel49.setText("Password");

        jLabel50.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(57, 225, 20));
        jLabel50.setText("Sell Coin");

        jComboBox1.setBackground(new java.awt.Color(25, 34, 49));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bitcoin", "etherium", "ripple" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(57, 225, 20));
        jLabel51.setText("Enter coin to sell");

        jTextField14.setBackground(new java.awt.Color(25, 34, 49));
        jTextField14.setFont(new java.awt.Font("Microsoft YaHei", 1, 11)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(57, 225, 20));
        jTextField14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel54.setIcon(new javax.swing.ImageIcon("C:\\Users\\iabdullah\\Desktop\\image.jpg")); // NOI18N

        jButton38.setBackground(new java.awt.Color(57, 225, 20));
        jButton38.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jButton38.setText("Back");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton38)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addGap(106, 106, 106))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jButton27)
                        .addGap(26, 26, 26)
                        .addComponent(jButton38))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab14", jPanel14);

        jPanel3.setBackground(new java.awt.Color(25, 34, 49));

        jButton13.setBackground(new java.awt.Color(57, 225, 20));
        jButton13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(1, 1, 1));
        jButton13.setText("Send");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(57, 225, 20));
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(57, 225, 20));
        jLabel7.setText("Coins");

        jTextField3.setBackground(new java.awt.Color(15, 25, 33));
        jTextField3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(57, 225, 20));
        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(15, 25, 33));
        jTextField4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(57, 225, 20));
        jTextField4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton14.setBackground(new java.awt.Color(57, 225, 20));
        jButton14.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 10)); // NOI18N
        jButton14.setText("Start Bitcoin");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(57, 225, 20));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blockchain/images/pic 3.PNG"))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(57, 225, 20));
        jLabel30.setText("Coin Type");

        jComboBox2.setBackground(new java.awt.Color(15, 25, 33));
        jComboBox2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(57, 225, 20));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bitcoin", "etherium", "ripple" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(57, 225, 20));
        jButton20.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 10)); // NOI18N
        jButton20.setText("Back");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(57, 225, 20));
        jLabel77.setText("Transaction");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton14))
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(87, 87, 87))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel77)
                    .addContainerGap(813, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jButton13)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton20)
                            .addComponent(jButton14)))
                    .addComponent(jLabel29))
                .addContainerGap(245, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel77)
                    .addContainerGap(673, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab5", jPanel3);

        jPanel7.setBackground(new java.awt.Color(17, 23, 33));

        jLabel22.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(57, 225, 20));
        jLabel22.setText("Start new chain");

        jLabel40.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(57, 225, 20));
        jLabel40.setText("Name:");

        jLabel41.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(57, 225, 20));
        jLabel41.setText("Chain Name");

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(57, 225, 20));
        jLabel42.setText("Right Above in Field");

        jButton23.setBackground(new java.awt.Color(57, 225, 20));
        jButton23.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton23.setForeground(new java.awt.Color(1, 1, 1));
        jButton23.setText("Go");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jTextField9.setBackground(new java.awt.Color(25, 34, 49));
        jTextField9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jTextField9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField10.setBackground(new java.awt.Color(25, 34, 49));
        jTextField10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(57, 225, 20));
        jTextField10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField11.setBackground(new java.awt.Color(25, 34, 49));
        jTextField11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(57, 225, 20));
        jTextField11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel43.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(238, 238, 238));
        jLabel43.setText("Joining MnM block chain platform");

        jButton35.setBackground(new java.awt.Color(57, 225, 20));
        jButton35.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton35.setForeground(new java.awt.Color(1, 1, 1));
        jButton35.setText("Back");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(57, 225, 20));
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blockchain/images/WhatsApp Image 2024-01-17 at 13.04.51_1cae72a0.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel43)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(jLabel78)
                .addGap(161, 161, 161))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton35)
                            .addComponent(jButton23)))
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265))
        );

        jTabbedPane2.addTab("tab7", jPanel7);

        jPanel6.setBackground(new java.awt.Color(15, 25, 33));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(57, 225, 20));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blockchain/images/pic 1.PNG"))); // NOI18N
        jLabel8.setToolTipText("");

        jButton16.setBackground(new java.awt.Color(57, 225, 20));
        jButton16.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jButton16.setText("ExistingChain");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(57, 225, 20));
        jButton18.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jButton18.setText("New Chain");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(57, 225, 20));
        jButton17.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton17.setText("Back");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(57, 225, 20));
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blockchain/images/pic 2.PNG"))); // NOI18N

        jLabel76.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(57, 225, 20));
        jLabel76.setText("Start Block Chain");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jButton17))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel8)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel75)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jLabel76)
                    .addContainerGap(701, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16)
                    .addComponent(jButton18))
                .addGap(18, 18, 18)
                .addComponent(jButton17)
                .addGap(195, 195, 195))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(jLabel76)
                    .addContainerGap(655, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab6", jPanel6);

        jPanel9.setBackground(new java.awt.Color(17, 23, 33));

        jLabel35.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(57, 225, 20));
        jLabel35.setText("Join existing chain");

        jLabel36.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(57, 225, 20));
        jLabel36.setText("Answer:");

        jLabel37.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(57, 225, 20));
        jLabel37.setText("Answer format: MnM{INPUT}");

        jButton21.setBackground(new java.awt.Color(57, 225, 20));
        jButton21.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton21.setText("Go");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jTextField8.setBackground(new java.awt.Color(25, 34, 49));
        jTextField8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(57, 225, 20));
        jTextField8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jButton36.setBackground(new java.awt.Color(57, 225, 20));
        jButton36.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        jButton36.setText("Back");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 358, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton36)
                        .addGap(104, 104, 104)
                        .addComponent(jButton21)
                        .addGap(420, 420, 420))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(405, 405, 405))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(426, 426, 426))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21)
                    .addComponent(jButton36))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab9", jPanel9);

        jPanel5.setBackground(new java.awt.Color(17, 23, 33));

        jLabel18.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(57, 225, 20));
        jLabel18.setText("____________");

        jLabel19.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(57, 225, 20));
        jLabel19.setText("____________");

        jLabel20.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(57, 225, 20));
        jLabel20.setText("____________");

        jButton7.setBackground(new java.awt.Color(57, 225, 20));
        jButton7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton7.setText("Buy");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(57, 225, 20));
        jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(57, 225, 20));
        jLabel79.setText("E T H E R I U M");

        jLabel80.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(57, 225, 20));
        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blockchain/images/COIN.PNG"))); // NOI18N

        jLabel81.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(57, 225, 20));
        jLabel81.setText("B I T C O I N");

        jLabel82.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(57, 225, 20));
        jLabel82.setText("R I P P L E");

        jLabel83.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(57, 225, 20));
        jLabel83.setText("Buy Coins");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79)
                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(821, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel81))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel79))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel82))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(216, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jLabel83)
                    .addContainerGap(674, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab5", jPanel5);

        jPanel10.setBackground(new java.awt.Color(17, 23, 33));

        jLabel44.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(57, 225, 20));
        jLabel44.setText("Math problem");

        jButton25.setBackground(new java.awt.Color(57, 225, 20));
        jButton25.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton25.setText("Create");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jTextField12.setBackground(new java.awt.Color(25, 34, 49));
        jTextField12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(57, 225, 20));
        jTextField12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton37.setBackground(new java.awt.Color(57, 225, 20));
        jButton37.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton37.setText("Back");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(57, 225, 20));
        jLabel84.setText("Answer");

        jLabel85.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(57, 225, 20));
        jLabel85.setText("Answer Formate: MNM{ANSWER}");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(63, 401, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton37)
                        .addGap(147, 147, 147)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(378, 378, 378))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addGap(423, 423, 423))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 390, Short.MAX_VALUE)
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton37)
                    .addComponent(jButton25))
                .addGap(166, 166, 166))
        );

        jTabbedPane2.addTab("tab10", jPanel10);

        jPanel12.setBackground(new java.awt.Color(17, 23, 33));

        jTextField2.setBackground(new java.awt.Color(25, 34, 49));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(57, 225, 20));
        jTextField2.setToolTipText("");
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel46.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(57, 225, 20));
        jLabel46.setText("______________________________________________");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(57, 225, 20));
        jLabel47.setText("Option:");

        jButton26.setBackground(new java.awt.Color(57, 225, 20));
        jButton26.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton26.setForeground(new java.awt.Color(1, 1, 1));
        jButton26.setText("Submit");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(57, 225, 20));
        jButton39.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton39.setForeground(new java.awt.Color(1, 1, 1));
        jButton39.setText("Back");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(57, 225, 20));
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blockchain/images/WhatsApp Image 2024-01-17 at 13.04.51_1cae72a0.jpg"))); // NOI18N

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(57, 225, 20));
        jLabel87.setText("Available blockchin");

        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(57, 225, 20));
        jLabel88.setText("Choose Blockchin");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jButton39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton26))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel46)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addComponent(jLabel86)
                .addGap(174, 174, 174))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jLabel88)
                    .addContainerGap(729, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton26)
                            .addComponent(jButton39)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel86)))
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(671, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab12", jPanel12);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 792, Short.MAX_VALUE)
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Tab1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        jTabbedPane2.setSelectedIndex(5);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        String store=jTextField8.getText().trim();

        int value=Integer.parseInt(store);
        String Transaction=String.valueOf(retrievedTransaction);
        if (store.equals("18")) {
            try {
                Block1 firstBlock = new Block1(0, "Initial Data");

                Block1 newBlock = new Block1(1,Transaction);
                newBlock.addToBlockTable();
                JOptionPane.showMessageDialog(this, "Congratulations for being part of "+store);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(6);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        showblockchain();
        jTabbedPane2.setSelectedIndex(11);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        jTabbedPane2.setSelectedIndex(5);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        if(!jTextField10.getText().trim().isEmpty() && !jTextField11.getText().trim().isEmpty() && jTextField9.getText().trim().equals("Joining MnM block chain platform")){
            jTabbedPane2.setSelectedIndex(8);
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter correct Information");
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        NumTransaction(retrievedTransaction,retrievedName);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        RecieverName=jTextField3.getText().trim();
        Float SendCoin=Float.parseFloat(jTextField4.getText());
        String CoinSelection=(String)jComboBox2.getSelectedItem();
        try {
            //Transaction(RecieverName,SendCoin,retrievedName,CoinSelection);
            Transaction(retrievedName,RecieverName,SendCoin,CoinSelection);
        } catch (Exception ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed

    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        String SellCoinType=(String) jComboBox1.getSelectedItem();
        String PasswordSeller=jTextField13.getText().trim();
        String NumCoin=jTextField14.getText().trim();
        float SellNumCoin=Float.parseFloat(NumCoin);
        if(NumCoin.equals("")|| PasswordSeller.equals("")){
            JOptionPane.showMessageDialog(this, "Pasword or number of coin incorrect");
        }
        else{
            try {
                Sellcoin(SellCoinType,PasswordSeller,SellNumCoin);
            } catch (Exception ex) {
                Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        //  warning;
        String fname=jTextField5.getText().trim();
        String lname=jTextField7.getText().trim();
        SignupFullname=fname+lname;
        String password=jPasswordField2.getText();
        if (jTextField5.getText().isEmpty() || jPasswordField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username or password is missing");
        }
        else {
            try {
                if(!saveToDatabase(SignupFullname, password)){

                    SearchForLogin(SignupFullname,password);
                };
            } catch (Exception ex) {
                Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {

        } catch (Exception ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JPanel p=new JPanel();
        JTextField ForCoinName=new JTextField(20);
        JTextField ForNumCoin=new JTextField(20);
        p.add(new JLabel("Enter Type of Currency"));
        p.add(ForCoinName);
        p.add(new Label("Enter number of Coins"));
        p.add(ForNumCoin);

        int result = JOptionPane.showConfirmDialog(null, p, "Enter Coin Details", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String CoinName=ForCoinName.getText().trim();
            float NumCoin=Float.parseFloat(ForNumCoin.getText().trim());
            try {
                if((CoinName.equals("bitcoin") && NumCoin*1500<=retrievedAmount) || (CoinName.equals("etherium") && NumCoin*1000<=retrievedAmount) ||(CoinName.equals("ripple") && NumCoin*1200<=retrievedAmount)){
                    BuyDigitalCoin(CoinName,NumCoin,retrievedName);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Not enought money");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        try {
            refresh();
        } catch (Exception ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        jTabbedPane2.setSelectedIndex(13);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        try {
            CurrenyWithTime() ;
        } catch (SQLException ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel54.setText("<html>Bitcoin >> " + changingBit + "<br/>Ripple >> " + changingRipple + "<br/>Etherium >> " + changingetherium + "</html>");

        jTabbedPane2.setSelectedIndex(12);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        jTabbedPane2.setSelectedIndex(9);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jTabbedPane2.setSelectedIndex(4);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        NumTransaction(retrievedTransaction,retrievedName);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            // TODO add your handling code here:
            CurrenyWithTime();
        } catch (SQLException ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabel18.setText(String.valueOf(changingBit));
        jLabel19.setText(String.valueOf(changingetherium));
        jLabel20.setText(String.valueOf(changingRipple));
        jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        username="";
        password="";
        balance=0;
        coin=0;
        isclick=false;
        selectedcrypto="";
        left=0;
        bit=1500;
        ripple=1200;
        eth=1000;
        buttonClick=false;
        totalCoin = 0;
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!isclick){
            retrieveData();
            isclick=true;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane2.setSelectedIndex(4);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane2.setSelectedIndex(8);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTabbedPane2.setSelectedIndex(10);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String  username = jTextField1.getText();
        String  password = jPasswordField3.getText();

        try {
            SearchForLogin(username,password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed

        if (!clicked || (System.currentTimeMillis() - lastClickTime) >= 300000) {
            try {
                CurrenyWithTime();
            } catch (SQLException ex) {
                Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
            }
            clicked = true;
            lastClickTime = System.currentTimeMillis();
        } else {
            JOptionPane.showMessageDialog(this,"Wait for five minutes before clicking again.");
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed

        String query = "SELECT * FROM currencywithtime ORDER BY Time DESC LIMIT 7";
        try {
            ps=c.prepareStatement(query);
            rs=ps.executeQuery();

            StringBuilder outputToLedger = new StringBuilder("<html>");
            while(rs.next()){
                String rowText = rs.getString("Time") + "&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("bitcoin")+"&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("etherium") +"&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("ripple")+  "<br><br>";
                outputToLedger.append(rowText);
            }
            outputToLedger.append("</html>");
            jLabel53.setText(outputToLedger.toString());
        } catch (SQLException ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        jTabbedPane2.setSelectedIndex(5);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

        try {
            checkchain();
        } catch (SQLException ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        String query = "SELECT Sender, Reciever FROM publicledger";
        try {
            ps=c.prepareStatement(query);
            rs=ps.executeQuery();

            StringBuilder outputToLedger = new StringBuilder("<html>");
            while(rs.next()){
                String OutputToLedger;
                String rowText = rs.getString("Sender") + " " + rs.getString("Reciever") + "<br>";
                outputToLedger.append(rowText);
            }
            outputToLedger.append("</html>");
            jLabel39.setText(outputToLedger.toString());
        } catch (SQLException ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        if(jTextField12.getText().isEmpty()){
            jTabbedPane2.setSelectedIndex(5);
        }
        else{
            jTabbedPane2.setSelectedIndex(2);
        }
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        boolean isClick1=false;
        if(jTextField12.getText().trim().equals("10")){
            try {
                createBlock();
                JOptionPane.showMessageDialog(this, "Congratulation for creating your own chain");
                isClick1=true;
            } catch (Exception ex) {
                Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Congratulation for creating your own chain");
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    protected String Getretrievedname(){
         return retrievedName;
    }
    protected int GetretrievedTransaction(){
        return retrievedTransaction;
    }
    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Block.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Block.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Block.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Block.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Block().setVisible(true);
            }
        });
    }
      public int BuyCoin(){
          
        String userInput = JOptionPane.showInputDialog(this, "Enter the number of coins to buy:");
        int coin=Integer.parseInt(userInput);
        return coin;
    }

private boolean saveToDatabase(String username, String password)throws Exception {
 //   Class.forName("com.mysql.cj.jdbc.Driver"); 
        c = DriverManager.getConnection(URL, username1, password1);
        if (accountExists(username)) {
        JOptionPane.showMessageDialog(this, "Account with the same name already exists.");
        return true;
    } else {
        String insertQuery = "INSERT INTO account (name, password) VALUES (?, ?)";
        ps = c.prepareStatement(insertQuery);
        ps.setString(1, username);
        ps.setString(2, password); 

       int status = ps.executeUpdate();
            if (status != 0) {
                    jTabbedPane2.setSelectedIndex(2);
        } else {
            JOptionPane.showMessageDialog(this, "Error while signing up. Please try again.");
        } 
     
        return false;
    }
        
}
private boolean accountExists(String username) throws SQLException {
    String checkQuery = "SELECT COUNT(*) AS count FROM account WHERE name = ?";
    try (PreparedStatement checkStatement = c.prepareStatement(checkQuery)) {
        checkStatement.setString(1, username);
        try (ResultSet resultSet = checkStatement.executeQuery()) {
            if (resultSet.next()) {
                int count = resultSet.getInt("count");
                return count > 0;
            }
        }
    }
    return false;
}
private void SearchForLogin(String name2, String password2) throws Exception{
   // Class.forName("com.mysql.cj.jdbc.Driver");
    c = DriverManager.getConnection(URL, username1, password1);
    String name="";
    String SearchQuery ="SELECT*FROM account WHERE name =? AND password =?";
    PreparedStatement ps = c.prepareStatement(SearchQuery);
    ps.setString(1,name2.trim());
    ps.setString(2,password2.trim());
    
    rs=ps.executeQuery();
    if(rs.next()){
             retrievedName = rs.getString("name");
             retrievedAmount = rs.getInt("dollars");
             retrievedbit = rs.getFloat("bitcoin");
             retrievedripple = rs.getFloat("ripple");
             retrievedetherium = rs.getFloat("etherium");
             retrievedTransaction = rs.getInt("Transaction");
             retrievedPassword = rs.getString("password");

            jTabbedPane2.setSelectedIndex(2);
        }
    else {
        JOptionPane.showMessageDialog(this, "Incorrect - No matching records found");
    }
    
} 
  private void BuyDigitalCoin(String CoinName,float NumCoin,String retrievedName ) throws ClassNotFoundException, SQLException{
//    Class.forName("com.mysql.cj.jdbc.Driver");
    c = DriverManager.getConnection(URL, username1, password1);
      
      float value=0;
      if(CoinName.equals("bitcoin")){
            value=NumCoin*bit;
           String SearchQuery ="UPDATE account SET dollars = dollars - ?,bitcoin= bitcoin + ? WHERE name = ?";
               PreparedStatement ps = c.prepareStatement(SearchQuery);
               ps.setFloat(1, value); 
               ps.setFloat(2,NumCoin); 
                ps.setString(3, retrievedName);
                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this,"Bitcoin purchase successful");
        } else {
            JOptionPane.showMessageDialog(this,"Bitcoin purchase failed. Check your input .");
        }
       }
      
      else if(CoinName.equals("etherium")){
           value=NumCoin*eth;
         String SearchQuery ="UPDATE account SET dollars = dollars - ?,etherium= etherium + ? WHERE name = ?";
             PreparedStatement ps = c.prepareStatement(SearchQuery);

                ps.setFloat(1, value); 
               ps.setFloat(2,NumCoin); 
                ps.setString(3, retrievedName);
             int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this,"etherium purchase successful");
        } else {
            JOptionPane.showMessageDialog(this,"etherium purchase failed. Check your input");
        }
       }
       
      else if(CoinName.equals("ripple")){
           value=NumCoin*ripple;
           String SearchQuery ="UPDATE account SET dollars = dollars - ?,ripple = ripple + ? WHERE name = ?";
               PreparedStatement ps = c.prepareStatement(SearchQuery);
                ps.setFloat(1, value); 
               ps.setFloat(2,NumCoin); 
                ps.setString(3, retrievedName);
               int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    
            JOptionPane.showMessageDialog(this,"ripple purchase successful. Database updated.");
        } else {
            JOptionPane.showMessageDialog(this,"ripple purchase failed. Check your input.");
        }
       }
      
       else{
       JOptionPane.showMessageDialog(this, "Select from:\nbitcoin\nnetherium\nripple ");
       }
    
    }

  private void Transaction(String senderName, String receiverName, float sendAmount, String coinSelection) throws Exception {
    String senderQuery = "UPDATE account SET %s = %s - ?, Transaction = Transaction + 1 WHERE name = ?";
    String receiverQuery = "UPDATE account SET %s = %s + ? WHERE name = ?";

    String coinColumn = "";
    switch (coinSelection) {
        case "bitcoin":
            coinColumn = "bitcoin";
            break;
        case "etherium":
            coinColumn = "etherium";
            break;
        case "ripple":
            coinColumn = "ripple";
            break;
        default:
            JOptionPane.showMessageDialog(this, "Select from:\nbitcoin\netherium\nripple");
            return;
    }

    float senderBalance = getCoinBalance(senderName, coinColumn);
    if (senderBalance < sendAmount) {
        JOptionPane.showMessageDialog(this, "Not enough " + coinSelection + " to transfer.");
        return;
    }

    try {
        String FsenderQuery = String.format(senderQuery, coinColumn, coinColumn);
        String FreceiverQuery = String.format(receiverQuery, coinColumn, coinColumn);

        PreparedStatement senderPs = c.prepareStatement(FsenderQuery);
        senderPs.setFloat(1, sendAmount);
        senderPs.setString(2, senderName);
        int senderRowsAffected = senderPs.executeUpdate();

        PreparedStatement receiverPs = c.prepareStatement(FreceiverQuery);
        receiverPs.setFloat(1, sendAmount);
        receiverPs.setString(2, receiverName);
        int receiverRowsAffected = receiverPs.executeUpdate();

        if (senderRowsAffected > 0 && receiverRowsAffected > 0) {
            JOptionPane.showMessageDialog(this, coinSelection + " transfer successful");
        } else {
            JOptionPane.showMessageDialog(this, coinSelection + " transfer failed. Check your input.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred during the transaction.");
    }

    SaveToLedger();
}

private float getCoinBalance(String name, String coinColumn) {
    float balance = 0;

    try {
        String query = "SELECT " + coinColumn + " FROM account WHERE name = ?";
        PreparedStatement ps = c.prepareStatement(query);
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            balance = rs.getFloat(1);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return balance;
}

 private void retrieveData(){
     jLabel12.setText(String.valueOf(retrievedName));
        jLabel13.setText(String.valueOf(retrievedbit)); 
        jLabel14.setText(String.valueOf(retrievedAmount));
        jLabel27.setText(String.valueOf(retrievedTransaction));
        jLabel32.setText(String.valueOf(retrievedetherium));
        jLabel34.setText(String.valueOf(retrievedripple));
 }
  private void NumTransaction(int TransCount,String retrievedName) {

       if (retrievedTransaction>=3) {
            jTabbedPane2.setSelectedIndex(5);
        } else {
            JOptionPane.showMessageDialog(this,"Make Atleast three transaction to start blochchain.");
        }
  
  }
  private void SaveToLedger() throws Exception{
      String insertQuery = "INSERT INTO ledger (Sender,Data) VALUES (?, ?)";
      ps = c.prepareStatement(insertQuery);
      ps.setString(1, retrievedName);
      ps.setString(2, RecieverName);
      ps.executeUpdate();
      EncryptedLedger();
  }  

private void EncryptedLedger() throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, SQLException{

    String insertQuery = "INSERT INTO Publicledger (Sender,Reciever) VALUES (?, ?)";
            
            String Sender=retrievedName;
            String Reciever=RecieverName;
            KeyGenerator kg=KeyGenerator.getInstance("AES");
            kg.init(128);
            SecretKey sk=kg.generateKey();
            Cipher cip=Cipher.getInstance("AES");
            cip.init(cip.ENCRYPT_MODE, sk);
            byte[] encSender=cip.doFinal(Sender.getBytes());
            byte[] encReciever=cip.doFinal(Reciever.getBytes());
            
            String base64encSender = Base64.getEncoder().encodeToString(encSender);
            String base64encReciever = Base64.getEncoder().encodeToString(encReciever);
            
            ps = c.prepareStatement(insertQuery);
            ps.setString(1, base64encSender);
            ps.setString(2, " send coins to "+base64encReciever);
            ps.executeUpdate();
                
}
public String getExtractTime(){
    LocalDateTime currentTime=LocalDateTime.now();
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");
    String Time=currentTime.format(dtf);
    return Time;
}
private String getHash(String Data) throws Exception{
    String OriginalData="1"+getExtractTime()+"GenesisBlock"+Data;
         MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        byte[] hash = messageDigest.digest(OriginalData.getBytes());
        return Base64.getEncoder().encodeToString(hash);
}

private void createBlock() throws SQLException, Exception {
    String tableName = jTextField10.getText().trim();
    String data = String.valueOf(retrievedTransaction);
    JOptionPane.showMessageDialog(this, tableName);
 
      String createTableQuery = "CREATE TABLE IF NOT EXISTS `" + tableName + "` (id VARCHAR(250), TimeStamp VARCHAR(250), hash VARCHAR(250), previousHash VARCHAR(250), data VARCHAR(250))";
  
  c.prepareStatement(createTableQuery).executeUpdate();
    String insertQuery = "INSERT INTO `" + tableName + "` (id, TimeStamp, hash, previousHash, data) VALUES (?, ?, ?, ?, ?)";
  
  
  ps = c.prepareStatement(insertQuery);
    ps.setString(1, "1");
    ps.setString(2, getExtractTime());
    ps.setString(3, getHash(data));
    ps.setString(4, "Genesis Block");
    ps.setString(5, data);
    ps.executeUpdate();
    
    String insertBlockchainQuery = "INSERT INTO blockchains (Name) VALUES (?)";
    ps = c.prepareStatement(insertBlockchainQuery);
    ps.setString(1, tableName);
    ps.executeUpdate();
}
private void showblockchain(){
String query = "SELECT Name FROM blockchains";
    try{
        ps=c.prepareStatement(query);
        rs=ps.executeQuery();
        StringBuilder outputToLedger = new StringBuilder("<html>");
        while(rs.next()){
        String OutputToLedger;
         String rowText = "CHAIN > : "+rs.getString("Name") + "<br>";
         outputToLedger.append(rowText);
        }
         outputToLedger.append("</html>");
        jLabel46.setText(outputToLedger.toString());
    } catch (SQLException ex) {
        Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
    }     
}
String checkchain() throws SQLException{
    String query = "SELECT Name FROM blockchains";
     chainname=jTextField2.getText().trim();
    boolean chainexist=false;
    ps=c.prepareStatement(query);
        rs=ps.executeQuery();
        while(rs.next()){
        if(chainname.equals(rs.getString("Name"))){
                chainexist=true;
        }
        }
        if(chainexist){
             jTabbedPane2.setSelectedIndex(7);
             chainname1=chainname;
             return chainname; 
        }
        else{
            JOptionPane.showMessageDialog(this, "No such chain exist");
            return null;
        } 
        
}
private void Sellcoin(String SellCoinType, String PasswordSeller, float SellNumCoin) throws Exception {
    String searchQuery = "SELECT * FROM account WHERE password = ?";
    String updateQuery = "UPDATE account SET " + SellCoinType + " = " + SellCoinType + " - ?, dollars = dollars + ? WHERE password = ?";

    PreparedStatement ps = c.prepareStatement(searchQuery);
    ps.setString(1, PasswordSeller.trim());
    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
        float currentCoins = rs.getFloat(SellCoinType);
        float coinValue = 0;

        if (SellCoinType.equals("bitcoin")) {
            coinValue = SellNumCoin * changingBit;
        } else if (SellCoinType.equals("ripple")) {
            coinValue = SellNumCoin * changingRipple;
        } else if (SellCoinType.equals("ethereum")) {
            coinValue = SellNumCoin * changingetherium;
        } else {
            JOptionPane.showMessageDialog(this, "Select a valid coin type");
            return;
        }

        if (currentCoins- SellNumCoin>=-0.0001) {
            // Update coins and dollars
            ps = c.prepareStatement(updateQuery);
            ps.setFloat(1, SellNumCoin);
            ps.setFloat(2, coinValue);
            ps.setString(3, PasswordSeller.trim());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Coins sold successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Insufficient coins to sell");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Incorrect password or no such user exists");
    }
}
public void CurrenyWithTime() throws SQLException, ParseException{
    Random R=new Random();
        Timer t=new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                        float bitcoin = R.nextFloat(10000-100)+100;
        float ripple = R.nextFloat(10000-100)+100;
        float etherium = R.nextFloat(10000-100)+100;
        if (changingRipple !=ripple ||changingetherium !=etherium || changingBit !=bitcoin) {
            changingRipple=ripple;
            changingetherium=etherium;
            changingBit=bitcoin;
            lastChangeTime = System.currentTimeMillis();
        }
    }
};      
        t.scheduleAtFixedRate(task, 0, 30000);
        String insertQuery = "INSERT INTO currencywithtime (Time, bitcoin, etherium, ripple) VALUES (?, ?, ?, ?)";
        ps=c.prepareStatement(insertQuery);
    
        String time = getExtractTime();

       
        ps.setString(1, time);
        ps.setFloat(2, changingBit);
        ps.setFloat(3, changingetherium);
        ps.setFloat(4, changingRipple);
        ps.executeUpdate();
        
        jLabel56.setText(String.valueOf(changingBit));
        jLabel57.setText(String.valueOf(changingRipple));
        jLabel59.setText(String.valueOf(changingetherium));
}
private void refresh() throws Exception{
    //Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            c = DriverManager.getConnection(URL, username1, password1);
        } catch (SQLException ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        }
    String SearchQuery ="SELECT * FROM account WHERE name =?";
    PreparedStatement ps = c.prepareStatement(SearchQuery);
    ps.setString(1,retrievedName.trim());
    rs=ps.executeQuery();
    if(rs.next()){
             retrievedName = rs.getString("name");
             retrievedAmount = rs.getInt("dollars");
             retrievedbit = rs.getFloat("bitcoin");
             retrievedripple = rs.getFloat("ripple");
             retrievedetherium = rs.getFloat("etherium");
             retrievedTransaction = rs.getInt("Transaction");
        
             jLabel12.setText(retrievedName);
             jLabel13.setText(String.valueOf(retrievedbit));
             jLabel14.setText(String.valueOf(retrievedAmount));
            
             jLabel34.setText(String.valueOf(retrievedripple));
             jLabel32.setText(String.valueOf(retrievedetherium));
             jLabel27.setText(String.valueOf(retrievedTransaction));
             
    }
    
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
