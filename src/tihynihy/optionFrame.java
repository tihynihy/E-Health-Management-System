package tihynihy;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class optionFrame extends JFrame implements ActionListener {

    JFrame frame;
    JButton toMainButton;
    JButton detailsButton;


    public optionFrame(){

        frame = new JFrame();

        detailsButton = new JButton("DETAILS");
        detailsButton.setBounds(60,200,100,30);
        detailsButton.setFocusable(false);
        detailsButton.addActionListener(this);

        toMainButton = new JButton("MAIN");
        toMainButton.setBounds(60,250,100,30);
        toMainButton.setFocusable(false);
        toMainButton.addActionListener(this);

        JTextField nameField = new JTextField(" Name: Amira Omerspahić");
        nameField.setBounds(350,70,200,30);
        nameField.setEditable(false);



        JTextField ageField = new JTextField("Age : 66");
        ageField.setBounds(350,110,200,30);
        ageField.setEditable(false);



        JTextField placeField = new JTextField("Sarajevo , Center");
        placeField.setBounds(350,150,200,30);
        placeField.setEditable(false);




        JTextField genderField = new JTextField(" Gender: Female");
        genderField.setBounds(350,190,200,30);
        genderField.setEditable(false);




        JTextField idField = new JTextField(" ID: 200302200");
        idField.setBounds(350,230,200,30);
        idField.setEditable(false);




        JTextField birthField = new JTextField(" Date of birth: 12.11.1955");
        birthField.setBounds(350,270,200,30);
        birthField.setEditable(false);




        Border blackBorder = BorderFactory.createLineBorder(Color.BLACK,2);



        ImageIcon avatar = new ImageIcon("patientImage/amiraOmerspahicImage.jpg");
        Image logoImage = avatar.getImage();
        Image modifiedLogoImage = logoImage.getScaledInstance(130,130, Image.SCALE_SMOOTH);
        avatar = new ImageIcon(modifiedLogoImage);




        ImageIcon cantonLogo = new ImageIcon("imageMaterials/kantonLogo.png");
        Image cantonImage = cantonLogo.getImage();
        Image modifiedCantonImage = cantonImage.getScaledInstance(150,90, Image.SCALE_SMOOTH);
        cantonLogo = new ImageIcon(modifiedCantonImage);


        JLabel cantonLabel = new JLabel();
        cantonLabel.setBounds(35,300,150,90);
        cantonLabel.setIcon(cantonLogo);
        


        JLabel patientImage = new JLabel();
        patientImage.setBounds(55,30,130,130);
        patientImage.setIcon(avatar);
        patientImage.setBorder(blackBorder);



        JPanel optionPanel = new JPanel();
        optionPanel.setLayout(null);
        optionPanel.setBounds(0,0,250,500);
        optionPanel.setBackground(new Color(226, 208, 47));
        optionPanel.add(patientImage);
        optionPanel.add(toMainButton);
        optionPanel.add(detailsButton);
        optionPanel.add(cantonLabel);




        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(0,0,800,500);
        mainPanel.setBackground(new Color(22, 100, 231));

        mainPanel.add(optionPanel);
        mainPanel.add(nameField);
        mainPanel.add(ageField);
        mainPanel.add(placeField);
        mainPanel.add(genderField);
        mainPanel.add(idField);
        mainPanel.add(birthField);



        Image icon = Toolkit.getDefaultToolkit().getImage("imageMaterials/mainLogo.png");

        frame.setSize(650,500);
        frame.setTitle("E-HealthCare Dom Zdravlja Sarajevo");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setIconImage(icon);
        frame.add(mainPanel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==detailsButton){

            //detailsFrame

        }else if(e.getSource()==toMainButton){

            frame.dispose();

            mainFrame mainFrame = new mainFrame();
            mainFrame.setVisible(true);

        }
    }
}
