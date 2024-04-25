package dev.dashaun.graphql.coffee;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
class CoffeeService {

    private final List<Coffee> coffees = new ArrayList<>();
    AtomicInteger id = new AtomicInteger(0);

    List<Coffee> findAll() {
        return coffees;
    }

    Optional<Coffee> findOne(Integer id) {
        return coffees.stream().filter(coffee -> Objects.equals(coffee.id(), id)).findFirst();
    }

    Coffee create(String name, Size size) {
        Coffee coffee = new Coffee(id.incrementAndGet(), name, size);
        coffees.add(coffee);
        return coffee;
    }

    Coffee update(Integer id, String name, Size size) {
        Coffee updatedCoffee = new Coffee(id, name, size);
        Optional<Coffee> optional = coffees.stream().filter(c -> Objects.equals(c.id(), id)).findFirst();
        if (optional.isPresent()) {
            Coffee coffee = optional.get();
            int index = coffees.indexOf(coffee);
            coffees.set(index, updatedCoffee);
        } else {
            throw new IllegalArgumentException("Invalid coffee");
        }
        return updatedCoffee;
    }

    Coffee delete(Integer id) {
        Coffee coffee = coffees.stream().filter(c -> Objects.equals(c.id(), id))
                .findFirst().orElseThrow(IllegalArgumentException::new);
        coffees.remove(coffee);
        return coffee;
    }

    @PostConstruct
    private void init() {
        coffees.add(new Coffee(id.incrementAndGet(), "Caffè Americano", Size.GRANDE));
        coffees.add(new Coffee(id.incrementAndGet(), "Caffè Latte", Size.VENTI));
        coffees.add(new Coffee(id.incrementAndGet(), "Caffè Caramel Macchiato", Size.TALL));
    }
}