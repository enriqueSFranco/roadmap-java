package org.example.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

class UserDTO {
    public final String username;
    public final int age;

    public UserDTO(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public static UserDTO create(String username, int age) {
        if (username == null || username.isBlank())
            throw new IllegalArgumentException("El nombre de usuario no puede estar vacío.");

        if (age < 18)
            throw new IllegalArgumentException("Debe ser mayor de edad.");

        return new UserDTO(username, age);
    }

    public String getUsername() {
        return this.username;
    }
}

class ProductDTO {
    public final Long id;
    public final String name;
    public final double price;

    public  ProductDTO(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ProductService {
    private final List<ProductDTO> stock;

    public ProductService(List<ProductDTO> stock) {
        this.stock = stock;
    }

    public Optional<ProductDTO> findProductById(Long id) {
        return this.stock.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
}

class UserFactory {
    // sobrecarga de metodos
    public UserDTO create(String username) {
        return new UserDTO(username, 0);
    }

    public UserDTO create(String name, int age) {
        return new UserDTO(name, age);
    }
}

public class Functions {
    private static Logger LOGGER = Logger.getLogger(Functions.class.getName());
    private static final List<ProductDTO> INITIAL_STOCK = List.of(
            new ProductDTO(1L, "iPhone 15 Pro", 32_000.99),
            new ProductDTO(2L, "MacBook Air", 22_500.00)
    );

    public static void main(String[] args) {
        UserDTO user = UserDTO.create("Carlos", 25);
        LOGGER.info("Usuario creado: " + user.getUsername());

        ProductService service = new ProductService(INITIAL_STOCK);
        Optional<ProductDTO> product = service.findProductById(1L);
        product.ifPresent(p ->
                LOGGER.info("Producto encontrado: " + p.getName() + " - $" + p.getPrice())
        );
    }
}
