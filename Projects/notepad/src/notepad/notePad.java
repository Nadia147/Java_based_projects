package notepad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class notePad implements ActionListener {

	public static void main(String[] args) {
		new notePad();
		

	}
	JTextArea textarea=new JTextArea();
	JScrollPane scroll=new JScrollPane(textarea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	JFrame jf=new JFrame();
	JMenuBar jm=new JMenuBar();
	JMenu fileMenu=new JMenu("File");
	JMenuItem fNew=new JMenuItem("New");
	JMenuItem fOpen=new JMenuItem("Open");
	JMenuItem fSave=new JMenuItem("Save");
	JMenuItem fSaveAs=new JMenuItem("SaveAs");
	JMenuItem fPrint=new JMenuItem("Print");
	JMenuItem fExit=new JMenuItem("Exit");
	
	public notePad() {
		fNew.addActionListener(this);
		fileMenu.add(fNew);
		fileMenu.add(fOpen);
		fileMenu.add(fSave);
		fileMenu.add(fSaveAs);
		fileMenu.add(fPrint);
		fileMenu.add(fExit);
		scroll.setSize(595,495);
		jm.add(fileMenu);
		jf.add(scroll);
		jf.setJMenuBar(jm);
		jf.setTitle("My NotePad");
		jf.setSize(600, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent a) {
if(a.getSource().equals(fExit)) {
	JOptionPane.showMessageDialog(null,"hi");
}
		
	}

}
