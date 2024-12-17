import com.pizzeria.pizzeria_menu.Menu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.PizzaConfig;

public class PizzeriaMenuApplication {
	public static void main(String[] args) {
		// Creazione del contesto Spring
		ApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);

		// Recupero del Bean "menu"
		Menu menu = context.getBean(Menu.class);

		// Stampa del menu
		menu.printMenu();
	}
}
