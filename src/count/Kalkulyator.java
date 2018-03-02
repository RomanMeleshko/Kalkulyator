package count;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Kalkulyator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField2;
	int firstValue = 0;

	double value4 = 0;
	String operation = "+";
	String operation1= "/";
	String operation2= "-";
	String operation3= "*";
	
	
	private JButton Button_1;
	private JButton Button_2;
	private JButton Button_3;
	private JButton Button_4;
	private JButton Button_5;
	private JButton Button_6;
	private JButton Button_7;
	private JButton Button_8;
	private JButton Button_9;
	private JButton Button_0;
	
	private JButton ButtonRavno;
	private JButton ButtonPlas;
	private JButton Button_C;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulyator window = new Kalkulyator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Kalkulyator() {
		
		initialize();
		
	}

public void off(){
		
		textField.setEnabled(true);
		Button_1.setEnabled(true);
		Button_2.setEnabled(true);
		Button_3.setEnabled(true);
		Button_4.setEnabled(true);
		Button_5.setEnabled(true);
		Button_6.setEnabled(true);
		Button_7.setEnabled(true);
		Button_8.setEnabled(true);
		Button_9.setEnabled(true);
		Button_0.setEnabled(true);
		ButtonRavno.setEnabled(true);
		ButtonPlas.setEnabled(true);
		Button_C.setEnabled(true);
		
	}
	
	
	public void on(){
		Button_1.setEnabled(false);
		Button_2.setEnabled(false);
		Button_3.setEnabled(false);
		Button_4.setEnabled(false);
		Button_5.setEnabled(false);
		Button_6.setEnabled(false);
		Button_7.setEnabled(false);
		Button_8.setEnabled(false);
		Button_9.setEnabled(false);
		Button_0.setEnabled(false);
		ButtonRavno.setEnabled(false);
		ButtonPlas.setEnabled(false);
		Button_C.setEnabled(false);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("img/java.png"));
		frame.getContentPane().setBackground(new Color(0, 139, 139));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 232, 352);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(240, 248, 255));
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setForeground(SystemColor.activeCaption);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 204, 51);
		frame.getContentPane().add(textField);
		textField.setColumns(20);
		
		textField2 = new JTextField();
		textField2.setBackground(new Color(244, 164, 96));
		textField2.setForeground(new Color(0, 0, 0));
		textField2.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField2.setBounds(80, 73, 134, 36);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
	//--------------------------------------------------------------//	
		JMenuBar menBar = new JMenuBar();
		menBar.setBackground(new Color(0, 139, 139));
		frame.setJMenuBar(menBar );
		
		JMenu mnFile = new JMenu("Настройки");
		mnFile.setBackground(new Color(0, 139, 139));
		menBar.add(mnFile);
		
		JMenuItem menStan = new JMenuItem("Стандартный");
		mnFile.add(menStan);
	//----------------------------------------------------------------//	
		class menStan implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				frame.setBounds(100, 100, 232, 346);
				textField.setBounds(10, 11, 204, 51);
				textField2.setBounds(80, 73, 134, 36);
				frame.setLocationRelativeTo(null);
			}
			
		}
		menStan.addActionListener(new menStan());
		
		JMenuItem menIngener = new JMenuItem("Инженерный");
		mnFile.add(menIngener);
		
		class  menIngener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				frame.setBounds(100, 100, 439, 349);
				frame.setLocationRelativeTo(null);
				textField.setBounds(10, 11, 408, 51);
				textField2.setBounds(80, 73, 336, 36);
			}
			
		}
		 menIngener.addActionListener(new  menIngener());
		 
		
		 
	    Button_1 = new JButton("");
		Button_1.setIcon(new ImageIcon("img/1.png"));
		Button_1.setBounds(20, 125, 41, 36);
		frame.getContentPane().add(Button_1);
		
		 class Button_1  implements ActionListener {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					textField.setText(textField.getText()+ "1");
				}
		    }
		    Button_1.addActionListener(new  Button_1());
		
		Button_2 = new JButton("");
		Button_2.setIcon(new ImageIcon("img/2.png"));
		Button_2.setBounds(71, 125, 41, 36);
		frame.getContentPane().add(Button_2);
		
		 class Button_2  implements ActionListener {
		    	
		    	@Override
		    	public void actionPerformed(ActionEvent e) {
		    		
		    		textField.setText(textField.getText()+ "2");
		    	}
		    }
		    Button_2.addActionListener(new  Button_2());
		
		Button_3 = new JButton("");
		Button_3.setIcon(new ImageIcon("img/3.png"));
		Button_3.setBounds(122, 125, 41, 36);
		frame.getContentPane().add(Button_3);
		
		 class Button_3  implements ActionListener {
		    	
		    	@Override
		    	public void actionPerformed(ActionEvent e) {
		    		
		    		textField.setText(textField.getText()+ "3");
		    	}
		    }
		    Button_3.addActionListener(new  Button_3());
		
	    Button_4 = new JButton("");
		Button_4.setIcon(new ImageIcon("img/4.png"));
		Button_4.setBounds(20, 172, 41, 36);
		frame.getContentPane().add(Button_4);
		
		class Button_4  implements ActionListener {
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		textField.setText(textField.getText()+ "4");
	    	}
	    }
	    Button_4.addActionListener(new  Button_4());
		
	    Button_5 = new JButton("");
		Button_5.setIcon(new ImageIcon("img/5.png"));
		Button_5.setBounds(71, 172, 41, 36);
		frame.getContentPane().add(Button_5);
		
		 class Button_5  implements ActionListener {
		    	
		    	@Override
		    	public void actionPerformed(ActionEvent e) {
		    		
		    		textField.setText(textField.getText()+ "5");
		    	}
		    }
		    Button_5.addActionListener(new  Button_5());
		
		Button_6 = new JButton("");
		Button_6.setIcon(new ImageIcon("img/6.png"));
		Button_6.setBounds(122, 172, 41, 36);
		frame.getContentPane().add(Button_6);
		
		 class Button_6  implements ActionListener {
		    	
		    	@Override
		    	public void actionPerformed(ActionEvent e) {
		    		
		    		textField.setText(textField.getText()+ "6");
		    	}
		    }
		    Button_6.addActionListener(new  Button_6());
		
		Button_7 = new JButton("");
		Button_7.setIcon(new ImageIcon("img/7.png"));
		Button_7.setBounds(20, 219, 41, 36);
		frame.getContentPane().add(Button_7);
		
		class Button_7  implements ActionListener {
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		textField.setText(textField.getText()+ "7");
	    	}
	    }
	    Button_7.addActionListener(new  Button_7());
		
		Button_8 = new JButton("");
		Button_8.setIcon(new ImageIcon("img/8.png"));
		Button_8.setBounds(71, 219, 41, 36);
		frame.getContentPane().add(Button_8);
		
		 class Button_8  implements ActionListener {
		    	
		    	@Override
		    	public void actionPerformed(ActionEvent e) {
		    		
		    		textField.setText(textField.getText()+ "8");
		    	}
		    }
		    Button_8.addActionListener(new  Button_8());
		
		Button_9 = new JButton("");
		Button_9.setIcon(new ImageIcon("img/9.png"));
		Button_9.setBounds(121, 219, 41, 36);
		frame.getContentPane().add(Button_9);
		
		class Button_9  implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+ "9");
			}
	    }
	    Button_9.addActionListener(new  Button_9());
		
		Button_0 = new JButton("");
		Button_0.setIcon(new ImageIcon("img/0.png"));
		Button_0.setBounds(20, 266, 143, 26);
		frame.getContentPane().add(Button_0);
		
		 class Button_0  implements ActionListener {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					textField.setText(textField.getText()+ "0");
				
				}
				
		    }
		 Button_0.addActionListener(new  Button_0());
		
	    ButtonRavno = new JButton("");
		ButtonRavno.setIcon(new ImageIcon("img/Ravno.png"));
		ButtonRavno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonRavno.setBounds(173, 219, 42, 71);
		frame.getContentPane().add(ButtonRavno);
		
		 class  ButtonRavno  implements ActionListener {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					int  secondValue = Integer.valueOf( textField.getText());
					int  secondValue1 = Integer.valueOf( textField.getText());
					int  secondValue2 = Integer.valueOf( textField.getText());
					int  secondValue3 = Integer.valueOf( textField.getText());
					
					
					if("+".equals(operation)){
						textField2.setText((firstValue + secondValue)+"");
					}else if("-".equals(operation)){
						textField2.setText((firstValue - secondValue1)+"");
					}else if("/".equals(operation)){
						textField2.setText((firstValue / secondValue2)+"");
					}else if("*".equals(operation)){
						textField2.setText((firstValue * secondValue3)+"");
					}else if("%".equals(operation)){
						textField2.setText((firstValue % secondValue3)+"");
					}
					
					 firstValue = 0;
		
					
	                 operation = "+";
	                 operation = "-";
	                 operation = "/";
	                 operation = "*";
	                 operation = "%";
	              
				}
				 
		    }
		 ButtonRavno.addActionListener(new  ButtonRavno());
		
		ButtonPlas = new JButton("");
		ButtonPlas.setIcon(new ImageIcon("img/Plas.png"));
		ButtonPlas.setBounds(173, 172, 42, 36);
		frame.getContentPane().add(ButtonPlas);
		
		class ButtonPlas implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				
		   firstValue = Integer.valueOf( textField.getText());
           value4 = Double.parseDouble((String.valueOf(textField.getText()))); 
           textField.setText("");
           textField.setText("");
           operation = "+";
			}
	    }
	    ButtonPlas.addActionListener(new  ButtonPlas());
		
		Button_C = new JButton("");
		Button_C.setIcon(new ImageIcon("img/C.png"));
		Button_C.setBounds(173, 125, 41, 36);
		frame.getContentPane().add(Button_C);
		
		class Button_C  implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				
           textField.setText(null);
           textField2.setText(null);
			}
	    }
	    Button_C.addActionListener(new  Button_C());
	    
	    
		
		JRadioButton ButtonOn = new JRadioButton("ON");
		ButtonOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				on();
				
			}
		});
		ButtonOn.setBackground(new Color(0, 139, 139));
		ButtonOn.setBounds(20, 69, 60, 23);
		frame.getContentPane().add(ButtonOn);
			
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
				
		    	 off();
		    	  
			}
			
		});
		rdbtnOff.setBackground(new Color(0, 139, 139));
		rdbtnOff.setBounds(20, 95, 60, 23);
		frame.getContentPane().add(rdbtnOff);
		
		
	//------------------------------------------------------------------------------//	
		JButton btnDel = new JButton("");
		btnDel.setIcon(new ImageIcon("img/del.png"));
		btnDel.setBounds(233, 125, 41, 36);
		frame.getContentPane().add(btnDel);
		
		class btnDel   implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				 firstValue = Integer.valueOf( textField.getText());
		           textField.setText("");
		           operation = "/";
			}
	    }
		btnDel.addActionListener(new  btnDel());
	//--------------------------------------------------------------------------------//	
		JButton btnUmno = new JButton("");
		btnUmno.setIcon(new ImageIcon("img/umno.png"));
		btnUmno.setBounds(233, 172, 41, 36);
		frame.getContentPane().add(btnUmno);
		
		class btnUmno implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				
           firstValue = Integer.valueOf( textField.getText());
           textField.setText("");
           operation = "*";
			}
	    }
		btnUmno.addActionListener(new  btnUmno());
		
		JButton btnMinus = new JButton("");
		btnMinus.setIcon(new ImageIcon("img/minus.png"));
		btnMinus.setBounds(233, 219, 41, 36);
		frame.getContentPane().add(btnMinus);     //--------" - " ---------//
		
		class btnMinus implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				firstValue = Integer.valueOf( textField.getText());
		           textField.setText("");
		           operation = "-";
				
			}
			
		}
		btnMinus.addActionListener(new btnMinus());
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String str = textField.getText();
		           textField.setText(str.substring(0, str.length() -1));
			}
		});
		btnBack.setIcon(new ImageIcon("img/Back.png"));
		btnBack.setBounds(285, 266, 60, 26);
		frame.getContentPane().add(btnBack);
		
		JButton btnSin = new JButton("");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value4 = Double.parseDouble(String.valueOf(textField.getText()));
				value4 = Math.sin(value4);
				textField.setText(String.valueOf(value4));
			}
		});
		btnSin.setIcon(new ImageIcon("img/Sin.png"));
		btnSin.setBounds(284, 125, 60, 36);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value4 = Double.parseDouble(String.valueOf(textField.getText()));
				value4 = Math.cos(value4);
				textField.setText(String.valueOf(value4));
			}
		});
		btnCos.setIcon(new ImageIcon("img/cos.png"));
		btnCos.setBounds(285, 172, 60, 36);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value4 = Double.parseDouble(String.valueOf(textField.getText()));
				value4 = Math.tan(value4);
				textField.setText(String.valueOf(value4));
			}
		});
		btnTan.setIcon(new ImageIcon("img/tan.png"));
		btnTan.setBounds(284, 219, 60, 36);
		frame.getContentPane().add(btnTan);
		
		JButton btnTochca = new JButton("");
		btnTochca.setIcon(new ImageIcon("img/tochka.png"));
		btnTochca.setBounds(230, 266, 44, 26);
		frame.getContentPane().add(btnTochca);
		
		class btnTochca  implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+ ".");
				
			}
			
		}
		btnTochca.addActionListener(new btnTochca());
		
		JButton btn_xx = new JButton("");
		btn_xx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = (ops * ops);
				textField.setText(String.valueOf(ops));
			}
		});
		
		btn_xx.setIcon(new ImageIcon("img/xx.png"));
		btn_xx.setBounds(354, 125, 60, 36);
		frame.getContentPane().add(btn_xx);
		
		
		JButton btnx3 = new JButton("");
		btnx3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = (ops * ops * ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btnx3.setIcon(new ImageIcon("img/x3.png"));
		btnx3.setBounds(355, 172, 60, 36);
		frame.getContentPane().add(btnx3);
		
		
		JButton btnPi = new JButton("");
		btnPi.setIcon(new ImageIcon("img/Pi.png"));
		btnPi.setBounds(354, 219, 60, 36);
		frame.getContentPane().add(btnPi);
		
		class btnPi implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
			   double pi;
			   pi = (3.1415926535897932384626433832795);
			   
			   textField.setText(String.valueOf(pi));
			}
			
		}
		btnPi.addActionListener(new btnPi());
		
		JButton btnProc = new JButton("");
		btnProc.setIcon(new ImageIcon("img/proc.png"));
		btnProc.setBounds(355, 267, 60, 26);
		frame.getContentPane().add(btnProc);
		
		class btnProc  implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				firstValue = Integer.valueOf( textField.getText());
		           textField.setText("");
		           operation = "%";
				
			}
			
		}
		btnProc.addActionListener(new btnProc());
		
	}
		
}




