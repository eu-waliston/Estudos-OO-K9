package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Listas {
    public static void main(String[] args) {

        //ArrayList arrayList = new ArrayList();
        //LinkedList linkedList = new LinkedList();
        // Vector vector = new Vector();

        //Podemos aplicar o polimorfismo e referenciar objetos criados a partir das classes:
        // ARRAYLIST, LINKEDLIST e VECTOR como LIST:
        List list1 = new ArrayList();
        List list2 = new LinkedList();
        List list3 = new Vector();


        //Metodos Add(object);
        //O método ADD (O BJECT ) adiciona uma referência no final da lista e aceita referências de
        //qualquer tipo.

        list1.add(258);
        list1.add("Waliston");
        list1.add(1575.78);
        list1.add("Marcela Martins");

        //Metodo Add(int, Object)
        //O metodo Add(int, object) adiciona uma referencia em uma determinada poisção da lista

        list2.add(0, "Jonas Hiranota");
        list2.add(1, "Rafael Cosentino");
        list2.add(2, "Marcelo Martins");
        list2.add(3, "Thiago Thies");
        list2.add(4, "Waliston");

        //Metodo SIZE()
        //O método SIZE () informa a quantidade de elementos armazenado na lista.
        System.out.println(list2.size());

        //Metodo CLEAER()
        //O metodo clear. remove todos os elementos da lista
        list1.clear();
        System.out.println(list1.size());

        //Metodo contains(Object)
        //Para verificar se um elemento está contido em uma lista podemos utilizar o método
        //CONTAINS (O BJECT )

        System.out.println(list2.contains("Waliston"));

        //metodo REMOVE(object)
        //Podemos retirar elementos de uma lista através do metodo remove() este metodo remove o primeiro elemento passado como parametro
        list2.remove("Waliston");
        System.out.println(list2.size());

        //metodo REMOVE(int)
        //outra maneira de retirar elementos de uma lista e com o uso do remove(int) so que com a posição do index
        list2.remove(2);


        //Metodo GET(int)
        //Para recuperar um elemento de uma determinada posição podemos utilizar o metodo GET passando o index
        System.out.println(list2.get(2));

        //Metodo indexOf(object)
        //Para descobrir o índice da primeira ocorrência de um determinad elemento podemos utilizar o método INDEX O F(O BJECT).
        list2.indexOf("Waliston");
    }
}
