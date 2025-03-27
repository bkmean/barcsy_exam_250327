package task05.app.entity;

public class MotorCycle {

	private Integer id;
	private String manufacturer;
	private String model;
	private MotorCycleCategory category;
	private Boolean status;

	public MotorCycle(Integer id, String manufacturer, String model, MotorCycleCategory category, Boolean status) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.model = model;
		this.category = category;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public MotorCycleCategory getCategory() {
		return category;
	}

	public Boolean getStatus() {
		return status;
	}

	public String getStatusText() {
		String result = "inaktív";
		if (!status) {
            result = "aktív";
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "MotorCycle [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", category=" + category
				+ ", status=" + status + "]";
	}
}
