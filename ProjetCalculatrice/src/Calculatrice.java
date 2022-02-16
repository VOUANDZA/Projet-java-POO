import java.awt.BorderLayout; // placements (nord, sud ...)
import java.awt.Color;	// couleurs
import java.awt.Dimension;	// dimensions
import java.awt.Font;	// police
import java.awt.GridLayout;
import java.awt.event.ActionEvent;	
import java.awt.event.ActionListener;



import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel; // affichage
import javax.swing.JPanel;
import javax.swing.JTextField;


//*****implements mouvements avec des methodes
public class Calculatrice implements ActionListener{
	//*****instenssier lobjetframe a partir de la classe frame qui concerne l'interface
	JFrame frame;
	//*****instencier lobjet textfield
	JTextField textfield;
	//**** creer le tableau des boutons
	//tableau des chiffres
	JButton[] numberButton = new JButton[10];
	//tableau des bouttons
	JButton[] functionButton = new JButton[9];
	
	//insensier des objets a partir de JBUttons
	JButton addButton, subButton, mulButton, divButton, decButton, equButton, delButton, ClrButton, negButton,videButton;
	//mettre des panels
	JPanel panel;
	//police d'ecriture
	Font myFont = new Font ("FreeSerif", Font.BOLD, 30);
	//****les variables
	double num1 = 0, num2 = 0, result = 0;
	//les operateurs - + /
	char operator;
	//creer une consructeur meme nom de que la classe qui retourne pas de type de retour
	public Calculatrice(){
		//nomer lapplication
		frame = new JFrame ("Calculatrice apple");
		//le boutton rouge croix fermer
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//changer la traille des ecritures dans lapp
		frame.setSize(315,520);
		//definir le champ daffichage des resultats
		frame.setLayout(null);
		frame.setPreferredSize(new Dimension(250, 250));
        frame.getContentPane().setBackground(new Color(90, 78, 79));
		//modifier la field pour afficher les caracteres
		textfield = new JTextField();
		textfield.setBounds(0,10,450,110);
	
		textfield.setBackground(new Color(90, 78, 79));
		textfield.setForeground(java.awt.Color.WHITE);
		textfield.setFont(myFont);
		
		textfield.setEditable(false);
		
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("x");
		divButton = new JButton("÷");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("%");
		ClrButton = new JButton("C");
		negButton = new JButton("+/-");
		videButton = new JButton("");
		
		
		
		
		functionButton[0] = addButton;
		functionButton[1] = subButton;
		functionButton[2] = mulButton;
		functionButton[3] = divButton;
		functionButton[4] = decButton;
		functionButton[5] = equButton;
		functionButton[6] = delButton;
		functionButton[7] = ClrButton;
		functionButton[8] = negButton;
		
		//ajouter une boucle pour parcourir le tableau funtion boutton
		for (int i = 0;i<9;i++) {
			functionButton[i].addActionListener(this);
			//si on veut changer le type ou la couleur des caracteres
			functionButton[i].setFont(myFont);
			functionButton[i].setFocusable(false);
			
			
		}
		
		
		
		
		//******2eme tab
		for(int i = 0; i<10;i++) {
			//transformer en string les chaine de charachteres 
			numberButton[i] = new JButton(String.valueOf(i));
			//ajouter l'action listener quad tu clique 
			numberButton[i].addActionListener(this);
			//fonte des chiffres
			numberButton[i].setFont(myFont);
			//parcourir les element du tableau
			numberButton[i].setFocusable(false);
		}
		
		//modifier le panel
		negButton.setBounds(0,120,80,50);
		delButton.setBounds(79,120,80,50);
		ClrButton.setBounds(155,120,70,50);
		divButton.setBounds(225,120,75,50);
		
		
		
		
		
		panel = new JPanel();
		panel.setBounds(0,170, 300, 320);
		//espace entre les bouttons
		panel.setLayout(new GridLayout(4,4,2,2));
		
		
		

		panel.add(numberButton[7]);
		panel.add(numberButton[8]);
		panel.add(numberButton[9]);
		panel.add(mulButton);
		panel.add(numberButton[4]);
		panel.add(numberButton[5]);
		panel.add(numberButton[6]);
		panel.add(subButton);
		panel.add(numberButton[1]);
		panel.add(numberButton[2]);
		panel.add(numberButton[3]);
		panel.add(addButton);
		panel.add(numberButton[0]);
		panel.add(videButton);
		panel.add(decButton);

		panel.add(equButton);
		
		
		panel.setBackground(Color.BLACK);
		
		
		
		
		frame.add(panel);
		frame.add(ClrButton);
		frame.add(negButton);
		frame.add(delButton);
		frame.add(divButton);
		frame.add(textfield);
		frame.setVisible(true);
		
		divButton.setBackground(new Color(245, 147, 66));
		mulButton.setBackground(new Color(245, 147, 66));
		subButton.setBackground(new Color(245, 147, 66));
		addButton.setBackground(new Color(245, 147, 66));
		equButton.setBackground(new Color(245, 147, 66));
		
		ClrButton.setBackground(new Color(146, 156, 149));
		negButton.setBackground(new Color(146, 156, 149));
		delButton.setBackground(new Color(146, 156, 149));
		
		videButton.setBackground(new Color(54, 56, 55));
		numberButton[0].setBackground(new Color(54, 56, 55));
		numberButton[1].setBackground(new Color(54, 56, 55));
		numberButton[2].setBackground(new Color(54, 56, 55));
		numberButton[3].setBackground(new Color(54, 56, 55));
		numberButton[4].setBackground(new Color(54, 56, 55));
		numberButton[5].setBackground(new Color(54, 56, 55));
		numberButton[6].setBackground(new Color(54, 56, 55));
		numberButton[7].setBackground(new Color(54, 56, 55));
		numberButton[8].setBackground(new Color(54, 56, 55));
		numberButton[9].setBackground(new Color(54, 56, 55));
		
		decButton.setBackground(new Color(54, 56, 55));
		
		
		
		
		
		numberButton[0].setForeground(java.awt.Color.WHITE);
		numberButton[1].setForeground(java.awt.Color.WHITE);
		numberButton[2].setForeground(java.awt.Color.WHITE);
		numberButton[3].setForeground(java.awt.Color.WHITE);
		numberButton[4].setForeground(java.awt.Color.WHITE);
		numberButton[5].setForeground(java.awt.Color.WHITE);
		numberButton[6].setForeground(java.awt.Color.WHITE);
		numberButton[7].setForeground(java.awt.Color.WHITE);
		numberButton[8].setForeground(java.awt.Color.WHITE);
		numberButton[9].setForeground(java.awt.Color.WHITE);
		
		
		divButton.setForeground(java.awt.Color.WHITE);
		mulButton.setForeground(java.awt.Color.WHITE);
		subButton.setForeground(java.awt.Color.WHITE);
		addButton.setForeground(java.awt.Color.WHITE);
		equButton.setForeground(java.awt.Color.WHITE);
		
		
		
		decButton.setForeground(java.awt.Color.WHITE);
		
		
		
		
	
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {	
	
	
	
	//methode d'action
	
		for(int i=0;i<10;i++) {
			//on utilise une condition a linterieur de la boucle
			if (e.getSource () ==numberButton[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
			
		}
		
		if(e.getSource () == decButton) {
			textfield.setText(textfield.getText().concat("."));
		}
		
		if (e.getSource()== addButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '+';
			textfield.setText("");
		}
		if(e.getSource() == subButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '-';
			textfield.setText("");
		}
		if(e.getSource()== mulButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '*';
			textfield.setText("");
		}
		if(e.getSource() == divButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='/';
			textfield.setText("");
		}
		if(e.getSource() == delButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='%';
			textfield.setText("");
		}
	
	//utiliser une condition pour le boutton equation
	if(e.getSource()== equButton) {
		num2 = Double.parseDouble(textfield.getText());
		
		switch(operator){
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1/num2;
			break;
		case '%':
			result = num1*0.01;
		
		}
		
		

		//affichage a gauche
		textfield.setText(String.valueOf(result));
		num1 = result;		
	}

	if(e.getSource()== ClrButton) {
		textfield.setText("");
	}

	if (e.getSource()== negButton) {
		double temps = Double.parseDouble(textfield.getText());
		temps *= -1;
		textfield.setText(String.valueOf(temps));
	}

	}
	public static void main(String[] args) {
		Calculatrice  uneCalculette=new Calculatrice();
	}
	
	
}
