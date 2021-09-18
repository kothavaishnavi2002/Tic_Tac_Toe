import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class game {
	JFrame f;
	public int flag;
	public int count;
	public String[] values;

	game(int flag, String[] values, int count) {
		f = new JFrame();
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("Start game");
		this.flag = flag;
		this.values = values;
		this.count = count;

		// adding buttons to the frame
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);

		// setting grid layout of 3 rows and 3 columns
		f.setLayout(new GridLayout(4, 3));
		f.setSize(600, 550);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
				setFlag(1);
				for(int i = 0; i < 9; i++) {
//					values[i] = String.valueOf(i+1);
					System.out.println(values[i]);
				}
			}
		});

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(b1.getText() == "1") {
					if (getFlag() == 1) {
						values[0] = "X";
						b1.setText("X");
						setCount(getCount()+1);
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						else {
							JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
							setFlag(0);
						}
						
					} else {
						b1.setText("O");
						values[0] = "O";
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
						setFlag(1);
					}
				}	
				else {
					JOptionPane.showMessageDialog(f, "Already slot is choosen, choose another slot");
				}
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(b2.getText() == "2") {
					if (getFlag() == 1) {
						values[1] = "X";
						b2.setText("X");
						setCount(getCount()+1);
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						else {
							JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
							setFlag(0);
						}
						
					} else {
						b2.setText("O");
						values[1] = "O";
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
						setFlag(1);
					}
				}	
				else {
					JOptionPane.showMessageDialog(f, "Already slot is choosen, choose another slot");
				}
			}
		});

//		b2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				if (getFlag() == 1) {
//					b2.setText("X");
//					JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
//					setFlag(0);
//				} else {
//					b2.setText("O");
//					JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
//					setFlag(1);
//				}
//
//			}
//		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(b3.getText() == "3") {
					if (getFlag() == 1) {
						values[2] = "X";
						b3.setText("X");
						setCount(getCount()+1);
						System.out.println("helloo" + winner(values));
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						else {
							JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
							setFlag(0);
						}
						
					} else {
						b3.setText("O");
						values[2] = "O";
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
						setFlag(1);
					}
				}	
				else {
					JOptionPane.showMessageDialog(f, "Already slot is choosen, choose another slot");
				}
			}
		});

//		b3.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				if (getFlag() == 1) {
//					b3.setText("X");
//					JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
//					setFlag(0);
//				} else {
//					b3.setText("O");
//					JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
//					setFlag(1);
//				}
//
//			}
//		});
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(b4.getText() == "4") {
					if (getFlag() == 1) {
						values[3] = "X";
						b4.setText("X");
						setCount(getCount()+1);
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						else {
							JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
							setFlag(0);
						}
						
					} else {
						b4.setText("O");
						values[3] = "O";
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
						setFlag(1);
					}
				}	
				else {
					JOptionPane.showMessageDialog(f, "Already slot is choosen, choose another slot");
				}
			}
		});

//		b4.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				if (getFlag() == 1) {
//					b4.setText("X");
//					JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
//					setFlag(0);
//				} else {
//					b4.setText("O");
//					JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
//					setFlag(1);
//				}
//
//			}
//		});
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(b5.getText() == "5") {
					if (getFlag() == 1) {
						values[4] = "X";
						b5.setText("X");
						setCount(getCount()+1);
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						else {
							JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
							setFlag(0);
						}
						
					} else {
						b5.setText("O");
						values[4] = "O";
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
						setFlag(1);
					}
				}	
				else {
					JOptionPane.showMessageDialog(f, "Already slot is choosen, choose another slot");
				}
			}
		});

//		b5.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				if (getFlag() == 1) {
//					b5.setText("X");
//					JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
//					setFlag(0);
//				} else {
//					b5.setText("O");
//					JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
//					setFlag(1);
//				}
//
//			}
//		});
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(b6.getText() == "6") {
					if (getFlag() == 1) {
						values[5] = "X";
						b6.setText("X");
						setCount(getCount()+1);
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						else {
							JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
							setFlag(0);
						}
						
					} else {
						b6.setText("O");
						values[5] = "O";
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
						setFlag(1);
					}
				}	
				else {
					JOptionPane.showMessageDialog(f, "Already slot is choosen, choose another slot");
				}
			}
		});

//		b6.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				if (getFlag() == 1) {
//					b6.setText("X");
//					JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
//					setFlag(0);
//				} else {
//					b6.setText("O");
//					JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
//					setFlag(1);
//				}
//
//			}
//		});
		
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(b7.getText() == "7") {
					if (getFlag() == 1) {
						values[6] = "X";
						b7.setText("X");
						setCount(getCount()+1);
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						else {
							JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
							setFlag(0);
						}
						
					} else {
						b7.setText("O");
						values[6] = "O";
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
						setFlag(1);
					}
				}	
				else {
					JOptionPane.showMessageDialog(f, "Already slot is choosen, choose another slot");
				}
			}
		});

//		b7.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				if (getFlag() == 1) {
//					b7.setText("X");
//					JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
//					setFlag(0);
//				} else {
//					b7.setText("O");
//					JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
//					setFlag(1);
//				}
//
//			}
//		});
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(b8.getText() == "8") {
					if (getFlag() == 1) {
						values[7] = "X";
						b8.setText("X");
						setCount(getCount()+1);
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						else {
							JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
							setFlag(0);
						}
						
					} else {
						b8.setText("O");
						values[7] = "O";
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
						setFlag(1);
					}
				}	
				else {
					JOptionPane.showMessageDialog(f, "Already slot is choosen, choose another slot");
				}
			}
		});

//		b8.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				if (getFlag() == 1) {
//					b8.setText("X");
//					JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
//					setFlag(0);
//				} else {
//					b8.setText("O");
//					JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
//					setFlag(1);
//				}
//
//			}
//		});
		
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(b9.getText() == "9") {
					if (getFlag() == 1) {
						values[8] = "X";
						b9.setText("X");
						setCount(getCount()+1);
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						else {
							JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
							setFlag(0);
						}
						
					} else {
						b9.setText("O");
						values[8] = "O";
						if(winner(values) == 1) {
							JOptionPane.showMessageDialog(f, "PLayer1 has won the match, CONGRATULATIONS!!!");
						}
						JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
						setFlag(1);
					}
				}	
				else {
					JOptionPane.showMessageDialog(f, "Already slot is choosen, choose another slot");
				}
			}
		});

//		b9.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				if (getFlag() == 1) {
//					b9.setText("X");
//					JOptionPane.showMessageDialog(f, "Player 2, choose the correct slot to place 'O'");
//					setFlag(0);
//				} else {
//					b9.setText("O");
//					JOptionPane.showMessageDialog(f, "Player 1, choose the correct slot to place 'X'");
//					setFlag(1);
//				}
//
//			}
//		});

	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.flag = count;
	}
	
	public String[] getValues() {
		return this.values = values;
	}
	
	public void setValues(String[] values) {
		this.values = values;
	}
	
	public int winner(String[] v) {
		int i;
		String res = null;
		for(i = 0; i < 9; i++) {
			System.out.print(v[i]);
		}
		System.out.println();
//		for(i= 0;i < 8; i++) {
//			switch(i) {
//			case 0 : 
//				res = v[0] + v[1] + v[2];
//				System.out.println("enter 0");
//				break;
//			case 1 :
//				res = v[3] + v[4] + v[5];
//				System.out.println("enter 1");
//				break;
//			case 2 :
//				res = v[6] + v[7] + v[8];
//				System.out.println("enter 2");
//				break;
//			case 3 :
//				res = v[0] + v[3] + v[6];
//				System.out.println("enter 3");
//				break;
//			case 4 : 
//				res = v[1] + v[4] + v[5];
//				System.out.println("enter 4");
//				break;
//			case 5 :
//				res = v[2] + v[5] + v[8];
//				break;
//			case 6 :
//				res = v[0] + v[4] + v[8];
//				break;
//			case 7 :
//				res = v[0] + v[4] + v[8];
//				break;
//			case 8 :
//				res = v[2] + v[4] + v[6];
//				break;
//			}
		
			if((v[0] + v[1] + v[2]).equals("XXX")) {
				System.out.println("yesssss");
				return 1;
			}
			else if((v[0] + v[3] + v[6]).equals("XXX")) {
				System.out.println("yesssss");
				return 1;
			}
				
//			if(res.equals("XXX")){
//				System.out.println("yesssss");
//				return 1;
//			}
//			else if(res.equals("OOO")) {
//				return 2;
//			}
			
			for (int j = 0; j < 9; j++) {
	            if (Arrays.asList(res).contains(
	                    String.valueOf(j + 1))) {
	                break;
	            }
	            else if (j == 8) {
	                return 0;
	            }
	        }
		
		return 0;
	}

	public static void main(String[] args) {
		String[] values = new String[9];
		for(int i = 0; i < 9; i++) {
			values[i] = String.valueOf(i+1);
			System.out.println(values[i]);
		}
		new game(0, values, 0);
	}
	
}