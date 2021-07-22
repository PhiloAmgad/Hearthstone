package view;

import javax.imageio.ImageIO;
import javax.swing.*;

import view.StartHS.BottomPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

public class Endgame  extends JFrame {
	JTextArea end;
	JPanel panel;
	JButton button;
	public JPanel getPanel() {
		return panel;
	}
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	public JButton getButton() {
		return button;
	}
	public void setButton(JButton button) {
		this.button = button;
	}
	public Endgame(){
		super();
		panel=new JPanel();
		button = new JButton();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);//philo atef 1920,1080
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//pane
		end = new JTextArea();
		end.setBackground(new Color(0,0,0,0));
		panel.setBackground(new Color(0,0,0,0));
		//this.add(end,BorderLayout.NORTH);
		end.setEditable(false);
		
		
       panel.add(button);
       //button.clickable(false);
       BottomPanel bp= new BottomPanel();
       bp.add(panel,BorderLayout.CENTER);
       bp.add(end,BorderLayout.NORTH);
       button.setBorderPainted(false);button.setContentAreaFilled(false);
       this.add(bp);
       repaint();
       revalidate();
	}
	public JTextArea getEnd() {
		return end;
	}
	public void setEnd(JTextArea end) {
		this.end = end;
	}
	
	public static void main(String [] args){
		Endgame g= new Endgame();
	}
	 class BottomPanel extends JPanel{
	      
	        protected void paintComponent(Graphics g) {

	          super.paintComponent(g);
	                      
	            
				try {
					Image image = ImageIO.read(new File("download1.jpg"));
					g.drawImage(image, 0, 0, null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
}
	 }}
