package desafioproject.model.VO;

import java.util.Date;

public class RegUsuarioOutVO {
	public String getId() {
		return id;
	}
	public Date getCreated() {
		return created;
	}
	public Date getModified() {
		return modified;
	}
	public Date getLast_login() {
		return last_login;
	}
	public String getToken() {
		return token;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	private String id;
	private Date created;
	private Date modified;
	private Date last_login;
	private String token;
	private boolean isactive;
}
