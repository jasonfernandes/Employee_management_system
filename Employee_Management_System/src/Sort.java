
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;


class empData {

    String index, ID, name, salary, shift;

    public empData(String index, String ID, String name, String salary, String shift) {
        this.index = index;
        this.ID = ID;
        this.name = name;
        this.salary = salary;
        this.shift = shift;
    }
}

class indCompare implements Comparator<empData> {

    @Override
    public int compare(empData s1, empData s2) {
        return s2.index.compareTo(s1.index);
    }
}

class idCompare implements Comparator<empData> {

    @Override
    public int compare(empData s1, empData s2) {
        return s2.ID.compareTo(s1.ID);
    }
}

//empNameCompare Class to compare the names
class empNameCompare implements Comparator<empData> {

    @Override
    public int compare(empData s1, empData s2) {
        return s2.name.compareTo(s1.name);
    }
}
//salaryCompare Class to compare the names

class salaryCompare implements Comparator<empData> {

    @Override
    public int compare(empData s1, empData s2) {
        return s2.salary.compareTo(s1.salary);
    }
}
//shiftCompare Class to compare the names

class shiftCompare implements Comparator<empData> {

    @Override
    public int compare(empData s1, empData s2) {
        return s2.shift.compareTo(s1.shift);
    }
}

public class Sort extends javax.swing.JInternalFrame {

    /**
     * Creates new form Search
     */
    public Sort() {
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

    public boolean sort(idCompare id_cmp) {
        File file;
        boolean check = false;
        try {
            file = new File("MenuList.txt");

            //Creating BufferedReader object to read the input text file
            BufferedReader reader = new BufferedReader(new FileReader(file));

            //Creating ArrayList to hold empData objects
            ArrayList<empData> empRecords = new ArrayList<empData>();

            //Reading empData records one by one
            String currentLine = reader.readLine();

            while (currentLine != null) {
                String[] empDetail = currentLine.split(",");
                String index = empDetail[0];
                String ID = empDetail[1];
                String Name = empDetail[2];
                String salary = empDetail[3];
                String shift = empDetail[4];

                //Creating empData object for every empData record and adding it to ArrayList
                empRecords.add(new empData(index, ID, Name, salary, shift));

                currentLine = reader.readLine();
            }

            //Sorting ArrayList empRecords based on marks
            Collections.sort(empRecords, id_cmp.reversed());//MAIN SORTING OF EMPLOYEE ID

            //Creating BufferedWriter object to write into output text file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            //Writing every empRecords into output text file
            for (empData empData : empRecords) {
                writer.write(empData.index);
                writer.write("," + empData.ID);
                writer.write("," + empData.name);
                writer.write("," + empData.salary);
                writer.write("," + empData.shift);

                //writer.write("," + empData.IDno);
                writer.newLine();
            }

            //Closing the resources
            reader.close();
            writer.close();

        } catch (Exception ex) {
            System.out.println("Exception msg: " + ex);
        }
        return true;

    }

    public boolean sort(empNameCompare emp_cmp) {
        File file;
        boolean check = false;
        try {
            file = new File("MenuList.txt");

            //Creating BufferedReader object to read the input text file
            BufferedReader reader = new BufferedReader(new FileReader(file));

            //Creating ArrayList to hold empData objects
            ArrayList<empData> empRecords = new ArrayList<empData>();

            //Reading empData records one by one
            String currentLine = reader.readLine();

            while (currentLine != null) {
                String[] empDetail = currentLine.split(",");
                String index = empDetail[0];
                String ID = empDetail[1];
                String Name = empDetail[2];
                String salary = empDetail[3];
                String shift = empDetail[4];

                //Creating empData object for every empData record and adding it to ArrayList
                empRecords.add(new empData(index, ID, Name, salary, shift));

                currentLine = reader.readLine();
            }

            //Sorting ArrayList empRecords based on marks
            Collections.sort(empRecords, emp_cmp.reversed());//MAIN COMPARISON OF EMPLOYE NAME

            //Creating BufferedWriter object to write into output text file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            //Writing every empRecords into output text file
            for (empData emp1Data : empRecords) {
                writer.write(emp1Data.index);
                writer.write("," + emp1Data.ID);
                writer.write("," + emp1Data.name);
                writer.write("," + emp1Data.salary);
                writer.write("," + emp1Data.shift);

                //writer.write("," + empData.IDno);
                writer.newLine();
            }

            //Closing the resources
            reader.close();
            writer.close();

        } catch (Exception ex) {
            System.out.println("Exception msg: " + ex);
        }
        return true;

    }

    public boolean sort(salaryCompare sal_cmp) {
        File file;
        boolean check = false;
        try {
            file = new File("MenuList.txt");

            //Creating BufferedReader object to read the input text file
            BufferedReader reader = new BufferedReader(new FileReader(file));

            //Creating ArrayList to hold empData objects
            ArrayList<empData> empRecords = new ArrayList<empData>();

            //Reading empData records one by one
            String currentLine = reader.readLine();

            while (currentLine != null) {
                String[] empDetail = currentLine.split(",");
                String index = empDetail[0];
                String ID = empDetail[1];
                String Name = empDetail[2];
                String salary = empDetail[3];
                String shift = empDetail[4];

                //Creating empData object for every empData record and adding it to ArrayList
                empRecords.add(new empData(index, ID, Name, salary, shift));

                currentLine = reader.readLine();
            }

            //Sorting ArrayList empRecords based on marks
            Collections.sort(empRecords, sal_cmp.reversed());

            //Creating BufferedWriter object to write into output text file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.flush();

            //Writing every empRecords into output text file
            for (empData empData : empRecords) {
                writer.write(empData.index);
                writer.write("," + empData.ID);
                writer.write("," + empData.name);
                writer.write("," + empData.salary);
                writer.write("," + empData.shift);

                //writer.write("," + empData.IDno);
                writer.newLine();
            }

            //Closing the resources
            reader.close();
//            writer.flush();
            writer.close();

        } catch (Exception ex) {
            System.out.println("Exception msg: " + ex);
        }
        return true;

    }

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
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Sort Details");
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(856, 600));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SORTING DETAILS");
        jLabel1.setMaximumSize(new java.awt.Dimension(108, 29));
        jLabel1.setMinimumSize(new java.awt.Dimension(108, 29));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 30, 410, 38);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emp ID", "Name", "Salary" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(160, 130, 138, 34);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton1.setText("Sort");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(420, 130, 98, 37);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp ID", "Name", "Salary", "Emp Shift"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 220, 667, 347);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 840, 660);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 930, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Sort sor = new Sort();
        int item = jComboBox1.getSelectedIndex();
        if (item == 0) {
            sor.sort(new idCompare());
        }
        if (item == 1) {
            sor.sort(new empNameCompare());
        }
        if (item == 2) {
            sor.sort(new salaryCompare());
        }
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
