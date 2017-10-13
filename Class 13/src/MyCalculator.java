import javax.swing.*;
import java.awt.event.*;
public class MyCalculator implements ActionListener{

	JFrame f;
	JTextField t;
	
	//Components
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,
	bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
	
	//variablies
	
	static double a =0, b=0, result =0;
	
	static int operator=0; // for the operation to perform
	
	//constructor
	{
	f = new JFrame("Calculator"); // set the title for the frame
	t = new JTextField(); //testField component
	
	//buttons to perform operations
	/*JButton b[] = new JButton[10];
	for(JButton i = 0; i<10; i++){
	
		b[i]= i;}*/
	
	
	
	b1 = new JButton("1");
	b2 = new JButton("2");
	b3 = new JButton("3");
	b4 = new JButton("4");
	b5 = new JButton("5");
	b6 = new JButton("6");
	b7 = new JButton("7");
	b8 = new JButton("8");
	b9 = new JButton("9");
	b0 = new JButton("0");
	
	//buttons to perform operations
	bdiv = new JButton("/");
	bmul = new JButton("*");
	bsub = new JButton("-");
	badd = new JButton("+");
	bdec = new JButton(".");
	beq = new JButton("=");
	bdel = new JButton("Delete");
	bclr = new JButton("Clear");

	//position and size of the components in the GUI
	
	//row 1
	t.setBounds(30,40,280,30);//position and the size of the textField component
	b7.setBounds(40,100,50,40);
	b8.setBounds(110,100,50,40);
	b9.setBounds(180,100,50,40);
	bdiv.setBounds(250,100,50,40);
	
	//row 2
	b4.setBounds(40,170,50,40);
	b5.setBounds(110,170,50,40);
	b6.setBounds(180,170,50,40);
	bmul.setBounds(250,170,50,40);
	
	//row 3
	b1.setBounds(40,240,50,40);
	b2.setBounds(110,240,50,40);
	b3.setBounds(180,240,50,40);
	bsub.setBounds(250,240,50,40);
	
	//row 4
	bdec.setBounds(40,310,50,40);
	b0.setBounds(110,310,50,40);
	beq.setBounds(180,310,50,40);
	badd.setBounds(250,310,50,40);
	
	//row 5
	bdel.setBounds(60,380,100,40);
	bclr.setBounds(180,380,100,40);
	
	//add the components to the frame
	f.add(t); //add the textField component
	
	//row 1
	f.add(b7);
	f.add(b8);
	f.add(b9);
	f.add(bdiv);
	//row2
	f.add(b4);
	f.add(b5);
	f.add(b6);
	f.add(bmul);
	//row 3
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(bsub);
	//row 4
	f.add(bdec);
	f.add(b0);
	f.add(beq);
	f.add(badd);
	//row 5
	f.add(bdel);
	f.add(bclr);
	
	//setting of component
	f.setLayout(null);//tell the compiler to not use the default setting
	
	f.setVisible(true);
	f.setSize(350,500);//set the height and width for the frame
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	f.setResizable(false);
	
	//Action Listeners
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b0.addActionListener(this);
	
	bdiv.addActionListener(this);
	bmul.addActionListener(this);
	bsub.addActionListener(this);
	badd.addActionListener(this);
	bdec.addActionListener(this);
	beq.addActionListener(this);
	bdel.addActionListener(this);
	bclr.addActionListener(this);	
}

public void actionPerformed(ActionEvent e){
	
	if(e.getSource()==b1)
		t.setText(t.getText().concat("1"));
	if(e.getSource()==b2)
		t.setText(t.getText().concat("2"));
	if(e.getSource()==b3)
		t.setText(t.getText().concat("3"));
	if(e.getSource()==b4)
		t.setText(t.getText().concat("4"));
	if(e.getSource()==b5)
		t.setText(t.getText().concat("5"));
	if(e.getSource()==b6)
		t.setText(t.getText().concat("6"));
	if(e.getSource()==b7)
		t.setText(t.getText().concat("7"));
	if(e.getSource()==b8)
		t.setText(t.getText().concat("8"));
	if(e.getSource()==b9)
		t.setText(t.getText().concat("9"));
	if(e.getSource()==b0)
		t.setText(t.getText().concat("0"));

	//setting for the operator
	if(e.getSource()==badd){
		a= Double.parseDouble(t.getText());
		operator = 1;
		t.setText("");}
	if(e.getSource()==bmul){
		a= Double.parseDouble(t.getText());
		operator = 3;
		t.setText("");}
	if(e.getSource()==bsub){
		a= Double.parseDouble(t.getText());
		operator = 2;
		t.setText("");}
	if(e.getSource()==bdiv){
		a= Double.parseDouble(t.getText());
		operator = 4;
		t.setText("");}
	
	if(e.getSource()==bdec){
		t.setText(t.getText().concat("."));
		operator = 3;}
	
	if(e.getSource()==beq){
		b= Double.parseDouble(t.getText());
		switch(operator){
		case 1: result = a+b;
		break;
		case 2: result = a-b;
		break;
		case 3: result = a*b;
		break;
		case 4: result = a/b;
		break;
		default: result =0;
		}
		t.setText(""+result);
		}
	if(e.getSource()==bdel){
		String s = t.getText();
		t.setText("");}
	
	if(e.getSource()==bclr){
		t.setText("");}
}



public static void main(String[] args)
{
	
	new MyCalculator();
	
}
}