package GuiMan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI {

	JButton button;
	JFrame frame;
	JTextArea text;
	JCheckBox check;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGUI gui = new SimpleGUI();
		gui.go();
	}

	public void go() {
		frame = new JFrame();
		JPanel panel = new JPanel();
		button = new JButton();
		button.addActionListener(new buttonListener());
		text = new JTextArea(10, 20);

		check = new JCheckBox("Click it!");
		text.setLineWrap(true);
		
		panel.add(check);
		panel.add(button, BorderLayout.SOUTH);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		
		JScrollPane scroller = new JScrollPane(text);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		panel.add(scroller);
		check.addItemListener(new checkboxListener());
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		
	}

	class buttonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			button.setText("Button clicked");
			text.append("Hi you\n");
		}
	}
	
	class checkboxListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			String onOrOff;
			onOrOff = check.isSelected() ? onOrOff = "ON" : "OFF";
			text.append("The switch is " + onOrOff + "\n");
		}
		
	}

}
