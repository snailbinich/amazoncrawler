package amazon.model;

public class Product {
	
	private String name;
	private Integer inventory;
	private String asin;
	
	
	public Product(){
		super();
	}
	
	public Product(String asin) {
		super();
		this.asin = asin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getInventory() {
		return inventory;
	}
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	public String getAsin() {
		return asin;
	}
	public void setAsin(String asin) {
		this.asin = asin;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		sb.append(String.format("\"name\":\"%s\",", this.name));
		sb.append(String.format("\"inventory\":\"%s\",", this.inventory));
		sb.append(String.format("\"asin\":\"%s\"", this.asin));
		sb.append("}");
		return sb.toString();
	}
	
	
	
	
	

}
