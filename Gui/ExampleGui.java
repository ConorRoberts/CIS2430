
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Conor extends JFrame
{
	
	public static final int WIDTH = 600;
	public static final int HEIGHT = 500;
	Container contentPane;
	TextField modelText;

	public Conor()
	{
		super();
		setUpSize();
		setMainContainer();

	}

	private void setUpSize(){
		setSize(WIDTH, HEIGHT);
		setTitle("Conor Roberts's GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}


	private void setMainContainer(){
		contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        JLabel theLabel = new JLabel("This is a label on the main content pane");
        contentPane.add(theLabel, BorderLayout.PAGE_START);
        contentPane.add(firstPanel(), BorderLayout.CENTER);
	}

	private JTextArea(){
     	JPanel thePanel = new JPanel();
		thePanel.setLayout(new BoxLayout(thePanel, BoxLayout.PAGE_AXIS));
		JLabel l = new JLabel("Using Lambda Listeners");
		thePanel.add(l);
		thePanel.add(interactWithGamePanel());
		thePanel.add(userInputPanel());

		return thePanel;
	}

	private JPanel interactWithGamePanel(){
		JPanel gamePanel = new JPanel();
		gamePanel.setLayout(new FlowLayout());
		modelText = new TextField(myC.getStringVal());
		gamePanel.add(modelText);
		JButton modelButton = new JButton("set string value to dinosaur");
		modelButton.addActionListener(myListener->updateString("dinosaur"));
		gamePanel.add(modelButton);
		return gamePanel;
	}

	private JPanel userInputPanel(){
		JPanel aPanel = new JPanel();
		aPanel.setLayout(new FlowLayout());
		JLabel showMe = new JLabel("your text will show up here");
		aPanel.add(showMe);
		JTextField editMe = new JTextField("you can type text here");
		editMe.addActionListener(ev->editFromUser(editMe, showMe));
		aPanel.add(editMe);
		aPanel.setBorder(BorderFactory.createLineBorder(Color.GREEN)); 

		return aPanel;

	}
	private void editFromUser(JTextField field, JLabel output){
		String userIn = field.getText();
		output.setText(userIn);
		field.setText("");

	}

	private void updateString(String val){
		myC.update(0, val);
		modelText.setText(myC.getStringVal());
	}


	public static void main(String[] args){
		Conor conor = new Conor();
		conor.setVisible(true);
	}
}