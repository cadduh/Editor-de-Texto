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
	private JMenu fontes,Cores,EstilosdeFonte ;
	private JMenuItem Arial,timeNewRoman,Georgia,tamanho,Normal,Bold,Italic,BoldItalic;
	private JMenuItem Vermelho,Azul,Amarelo,Rosa,Roxo,Verde;
	private JMenuItem calibre[] = new JMenuItem[30];
	
	private JTextArea textAreaEditor;
	private String font = "";
	private int tamanhoDaLetra = 15;
	private int estiloDaLetra = 0;
	
        
    

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
		
		tamanho = new JMenu("Tamanho   |");
		tamanho.setFont(new Font("Impact",5,15));
		
		for (int i=0; i < 30;i++) {
			calibre[i] = new JMenuItem(String.valueOf(i));			
			tamanho.add(calibre[i]);
		}
		
		menuBarra.add(tamanho);
		
		
		//COR 
		 	
		Cores = new JMenu("Cores  |");
		Cores.setFont(new Font("Impact",5,15));
		
		Amarelo = new JMenuItem("Amarelo");
		Vermelho = new JMenuItem("Vermelho");
		Verde = new JMenuItem("Verde");
		Rosa = new JMenuItem("Rosa");
		Roxo = new JMenuItem("Roxo");
		Azul = new JMenuItem("Azul");
		
		Cores.add(Amarelo);
		Cores.add(Vermelho);
		Cores.add(Verde);
		Cores.add(Azul);
		menuBarra.add(Cores);
	
	    setJMenuBar(menuBarra);
	    
	    //FONT STYLES
	    EstilosdeFonte = new JMenu("Estilos de Fonte  |");
	    EstilosdeFonte.setFont(new Font("Impact",5,15));
	    // Normal,Bold,Italic,Bold Italic;
	    
	    Normal = new JMenuItem("Normal");
	    Bold = new JMenuItem("Bold");
	    Italic = new JMenuItem("Italic");
	    BoldItalic = new JMenuItem("Bold Italic");
	    
	    EstilosdeFonte.add(Normal);
	    EstilosdeFonte.add(Bold);
	    EstilosdeFonte.add(Italic);
	    EstilosdeFonte.add(BoldItalic);
	    menuBarra.add(EstilosdeFonte);
	    
	    
	    
	    
		
	}
	
	public void inserirEvento() {
		
	 	Arial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setFont(new Font("Arial",estiloDaLetra,tamanhoDaLetra));
				fontes.setText("Arial      |");
				font = "Arial";
				
			}
		});
		
		Georgia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setFont(new Font("Georgia",estiloDaLetra,tamanhoDaLetra));
				fontes.setText("Georgia      |");
				font = "Georgia";
				
			}
		});
		
		for (int i= 0; i < 30;i++) {
			int num = i;
			calibre[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					textAreaEditor.setFont(new Font(font,estiloDaLetra,num));
					tamanhoDaLetra = num;
				}
			});
	   }
		
		Amarelo.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setForeground(Color.YELLOW);
			}
		});
		
		Vermelho.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setForeground(Color.RED);
			}
		});
		
		Verde.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setForeground(Color.green);
			}
		});
		
		Azul.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setForeground(Color.blue);
			}
		});
		
		Rosa.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setForeground(Color.pink);
			}
		});
		
		Roxo.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setForeground(new Color(153,51,153));
			}
		});
		
		Normal.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setFont(new Font(font,0,tamanhoDaLetra));
				estiloDaLetra = 0;
				
			}
		});
		
		Bold.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setFont(new Font(font,1,tamanhoDaLetra));
				estiloDaLetra = 1;
				
			}
		});
		
		Italic.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setFont(new Font(font,2,tamanhoDaLetra));
				estiloDaLetra = 2;
				
			}
		});
		
		BoldItalic.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textAreaEditor.setFont(new Font(font,3,tamanhoDaLetra));
				estiloDaLetra = 3;
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		editor frame = new editor();
		frame.setTitle("Editor de texto");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(0,0,1280,720);
	    frame.setVisible(true);
	    frame.setLocationRelativeTo(null);
		
	}
}
