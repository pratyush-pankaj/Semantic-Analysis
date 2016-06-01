package sentiment;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

public class ama extends JFrame{
	
	
	Container c;
	JTextField searchField;
	JTextArea consoler = new JTextArea();
	static JButton searchButton = new JButton("Start Search");
	public ama()
	{
		setTitle("Data Extractor Analyser , Recommender Assistant ");
		getContentPane().setForeground(Color.GREEN);
		getContentPane().setLayout(null);
		
		searchField = new JTextField();
		searchField.setBounds(179, 21, 110, 20);
		getContentPane().add(searchField);
		searchField.setColumns(10);
		
		JLabel lblEnterParameterFor = new JLabel("Enter Parameter For Search");
		lblEnterParameterFor.setForeground(Color.BLACK);
		lblEnterParameterFor.setBounds(10, 11, 159, 40);
		getContentPane().add(lblEnterParameterFor);
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		
		
		
		searchButton.setBounds(179, 52, 110, 23);
		getContentPane().add(searchButton);
		
		
		consoler.setBounds(31, 86, 376, 131);
		getContentPane().add(consoler);
		
		JButton btnViewResult = new JButton("view Result");
		btnViewResult.setBounds(189, 228, 89, 23);
		getContentPane().add(btnViewResult);
	
	}
}
