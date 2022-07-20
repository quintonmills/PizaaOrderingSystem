import java.awt.event.*;

import javax.swing.*;

class MomAndPopPizzeria extends JFrame implements ActionListener

{

private JLabel nameLabel;

private JLabel passwordLabel;

private JLabel paymentModeLabel;

private JLabel amountLabel;

private JLabel menuItemsLabel;

private JLabel pizzaToppingsLabel;

private JLabel crustOptionsLabel;

private JLabel beveragesLabel;  

  

private JTextField nameTextfield;

private JTextField passwordTextfield;

private JTextField amountTextfield;

  

private ButtonGroup paymentModeBG;

private JRadioButton cashJRB;

private JRadioButton checksJRB;  

private JRadioButton creditCardJRB;

  

private ButtonGroup pizzaSizeBG;

private JRadioButton smallJRB;

private JRadioButton mediumJRB;

private JRadioButton largeJRB;

private JRadioButton extraLargeJRB;  

  
//8 pizza topping items
private JCheckBox pepperoniJCB;

private JCheckBox sausageJCB;

private JCheckBox onionJCB;

private JCheckBox mushroomJCB;

  
//three crust options
private ButtonGroup crustOptionsBG;

private JRadioButton handTossedJRB;

private JRadioButton thinCrustJRB;

private JRadioButton deepDishJRB;

  
//5 beverages
private JCheckBox lemonTeaJCB;

private JCheckBox orangeJuiceJCB;

private JCheckBox dietPepsiJCB;

private JCheckBox hotChocolateJCB;

  

private JButton processOrderButton;

private JTextArea result;  

private JPanel customerPanel;

  

public MomAndPopPizzeria()

{

nameLabel = new JLabel("User: ");

passwordLabel = new JLabel("Password: ");

paymentModeLabel = new JLabel("Payment mode: ");

amountLabel = new JLabel("Amount Paid: $");

pizzaToppingsLabel = new JLabel("Pizza Toppings: \n");

menuItemsLabel = new JLabel("Menu Items: \n");

crustOptionsLabel = new JLabel("Crust: ");

beveragesLabel = new JLabel("Beverages: ");   

  

nameTextfield = new JTextField(20);

passwordTextfield = new JTextField(20);

amountTextfield = new JTextField(10);

  

checksJRB = new JRadioButton("Check");

creditCardJRB = new JRadioButton("Credit card");

cashJRB = new JRadioButton("Cash");

smallJRB = new JRadioButton("small");

mediumJRB = new JRadioButton("medium");

largeJRB = new JRadioButton("large");

extraLargeJRB = new JRadioButton("extra large");

handTossedJRB = new JRadioButton("hand tossed");

thinCrustJRB = new JRadioButton("thin crust");

deepDishJRB = new JRadioButton("deep dish");

  

pepperoniJCB = new JCheckBox("pepperoni @ $12.00");

sausageJCB = new JCheckBox("sausage @ $10.25");

onionJCB = new JCheckBox("onion @ $10.50");

mushroomJCB = new JCheckBox("mushroom @ $10.75");

lemonTeaJCB = new JCheckBox("Lemon tea @ $1.99");

orangeJuiceJCB = new JCheckBox("Orange Juice @ $2.99");

dietPepsiJCB = new JCheckBox("Diet pepsi @ $3.99");

hotChocolateJCB = new JCheckBox("Hot chocolate @ $4.99");   

  

processOrderButton = new JButton("Process Order");

result = new JTextArea(20, 25);

result.setEditable(false);

  

paymentModeBG = new ButtonGroup();   

paymentModeBG.add(cashJRB);

paymentModeBG.add(checksJRB);   

paymentModeBG.add(creditCardJRB);

  

pizzaSizeBG= new ButtonGroup();

pizzaSizeBG.add(smallJRB);

pizzaSizeBG.add(mediumJRB);

pizzaSizeBG.add(largeJRB);

pizzaSizeBG.add(extraLargeJRB);

  

crustOptionsBG = new ButtonGroup();   

crustOptionsBG.add(handTossedJRB);

crustOptionsBG.add(thinCrustJRB);   

crustOptionsBG.add(deepDishJRB);

  

customerPanel = new JPanel();

  

customerPanel.add(nameLabel);

customerPanel.add(nameTextfield);

customerPanel.add(passwordLabel);

customerPanel.add(passwordTextfield);

customerPanel.add(menuItemsLabel);

customerPanel.add(smallJRB);

customerPanel.add(mediumJRB);

customerPanel.add(largeJRB);

customerPanel.add(extraLargeJRB);

smallJRB.setSelected(true);

customerPanel.add(crustOptionsLabel);

customerPanel.add(handTossedJRB);

customerPanel.add(thinCrustJRB);

customerPanel.add(deepDishJRB);

customerPanel.add(pizzaToppingsLabel);

customerPanel.add(pepperoniJCB);

customerPanel.add(sausageJCB);

customerPanel.add(onionJCB);

customerPanel.add(mushroomJCB);

customerPanel.add(beveragesLabel);

customerPanel.add(lemonTeaJCB);

customerPanel.add(orangeJuiceJCB);

customerPanel.add(dietPepsiJCB);

customerPanel.add(hotChocolateJCB);


customerPanel.add(paymentModeLabel);

customerPanel.add(cashJRB);

customerPanel.add(checksJRB);

customerPanel.add(creditCardJRB);   

customerPanel.add(amountLabel);

customerPanel.add(amountTextfield);

cashJRB.setSelected(true);

  

customerPanel.add(processOrderButton);

  

customerPanel.add(result);

result.setVisible(false);

  

processOrderButton.addActionListener(this);  

  

  

add(customerPanel);

  

setTitle("Pizza Restaurant");

setSize(330, 800);

setVisible(true);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

  

@Override

public void actionPerformed(ActionEvent ae)

{   

double amount = 0;   

double bill = 0;

double change = 0;

int toppings = 0;

int beverages = 0;

String report = "";

  

try

{

amount = Double.parseDouble(amountTextfield.getText());  

report += "Order Details" + "\n";

  

if(smallJRB.isSelected())

{

report += "Pizza size: Small" + "\n";

bill += 10.99;   

}

else if(mediumJRB.isSelected())

{

report += "Pizza size: Medium" + "\n";

bill += 12.99;

}

else if(largeJRB.isSelected())

{

report += "Pizza size: Large" + "\n";

bill += 14.99;

}

else if(extraLargeJRB.isSelected())

{

report += "Pizza size: Extra large" + "\n";

bill += 16.99;

}

  

if(pepperoniJCB.isSelected())

{

toppings++;

report += "Topping # " + toppings + ": Pepperoni" + "\n";

bill += 1.00;

}

  

if(sausageJCB.isSelected())

{

toppings++;

report += "Topping # " + toppings + ": Sausage" + "\n";

bill += 1.25;

}

  

if(onionJCB.isSelected())

{

toppings++;

report += "Topping # " + toppings + ": Onion" + "\n";

bill += 1.50;

}

  

if(mushroomJCB.isSelected())

{

toppings++;

report += "Topping # " + toppings + ": Mushroom" + "\n";

bill += 1.75;

}

  

if(handTossedJRB.isSelected())

{

report += "Crust: " + toppings + ": Hand tossed" + "\n";

}

else if(thinCrustJRB.isSelected())

{

report += "Crust: " + toppings + ": Thin crust" + "\n";

}

else if(deepDishJRB.isSelected())

{

report += "Crust: " + toppings + ": Deep dish" + "\n";

}

  

if(lemonTeaJCB.isSelected())

{

beverages++;

report += "Beverage # " + beverages + ": Lemon tea" + "\n";

bill += 1.99;

}

  

if(orangeJuiceJCB.isSelected())

{

beverages++;

report += "Beverage # " + beverages + ": Orange juice" + "\n";

bill += 2.99;

}

  

if(dietPepsiJCB.isSelected())

{

beverages++;

report += "Beverage # " + beverages + ": Diet pepsi" + "\n";

bill += 3.99;

}

  

if(hotChocolateJCB.isSelected())

{

beverages++;

report += "Beverage # " + beverages + ": Hot chocolate" + "\n";

bill += 4.99;

}

  

change = amount - bill;

  

report += "\n";

report += "Amount paid: $" + String.format("%.2f", amount) + "\n";

report += "Total bill: $" + String.format("%.2f", bill) + "\n";

report += "Change: $" + String.format("%.2f", change) + "\n";

report += "\n\n";   

  

if(creditCardJRB.isSelected())

{

report += "Customer sign: ";

}

  

result.setText(report);

}

catch(Exception e)

{

result.setText("Amount is not in a valid format!");

}

  

result.setVisible(true);

}

  

public static void main(String[] args)

{

new MomAndPopPizzeria();

}

} // end of PizzaShop class