package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("a");
		lista.add("b");
		lista.add("c");
		
//		for(String e: lista){
//			System.out.println(e);
//		}
		
		Iterator<String> stringIteratorInverso = new StringIteratorInverso(lista);
		Iterator<String> stringIteratorNormal = new StringIteratorNormal(lista);
		
		System.out.println("Lista Normal: ");
		while(stringIteratorNormal.hasNext()){
			System.out.println(stringIteratorNormal.next());
		}
		System.out.println("-------------");
		
		
		System.out.println("Lista Inversa: ");
		while(stringIteratorInverso.hasNext()){
			System.out.println(stringIteratorInverso.next());
		}
		System.out.println("-------------");
		
	}

}
