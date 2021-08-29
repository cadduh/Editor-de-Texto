import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class editor extends JFrame {
	
	private JPanel fundo;
	private JLabel img;
	private JMenuBar menuBarra; // Barra de menu
	private JMenu fonte,tamanho, cor ;
	private JMenuItem Arial,timeNewRoman;
	private JTextArea textAreaEditor;
	private String font = "";

	public editor() {
		// TODO Auto-generated constructor stub
		initComponents();
		inserirEvento();
	}
	
	public void initComponents() {
		setLayout(null);
		setResizable(false);
		
		textAreaEditor = new JTextArea();
	    textAreaEditor.setBounds(10,10,1245,640);
	    add(textAreaEditor);
		
		img = new JLabel();
		img.setIcon(new ImageIcon(getClass().getResource("\\Icon\\fundo.jpg")));
		img.setBounds(0,0,1280,720);
		add(img);
		
		menuBarra = new JMenuBar();
		fonte = new JMenu("Fonte   ");
		tamanho = new JMenu("Tamanho");
		cor = new JMenu("Cor");
		
		Arial = new JMenuItem("Arial ");
		timeNewRoman = new JMenuItem("Time New Roman");
		

	    
	    fonte.add(Arial);
		fonte.add(timeNewRoman);
		menuBarra.add(fonte);
		menuBarra.add(tamanho);
		menuBarra.add(cor);
	    setJMenuBar(menuBarra);
		
	}
	
	
	public void inserirEvento() {
		
		Arial.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setFont(new Font("Arial",0,15));
				font = "Arial";
				
			}
		});
		
		tamanho.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		editor frame = new editor();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(0,0,1280,720);
	    frame.setVisible(true);
	    frame.setLocationRelativeTo(null);
		
	}
}
