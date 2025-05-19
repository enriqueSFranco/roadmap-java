package org.example.intermediate.enumerations;

import java.util.Locale;
import java.util.ResourceBundle;

public class Enumi18nHelper {
    public static String getLabel(Enum<?> e, Locale locale) {
        String key = e.getClass().getSimpleName().toLowerCase() + "." + e.name().toLowerCase();
        ResourceBundle bundle = ResourceBundle.getBundle("i18n.messages", locale);
        return bundle.getString(key);
    }

}
