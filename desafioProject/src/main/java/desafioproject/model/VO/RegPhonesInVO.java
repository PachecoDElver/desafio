package desafioproject.model.VO;

public class RegPhonesInVO {
	public String getNumber() {
		return number;
	}
	public String getCitycode() {
		return citycode;
	}
	public String getContrycode() {
		return contrycode;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public void setContrycode(String contrycode) {
		this.contrycode = contrycode;
	}
	private String number;
	private String citycode;
	private String contrycode;
}
