package lab7.item.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class FlowerController {
    private static final double EXAMPLE_LENGTH = 15.0;
    private static final double EXAMPLE_PRICE = 10;

    @GetMapping
    public List<Flower> flowers() {
        return List.of(
                new Flower(
                        EXAMPLE_LENGTH,
                        FlowerColor.RED,
                        EXAMPLE_PRICE
                )
        );
    }
}
