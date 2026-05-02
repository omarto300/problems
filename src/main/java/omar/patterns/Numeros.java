package omar.patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numeros {

    public int[] buscarNumeros(String num){
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(num);
        List<Integer> numeros = new ArrayList<>();
        while (matcher.find()){
            numeros.add(Integer.parseInt(matcher.group()));
        }
        System.out.println(numeros);
        return numeros.stream().mapToInt(Integer::intValue).toArray();
    }

    public int bianaryGaps(String numeroBinario){
        String regex = "(?=(1(0+1)))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numeroBinario);
        int contador = 0;
        while (matcher.find()){
            System.out.println(matcher.group());
            contador++;
        }
        return contador;
    }
}
