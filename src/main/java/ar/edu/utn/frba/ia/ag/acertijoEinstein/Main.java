package main.java.ar.edu.utn.frba.ia.ag.acertijoEinstein;

import main.java.ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import main.java.ar.edu.utn.frba.ia.ag.ConfiguracionDefault;
import main.java.ar.edu.utn.frba.ia.ag.Individuo;

public class Main {
	
	public static void main(String[] args) {
		
		AlgoritmoGenetico acertijoEinstein = new AlgoritmoGenetico(new ConfiguracionDefault(), Cromosoma.class);
		
		Individuo cromosoma = acertijoEinstein.ejecutar();
		
	}

}
