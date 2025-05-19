package org.example.intermediate.dateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Chronos {
    public static void main(String[] args) {
        // Representa una fecha sin hora ni zona horaria. Ideal para cumpleaños, aniversarios o fechas de vencimiento.
        LocalDate today = LocalDate.now();
        System.out.println("today: " + today); // 2025-05-15

        LocalDate specificData = LocalDate.of(2025, 5, 15);
        System.out.println("specificData: " + today);

        // Representa una hora sin fecha ni zona horaria. Útil para horarios de apertura o eventos programados.
        LocalTime now = LocalTime.now();
        System.out.println("now: " + now);

        LocalTime specificTime = LocalTime.of(14, 30);
        System.out.println("specificTime: " + specificTime);

        // Combina fecha y hora sin zona horaria. Es útil para representar eventos que ocurren en una fecha
        // y hora específicas sin importar la zona horaria.
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime: " + nowDateTime);

        LocalDateTime specificDateTime = LocalDateTime.of(2025, 5, 15, 14, 30);
        System.out.println("specificDateTime: " + specificTime);


        //Representa una fecha y hora con zona horaria. Es esencial para aplicaciones que necesitan manejar múltiples
        // zonas horarias, como calendarios globales o sistemas distribuidos.
        ZonedDateTime nowInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("nowInParis:" + nowInParis);

        ZonedDateTime specificZoneDateTime = ZonedDateTime.of(specificDateTime, ZoneId.of("America/Mexico_City"));
        System.out.println("specificZoneDateTime: " + specificZoneDateTime);


        // Representa un punto específico en la línea de tiempo (timestamp), útil para marcas de tiempo precisas,
        // como registros de eventos o medición de tiempo.
        Instant timestamp = Instant.now();

        // Representa una cantidad de tiempo en segundos y nanosegundos. Es útil para medir intervalos de tiempo precisos.
        Duration duration = Duration.ofHours(5);
        Duration between = Duration.between(LocalTime.of(10, 0), LocalTime.of(15, 30));

        // Representa una cantidad de tiempo en años, meses y días. Es útil para calcular edades o diferencias entre fechas.
        Period period = Period.of(1, 2, 15); // 1 año, 2 meses, 15 días
        Period age = Period.between(LocalDate.of(1990, 1, 1), LocalDate.now());


        // 🧭 Zona Horaria y Ajustes
        // ZoneId y ZoneOffset
        //ZoneId representa una zona horaria, mientras que ZoneOffset representa un desplazamiento fijo desde UTC.
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZoneOffset offset = ZoneOffset.of("-05:00");


        // 9. Ajustes de fecha y hora
        //Puedes modificar fechas y horas utilizando métodos como plus(), minus() y with().
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate lastWeek = LocalDate.now().minusWeeks(1);
        LocalDate nextMonth = LocalDate.now().withMonth(6);

        // 🧾 Formateo y Parseo
        //10. DateTimeFormatter
        //Permite formatear y analizar fechas y horas en cadenas de texto con patrones personalizados.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = LocalDateTime.now().format(formatter);
        LocalDateTime parsedDate = LocalDateTime.parse("15/05/2025 14:30:00", formatter);
    }
}
