package jdbc;
//import org.springframework.jdbc.core.JdbcTemplate; 

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDao {
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	//method to save employee  
	public void saveStudent(Student e){  
	    template.save(e);  
	}  
	public void updateStudent(Student e){  
	    template.update(e);  
	}  
	
	
}
