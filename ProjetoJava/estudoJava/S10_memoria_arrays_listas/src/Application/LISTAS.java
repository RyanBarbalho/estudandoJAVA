package Application;
// COMANDOS>>>
// tamanho da lista: size()
// inserir elemento na lista: add(obj), add(int,obj)
// remover: remove(obj), remove(int), removeIf(Predicate)
// encontrar posiçao de elemento: indexOf(obj), lastIndex(obj)
// filtra lista com base em predicado: List<Integer> result = list.stream().filter(x -> x> 4).collect(collectors.toList());
// encontrar primeira ocorrencia com base em predicado: Integer result = list.stream().filter(x -> x>4).findFirst().orElse(null);

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LISTAS {

    public static void main(String[] args) {
        //lista de inteiros e deve se instanciar ela
        //usando a arraylist
        List<String> lista = new ArrayList<>();
    
        lista.add("Blonga");
        lista.add("Trolios");
        lista.add("Grolios");
        lista.add("Blondres");

        System.out.println(lista.size());
        

        for(String i : lista){
            System.out.println(i);
        }
        //remover com predicado (primeiro caractere é B)
        lista.removeIf(i -> i.charAt(0) == 'B');
        System.out.println("--------------------------------");
        for(String i : lista){
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        System.out.println("Index of Grolios: " + lista.indexOf("Grolios"));
        
        lista.add("Crolios");
        lista.add("Chogles");
        lista.add("Crobles");

        for(String i : lista){
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        //agora vamos filtrar a lista (os que comecem com b)
        //                    converto pra stream//faço operaçao lambda         //volta ele pra lista
        List<String> result = lista.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());

        for(String i : result){
            System.out.println(i);
        }
        System.out.println("----------------------------------");
        //agora fazer um comando pra encontrar o primeiro elemento que satisfaça o predicado
        //, se nao existir retorna nulo

        String name = lista.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
        System.out.println(name); 
        
    }   


}
