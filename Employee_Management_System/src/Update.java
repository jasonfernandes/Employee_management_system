
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Update extends javax.swing.JInternalFrame {

    /**
     * Creates new form Search
     */
    public Update() {
        initComponents();
        try {
            BufferedReader brSearch1 = new BufferedReader(new FileReader("MenuList.txt"));
            String key[] = new String[1024];
            String search;
            Object columns[] = {"Emp ID", "Name", "Salary", "Emp Shift"};
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(columns);
            jTable1.setModel(model);
            Object row[] = new Object[4];
            while ((search = brSearch1.readLine()) != null) {

                key = search.split(",");
                row[0] = key[1];
                row[1] = key[2];
                row[2] = key[3];
                row[3] = key[4];
                model.addRow(row);
            }
            brSearch1.close();
        } catch (Exception ex) {
            System.out.println("Exception msg: " + ex);
        }
    }

    String id, name, salary, shift;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Name = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        empshift = new javax.swing.JLabel();
        EmpShiftText = new javax.swing.JTextField();
        salary1 = new javax.swing.JLabel();
        SalaryText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Update Details");
        setPreferredSize(new java.awt.Dimension(1041, 525));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1025, 491));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPDATE DETAILS");
        jLabel1.setMaximumSize(new java.awt.Dimension(108, 29));
        jLabel1.setMinimumSize(new java.awt.Dimension(108, 29));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(402, 38, 424, 38);

        jTable1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp ID", "Name", "Emp Shift", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(398, 150, 585, 402);

        Name.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Name");
        Name.setMaximumSize(new java.awt.Dimension(72, 20));
        Name.setMinimumSize(new java.awt.Dimension(72, 20));
        Name.setPreferredSize(new java.awt.Dimension(72, 20));
        jPanel1.add(Name);
        Name.setBounds(50, 161, 97, 28);

        NameText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(NameText);
        NameText.setBounds(176, 160, 215, 40);

        empshift.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        empshift.setForeground(new java.awt.Color(255, 255, 255));
        empshift.setText("Emp Shift");
        empshift.setMaximumSize(new java.awt.Dimension(72, 20));
        empshift.setMinimumSize(new java.awt.Dimension(72, 20));
        empshift.setPreferredSize(new java.awt.Dimension(72, 20));
        jPanel1.add(empshift);
        empshift.setBounds(42, 209, 116, 25);

        EmpShiftText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(EmpShiftText);
        EmpShiftText.setBounds(176, 208, 215, 40);

        salary1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        salary1.setForeground(new java.awt.Color(255, 255, 255));
        salary1.setText("Salary");
        salary1.setMaximumSize(new java.awt.Dimension(72, 20));
        salary1.setMinimumSize(new java.awt.Dimension(72, 20));
        salary1.setPreferredSize(new java.awt.Dimension(72, 20));
        jPanel1.add(salary1);
        salary1.setBounds(50, 252, 72, 33);

        SalaryText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(SalaryText);
        SalaryText.setBounds(176, 257, 215, 40);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton1.setText("Update");
        jButton1.setMaximumSize(new java.awt.Dimension(125, 33));
        jButton1.setMinimumSize(new java.awt.Dimension(125, 33));
        jButton1.setPreferredSize(new java.awt.Dimension(125, 33));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(176, 352, 125, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\shreya kulkarni\\Desktop\\yo.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1140, 630);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-5, 0, 1110, 614);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();        // TODO add your handling code here:
        TableModel model = jTable1.getModel();
        String acc = model.getValueAt(i, 0).toString();
        name = NameText.getText().toUpperCase();
        salary = SalaryText.getText();
        shift = EmpShiftText.getText().toUpperCase();
        model.setValueAt(name, i, 1);
        model.setValueAt(salary, i, 2);
        model.setValueAt(shift, i, 3);
        //  String dob = jTextField3.getText();
        ArrayList<String> tempArray = new ArrayList<>();
        ArrayList<String> tempArray2 = new ArrayList<>();
        ArrayList<String> tempArray3 = new ArrayList<>();
        try {
            try {
                FileReader fr = new FileReader("Second_Index.txt");
                Scanner reader = new Scanner(fr);
                FileReader fr2 = new FileReader("Index.txt");
                Scanner reader2 = new Scanner(fr2);
                FileReader fr3 = new FileReader("MenuList.txt");
                Scanner reader3 = new Scanner(fr3);
                String line, val, result;
                String lineArr[], lineArr2[], lineArr3[];
                while ((line = reader.nextLine()) != null && (result = reader3.nextLine()) != null) {
                    lineArr = line.split(",");
                    //lineArr2 = val.split(",");
                    lineArr3 = result.split(",");
                    if (lineArr[0].equals(acc)) {
                        tempArray.add(lineArr[0] + "," + name + "," + salary + "," + shift);
                    } else {
                        tempArray.add(line);
                    }
                    //                    if (lineArr2[1].equals(acc)) {
                        //                        tempArray2.add(lineArr2[0] + "," + acc);
                        //                    } else {
                        //                        tempArray2.add(val);
                        //                    }
                    if (lineArr3[1].equals(acc)) {
                        tempArray3.add(lineArr3[0] + "," + acc + "," + name + "," + salary + "," + shift);
                    } else {
                        tempArray3.add(result);
                    }
                }
                fr.close();
                //                fr2.close();
                fr3.close();
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        try {
            try {
                PrintWriter pr = new PrintWriter("Second_Index.txt");
                //PrintWriter pr2 = new PrintWriter("C:\\Users\\Shreya\\Documents\\NetBeansProjects\\Employee_Management_System\\Index.txt");
                PrintWriter pr3 = new PrintWriter("MenuList.txt");
                for (String str : tempArray) {
                    pr.println(str);
                }
                //                for (String str2 : tempArray2) {
                    //                    pr2.println(str2);
                    //                }
                for (String str3 : tempArray3) //THis loop is for writing the values from tempArray3 to the file MenuList
                {
                    pr3.println(str3);  
                }
                pr.close();
                //                pr2.close();
                pr3.close();
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();        // TODO add your handling code here:
        TableModel model = jTable1.getModel();
        NameText.setText(model.getValueAt(i, 1).toString());
        SalaryText.setText(model.getValueAt(i, 2).toString());
        //jTextField3.setText(model.getValueAt(i, 2).toString());
        EmpShiftText.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmpShiftText;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField SalaryText;
    private javax.swing.JLabel empshift;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel salary1;
    // End of variables declaration//GEN-END:variables
}