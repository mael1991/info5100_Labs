/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Student;
import utility.DatabaseConnector;

public class FormJPanel extends javax.swing.JPanel {
    private Image photo;
    private JPanel bottomPanel;
    private File selectedPhoto;
    

    public FormJPanel() {
        initComponents();
        
        
    }

    public FormJPanel(JPanel panel) {
        initComponents();
        this.bottomPanel = panel;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        collegeButtonGroup = new javax.swing.ButtonGroup();
        ageSpinner = new javax.swing.JSpinner();
        age = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        continentComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        experienceTextArea = new javax.swing.JTextArea();
        phoneLabel1 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        firstnameTextfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        photoButton = new javax.swing.JButton();
        RegistrationLabel = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        photoTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        coeRadioButton = new javax.swing.JRadioButton();
        cosRadioButton = new javax.swing.JRadioButton();
        phoneLabel2 = new javax.swing.JLabel();
        phoneFormattedTextField = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(102, 255, 255));

        ageSpinner.setAutoscrolls(true);

        age.setText("Age:");

        firstname.setText("Name:");

        continentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Africa", "Antarctica", "Asia", "Europe", "North America", "South America", "Australia" }));
        continentComboBox.setSelectedIndex(-1);

        experienceTextArea.setColumns(20);
        experienceTextArea.setRows(5);
        jScrollPane1.setViewportView(experienceTextArea);

        phoneLabel1.setText("Phone");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        firstnameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTextfieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Experience");

        jLabel2.setText("Continent:");

        photoButton.setText("Upload");
        photoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoButtonActionPerformed(evt);
            }
        });

        RegistrationLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegistrationLabel.setText("Registration");

        photoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Photo");

        collegeButtonGroup.add(coeRadioButton);
        coeRadioButton.setText("College of Engineering(COE)");
        coeRadioButton.setActionCommand("COE");
        coeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coeRadioButtonActionPerformed(evt);
            }
        });

        collegeButtonGroup.add(cosRadioButton);
        cosRadioButton.setText("College of Science (COS)");
        cosRadioButton.setActionCommand("COS");
        cosRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosRadioButtonActionPerformed(evt);
            }
        });

        phoneLabel2.setText("College");

        try {
            phoneFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        phoneFormattedTextField.setToolTipText("123-456-7890");
        phoneFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFormattedTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(RegistrationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(submitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(photoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(photoButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(continentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstname)
                                    .addComponent(age)
                                    .addComponent(phoneLabel2)
                                    .addComponent(phoneLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstnameTextfield)
                                    .addComponent(phoneFormattedTextField)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cosRadioButton)
                                            .addComponent(ageSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(coeRadioButton))
                                        .addGap(59, 59, 59)))))))
                .addGap(332, 332, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(RegistrationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age)
                            .addComponent(ageSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coeRadioButton))
                    .addComponent(phoneLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cosRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel1)
                    .addComponent(phoneFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(photoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(photoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
     
        // Read all input fields
       
        
        String name = firstnameTextfield.getText().trim();
        int age = (Integer) ageSpinner.getValue();
        
        
        String phone = phoneFormattedTextField.getText().trim();
        if (phone.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Phone is required!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
}
        
        

        String college = "";
        if (collegeButtonGroup.getSelection() != null) {
            college = collegeButtonGroup.getSelection().getActionCommand();
        }

        Object selectedContinent = continentComboBox.getSelectedItem();
        String continent = (selectedContinent != null) ? selectedContinent.toString() : "";
        String experience = experienceTextArea.getText().trim();

        
       
         // === Validation ===
        if (name.isEmpty() || phone.isEmpty() || college.isEmpty() || continent.isEmpty() || experience.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (age < 18) {
            JOptionPane.showMessageDialog(this, "Age must be 18 or older!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
       // Expand college names
        if (college.equals("COE")) {
            college = "College of Engineering (COE)";
        } else if (college.equals("COS")) {
            college = "College of Science (COS)";
        }

        // === Create Student object ===
        Student user = new Student(name, age, college, phone, continent, experience, selectedPhoto);
 try {
    DatabaseConnector.addUser(user); // <-- Insert this after creating the Student
}       catch (java.sql.SQLException ex) {
            System.getLogger(FormJPanel.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        // === Navigate to view page ===
        ViewJPanel viewJPanelObject = new ViewJPanel(user);
        this.bottomPanel.add(viewJPanelObject);
        CardLayout layout = (CardLayout) this.bottomPanel.getLayout();
        layout.next(this.bottomPanel);

        
       

        // === Show confirmation popup ===
        if (selectedPhoto != null) {
            ImageIcon icon = new ImageIcon(new ImageIcon(selectedPhoto.getAbsolutePath())
                    .getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH));
            JOptionPane.showMessageDialog(this, user.toString(), "Profile", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(this, user.toString(), "Profile", JOptionPane.INFORMATION_MESSAGE);
        }
    
       
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void photoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoButtonActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
    "Image files", "jpg", "jpeg", "png"
    ));

int result = fileChooser.showOpenDialog(this);

if (result == JFileChooser.APPROVE_OPTION) {
    File selectedPhoto = fileChooser.getSelectedFile();
    try {
        // Read the image
        BufferedImage img = ImageIO.read(selectedPhoto);

        // Resize the image smoothly to fit the label
        Image scaledImage = img.getScaledInstance(120, 140, Image.SCALE_SMOOTH);

        // Set the scaled image into the JLabel
        photoLabel.setIcon(new ImageIcon(scaledImage));

        // Display the image path in the JTextField
        photoTextField.setText(selectedPhoto.getAbsolutePath());

        // Optional success message
        JOptionPane.showMessageDialog(this, "Photo uploaded: " + selectedPhoto.getName());
        
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this,
            "Error loading image. Please try again.",
            "Image Upload Error",
            JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
}

    }//GEN-LAST:event_photoButtonActionPerformed

    private void photoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoTextFieldActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_photoTextFieldActionPerformed

    private void firstnameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTextfieldActionPerformed

    private void phoneFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFormattedTextFieldActionPerformed

    private void coeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coeRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coeRadioButtonActionPerformed

    private void cosRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cosRadioButtonActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegistrationLabel;
    private javax.swing.JLabel age;
    private javax.swing.JSpinner ageSpinner;
    private javax.swing.JRadioButton coeRadioButton;
    private javax.swing.ButtonGroup collegeButtonGroup;
    private javax.swing.JComboBox<String> continentComboBox;
    private javax.swing.JRadioButton cosRadioButton;
    private javax.swing.JTextArea experienceTextArea;
    private javax.swing.JLabel firstname;
    private javax.swing.JTextField firstnameTextfield;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField phoneFormattedTextField;
    private javax.swing.JLabel phoneLabel1;
    private javax.swing.JLabel phoneLabel2;
    private javax.swing.JButton photoButton;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JTextField photoTextField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
