package models;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ComputersManager {

	ArrayList<Computers> computersList = new ArrayList<Computers>();
	
	public void addComputer() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Computer's id: "));
		String cpu = JOptionPane.showInputDialog("Computer's cpu: ");
		String gpu = JOptionPane.showInputDialog("Computer's gpu: ");
		int ram = Integer.parseInt(JOptionPane.showInputDialog(("Computer's ram: ")));
		Computers computer = new Computers(ram, gpu, gpu, ram);
		computer.setId(id);
		computer.setCPU(cpu);
		computer.setGPU(gpu);
		computer.setRAM(ram);
		computersList.add(computer);
	}
	
	public void removeComputer() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Id of the computer you want to remove: "));
		for (int i = 0; i < computersList.size(); i++) {
			if (computersList.get(i).getId() == num) {
				computersList.remove(i).getId();
			}
		}
	}
	
	public void clearList() {
		computersList.clear();
	}
	
	public void getComputers() {
		String string = "";
		for (int i = 0; i < computersList.size(); i++) {
			string += "Computer: " + (i+1) + "\n";
			string += "Id: " + computersList.get(i).getId() + "\n";
			string += "CPU: " + computersList.get(i).getCPU() + "\n";
			string += "GPU: " + computersList.get(i).getGPU() + "\n";
			string += "RAM: " + computersList.get(i).getRAM() + "\n\n";
		}
		if (computersList.size() != 0) {
			JOptionPane.showMessageDialog(null, string);
		} else {
			JOptionPane.showMessageDialog(null, "There aren't Pc's in the list.");
		}
	}
	
}