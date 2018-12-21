package dom.jagadish.com.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeDAO dao = ctx.getBean("empdao", EmployeeDAO.class);
		System.out.println("Data Added");
		 dao.saveEmployee(new Employee(101, "Krish", 40000));
		dao.saveEmployee(new Employee(102, "Jai", 55000));
		dao.saveEmployee(new Employee(103, "Ching", 10000));
		/*System.out.println("Data Update");
		dao.retriveEmployee(new Employee(102));*/
		System.out.println("Data Deleted");
		dao.deleteEmployee(new Employee(103, "Ching", 10000));
		System.out.println("Data Updated");
		dao.updateEmployee(new Employee(102, "Jagadish", 600000));
	}
}
