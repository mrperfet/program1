package shopping.mall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class customer
{
	 private Integer c_id;
	  private String c_name;
	  private String c_email;
	  private int c_phno;
	  
	  
	  
	public customer()
	{
		super();
	}
	public customer(Integer c_id, String c_name, String c_email, int c_phno) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_email = c_email;
		this.c_phno = c_phno;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getC_id() {
		return c_id;
	}
	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	public int getC_phno() {
		return c_phno;
	}
	public void setC_phno(int c_phno) {
		this.c_phno = c_phno;
	}
	@Override
	public String toString() {
		return "customer [c_id=" + c_id + ", c_name=" + c_name + ", c_email=" + c_email + ", c_phno=" + c_phno + "]";
	}
	  
	  
}
