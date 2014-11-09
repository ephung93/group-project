import javax.swing.JFrame;


public class Registration implements Screen {
	
	public void createLayout()
	{
		JFrame frame = new JFrame("Registration");
		frame.setSize(1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.getContentPane().add(BorderLayout.CENTER);
		frame.setVisible(true);
	}

}
