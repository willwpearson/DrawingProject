package art.view;

import art.controller.ArtController;
import javax.swing.JFrame;

public class ArtFrame extends JFrame
{
	private ArtPanel appPanel;
	
	public ArtFrame(ArtController app)
	{
		super();
		appPanel = new ArtPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame() 
	{
		this.setSize(1200, 700);
		this.setContentPane(appPanel);
		this.setTitle("Creating modern art in Java");
		this.setVisible(true);
	}
}
