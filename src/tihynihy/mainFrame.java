package tihynihy;

import tihynihy.dataBase.AmiraOmerspahic;
import tihynihy.dataBase.DinoKermelic;
import tihynihy.dataBase.ElvedinMahtumic;
import tihynihy.dataBase.NerminaHasagic;
import tihynihy.dataBase.numericalDataBase;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainFrame extends JFrame implements ActionListener {

    JFrame frame;
    JButton confirmButton;
    JButton resetButton;
    JTextField idField;

    public mainFrame(){

        frame = new JFrame();

        ImageIcon logo = new ImageIcon("imageMaterials/mainLogo.png");
        Image logoImage = logo.getImage();
        Image modifiedLogoImage = logoImage.getScaledInstance(150,170, Image.SCALE_SMOOTH);
        logo = new ImageIcon(modifiedLogoImage);

        JLabel imageLabel = new JLabel("mainLogo.png");
        imageLabel.setLayout(null);
        imageLabel.setBounds(160,50,150,170);
        imageLabel.setIcon(logo);

        Image icon = Toolkit.getDefaultToolkit().getImage("imageMaterials/mainLogo.png");


        Border blueBorder = BorderFactory.createLineBorder(Color.BLUE, 2);

        idField = new JTextField();
        idField.setBounds( 120,250,230,28);
        idField.setBackground(Color.WHITE);
        idField.setBorder(blueBorder);


        confirmButton = new JButton("CONFIRM");
        confirmButton.setBounds(250,325,100,25);
        confirmButton.setBackground(Color.WHITE);
        confirmButton.setFocusable(false);
        confirmButton.addActionListener(this);


        resetButton = new JButton("RESET");
        resetButton.setBounds(120,325,100,25);
        resetButton.setBackground(Color.WHITE);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(0,0,500,500);
        mainPanel.setBackground(new Color(22, 100, 231));


        mainPanel.add(confirmButton);
        mainPanel.add(resetButton);
        mainPanel.add(idField);
        mainPanel.add(imageLabel);



        frame.setSize(500,500);
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

        if(e.getSource().equals(resetButton)){



            idField.setText(null);



        }else if(e.getSource()==confirmButton){


            numericalDataBase numericalDataBase = new numericalDataBase();




            if(idField.getText().equals(numericalDataBase.getAmiraOmerspahic())){



                frame.dispose();
                AmiraOmerspahic amiraOmerspahicFrame = new AmiraOmerspahic();
                amiraOmerspahicFrame.setVisible(true);



            } else if(idField.getText().equals(numericalDataBase.getDinoKermelic())){



                frame.dispose();
                DinoKermelic dinoKermelicFrame = new DinoKermelic();
                dinoKermelicFrame.setVisible(true);



            } else if (idField.getText().equals(numericalDataBase.getElvedinMahtumic())){



                frame.dispose();
                ElvedinMahtumic elvedinMahtumicFrame = new ElvedinMahtumic();
                elvedinMahtumicFrame.setVisible(true);



            } else if(idField.getText().equals(numericalDataBase.getNerminaHasagic())){



                NerminaHasagic nerminaHasagicFrame = new NerminaHasagic();
                nerminaHasagicFrame.setVisible(true);



            }
        }
    }
}
