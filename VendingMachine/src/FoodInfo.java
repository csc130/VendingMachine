import java.math.BigDecimal;


public class FoodInfo {
	BigDecimal price;
	String name;
	String nutiFacts;
	String itemType;
	
	
	public FoodInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodInfo(BigDecimal price, String name, String nutiFacts,
			String itemType) {
		super();
		this.price = price;
		this.name = name;
		this.nutiFacts = nutiFacts;
		this.itemType = itemType;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNutiFacts() {
		return nutiFacts;
	}
	public void setNutiFacts(String nutiFacts) {
		this.nutiFacts = nutiFacts;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	@Override
	public String toString() {
		return "FoodInfo [price=" + price + ", name=" + name + ", nutiFacts="
				+ nutiFacts + ", itemType=" + itemType + "]";
	}
	
}
