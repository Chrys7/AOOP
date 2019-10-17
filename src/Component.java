
public class Component extends Smartphone 
{
	private Smartphone vendor;
	
	public Component(String phone_name, int version, Smartphone vendor)
	{
		super(phone_name, version);
		this.vendor = vendor;
	}

	public Smartphone getVendor() {
		return vendor;
	}

	public void setVendor(Smartphone vendor) {
		this.vendor = vendor;
	}
}
