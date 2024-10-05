package codeWars;

import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static String greet(String language) {
        // your code
        Map<String, String> greetsMap = new HashMap<>();
        greetsMap.put("english", "Welcome");
        greetsMap.put("czech", "Vitejte");
        greetsMap.put("danish", "Velkomst");
        greetsMap.put("dutch", "Welkom");
        greetsMap.put("estonian", "Tere tulemast");
        greetsMap.put("finnish", "Tervetuloa");
        greetsMap.put("flemish", "Welgekomen");
        greetsMap.put("french", "Bienvenue");
        greetsMap.put("german", "Willkommen");
        greetsMap.put("irish", "Failte");
        greetsMap.put("italian", "Benvenuto");
        greetsMap.put("latvian", "Gaidits");
        greetsMap.put("lithuanian", "Laukiamas");
        greetsMap.put("polish", "Witamy");
        greetsMap.put("spanish", "Bienvenido");
        greetsMap.put("swedish", "Valkommen");
        greetsMap.put("welsh", "Croeso");

        return greetsMap.get(language);
    }
}