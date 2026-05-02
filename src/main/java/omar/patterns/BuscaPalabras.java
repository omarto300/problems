package omar.patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscaPalabras {

    public int numeroPalabras(String frase){
        String regex = "\\berror\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(frase);
        int contador = 0;
        while(matcher.find()){
            contador++;
        }
        return contador;
    }
}
