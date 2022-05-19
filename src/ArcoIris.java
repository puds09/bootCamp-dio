import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArcoIris {

	public static void main(String[] args) {
		Set<String> arcoIris = new HashSet<>();
		arcoIris.add("vermelho");
		arcoIris.add("laranja");
		arcoIris.add("amarelo");
		arcoIris.add("verde");
		arcoIris.add("azul");
		arcoIris.add("anil");
		arcoIris.add("violeta");

  
//		Imprima uma cor em baixo da outra
//		for (String cor : arcoIris) {
//			System.out.println(cor);
//			
//		}
		
		
//		Imprima a quantidade de cores do arco iris
//		System.out.println(arcoIris.size());
		
		
//		Exiba as cores em ordem alfabética
//		Set<String> arcoIris2 = new TreeSet<>(arcoIris);
//		System.out.println(arcoIris2);
		
		
//		Exiba as cores na ordem inversa da que foi informada
		Set<String> arcoIris3 = new LinkedHashSet<>(
				Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho")
				);
		System.out.println(arcoIris3);
		List<String> lista = new ArrayList<>( arcoIris3);
		Collections.reverse(lista);
		System.out.println(lista);
		
        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: arcoIris) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = arcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(arcoIris);

        System.out.println("Limpe o conjunto: ");
        arcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + arcoIris.isEmpty());
		
	}
		
		
}
