
public class Smartphone 
{
	private String phone_name;
	private int version;
	
	public Smartphone(String phone_name, int version)
	{
		super();
		this.phone_name = phone_name;
		this.version = version;
	}

	public String getPhone_name() {
		return phone_name;
	}

	public void setPhone_name(String phone_name) {
		this.phone_name = phone_name;
	}

	public int getVersion() 
	{
		return version;
	}

	public void setVersion(int version) 
	{
		this.version = version;
	}
	
}