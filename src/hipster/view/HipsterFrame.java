package hipster.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hipster.controller.HipsterController;

public class HipsterFrame extends JFrame
{
	private HipsterController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		setupFrame();
	}
	
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500); 
		this.setTitle("Hipster");
		this.setResizable(false); 
		this.setVisible(true); 
		
	}
	
	public HipsterController getBaseController()
	{
		return baseController;
	}

}
