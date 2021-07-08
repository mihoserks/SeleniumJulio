package javabasics;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	
	public List<String> listaDeNombres(){
		
		List<String> listaNombres = new ArrayList<>();
		listaNombres.add("Jesus");
		listaNombres.add("Karen");
		listaNombres.add("Ian");
		listaNombres.add("Jesus");
		listaNombres.add("Estrella");
		
		return listaNombres;
	}
	public List<String> listaDeNombres2(){
		
		List<String> listaNombres = new ArrayList<>();
		listaNombres.add("Jesus");
		listaNombres.add("Karen");
		listaNombres.add("Ian");
		listaNombres.add("Jesus");
		listaNombres.add("Estrella");
		
		return listaNombres;
	}
	
	public List<Integer> listaDeEdades(){
		
		List<Integer> listaEdades = new ArrayList<>();
		listaEdades.add(32);
		listaEdades.add(32);
		listaEdades.add(5);
		listaEdades.add(8);
		listaEdades.add(32);
		
		return listaEdades;
	}
}
