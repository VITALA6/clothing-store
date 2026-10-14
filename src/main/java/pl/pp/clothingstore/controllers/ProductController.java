package pl.pp.clothingstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.pp.clothingstore.domain.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/product")
    public String product(Model model) {
        Product product = new Product(1L, "Kurtka puchowa", "Kurtki", "Zima", "M",
                LocalDate.of(2026, 10, 1), 1299.99f, true);
        model.addAttribute("product", product);
        return "product";
    }

    @GetMapping("/products")
    public String products(Model model) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Kurtka puchowa", "Kurtki", "Zima", "M",
                LocalDate.of(2026, 10, 1), 1299.99f, true));
        products.add(new Product(2L, "T-shirt", "Koszulki", "Lato", "L",
                LocalDate.of(2026, 5, 12), 59.9f, true));
        products.add(new Product(3L, "Sweter", "Swetry", "Jesień", "S",
                LocalDate.of(2026, 9, 3), 249.0f, false));
        model.addAttribute("products", products);
        return "products";
    }
}
