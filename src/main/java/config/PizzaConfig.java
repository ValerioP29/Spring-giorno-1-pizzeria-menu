package config;

import com.pizzeria.pizzeria_menu.Drink;
import com.pizzeria.pizzeria_menu.Menu;
import com.pizzeria.pizzeria_menu.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class PizzaConfig {

    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 7, 890, Arrays.asList("Tomato", "Mozzarella"));
    }

    @Bean
    public Pizza hawaiian() {
        return new Pizza("Hawaiian Pizza", 18, 1024, Arrays.asList("Tomato", "Cheese", "Ham", "Pineapple"));
    }

    @Bean
    public Drink coca() {
        return new Drink("CocaCola", 4, 0.33, 300);
    }

    @Bean
    public List<String> toppings() {
        return Arrays.asList("Cheese", "Ham", "Onions", "Pineapple", "Salami");
    }

    // Qui definiamo un singolo bean di tipo Menu
    @Bean
    public Menu menu() {
        return new Menu(
                Arrays.asList(margherita(), hawaiian()), // Lista delle pizze
                toppings(),                             // Lista dei toppings
                Arrays.asList(coca())                   // Lista delle bevande
        );
    }
}
