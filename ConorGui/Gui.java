import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Gui extends JFrame{

    //member variables
    public static final int WIDTH = 600;
    public static final int HEIGHT = 300;
    Container contentPane;
    
    /**
     * Default constructor
     */
    public Gui(){
        super();
    
        //Bunch of setup garbage 
        setSize(WIDTH, HEIGHT);
		setTitle("Conor's Exam Question");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
        
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        TextArea outputArea = new TextArea(); //new blank output box

        JPanel inputPanel = new JPanel(); //new panel to store input stuff
        inputPanel.setLayout(new FlowLayout()); 

        JTextField inputBox = new JTextField("..."); //input box with some default text
        inputBox.setPreferredSize(new Dimension(200,20)); //sets inputbox size so it not smol

        JButton inputButton = new JButton("Enter"); //input button with Enter text
        inputButton.addActionListener(listen->outputArea.append(inputBox.getText()+"\n")); //adds functionality to button

        inputPanel.add(inputButton);
        inputPanel.add(inputBox);

        contentPane.add(inputPanel);
        //comment
        contentPane.add(outputArea);
    }
    
    //this is main btw
    public static void main(String[] args){
        Gui gui = new Gui();
        gui.setVisible(true);
    }
}