package lab7.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "delivery")
public class DeliveryController {

    @GetMapping
    public String getDelivery() {
        return "Right now our shop can deliver products to you via post or via DHL";
    }
}
