package task05.app.entity;

public class MotorCycleCategory {
	private Integer id;
	private String name;
	
	public MotorCycleCategory(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
	
    public Integer getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

	@Override
	public String toString() {
		return "MotorCycleCategory [id=" + id + ", name=" + name + "]";
	}
}
