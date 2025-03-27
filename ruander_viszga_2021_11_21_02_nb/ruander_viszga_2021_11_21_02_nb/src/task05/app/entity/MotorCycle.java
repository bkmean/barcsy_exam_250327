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
        return status ? "aktív" : "inaktív";
    }

    public String getName() {
        return category.getName();
    }

    public Object getProperty(int index) {
        Object obj = null;
        switch (index) {
            case 0:
                obj = id;
                break;
            case 1:
                obj = manufacturer;
                break;
            case 2:
                obj = model;
                break;
            case 3:
                obj = getName();
                break;
            case 4:
                obj = getStatusText();
                break;
        }
        return obj;
    }

    @Override
    public String toString() {
        return "MotorCycle [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", category=" + category
                + ", status=" + status + "]";
    }
}
