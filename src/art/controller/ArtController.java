package art.controller;

import javax.swing.JOptionPane;
import art.view.ArtFrame;


public class ArtController
{
	private ArtFrame appFrame;
	
	public ArtController()
	{
		appFrame = new ArtFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	
	public ArtFrame getFrame()
	{
		return appFrame;
	}
}
