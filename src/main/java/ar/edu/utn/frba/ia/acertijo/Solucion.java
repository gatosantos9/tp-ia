package main.java.ar.edu.utn.frba.ia.acertijo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.java.ar.edu.utn.frba.ia.ag.Individuo;

public class Solucion extends Individuo {

	private Casa[] posibleSolucion = new Casa[5];
	
	@Override
	public double aptitud() {
		
		double aptitud = 0;
		
		
		if(this.uno()){ //1
			aptitud = aptitud + 10;
		}else{
			aptitud = aptitud-2;
		}
		
		if(this.dos()){ //2
			aptitud = aptitud + 10;
		}else{
			aptitud = aptitud-2;
		}
		
		if(this.tres()){ //3
			aptitud = aptitud + 10;
		}else{
			aptitud = aptitud-2;
		}
		
		if(this.cuatro()){ //4
			aptitud = aptitud + 10;
		}else{
			aptitud = aptitud-2;
		}
		
		if(this.cinco()){ //5
			aptitud = aptitud + 10;
		}else{
			aptitud = aptitud-2;
		}
		
		if(this.seis()){ //6
			aptitud = aptitud + 10;
		}else{
			aptitud = aptitud-2;
		}
		
		if(this.siete()){ //7
			aptitud = aptitud + 10;
		}else{
			aptitud = aptitud-2;
		}

		if(this.ocho()){ //8
			aptitud = aptitud + 10;
		}else{
			aptitud = aptitud-2;
		}

		if(this.nueve()){ //9
			aptitud = aptitud + 10;
		}else{
			aptitud = aptitud-2;
		}

		if(this.diez()){ //10
			aptitud = aptitud + 10;
		}else{
			aptitud = aptitud-2;
		}
		
		return aptitud;
	}

	
	@Override
	public Individuo generarRandom(){

		Solucion solucion = new Solucion();
		
		solucion.posibleSolucion[0] = Persona.generarCasa();

		
		return solucion;
	
	}

	
	/****************************Criterios Para Funcion Aptitud***********************************/
	
	
	private boolean uno(){
		if (this.getCasaPorColor("Amarilla").getNumero() == 1 ){
			return true;
		}
		return false;
	}
	
	private boolean dos(){
        if (this.getCasaPorColor("Azul").getNumero() == 2 ){
			return true;
		}
		return false;
	}
	
	private boolean tres(){
		if (this.getNumero().equalsIgnoreCase("Tres")
				&& 
				this.getColor().equalsIgnoreCase("Roja")){
			return true;
		}
		return false;
	}
	
	private boolean cuatro(){
		if (this.getNumero().equalsIgnoreCase("Cuatro")
				&& 
				this.getColor().equalsIgnoreCase("Verde")){
			return true;
		}
        return false;
	}
	
	private boolean cinco(){
		if (this.getNumero().equalsIgnoreCase("Cinco")
				&& 
				this.getColor().equalsIgnoreCase("Blanca")){
			return true;
		}
        return false;
	}
	
	private boolean seis(){
		if (this.getNacionalidad().equalsIgnoreCase("Noruego")
				&& 
				this.getNumero().equalsIgnoreCase("Uno")){
			return true;
		}
        return false;
	}
	
	private boolean siete(){
		if (this.getNacionalidad().equalsIgnoreCase("Noruego")
				&& 
				this.getFuma().equalsIgnoreCase("Dunhill")){
			return true;
		}
        return false;
	}
	
	private boolean ocho(){
		if (this.getNumero().equalsIgnoreCase("Dos")
				&& 
				this.getMascota().equalsIgnoreCase("Caballo")){
			return true;
		}
        return false;
	}

    private boolean nueve(){
		if (this.getNacionalidad().equalsIgnoreCase("Britanico")
				&& 
				this.getNumero().equalsIgnoreCase("Tres")){
			return true;
		}
        return false;
	}
    
    private boolean diez(){
		if (this.getNacionalidad().equalsIgnoreCase("Britanico")
				&& 
				this.getBebe().equalsIgnoreCase("Leche")){
			return true;
		}
        return false;
	}
	
	private boolean once(){
		if (this.getNumero().equalsIgnoreCase("Cuatro")
				&& 
				this.getBebe().equalsIgnoreCase("Cafe")){
			return true;
		}
        return false;
	}
    
    private boolean doce(){
		if (this.getNacionalidad().equalsIgnoreCase("Sueco")
				&& 
				this.getMascota().equalsIgnoreCase("Perro")){
			return true;
		}
        return false;
	}

    private boolean trece(){
		if (this.getNacionalidad().equalsIgnoreCase("Danes")
				&& 
				this.getBebe().equalsIgnoreCase("Te")){
			return true;
		}
	}

    private boolean catorce(){
		if (this.getNacionalidad().equalsIgnoreCase("Aleman")
				&& 
				this.getFuma().equalsIgnoreCase("Prince")){
			return true;
		}
	}

    
    private boolean quince(){
        if (this.getFuma().equalsIgnoreCase("Pall Mall")
				&& 
				this.getMascota().equalsIgnoreCase("Pajaros")){
			return true;
		}

	}

        private boolean dieciseis(){
        if (this.getFuma().equalsIgnoreCase("Bluemaster")
				&& 
				this.getBebe().equalsIgnoreCase("Cerveza")){
			return true;
		}

        private boolean diecisiete(){
            //todo
            Casa casaConGato = getCasaPorMascota("Gato")

            if(casaConGato.getNumero())
		}

        private boolean dieciocho(){
            //todo
            if (this.getFuma().equalsIgnoreCase("Pall Mall")
				&& 
				this.getMascota().equalsIgnoreCase("Pajaros")){
			return true;
		}

	}

	}
	
	/**************************Getters y Setters personalizados***********************/
	private Casa getCasaPorMascota(String mascota){
		for(int i=0; i<posibleSolucion.length; i++){
			if(posibleSolucion[i].getMascota().equalsIgnoreCase(mascota)){
				return posibleSolucion[i];
			}
		}
		return null;
	}
	

    
	private Persona getPersonaPorProfesion(String profesion){
		for(int i=0; i<posibleSolucion.length; i++){
			if(posibleSolucion[i].getOcupacion().equalsIgnoreCase(profesion)){
				return posibleSolucion[i];
			}
		}
		return null;
	}
	
	private Persona getPersonaPorPosicion(int posicion){
		/*for(int i=0; i<posibleSolucion.length; i++){
			if(posibleSolucion[i].getPosicion()== posicion){
				return posibleSolucion[i];
			}
		}*/
		if(posibleSolucion[posicion-1] != null){
			return posibleSolucion[posicion-1];
		}
		
		return null;
	}
	
	private Persona getMujerPorApellido(String apellido) {
		for(int i=0; i<this.posibleSolucion.length; i++){
			if(this.posibleSolucion[i].getApellido().equalsIgnoreCase(apellido)){
				if(this.posibleSolucion[i].esMujer()){
					return this.posibleSolucion[i];	
				}
			}
		}
		
		return null;
	}
	
	private Persona getHombrePorApellido(String apellido) {
		for(int i=0; i<this.posibleSolucion.length; i++){
			if(this.posibleSolucion[i].getApellido().equalsIgnoreCase(apellido)){
				if(this.posibleSolucion[i].esHombre()){
					return this.posibleSolucion[i];	
				}
			}
		}
		
		return null;
	}
	
	private Persona getDerechaDe(int posicion){
		if(posicion == 0){
			return getPersonaPorPosicion(8);
		}else{
			return getPersonaPorPosicion(posicion+1);
		}
	}
	
	private Persona getIzquierdaDe(int posicion){
		if(posicion == 8){
			return getPersonaPorPosicion(1);
		}else{
			return getPersonaPorPosicion(posicion+1);
		}
	}
	
	private Persona getEnFrente(int posicion){
		if(posicion == 5){
			return getPersonaPorPosicion(1);
		}
		if(posicion == 6){
			return getPersonaPorPosicion(2);
		}
		if(posicion == 7){
			return getPersonaPorPosicion(3);
		}
		if(posicion == 8){
			return getPersonaPorPosicion(4);
		}
		return getPersonaPorPosicion(posicion+4);
	}
		
	private int getPosicion(Persona persona){
		for(int i=0; i<this.posibleSolucion.length;i++){
			if (this.posibleSolucion[i].equalsPersona(persona)){
				return i;
			}
		}
		return -1;
	}

	public String[] removerElemento(String[] array, String elementoABorrar){
		List<String> list = new ArrayList<String>(Arrays.asList(array));
		list.remove(elementoABorrar);
		String[] nuevoArray = list.toArray(new String[0]);
		return nuevoArray;
	}
	
	
	/**************************Funciones Overrides de Individuo***********************/
	
	@Override
	public String toString() {
		String solucion = new String();

		for (int i =0; i<8;i++){
			solucion += (" Posicion " + i + " =  Nombre: " + this.posibleSolucion[i].getNombre()
										+ "  Apellido: " + this.posibleSolucion[i].getApellido()
										+ "  Ocupacion: " + this.posibleSolucion[i].getOcupacion());
		}
        
        return "Aptitud = " + this.aptitud() + " || Genes: " + solucion;
		
	}
	
	@Override
	public Individuo clone(){
		Solucion nuevaSolucion = new Solucion();
		nuevaSolucion.posibleSolucion = this.posibleSolucion;
		return nuevaSolucion;
	}

	@Override
	public void mutar(){
		
	}

	public Persona[] getPosibleSolucion(){
		return posibleSolucion;
	}
	
	public void setPosibleSolucion(Persona [] p){
		this.posibleSolucion = p;
	}
}
	
