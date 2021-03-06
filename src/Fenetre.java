import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame {

	private static final long serialVersionUID = 1L;

	public Fenetre(int l, int h){
		this.setSize(l,h);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void changerFond(JPanel fond) {
		setContentPane(fond);
		revalidate();
	}
}
