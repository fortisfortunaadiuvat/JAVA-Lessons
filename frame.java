/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson29;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author hakan
 */
public class Lesson29 extends JFrame{

    JLabel namelabel,streetlabel,statelabel,datelabel,agelabel,sexlabel,
            optionlabel,aboutlabel ;
    JTextField nametext,streetext ;
    JComboBox statelist;
    JSpinner datespin;
    JSlider ageslider;
    ButtonGroup sexgroup;
    JRadioButton maleradio,femaleradio;
    JCheckBox morningcheck,afterncheck,eveningcheck;
    JTextArea aboutyou;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    Lesson29(){
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Random Layout");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        
        namelabel = new JLabel("Name:");
        addComp(panel,namelabel,0,0,1,1,GridBagConstraints.EAST,GridBagConstraints.NONE);
        
        nametext = new JTextField(30);
        addComp(panel,nametext,0,0,2,1,GridBagConstraints.WEST,GridBagConstraints.NONE);
        
        streetlabel = new JLabel("Street:");
        addComp(panel,namelabel,0,1,1,1,GridBagConstraints.EAST,GridBagConstraints.NONE);
        
        streetext = new JTextField(30);
        addComp(panel,namelabel,0,1,2,1,GridBagConstraints.WEST,GridBagConstraints.NONE);
        
        Box sexbox = Box.createVerticalBox();
        maleradio = new JRadioButton("Male");
        femaleradio = new JRadioButton("Female");
        sexgroup = new ButtonGroup();
        sexgroup.add(maleradio);
        sexgroup.add(femaleradio);
        sexbox.add(maleradio);
        sexbox.add(femaleradio);
        sexbox.setBorder(BorderFactory.createTitledBorder("Sex"));
        addComp(panel,namelabel,3,0,2,1,GridBagConstraints.WEST,GridBagConstraints.NONE);
        
        JPanel statepanel = new JPanel();
        statepanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,0));
        statelabel = new JLabel("State:");
        statepanel.add(statelabel);
        
        String[] state = {"NY","PA","OH","WV"};
        statelist = new JComboBox(state);
        
        Date date = new Date();
        datespin = new JSpinner(new SpinnerDateModel(date,null,null,Calendar.DAY_OF_MONTH));
        
        JSpinner.DateEditor dateeditor = new JSpinner.DateEditor(datespin,"dd/MM/yy");
        datespin.add(dateeditor);
        statepanel.add(datespin);
        agelabel = new JLabel("Age:50");
        statepanel.add(agelabel);
        
        ageslider = new JSlider(1,99,50);
     
        Listenforslider lforslider = new Listenforslider();
        ageslider.addChangeListener(lforslider);
        
        addComp(panel,sexbox,1,2,5,1,GridBagConstraints.EAST,GridBagConstraints.NONE);
        
        Box optionbox = Box.createVerticalBox();
        morningcheck = new JCheckBox("Morning");
        afterncheck = new JCheckBox("Afternoon");
        eveningcheck = new JCheckBox("Evening");
        
        optionbox.add(morningcheck);
        optionbox.add(afterncheck);
        optionbox.add(eveningcheck);
        
        optionbox.setBorder(BorderFactory.createTitledBorder("Time of Day"));
        addComp(panel,optionbox,1,3,2,1,GridBagConstraints.NORTHWEST,GridBagConstraints.NONE);
        
        aboutyou = new JTextArea(6,40);
        aboutyou.setText("Tell about us you");
        aboutyou.setLineWrap(true);
        aboutyou.setWrapStyleWord(true);
        JScrollPane scrollbar = new JScrollPane(aboutyou,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        addComp(panel,scrollbar,2,3,3,1,GridBagConstraints.EAST,GridBagConstraints.NONE);
        
        
        this.add(panel);
        
        this.pack();
        this.setVisible(true); 
    }
            
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String[] args) {
        // TODO code application logic here
        new Lesson29();
    }
    
    private class Listenforslider implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            if(e.getSource() == ageslider){
                agelabel.setText("Age:" + ageslider.getValue());
            }
        }
        
    }
    
    private void addComp(JPanel panel,JComponent component,int x,int y,int width,int height,int place,int stretch){
        GridBagConstraints gridcons = new GridBagConstraints();
        
        gridcons.gridx = x;
        gridcons.gridy = y;
        gridcons.gridheight = width;
        gridcons.gridwidth = height;
        gridcons.weightx = 100;
        gridcons.weighty = 100;
        gridcons.insets = new Insets(5,5,5,5);
        gridcons.anchor = place;
        gridcons.fill = stretch;
        
        panel.add(component,gridcons);
    }
    
}
