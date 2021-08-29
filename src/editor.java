import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import java.io.*;
import java.util.Iterator;


public class editor extends JFrame {
	
	private JPanel fundo;
	private JLabel img;
	private JScrollPane scrollDoTexto;
	private JMenuBar menuBarra; // Barra de menu
	private JMenu fontes ;
	private JMenuItem Arial,timeNewRoman,Georgia,tamanho,cor;
	
	private JMenuItem calibre[] = new JMenuItem[30];
	
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
		textAreaEditor.setBackground(new Color(250,250,250));
		scrollDoTexto = new JScrollPane();
	    scrollDoTexto.setBounds(10,10,1245,640);
	    scrollDoTexto.setViewportView(textAreaEditor);
	    add(scrollDoTexto);
		
		img = new JLabel();
		img.setIcon(new ImageIcon(getClass().getResource("\\Icon\\fundo.jpg")));
		img.setBounds(0,0,1280,720);
		add(img);
			
		menuBarra = new JMenuBar();
		menuBarra.setBackground(new Color(250,250,250));
		
		//FONTES
		fontes = new JMenu("Fontes     |");
		fontes.setFont(new Font("Impact",5,15));
		
		Arial = new JMenuItem("Arial ");
		Georgia = new JMenuItem("Georgia");
		
		fontes.add(Arial);
		fontes.add(Georgia);
		menuBarra.add(fontes);
        
		//Tamanho
		
		tamanho = new JMenu("Tamanho");
		
		for (int i=0; i < 30;i++) {
			calibre[i] = new JMenuItem(String.valueOf(i));			
			tamanho.add(calibre[i]);
		}
		
		menuBarra.add(tamanho);
		
		
		//COR 
		
		cor = new JMenu("Cor");
	    	

		

	    setJMenuBar(menuBarra);
		
	}
	
	public void inserirEvento() {
		
	 	Arial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setFont(new Font("Arial",0,15));
				fontes.setText("Arial      |");
				
			}
		});
		
		Georgia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setFont(new Font("Georgia",0,15));
				fontes.setText("Georgia      |");
				
			}
		});
		
		for (int i= 0; i < 30;i++) {
			int num = i;
			calibre[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					textAreaEditor.setFont(new Font("Arial",0,num));
					
				}
			});
	   }
	}
	
	public static void main(String[] args) {
		editor frame = new editor();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(0,0,1280,720);
	    frame.setVisible(true);
	    frame.setLocationRelativeTo(null);
		
	}
}
