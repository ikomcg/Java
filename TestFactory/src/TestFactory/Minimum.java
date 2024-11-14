package TestFactory;

public class Minimum extends Laptop{
	
	private int ram, ssd;
	private String cpu;
	
	public Minimum(int ram, int ssd, String cpu){
		  this.ram=ram;
		  this.ssd=ssd;
		  this.cpu=cpu;
		}
	

	@Override
	public int getSSD() {
		// TODO Auto-generated method stub
		return this.ssd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}


	@Override
	public int getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}
}