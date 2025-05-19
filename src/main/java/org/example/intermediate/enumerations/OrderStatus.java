package org.example.intermediate.enumerations;

import java.util.Locale;
import java.util.ResourceBundle;

public enum OrderStatus {
    NEW("New Order"),
    PROCESSING("In Process"),
    SHIPPED("Shipped to Customer"),
    DELIVERED("Delivered");

    private String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public String getLabel(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("i18n.messages", locale);
        return bundle.getString("orderstatus." + this.name().toLowerCase());
    }

}