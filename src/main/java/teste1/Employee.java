package teste1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
//@Table(name = "EMPLOYEE")
public class Employee {
	
		/*
 
	    @Id
	    @Column(name = "id")
	    private int id;
	 
	    @Column(name = "fistName")
	    private String firstName;
	 
	    @Column(name = "lastName")
	    private String lastName;
	 
	    @Column(name = "dept")
	    private String dept;
	    */
	
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column (name="id")
		private int id;
		
		@Column (name="firstName")
		private String firstName;
		
		@Column (name="lastName")
	    private String lastName;
		
		@Column (name="dept")
	    private String dept;
		
		
	    public Employee() {
	    	
	    }
	    
	    //this.setId(id);
	    public Employee(String firstName, String lastName, String dept) {
	        
	        this.setFirstName(firstName);
	        this.setLastName(lastName);
	        this.setDept(dept);
	    }
	 
	    public int getId() {
	        return id;
	    }
	 
	    public void setId(int id) {
	        this.id = id;
	    }
	 
	    public String getFirstName() {
	        return firstName;
	    }
	 
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	 
	    public String getLastName() {
	        return lastName;
	    }
	 
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	 
	    public String getDept() {
	        return dept;
	    }
	 
	    public void setDept(String dept) {
	        this.dept = dept;
	    }
}
