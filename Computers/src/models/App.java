package models;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		ComputersManager cm = new ComputersManager();
		byte option;
		do {
			option = Byte.parseByte(JOptionPane.showInputDialog("Principal Menu: \n" + 
																"1. Add Computer. \n" +
																"2. Remove Computer. \n" +
																"3. Clear List. \n" +
																"4. Show List. \n" + 
																"5. Exit."));
			
			switch (option) {
			case 1:
				cm.addComputer();
				break;
			case 2:
				cm.removeComputer();
				break;
			case 3:
				cm.clearList();
				break;
			case 4:
				cm.getComputers();
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Good bye.");
				break;
			default:
				JOptionPane.showInternalMessageDialog(null, "Not found.");
				break;
			}
			
		} while (option != 5);
	}
	
}