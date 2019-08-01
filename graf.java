package teste;
import java.awt.*;
import java.awt.event.*;

import javax.swing.text.GapContent;
class graf extends Frame implements ActionListener{
	Button b[]=new Button[4];
	//b[1]=new Button();
	public void update(Graphics g) {paint(g);}
	class draw extends Canvas{
		public void paint(Graphics g) {	
			g.setColor(new Color(255,240,240));
			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(new Color(1,1,1));
			for(int i=0;i<10000000;i++) {
				int k,id;
			g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
			g.drawLine(k=(int)(Math.random()*getWidth()), id=(int)(Math.random()*getHeight()),k,id);
			}	
		}
	}
	draw d=new draw();
	public graf() {
	super("super");
	setSize(600,500);
	Panel panel=new Panel(new BorderLayout());
	panel.add(d,BorderLayout.CENTER);
	addWindowListener(new we());
	Button button=new Button("Re");button.addActionListener(this);
	button.addActionListener(this);
	panel.add(button,BorderLayout.SOUTH);
	add(panel);
	setVisible(true);
	}
	class we extends WindowAdapter{
		public void windowClosing(WindowEvent e) {dispose();		}
	}
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
		System.out.println("reg");
		if(s.equals("Re")) {
			System.out.println("stop");
			d.repaint();}
	}
	
};





