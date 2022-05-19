import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demografia {

	public static void main(String[] args) {
		Map<String, Integer> populacao = new HashMap<String, Integer>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
		
        System.out.println(populacao);
        
//        Substitua a população do estado RN por 3534165
//        populacao.put("RN", 3534165);
//        System.out.println(populacao);
        
        
//        Confira se o estado PB está no dicionário, caso negativo, adicione-o com valor 4039277
//        populacao.put("PB", 4039277);
//        System.out.println(populacao);
        
        
//        Exiba todos os estados e suas populaçãos na ordem em que foram informados
//        Map<String, Integer> populacao2 = new LinkedHashMap<String, Integer>() {{
//            put("PE", 9616621);
//            put("AL", 3351543);
//            put("CE", 9187103);
//            put("RN", 3534265);
//            put("PB", 4039277);
//        }};
//        System.out.println(populacao2);
        
	}
}
