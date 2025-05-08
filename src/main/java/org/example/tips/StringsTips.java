package org.example.tips;

public class StringsTips {
    public static void main(String[] args) {
        // Técnicas de Optimización de Strings

        // ❌ ineficiente
        String s = "";
        for (int i = 0; i < 100; i++)
            s += i;

        // ✅ Usar StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++)
            sb.append(i);
        String sbResult = sb.toString();
        System.out.println("sbResult " + sbResult);

    }
}
