package jdbc;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;  
public class Test {
public static void main(String...scs)
{
	 Resource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	    StudentDao dao=(StudentDao)factory.getBean("d");  
	    Student e=new Student();  
	    e.setRno(114);  
	    e.setSname("varun");  
	    e.setBranch("CS");
	    e.setFees(12000);
	    dao.saveStudent(e);
	      
	          
}
}
