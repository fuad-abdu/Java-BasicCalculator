import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	boolean isOperatorClicked = false;
	
	boolean plusOperation= false;
	boolean minusOperation= false;
	boolean multiplicationOperation= false;
	boolean divisionOperation= false;
	
	float number1,number2;
	float result;
	
	String oldValue = "";
	String newValue = "";
	
	String description = "";
	
	JFrame jf;
	JLabel displayLabel;
	JLabel descriptionLabel;
	
	JButton sevenBtn;
	JButton eightBtn;
	JButton nineBtn;
	JButton fourBtn;
	JButton fiveBtn;
	JButton sixBtn;
	JButton oneBtn;
	JButton twoBtn;
	JButton threeBtn;
	JButton zeroBtn;
	JButton dotBtn;
	
	JButton clearBtn;

	JButton plusBtn;
	JButton minusBtn;
	JButton multiplicationBtn;
	JButton divisionBtn;
	
	JButton equaltoBtn;
	

	public Calculator() {
		jf = new JFrame("My Calculator");
		jf.setLayout(null);
		jf.setSize(310, 385);
		jf.setLocation(100, 100);
		jf.getContentPane().setBackground(Color.black);
		
//		Display Field
		
		descriptionLabel = new JLabel();
		descriptionLabel.setBounds(10, 10, 290, 25);
		descriptionLabel.setBackground(Color.darkGray);
		descriptionLabel.setForeground(Color.lightGray);
		descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		descriptionLabel.setOpaque(true);
		descriptionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		jf.add(descriptionLabel);
		
		displayLabel = new JLabel("  ");
		displayLabel.setBounds(10, 35, 290, 50);
		displayLabel.setBackground(Color.darkGray);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Arial", Font.BOLD, 16));
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		jf.add(displayLabel);
		
		
		
//		Display Field		
		
//		Number Buttons
		
		sevenBtn = new JButton("7");
		sevenBtn.setBounds(10, 105, 45, 45);
		sevenBtn.setBackground(Color.white);
		sevenBtn.setFont(new Font("Arial", Font.BOLD, 16));
		sevenBtn.addActionListener(this);
		jf.add(sevenBtn);
		
		eightBtn = new JButton("8");
		eightBtn.setBounds(70, 105, 45, 45);
		eightBtn.setBackground(Color.white);
		eightBtn.setFont(new Font("Arial", Font.BOLD, 16));
		eightBtn.addActionListener(this);
		jf.add(eightBtn);
		
		nineBtn = new JButton("9");
		nineBtn.setBounds(130, 105, 45, 45);
		nineBtn.setBackground(Color.white);
		nineBtn.setFont(new Font("Arial", Font.BOLD, 16));
		nineBtn.addActionListener(this);
		jf.add(nineBtn);
		
		fourBtn = new JButton("4");
		fourBtn.setBounds(10, 165, 45, 45);
		fourBtn.setBackground(Color.white);
		fourBtn.setFont(new Font("Arial", Font.BOLD, 16));
		fourBtn.addActionListener(this);
		jf.add(fourBtn);
		
		fiveBtn = new JButton("5");
		fiveBtn.setBounds(70, 165, 45, 45);
		fiveBtn.setBackground(Color.white);
		fiveBtn.setFont(new Font("Arial", Font.BOLD, 16));
		fiveBtn.addActionListener(this);
		jf.add(fiveBtn);
		
		sixBtn = new JButton("6");
		sixBtn.setBounds(130, 165, 45, 45);
		sixBtn.setBackground(Color.white);
		sixBtn.setFont(new Font("Arial", Font.BOLD, 16));
		sixBtn.addActionListener(this);
		jf.add(sixBtn);
		
		oneBtn = new JButton("1");
		oneBtn.setBounds(10, 225, 45, 45);
		oneBtn.setBackground(Color.white);
		oneBtn.setFont(new Font("Arial", Font.BOLD, 16));
		oneBtn.addActionListener(this);
		jf.add(oneBtn);
		
		twoBtn = new JButton("2");
		twoBtn.setBounds(70, 225, 45, 45);
		twoBtn.setBackground(Color.white);
		twoBtn.setFont(new Font("Arial", Font.BOLD, 16));
		twoBtn.addActionListener(this);
		jf.add(twoBtn);
		
		threeBtn = new JButton("3");
		threeBtn.setBounds(130, 225, 45, 45);
		threeBtn.setBackground(Color.white);
		threeBtn.setFont(new Font("Arial", Font.BOLD, 16));
		threeBtn.addActionListener(this);
		jf.add(threeBtn);
		
		zeroBtn = new JButton("0");
		zeroBtn.setBounds(10, 285, 105, 45);
		zeroBtn.setBackground(Color.white);
		zeroBtn.setFont(new Font("Arial", Font.BOLD, 16));
		zeroBtn.addActionListener(this);
		jf.add(zeroBtn);
		
		dotBtn = new JButton(".");
		dotBtn.setBounds(130, 285, 45, 45);
		dotBtn.setBackground(Color.white);
		dotBtn.setFont(new Font("Arial", Font.BOLD, 16));
		dotBtn.addActionListener(this);
		jf.add(dotBtn);
		
//		Number Buttons
		
//		Functions Buttons
		
		plusBtn = new JButton("+");
		plusBtn.setBounds(190, 165, 45, 45);
		plusBtn.setBackground(Color.ORANGE);
		plusBtn.setFont(new Font("Arial", Font.BOLD, 13));
		plusBtn.addActionListener(this);
		jf.add(plusBtn);
		
		minusBtn = new JButton("-");
		minusBtn.setBounds(250, 165, 45, 45);
		minusBtn.setBackground(Color.ORANGE);
		minusBtn.setFont(new Font("Arial", Font.BOLD, 16));
		minusBtn.addActionListener(this);
		jf.add(minusBtn);
		
		multiplicationBtn = new JButton("x");
		multiplicationBtn.setBounds(190, 225, 45, 45);
		multiplicationBtn.setBackground(Color.ORANGE);
		multiplicationBtn.setFont(new Font("Arial", Font.BOLD, 16));
		multiplicationBtn.addActionListener(this);
		jf.add(multiplicationBtn);
		
		divisionBtn = new JButton("÷");
		divisionBtn.setBounds(250, 225, 45, 45);
		divisionBtn.setBackground(Color.ORANGE);
		divisionBtn.setFont(new Font("Arial", Font.BOLD, 13));
		divisionBtn.addActionListener(this);
		jf.add(divisionBtn);
		
		clearBtn = new JButton("C");
		clearBtn.setBounds(190, 105, 105, 45);
		clearBtn.setBackground(Color.ORANGE);
		clearBtn.setFont(new Font("Arial", Font.BOLD, 16));
		clearBtn.addActionListener(this);
		jf.add(clearBtn);
		
		equaltoBtn = new JButton("=");
		equaltoBtn.setBounds(190, 285, 105, 45);
		equaltoBtn.setBackground(Color.ORANGE);
		equaltoBtn.setFont(new Font("Arial", Font.BOLD, 16));
		equaltoBtn.addActionListener(this);
		jf.add(equaltoBtn);
		
//		Functions Buttons
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sevenBtn) {
		
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
		}else if(e.getSource() == eightBtn) {	
			
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}

			
		}else if(e.getSource() == nineBtn) {
			
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
			
		}else if(e.getSource() == fourBtn) {
			
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
			
		}else if(e.getSource() == fiveBtn) {
			
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
			
			
		}else if(e.getSource() == sixBtn) {
			
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
			
		}else if(e.getSource() == oneBtn) {
			
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
			
		}else if(e.getSource() == twoBtn) {
			
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
			
		}else if(e.getSource() ==  threeBtn) {
			
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
			
		}else if(e.getSource() ==  zeroBtn) {
			
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
		}else if(e.getSource() ==  dotBtn) {
			
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
				
			
		}else if(e.getSource() ==  clearBtn) {
			
			displayLabel.setText("");
			descriptionLabel.setText("");
			oldValue = "";
			newValue = "";
			description="";
			
		}else if(e.getSource() ==  plusBtn) {
			
			isOperatorClicked = true;
			plusOperation = true;
			
			if(oldValue == "") {
				oldValue = displayLabel.getText();
				description = description+oldValue+"+";
	
			}else {
				
			}
			
			descriptionLabel.setText(description);
			
		}else if(e.getSource() ==  minusBtn) {
			
			isOperatorClicked = true;
			minusOperation = true;
			
			if(oldValue == "") {
				oldValue = displayLabel.getText();
				description = description+oldValue+"-";
				
			}else {
				
			}
			
			descriptionLabel.setText(description);
			
		}else if(e.getSource() ==  multiplicationBtn) {
			
			isOperatorClicked = true;
			multiplicationOperation = true;
			
			if(oldValue == "") {
				oldValue = displayLabel.getText();
				description = description+oldValue+"x";
				
			}else {
				
			}
			
			descriptionLabel.setText(description);
			
		}else if(e.getSource() ==  divisionBtn) {
			
			isOperatorClicked = true;
			
			divisionOperation = true;
			
			if(oldValue == "") {
				oldValue = displayLabel.getText();
				description = description+oldValue+"÷";
				
			}else {
			
			}
			
			descriptionLabel.setText(description);
			
		}else if(e.getSource() ==  equaltoBtn) {
			
			newValue = displayLabel.getText();
			
			descriptionLabel.setText(description+newValue);
			
			number1 = Float.parseFloat(oldValue);
			number2 = Float.parseFloat(newValue);
			
			if(plusOperation) {
				result = number1+number2;
				plusOperation = false;
			}else if(minusOperation) {
				result = number1-number2;
				minusOperation = false;
			}else if(multiplicationOperation) {
				result = number1*number2;
				multiplicationOperation = false;
			}else if(divisionOperation) {
				result = number1/number2;
				divisionOperation = false;
			}
			
			displayLabel.setText(""+result);
			
			description = "";
			oldValue = "";
			newValue = "";
		}
	
	}
	
} 
