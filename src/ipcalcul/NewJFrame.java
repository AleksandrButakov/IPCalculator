package ipcalcul;
import java.awt.TextField;
import java.lang.String;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.event.*;
import javax.swing.*;

import java.io.*;
import java.net.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


//import static javax.swing.JOptionPane.showMessageDialog;

public class NewJFrame extends javax.swing.JFrame {
    public String sText="";
    public String redText="";
    public int Length=0;
    public String AuxiliaryText="";
    public String sByte3, sByte2, sByte1, sByte0;
    public boolean IPAddrIsCorrectly = false;
    public int DD0min = 0, DD0max = 0;
    
    public boolean[] bIP = new boolean[8];
    public boolean[] bNetmask = new boolean[8];
    public boolean[] bHMin = new boolean[8];
    public boolean[] bHMax = new boolean[8];
    public boolean[] bNetwork = new boolean[8];
    
    public int IndexNetMask = -1;
    public String ItemText;
    
    public NewJFrame() {
        initComponents();
        ComboBoxRedraw();
     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textField4 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        textField6 = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        textField7 = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        textField8 = new java.awt.TextField();
        jLabel9 = new javax.swing.JLabel();
        textField9 = new java.awt.TextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IP calculator");
        setLocation(new java.awt.Point(100, 100));
        setResizable(false);

        jLabel1.setText("Enter IP address");

        jLabel2.setText("IP address");

        jLabel3.setText("Netmask");

        textField1.setName(""); // NOI18N
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        textField1.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField1TextValueChanged(evt);
            }
        });

        textField2.setBackground(javax.swing.UIManager.getDefaults().getColor("windowText"));
        textField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textField2.setEditable(false);
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });

        textField3.setBackground(javax.swing.UIManager.getDefaults().getColor("windowText"));
        textField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textField3.setEditable(false);

        jComboBox1.setName(""); // NOI18N
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter mask");

        jLabel5.setText("HostMin");

        textField4.setBackground(javax.swing.UIManager.getDefaults().getColor("windowText"));
        textField4.setEditable(false);

        textField5.setBackground(javax.swing.UIManager.getDefaults().getColor("windowText"));
        textField5.setEditable(false);

        jLabel6.setText("HostMax");

        textField6.setBackground(javax.swing.UIManager.getDefaults().getColor("windowText"));
        textField6.setEditable(false);

        jLabel7.setText("Network");

        textField7.setBackground(javax.swing.UIManager.getDefaults().getColor("windowText"));
        textField7.setEditable(false);

        jLabel8.setText("HostMin");

        textField8.setBackground(javax.swing.UIManager.getDefaults().getColor("windowText"));
        textField8.setEditable(false);

        jLabel9.setText("HostMax");

        textField9.setBackground(javax.swing.UIManager.getDefaults().getColor("windowText"));
        textField9.setEditable(false);

        jLabel10.setText("Hosts");

        jLabel11.setText("bin");

        jLabel12.setText("bin");

        jLabel13.setText("bin");

        jLabel14.setText("bin");

        jLabel15.setText("DD.DD.DD.DD");

        jLabel16.setText("DD.DD.DD.DD");

        jLabel17.setText("GateWay");

        jButton1.setBackground(new java.awt.Color(102, 204, 0));
        jButton1.setText("Count");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ping");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Close ping");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel18.setText("number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField9, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                    .addComponent(jLabel1)
                                                                                    .addComponent(jLabel4))
                                                                                .addGap(3, 3, 3)
                                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(28, 28, 28)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(jLabel11)))
                                                                    .addComponent(jLabel2))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(textField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                            .addComponent(jLabel12))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel5)))
                                                    .addComponent(jLabel13))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6)))
                                            .addComponent(jLabel14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)))
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel17))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel18)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField1TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField1TextValueChanged
    // проверим корректность IP адреса и внесем данные в переменные byte
    textField2.setText("");
    ComboBoxRedraw();
    redText=textField1.getText();
        if (redText.trim().length() == 0)
            return;
        
        // проверим что это не запятая
        int IndexComma=-1;
        IndexComma=redText.indexOf(",");
        if (IndexComma!=-1) {
            // введена запятая, исправим на точку
            if (redText.length()==1) {
                textField1.setText("");
            } else {
                redText=redText.replace(',','.');
                textField1.setText(redText);
                // поместим курсор в конец введенного текста
                Length=redText.length();
                textField1.setCaretPosition(Length);
                textField1.requestFocus();   
            }
        }
        
        IP_per_byte IPaddr = new IP_per_byte(redText);

        // ошибка первого символа
        if (IPaddr.ErrorIP==true) {
            // IP начинается не с цифры
            MessageText("Enter correctly IP address!");
            CursorPosition();
            return;
        }
        // ошибка байта 3
        if (IPaddr.ErrorByte3==true) {
            // некорректен byte3
            MessageText("Enter correctly IP address and byte 3!");
            CursorPosition();
            return;
        }
        // ошибка байта 2
        if (IPaddr.ErrorByte2==true) {
            MessageText("Enter correctly IP address and byte 2!");
            CursorPosition();
            return;
        }
        // ошибка байта 1
        if (IPaddr.ErrorByte1==true) {
            MessageText("Enter correctly IP address and byte 1!");
            CursorPosition();
            return;
        }
        // ошибка байта 0
        if (IPaddr.ErrorByte0==true) {
            MessageText("Enter correctly IP address and byte 0!");
            CursorPosition();
            return;
        }
        // введен недопустимый символ
        if (IPaddr.ErrorSymbol==true) {
            MessageText("The symbol is entered incorrectly!");
            CursorPosition();
            return;
        }
        // введены две точки подряд
        if (IPaddr.TwoPoints==true) {
            MessageText("The two points!");
            CursorPosition();
            return;
        }
        
        // сохраним в переменной последнее корректное значение IP введенное в textField1
        sText=textField1.getText();
        
        // если IP адрес корректен (существуют все 4 байта), попадаем в этот блок
        first:{
            for (int i=0; i<=3; i++){
                if (IPaddr.CorrectlyIP[i]==false){
                    jButton1.setEnabled(false);
                    jButton2.setEnabled(false);
                    IPAddrIsCorrectly = false;
                    break first;
                }
            }
            IPAddrIsCorrectly = true;
            
            if (IndexNetMask != -1 && IPAddrIsCorrectly == true) {
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
                IPAddrIsCorrectly = true;
            }

            ComboBoxRedraw ();
            // заполнили public переменные для дальнейшей обработки
            sByte3=IPaddr.sByte3;
            sByte2=IPaddr.sByte2;
            sByte1=IPaddr.sByte1;
            sByte0=IPaddr.sByte0;
        }
        

    }//GEN-LAST:event_textField1TextValueChanged

    public void CursorPosition () {
        textField1.setText(sText);
        Length=sText.length();
        textField1.setCaretPosition(Length);
        textField1.requestFocus();        
    }
      
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // отобразили байт sByte0 в бинарном виде в поле textField2
        AuxiliaryText="";
        DecToBin DecToBin = new DecToBin(Integer.valueOf(sByte0));
        for (int i=7; i>=0; i--) {
            if (DecToBin.BitOrder[i]==true) {
                AuxiliaryText += "1";
                bIP[i]=true;
            } else {
                AuxiliaryText += "0";
                bIP[i]=false;
            }
            if (i==4) {
                AuxiliaryText +="  ";
            }
            if (i>0)
                AuxiliaryText +=" ";
        }
        textField2.setText(AuxiliaryText);
        ComboBoxRedraw ();
        
        // проверим, что IP лежит в диапазоне маски
        if (IndexNetMask<0 || IndexNetMask>7) {
            MessageText("Enter network mask!");
            return;            
        }
        int a=0;
        for (int i=7-IndexNetMask; i>=0; i--) {
            if (bIP[i]==true) {
                a++;
            }
        }
        if (a!=0 && a<=7-IndexNetMask) {
            // IP находится в диапазоне
        } else {
            // IP находится вне диапазона
            MessageText("IP out of range!");
            return;
        }
        
        // найдем бинарный hostmin and hostmax (bHMin[8] and bHMax[8])
        for (int i=7; i>=0; i--) {
            if (i>7-IndexNetMask) {
                bHMin[i]=bIP[i];
                bHMax[i]=bIP[i];
                
            } else {
                if (i==0) {
                    bHMin[i]=true;
                    bHMax[i]=false;
                } else {
                    bHMin[i]=false;
                    bHMax[i]=true;
                }
            }
        }
        // отобазим бинарный HostMin
        AuxiliaryText=BinHMin();
        textField4.setText(AuxiliaryText);
        
        // отобазим бинарный HostMax
        AuxiliaryText=BinHMax();
        textField5.setText(AuxiliaryText);
        
        // найдем адрес Network
        for (int i=7; i>=1; i--) {
            bNetwork[i]=bHMin[i];
        }
        bNetwork[0]=false;
        BinToDec BTDNetwork = new BinToDec(bNetwork);
        AuxiliaryText=sByte3+"."+sByte2+"."+sByte1+"."+Integer.toString(BTDNetwork.AxiliaryDecByte0);
        textField6.setText(AuxiliaryText);
        
        // найдем и отобразим десятичный адрес HostMin
        BinToDec BTDHMin = new BinToDec(bHMin);
        //для ping сохраним в переменную адрес хоста мин
        DD0min = BTDHMin.AxiliaryDecByte0;
        AuxiliaryText=sByte3+"."+sByte2+"."+sByte1+"."+Integer.toString(BTDHMin.AxiliaryDecByte0);
        textField7.setText(AuxiliaryText);
        
        // найдем и отобразим десятичный адрес HostMax
        BinToDec BTDHMax = new BinToDec(bHMax);
        //для ping сохраним в переменную адрес хоста мин
        DD0max = BTDHMax.AxiliaryDecByte0;
        AuxiliaryText=sByte3+"."+sByte2+"."+sByte1+"."+Integer.toString(BTDHMax.AxiliaryDecByte0);
        
        textField8.setText(AuxiliaryText);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboBoxRedraw () {
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "/ 24 - 255.255.255.0", "/ 25 - 255.255.255.128", 
            "/ 26 - 255.255.255.192", "/ 27 - 255.255.255.224", "/ 28 - 255.255.255.240", "/ 29 - 255.255.255.248", 
            "/ 30 - 255.255.255.252" }));
            //public int IndexNetmask;
            //public String ItemText;
            jComboBox1.setSelectedItem(ItemText);
    }
    
    private String BinHMin() {
        AuxiliaryText="";
        for (int i=7; i>=0; i--) {
            if (bHMin[i]==true) {
                AuxiliaryText+="1";
            } else {
                AuxiliaryText+="0";
            }
            switch (i) {
                case 7:AuxiliaryText+=" "; break;
                case 6:AuxiliaryText+=" "; break;
                case 5:AuxiliaryText+=" "; break;
                case 4:AuxiliaryText+="   "; break;
                case 3:AuxiliaryText+=" "; break;
                case 2:AuxiliaryText+=" "; break;
                case 1:AuxiliaryText+=" "; break;
                case 0: break;
            }
        }
        return AuxiliaryText;
    }

    private String BinHMax() {
        AuxiliaryText="";
        for (int i=7; i>=0; i--) {
            if (bHMax[i]==true) {
                AuxiliaryText+="1";
            } else {
                AuxiliaryText+="0";
            }
            switch (i) {
                case 7:AuxiliaryText+=" "; break;
                case 6:AuxiliaryText+=" "; break;
                case 5:AuxiliaryText+=" "; break;
                case 4:AuxiliaryText+="   "; break;
                case 3:AuxiliaryText+=" "; break;
                case 2:AuxiliaryText+=" "; break;
                case 1:AuxiliaryText+=" "; break;
                case 0: break;
            }
        }
        return AuxiliaryText;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        

        
        if (textField6.getText().trim().length() == 0)
            return;
        
        JPanel middlePanel = new JPanel ();
        middlePanel.setBorder ( new TitledBorder ( new EtchedBorder ()) );

        // create the middle panel components
        JTextArea display = new JTextArea ( 30, 48 );
        display.setEditable ( false ); // set textArea non-editable
        JScrollPane scroll = new JScrollPane ( display );
        scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

        //Add Textarea in to middle panel
        middlePanel.add ( scroll );

        

       
        
        
        
        // My code
        JFrame frame = new JFrame ("Ping network " + textField6.getText());
        frame.setResizable(false); // запрет изменения размеров окна
        frame.add ( middlePanel );
        frame.pack ();
        frame.setLocationRelativeTo ( null );
        frame.setVisible ( true );        

        display.append("IP calculator [Version 1.5]"+"\n");
        display.append("(c) Корпорация Сургут ЦТО (Surgut Maintenance center), 2019. Все права"+"\n");
        display.append("защищены"+"\n");
        display.append("Обмен пакетами с выбранным диапазоном адресов"+"\n");
        display.append("\n");        

        Thread t1 = new Thread(new Runnable () {
            @Override
            public void run() {

            try {
                for (int i=DD0min; i<=DD0max; i++) {
                    AuxiliaryText = sByte3+"."+sByte2+"."+sByte1+"."+Integer.toString(i);
                    InetAddress geek = InetAddress.getByName(AuxiliaryText);
                    display.append("Sending Ping Request to   " + AuxiliaryText);
                    
                    if (geek.isReachable(5000))
                        display.append("   Host is reachable" + "\n");
                    else
                        display.append("   Sorry ! We can't reach to this host" + "\n");
                }
                
                display.append("\n");
                display.append("Проверка доступности IP адресов из диапазона закончена!");
                
            } catch (UnknownHostException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            }
        });        
            
        t1.start();
        


        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void sendPingRequest(String ipAddress)
        throws UnknownHostException, IOException {
        InetAddress geek = InetAddress.getByName(ipAddress);
        //display.append("Sending Ping Request to " + ipAddress);
        if (geek.isReachable(5000))
            System.out.println("Host is reachable");
        else
            System.out.println("Sorry ! We can't reach to this host");                
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // заполняем оле с двоичной маской
        IndexNetMask=(int) jComboBox1.getSelectedIndex();
        ItemText=(String)jComboBox1.getSelectedItem();
        switch (IndexNetMask) {
            case 0:
                textField3.setText("0 0 0 0   0 0 0 0");
                textField9.setText("254");
                break;
            case 1:
                textField3.setText("1 0 0 0   0 0 0 0");
                textField9.setText("126");
                break;
            case 2:
                textField3.setText("1 1 0 0   0 0 0 0");
                textField9.setText("62");
                break;
            case 3:
                textField3.setText("1 1 1 0   0 0 0 0");
                textField9.setText("30");
                break;
            case 4:
                textField3.setText("1 1 1 1   0 0 0 0");
                textField9.setText("14");
                break;
            case 5:
                textField3.setText("1 1 1 1   1 0 0 0");
                textField9.setText("6");
                break;
            case 6:
                textField3.setText("1 1 1 1   1 1 0 0");
                textField9.setText("2");
                break;
        }
        
                // если IP адрес корректен (существуют все 4 байта), попадаем в этот блок
        
        if (IndexNetMask != -1 && IPAddrIsCorrectly == true) {
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);                 
        } else {
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);                
        }
        
        // для корректной прорисовки обновим ComboBox1
        ComboBoxRedraw();
        BinaryMaskFill();
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BinaryMaskFill () {
        // заполним массив bNetmask для дальнейшей обработки
        for (int i=7; i>=0; i--) {
            if (i>7-IndexNetMask) {
                // заполняем true
                bNetmask[i]=true;
            } else {
                // заполняем false
                bNetmask[i]=false;
            }
        }
    }
    
    private void MessageText (String Text) {
        JOptionPane.showMessageDialog(null, Text, "Alert! Incorrect IP address.",
            JOptionPane.ERROR_MESSAGE);           
    }
    
    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    private java.awt.TextField textField7;
    private java.awt.TextField textField8;
    private java.awt.TextField textField9;
    // End of variables declaration//GEN-END:variables

}
