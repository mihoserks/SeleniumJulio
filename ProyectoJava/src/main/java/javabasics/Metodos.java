package javabasics;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class Metodos {

	
	public static void main(String[] args) {
		
		Lista objLista = new Lista();
		
		List<String> listaNombres = objLista.listaDeNombres();
		Collections.sort(listaNombres);
		List<Integer> listaEdades = objLista.listaDeEdades();
		
		for (String nombre : listaNombres) {
			System.out.println(nombre);
		}
		for (int edad=0; edad<listaEdades.size(); edad++) {
			System.out.println(listaEdades.get(edad));
		}
		/*for (int edad : listaEdades) {
			System.out.println(edad);
		}*/
		List<String> listaSinDuplicados = listaNombres.stream().distinct().collect(Collectors.toList());
		Collections.sort(listaSinDuplicados, Collections.reverseOrder());
		System.out.println(listaSinDuplicados);
		
		System.out.println(Collections.max(listaEdades));
		System.out.println(Collections.min(listaEdades));
		Collections.sort(listaEdades);
		System.out.println(listaEdades);
		Collections.sort(listaEdades, Collections.reverseOrder());
		System.out.println(listaEdades);
		
		Object last = null;
		int numCount = 0;
		Iterator<Integer> i = listaEdades.iterator();

		while (i.hasNext()) {
			Object temp = i.next();
			if (temp.equals(last)) {
				i.remove();
				numCount++;
			}else {
				last=temp;
			}
			
		}
		
		System.out.println(numCount);
		System.out.println(listaEdades);
		
		List<String> nombres1 = objLista.listaDeNombres();
		List<String> nombres2 = objLista.listaDeNombres2();
		Collections.sort(nombres1);
		Collections.sort(nombres2);
		boolean diferencia = nombres1.equals(nombres2);
		System.out.println(diferencia);
		if (diferencia==true) {
			System.out.println("Las listas son Iguales: \n");
			System.out.println("Lista 1: "+nombres1+" Lista 2: "+nombres2);
		}
		else {
			System.out.println("Las listas son Diferentes:");
			System.out.println("Lista 1: "+nombres1+" Lista 2: "+nombres2);
		}
		
	}
	
	
}
