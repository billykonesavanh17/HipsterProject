package hipster.view;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import hipster.controller.HipsterController;


public class HipsterPanel extends JPanel
{
	private HipsterController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private int maxClicks;
	private int startClick;
	
	public HipsterPanel(HipsterController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		phraseComboBox = new JComboBox<String>();
	

		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
			
	
	private void setupComboBox()
	{
		String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}
	
		
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.YELLOW);
		this.add(phraseComboBox);

	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, phraseComboBox, 24, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, phraseComboBox, 30, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				setBackground(new Color(red, green, blue));
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
				
			}
		});
		
	}

}
