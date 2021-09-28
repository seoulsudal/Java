
public class CellPhone {

	// 필드
	private String modelName;			// 모델명
	private String manufactureCompany;	// 제조회사
	private String color;				// 색상
	private boolean power;				// 전원 여부
	private boolean camera;				// 카메라 여부
	
	// 메소드
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getManufactureCompany() {
		return manufactureCompany;
	}
	public void setManufactureCompany(String manufactureCompany) {
		this.manufactureCompany = manufactureCompany;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public boolean isCamera() {
		return camera;
	}
	public void setCamera(boolean camera) {
		this.camera = camera;
	}				

	public void powerStatuse() {
		if(power == true) {
			System.out.println("전원이 켜졌습니다.");
		}
		else{
			System.out.println("전원이 켜졌습니다.");
		}
	}
		
}
