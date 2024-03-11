import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import JAVA.ExpressionEvaluator;

public class Calculator implements ActionListener{
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton zeroButton;
    JButton dotButton;
    JButton eButton;
    JButton ACButton;
    JButton delButton;
    JButton percentageButton;
    JButton divitionButton;
    JButton multiplicationButton;
    JButton subtractionButton;
    JButton additionButton;
    JButton equalsButton;
    Boolean operatorPressed;
    JFrame jf;
    JLabel displayLabel;
    int numOfOperator=0;




    Calculator(){
    jf=new JFrame();
    jf.setSize(350,520);
    jf.setLayout(null);
    jf.setLocation(1200,150);
    displayLabel=new JLabel("0");
    displayLabel.setBounds(30,30,270,50);
    displayLabel.setOpaque(true);
    displayLabel.setBackground(java.awt.Color.black);
    displayLabel.setForeground(Color.WHITE);
    displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);

    sevenButton=new JButton("7");
    eightButton=new JButton("8");
    nineButton=new JButton("9");
    fourButton=new JButton("4");
    fiveButton=new JButton("5");
    sixButton=new JButton("6");
    oneButton=new JButton("1");
    twoButton=new JButton("2");
    threeButton=new JButton("3");
    zeroButton=new JButton("0");
    dotButton=new JButton(".");
    eButton=new JButton("E");
    ACButton=new JButton("AC");
    delButton=new JButton("Del");
    percentageButton=new JButton("%");
    divitionButton=new JButton("/");
    multiplicationButton=new JButton("*");
    subtractionButton=new JButton("-");
    additionButton=new JButton("+");
    equalsButton=new JButton("=");
    operatorPressed=false;

    ACButton.setBounds(30,100,60,60);ACButton.setFont(new Font("Arial", Font.PLAIN, 18));ACButton.addActionListener(this);
    sevenButton.setBounds(30,170,60,60);sevenButton.setFont(new Font("Arial", Font.PLAIN, 20));sevenButton.addActionListener(this);
    fourButton.setBounds(30,240,60,60);fourButton.setFont(new Font("Arial", Font.PLAIN, 20));fourButton.addActionListener(this);
    oneButton.setBounds(30, 310, 60, 60);oneButton.setFont(new Font("Arial", Font.PLAIN, 20));oneButton.addActionListener(this);
    eButton.setBounds(30,380,60,60);eButton.setFont(new Font("Arial", Font.PLAIN, 20));//eButton.addActionListener(this);


    delButton.setBounds(100,100,60,60);delButton.setFont(new Font("Arial", Font.PLAIN, 17));delButton.addActionListener(this);
    eightButton.setBounds(100,170,60,60);eightButton.setFont(new Font("Arial", Font.PLAIN, 20));eightButton.addActionListener(this);
    fiveButton.setBounds(100,240,60,60);fiveButton.setFont(new Font("Arial", Font.PLAIN, 20));fiveButton.addActionListener(this);
    twoButton.setBounds(100, 310, 60, 60);twoButton.setFont(new Font("Arial", Font.PLAIN, 20));twoButton.addActionListener(this);
    zeroButton.setBounds(100,380,60,60);zeroButton.setFont(new Font("Arial", Font.PLAIN, 20));zeroButton.addActionListener(this);

    percentageButton.setBounds(170,100,60,60);percentageButton.setFont(new Font("Arial", Font.PLAIN, 20));percentageButton.addActionListener(this);
    nineButton.setBounds(170,170,60,60);nineButton.setFont(new Font("Arial", Font.PLAIN, 20));nineButton.addActionListener(this);
    sixButton.setBounds(170,240,60,60);sixButton.setFont(new Font("Arial", Font.PLAIN, 20));sixButton.addActionListener(this);
    threeButton.setBounds(170, 310, 60, 60);threeButton.setFont(new Font("Arial", Font.PLAIN, 20));threeButton.addActionListener(this);
    dotButton.setBounds(170,380,60,60);dotButton.setFont(new Font("Arial", Font.PLAIN, 30));dotButton.addActionListener(this);


    divitionButton.setBounds(240,100,60,60);divitionButton.setFont(new Font("Arial", Font.PLAIN, 20));divitionButton.addActionListener(this);
    multiplicationButton.setBounds(240,170,60,60);multiplicationButton.setFont(new Font("Arial", Font.PLAIN, 25));multiplicationButton.addActionListener(this);
    subtractionButton.setBounds(240,240,60,60);subtractionButton.setFont(new Font("Arial", Font.PLAIN, 30));subtractionButton.addActionListener(this);
    additionButton.setBounds(240, 310, 60, 60);additionButton.setFont(new Font("Arial", Font.PLAIN, 20));additionButton.addActionListener(this);
    equalsButton.setBounds(240,380,60,60);equalsButton.setFont(new Font("Arial", Font.PLAIN, 25));equalsButton.addActionListener(this);

    
    jf.add(displayLabel);
    jf.add(zeroButton);
    jf.add(oneButton);
    jf.add(twoButton);
    jf.add(threeButton);
    jf.add(fourButton);
    jf.add(fiveButton);
    jf.add(sixButton);
    jf.add(sevenButton);
    jf.add(eightButton);
    jf.add(nineButton);
    jf.add(ACButton);
    jf.add(delButton);
    jf.add(percentageButton);
    jf.add(eButton);
    jf.add(dotButton);
    jf.add(divitionButton);
    jf.add(multiplicationButton);
    jf.add(subtractionButton);
    jf.add(additionButton);
    jf.add(equalsButton);


    jf.setVisible(true);
    jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
}

public static void main(String[] args) {
    new  Calculator();
    

}

@Override
public void actionPerformed(ActionEvent e) {
    


    // TODO Auto-generated method stub
    if(e.getSource()==zeroButton){
        displayLabel.setText(displayLabel.getText()+zeroButton.getText());operatorPressed=false;
    }else if(e.getSource()==oneButton){displayLabel.setText(displayLabel.getText()+oneButton.getText());operatorPressed=false;
    }else if(e.getSource()==twoButton){displayLabel.setText(displayLabel.getText()+twoButton.getText());operatorPressed=false;
    }else if(e.getSource()==threeButton){displayLabel.setText(displayLabel.getText()+threeButton.getText());operatorPressed=false;
    }else if(e.getSource()==fourButton){displayLabel.setText(displayLabel.getText()+fourButton.getText());operatorPressed=false;
    }else if(e.getSource()==fiveButton){displayLabel.setText(displayLabel.getText()+fiveButton.getText());operatorPressed=false;
    }else if(e.getSource()==sixButton){displayLabel.setText(displayLabel.getText()+sixButton.getText());operatorPressed=false;
    }else if(e.getSource()==sevenButton){displayLabel.setText(displayLabel.getText()+sevenButton.getText());operatorPressed=false;
    }else if(e.getSource()==eightButton){displayLabel.setText(displayLabel.getText()+eightButton.getText());operatorPressed=false;
    }else if(e.getSource()==nineButton){displayLabel.setText(displayLabel.getText()+nineButton.getText());operatorPressed=false;
    }else if(e.getSource()==dotButton){
        if(!(Character.toString(displayLabel.getText().charAt(displayLabel.getText().length()-1)).equals(dotButton.getText()))) {
            displayLabel.setText(displayLabel.getText()+dotButton.getText());}
    }else if(e.getSource()==additionButton){
        if(!operatorPressed){
        if (!(Character.toString(displayLabel.getText().charAt(displayLabel.getText().length()-1)).equals(additionButton.getText()))) {
            numOfOperator+=1;
            if(numOfOperator>=2){displayLabel.setText(""+processString(displayLabel.getText()));numOfOperator=1;}
        displayLabel.setText(displayLabel.getText()+additionButton.getText());}
        operatorPressed=true;}
        
    }else if(e.getSource()==subtractionButton){
        if(!operatorPressed){
            if (!(Character.toString(displayLabel.getText().charAt(displayLabel.getText().length()-1)).equals(subtractionButton.getText()))) {
                numOfOperator+=1;
            if(numOfOperator==2){displayLabel.setText(""+processString(displayLabel.getText()));numOfOperator=1;}
                displayLabel.setText(displayLabel.getText()+subtractionButton.getText());}
            operatorPressed=true;}
        
    }else if(e.getSource()==multiplicationButton){
        if(!operatorPressed){
            if (!(Character.toString(displayLabel.getText().charAt(displayLabel.getText().length()-1)).equals(multiplicationButton.getText()))) {
                numOfOperator+=1;
            if(numOfOperator==2){displayLabel.setText(""+processString(displayLabel.getText()));numOfOperator=1;}
                displayLabel.setText(displayLabel.getText()+multiplicationButton.getText());}
            operatorPressed=true;}
        
    }else if(e.getSource()==divitionButton){
        if(!operatorPressed){
            if (!(Character.toString(displayLabel.getText().charAt(displayLabel.getText().length()-1)).equals(divitionButton.getText()))) {
                numOfOperator+=1;
            if(numOfOperator==2){displayLabel.setText(""+processString(displayLabel.getText()));numOfOperator=1;}
                displayLabel.setText(displayLabel.getText()+divitionButton.getText());}
            operatorPressed=true;}
        
    }else if(e.getSource()==percentageButton){
        if(!operatorPressed){
            if (!(Character.toString(displayLabel.getText().charAt(displayLabel.getText().length()-1)).equals(percentageButton.getText()))) {
                displayLabel.setText(""+(processString(displayLabel.getText())/100));}
            operatorPressed=false;}
        
    }else if(e.getSource()==eButton){
        if (!(Character.toString(displayLabel.getText().charAt(displayLabel.getText().length()-1)).equals(eButton.getText()))) {
            displayLabel.setText(displayLabel.getText()+eButton.getText());}
    }else if(e.getSource()==delButton){displayLabel.setText(displayLabel.getText().substring(0, displayLabel.getText().length() - 1));operatorPressed=false;
    }else if(e.getSource()==equalsButton){displayLabel.setText(""+processString(displayLabel.getText()));operatorPressed=false;numOfOperator=0;
    }else if(e.getSource()==ACButton){displayLabel.setText("0");operatorPressed=false;numOfOperator=0;
    }
    // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
}

public static double processString(String displayLabelString){
    if(displayLabelString.charAt(displayLabelString.length()-1)=='+'){displayLabelString=displayLabelString.substring(0, displayLabelString.length()- 1);
    }else if(displayLabelString.charAt(displayLabelString.length()-1)=='-'){displayLabelString=displayLabelString.substring(0, displayLabelString.length()- 1);
    }else if(displayLabelString.charAt(displayLabelString.length()-1)=='*'){displayLabelString=displayLabelString.substring(0, displayLabelString.length()- 1);
    }else if(displayLabelString.charAt(displayLabelString.length()-1)=='/'){displayLabelString=displayLabelString.substring(0, displayLabelString.length()- 1);}
    ExpressionEvaluator ee=new ExpressionEvaluator();
    return(ee.evaluateExpression(displayLabelString));
}
}
