import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		JFrame f = new JFrame("Layout");

		JButton jb1 = new JButton("b1");
		JButton jb2 = new JButton("b2");
		JButton jb3 = new JButton("b3");
		JButton jb4 = new JButton("b4");
		JButton jb5 = new JButton("b5");
		JButton jb6 = new JButton("b6");
		JButton jb7 = new JButton("b7");
		JButton jb8 = new JButton("b8");
		JButton jb9 = new JButton("b9");

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,2));

		p.add(jb1);
		p.add(jb2);
		p.add(jb3);
		p.add(jb4);
		p.add(jb5);
		p.add(jb6);
		p.add(jb7);
		p.add(jb8);
		
		

		f.add(p);
		f.setSize(400, 400);

		f.setVisible(true);

	}

}
