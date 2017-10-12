package smplApp;

public class Network {
	private Device dev;
	private String name;
	
	public Network(Device dev, String name) {
		super();
		this.dev = dev;
		this.name = name;
	}
	
	public Device getDev() {
		return dev;
	}
//	public void setDev(Device dev) {
//		this.dev = dev;
//	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
	@Override
	public String toString() {
		return "\"" + name + "\": {" + dev.toString() + "}";
	}
}
