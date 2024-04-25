package dev.dashaun.graphql.coffee;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
class CoffeeController {

    private final CoffeeService coffeeService;

    CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @QueryMapping
    List<Coffee> findAll() {
        return coffeeService.findAll();
    }

    @QueryMapping
    Optional<Coffee> findOne(@Argument Integer id) {
        return coffeeService.findOne(id);
    }

    @MutationMapping
    Coffee create(@Argument String name, @Argument Size size) {
        return coffeeService.create(name,size);
    }

    @MutationMapping
    Coffee update(@Argument Integer id, @Argument String name, @Argument Size size) {
        return coffeeService.update(id,name,size);
    }

    @MutationMapping
    Coffee delete(@Argument Integer id) {
        return coffeeService.delete(id);
    }
}