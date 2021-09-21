package models;

public class Computers {

	private int id;
	private String cpu;
	private String gpu;
	private int ram;
	
	public Computers(int id, String cpu, String gpu, int ram) {
		this.id = id;
		this.cpu = cpu;
		this.gpu = gpu;
		this.ram = ram;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCPU() {
		return cpu;
	}

	public void setCPU(String cpu) {
		this.cpu = cpu;
	}

	public String getGPU() {
		return gpu;
	}

	public void setGPU(String gpu) {
		this.gpu = gpu;
	}

	public int getRAM() {
		return ram;
	}

	public void setRAM(int ram) {
		this.ram = ram;
	} 
	
}