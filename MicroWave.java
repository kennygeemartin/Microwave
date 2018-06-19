package microWave;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MicroWave extends JFrame{
	
	private JButton jbtScreen = new JButton("Food to Be Placed Here");
	private JTextField txtfld = new JTextField("Time to be displayed here");
	private JButton nextPage = new JButton("Next Page");
	private JButton start = new JButton("Start");
	private JButton stop = new JButton("Stop");
	
	public MicroWave(){
		JButton j1 = new JButton("1");
		JButton j2 = new JButton("2");
		JButton j3 = new JButton("3");
		JButton j4 = new JButton("4");
		JButton j5 = new JButton("5");
		JButton j6 = new JButton("6");
		JButton j7 = new JButton("7");
		JButton j8 = new JButton("8");
		JButton j9 = new JButton("9");
		
		JPanel p1 = new JPanel(new GridLayout(4,3));
		p1.add(j1);
		p1.add(j2);
		p1.add(j3);
		p1.add(j4);
		p1.add(j5);
		p1.add(j6);
		p1.add(j7);
		p1.add(j8);
		p1.add(j9);
		p1.add(start);
		p1.add(stop);
		p1.add(nextPage);
		
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(txtfld, BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);
		
		JPanel p3 = new JPanel(new BorderLayout());
		p3.add(jbtScreen, BorderLayout.CENTER);
		p3.add(p2, BorderLayout.EAST);
		add(p3);
		
		j1.setToolTipText("Button 1");j2.setToolTipText("Button 2"); j3.setToolTipText("Button 3"); j4.setToolTipText("Button 4");
		
		j1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				e.getSource();
				JOptionPane.showMessageDialog(null, "you pressed 1");
			}
		});
		
		j2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "You Pressed 2");
			}
		});
		
		j3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "You Have Pressed 3");
			}
		});
		
		txtfld.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				txtfld.requestFocusInWindow();
				
			}
		});

		
	}
	
	

	public static void main(String [] args){
			MicroWave frame = new MicroWave();
			frame.setTitle("MicroWave");
			frame.pack();
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
}
