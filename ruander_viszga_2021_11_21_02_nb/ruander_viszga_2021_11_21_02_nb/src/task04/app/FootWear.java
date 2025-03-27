package task04.app;

public class FootWear {

	private Integer id;
	private String brand;
	private String model;
	private Double netPrice;
	private Byte category;
	private Boolean sale;

	public FootWear(Integer id, String brand, String model, Double netPrice, Byte category, Boolean sale) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.netPrice = netPrice;
		this.category = category;
		this.sale = sale;
	}

	public Integer getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public Double getNetPrice() {
		return netPrice;
	}

	public Byte getCategory() {
		return category;
	}

	public Boolean isSale() {
		return sale;
	}
	
	public String getIsSaleText() {
		String result = "nem akciós";
		if (this.sale) {
			result = "akciós";
		}
		return result;
	}
	
	public String getCategoryText() {
		String result = "";
        if (this.category == 1) {
            result = "férfi";
        } else if (this.category == 2) {
            result = "női";
        } else if (this.category == 3) {
            result = "gyermek";
        }
        return result;
	}

	@Override
	public String toString() {
		return "FootWear [id=" + id + ", brand=" + brand + ", model=" + model + ", netPrice=" + netPrice + ", category="
				+ category + ", isSale=" + sale + "]";
	}
	
	public String getAllDataJoinedByDivider(char divider) {
		return id +""+ divider + brand + divider + model + 
				divider + netPrice + divider + getCategoryText() + divider + getIsSaleText();
	}
}
