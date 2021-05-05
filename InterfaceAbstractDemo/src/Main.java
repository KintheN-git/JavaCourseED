import java.time.LocalDate;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer1 = new Customer(1,"Engin","Demiro�",LocalDate.of(1985, 1, 6),"22246098788");
		customerManager.save(customer1);
		
		
	}

}
