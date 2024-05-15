
package hms_a;

import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CheckUp extends javax.swing.JFrame {

    ArrayList<BillingInfo> record = new ArrayList<>();
    ArrayList<Medicine> allMedicines = new ArrayList<>();
    ArrayList<Patient> allPatients = new ArrayList<>();
    
    public CheckUp() {
        initComponents();
        readAllMData();
        readAllPData();
        LoadMed();
    }
    
    void LoadMed(){
        allM.removeAllItems();
        for(int i = 0; i<allMedicines.size();i++){
            allM.addItem(allMedicines.get(i).getId()+";"+allMedicines.get(i).getName());
        }
    }
    
    void readAllPData() {

        try {
            File pfile = new File("PatientsData.txt");
            Scanner scanner = new Scanner(pfile);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] curData = data.split(";");
                Patient patient = new Patient();
                patient.setId(Integer.parseInt(curData[0]));
                patient.setName(curData[1]);
                patient.setAge(Integer.parseInt(curData[2]));
                patient.setGender(curData[3]);
                patient.setAddress(curData[4]);
                patient.setContact(curData[5]);
                allPatients.add(patient);
            }
            scanner.close();
        } catch (Exception e) {
        }
    }
    
    void readAllMData() {

        try {
            File pfile = new File("mdata.txt");
            Scanner scanner = new Scanner(pfile);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] curData = data.split(";");
                Medicine medicines = new Medicine();
                medicines.setId(Integer.parseInt(curData[0]));
                medicines.setName(curData[1]);
                medicines.setSellingPrice(Integer.parseInt(curData[2]));
                medicines.setBuyingPrice(Integer.parseInt(curData[3]));
                medicines.setQuantity(Integer.parseInt(curData[4]));
                medicines.setDescription(curData[5]);
                allMedicines.add(medicines);
            }
            scanner.close();
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        HomeBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        allM = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        mList = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        fee = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rec = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 135, 137));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHECKUP MENU");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\toshiba\\OneDrive\\Documents\\NetBeansProjects\\HMS_A\\src\\icon\\Blue Red White Square Badge Simple Medical Clinic Logo.png")); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        HomeBtn.setBackground(new java.awt.Color(5, 135, 137));
        HomeBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn.setText("Home");
        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
        });
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HomeBtn)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Medicines");

        id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Patient ID");

        allM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        mList.setColumns(20);
        mList.setRows(5);
        jScrollPane1.setViewportView(mList);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Add Medicines");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Recomendation");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Fee");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Medicines List");

        rec.setColumns(20);
        rec.setRows(5);
        jScrollPane2.setViewportView(rec);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(5, 135, 137));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Quantity");

        quantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(allM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(quantity))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(340, 340, 340))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(allM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(fee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel5))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        MainForm mainform = new MainForm();
        this.setVisible(false);
        mainform.setVisible(true);
    }//GEN-LAST:event_HomeBtnMouseClicked

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed

    }//GEN-LAST:event_HomeBtnActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    boolean checkForQuantity(){
        int currMId = Integer.parseInt(allM.getSelectedItem().toString().split(";")[0]);
        for(int i = 0; i<allMedicines.size(); i++){
            if(currMId == allMedicines.get(i).getId()){
                if(Integer.parseInt(quantity.getText())>allMedicines.get(i).getQuantity())
                    return true;
            }
        }
        return false;
    }
    
//    void SaveAllMData() {
//        try {
//            FileWriter fileWriter = new FileWriter("mdata.txt");
//            for (int i = 0; i < allMedicines.size(); i++) {
//                fileWriter.write(allMedicines.get(i).getId() + ";" + allMedicines.get(i).getName() + ";" + allMedicines.get(i).getSellingPrice() + ";" + allMedicines.get(i).getBuyingPrice()+ ";" + allMedicines.get(i).getQuantity() + ";"  + allMedicines.get(i).getDescription() + "\n");
//            }
//            fileWriter.close();
//        } catch (Exception e) {
//        }
//    }
//    
//    void SaveAllPData() {
//        try {
//            FileWriter fileWriter = new FileWriter("pdata.txt");
//            for (int i = 0; i < allPatients.size(); i++) {
//                fileWriter.write(allPatients.get(i).getId() + ";" + allPatients.get(i).getName() + ";" + allPatients.get(i).getAge() + ";" + allPatients.get(i).getGender() + ";" + allPatients.get(i).getContact() + "\n");
//            }
//            fileWriter.close();
//        } catch (Exception e) {
//        }
//    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(quantity.getText().equals("") || allM.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(null,"Please Select Medicines Or Enter Quantity");
        }else if (checkForQuantity()){
            JOptionPane.showMessageDialog(null,"Current Quantity is greater then available quantity");            
        }else{
            mList.append(allM.getSelectedItem()+";"+quantity.getText()+"\n");
            quantity.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void feeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feeActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    boolean PatientIdExist(){
        for(int i = 0; i<allPatients.size(); i++){
            if(id.getText().equals(allPatients.get(i).getId()+"")){
                return false;
            }
        }
        return true;
    }
    
    void SaveAllMData() {
        try {
            FileWriter fileWriter = new FileWriter("mdata.txt");
            for (int i = 0; i < allMedicines.size(); i++) {
                fileWriter.write(allMedicines.get(i).getId() + ";" + allMedicines.get(i).getName() + ";" + allMedicines.get(i).getSellingPrice() + ";" + allMedicines.get(i).getBuyingPrice()+ ";" + allMedicines.get(i).getQuantity() + ";"  + allMedicines.get(i).getDescription() + "\n");
            }
            fileWriter.close();
        } catch (Exception e) {
        }
    }
    
    void SaveAllRData() {
        try {
            FileWriter fileWriter = new FileWriter("record.txt");
            for (int i = 0; i < record.size(); i++) {
                fileWriter.append(record.get(i).getPatientID() + ";" + record.get(i).getFee() + ";" + record.get(i).getRecommendations() + ";" + record.get(i).getDate()+ ";");
                ArrayList<Integer> tmp = record.get(i).getMedicineID();
                for(int j = 0; j<tmp.size(); j++){
                    fileWriter.append(tmp.get(j)+";");
                }
                fileWriter.append("\n");
            }
            fileWriter.close();
        } catch (Exception e) {
        }
    }
        
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(id.getText().equals("")||fee.getText().equals("")||rec.getText().equals("")){
            JOptionPane.showMessageDialog(null,"All Fields Are Required!");            
        }
        else if(PatientIdExist()){
            JOptionPane.showMessageDialog(null,"PatientID Didn't Exists");
        }
        else{
            try{
            BillingInfo billingInfo = new BillingInfo();
            String Bill = "";
            int total = 0;
            billingInfo.setPatientID(Integer.parseInt(id.getText()));
            billingInfo.setFee(Integer.parseInt(fee.getText()));
            String[] Mdata = mList.getText().split("\n");
            //Bill += "\n"; 
            for(int i = 0; i<Mdata.length; i++){
                billingInfo.setMedicineID(Integer.parseInt(Mdata[i].split(";")[0]));
                int curQ = Integer.parseInt(Mdata[i].split(";")[2]);
                int curID = Integer.parseInt(Mdata[i].split(";")[0]);
                for(int j = 0; j<allMedicines.size(); j++){
                    if(allMedicines.get(j).getId() == curID){
                        Bill += allMedicines.get(j).getName()+" = "+allMedicines.get(j).getSellingPrice()+"\n";
                        total += allMedicines.get(j).getSellingPrice();
                        allMedicines.get(j).setQuantity(allMedicines.get(j).getQuantity() - curQ);
                    }
                }
            }
            billingInfo.setRecommendations(rec.getText());
            DateFormat cDateFormat = new SimpleDateFormat("dd:MM:YYYY");
            Date cdate = new Date();
            billingInfo.setDate(cDateFormat.format(cdate));
            record.add(billingInfo);
            SaveAllMData();
            SaveAllRData();
            Bill += "\nTotal Medicines Cost = "+total;
            Bill += "\nDoctor Fee = "+fee.getText();
            Bill += "Total = "+(total+Integer.parseInt(fee.getText()));
            JOptionPane.showMessageDialog(null, "Your Bill \n"+Bill);
            id.setText("");
            fee.setText("");
            rec.setText("");
            mList.setText("");
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeBtn;
    private javax.swing.JComboBox<String> allM;
    private javax.swing.JTextField fee;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea mList;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextArea rec;
    // End of variables declaration//GEN-END:variables
}
