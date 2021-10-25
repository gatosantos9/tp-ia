package main.java.ar.edu.utn.frba.ia.ag.acertijoEinstein;

import java.util.ArrayList;

import main.java.ar.edu.utn.frba.ia.ag.Individuo;

public class Cromosoma extends Individuo {
	public ArrayList<Casa> getCasas() {
		return casas;
	}

	public void setCasas(ArrayList<Casa> casas) {
		this.casas = casas;
	}

	public void setUbicaciones(ArrayList<String> ubicaciones) {
		this.ubicaciones = ubicaciones;
	}


	public ArrayList<String> getUbicaciones() {
		return ubicaciones;
	}


	public void setColores(ArrayList<String> colores) {
		this.colores = colores;
	}

	public ArrayList<String> getNacionalidades() {
		return nacionalidades;
	}


	public void setNacionalidades(ArrayList<String> nacionalidades) {
		this.nacionalidades = nacionalidades;
	}


	public ArrayList<String> getCigarros() {
		return cigarros;
	}


	public void setCigarros(ArrayList<String> cigarros) {
		this.cigarros = cigarros;
	}


	public ArrayList<String> getBebidas() {
		return bebidas;
	}


	public void setBebidas(ArrayList<String> bebidas) {
		this.bebidas = bebidas;
	}


	public ArrayList<String> getMascotas() {
		return mascotas;
	}


	public void setMascotas(ArrayList<String> mascotas) {
		this.mascotas = mascotas;
	}

	private ArrayList<Casa> casas = new ArrayList<Casa>();
	private ArrayList<String> ubicaciones = new ArrayList<String>();
	private ArrayList<String> colores = new ArrayList<String>();
	private ArrayList<String> nacionalidades = new ArrayList<String>();
	private ArrayList<String> cigarros = new ArrayList<String>();
	private ArrayList<String> bebidas = new ArrayList<String>();
	private ArrayList<String> mascotas = new ArrayList<String>();
		
	@Override
	public Individuo generarRandom() {
		this.inicializarUbicaciones();
		this.inicializarColores();
		this.inicializarNacionalidades();
		this.inicializarCigarros();
		this.inicializarBebidas();
		this.inicializarMascotas();
		
		
		while(!ubicaciones.isEmpty()){
		
			Casa casa = new Casa();
			int prueba1 = (int)(Math.random()*ubicaciones.size());
			String ubicacion = ubicaciones.get((int)(Math.random()*ubicaciones.size()));
			String color = colores.get((int)Math.random()*colores.size());
			String nacionalidad = nacionalidades.get((int)(Math.random()*nacionalidades.size()));
			String cigarro = cigarros.get((int)(Math.random()*cigarros.size()));
			String bebida = bebidas.get((int)(Math.random()*bebidas.size()));
			String mascota = mascotas.get((int)(Math.random()*mascotas.size()));
			
			casa.setUbicacion(ubicacion);
			casa.setColor(color);
			casa.setNacionalidad(nacionalidad);
			casa.setCigarro(cigarro);
			casa.setBebida(bebida);
			casa.setMascota(mascota);
			
			ubicaciones.remove(ubicacion);
			colores.remove(color);
			nacionalidades.remove(nacionalidad);
			cigarros.remove(cigarro);
			bebidas.remove(bebida);
			mascotas.remove(mascota);			
			
			this.casas.add(casa);
		}
		return this;
	}


	private void inicializarUbicaciones() {
		ubicaciones.add("Primera");
		ubicaciones.add("Segunda");
		ubicaciones.add("Tercera");
		ubicaciones.add("Cuarte");
		ubicaciones.add("Quinta");
	}


	private void inicializarColores() {
		colores.add("Roja");
		colores.add("Verde");
		colores.add("Blanca");
		colores.add("Amarilla");
		colores.add("Azul");
	}

	private void inicializarNacionalidades() {
		nacionalidades.add("Britanico");
		nacionalidades.add("Sueco");
		nacionalidades.add("Danes");
		nacionalidades.add("Noruego");
		nacionalidades.add("Aleman");
	}


	private void inicializarCigarros() {
		cigarros.add("Prince");
		cigarros.add("PallMall");
		cigarros.add("Dunhill");
		cigarros.add("Blends");
		cigarros.add("Bluemaster");
	}


	private void inicializarBebidas() {
		bebidas.add("Te");
		bebidas.add("Cafe");
		bebidas.add("Leche");
		bebidas.add("Cerveza");
		bebidas.add("Agua");
	}


	private void inicializarMascotas() {
		mascotas.add("Perro");
		mascotas.add("Pajaros");
		mascotas.add("Gato");
		mascotas.add("Caballo");
		mascotas.add("Pez");
	}
	
	@Override
	public boolean esMasAptoQue(Individuo individuo) {
		return this.aptitud() < individuo.aptitud();
	}
	
	@Override
	public String toString() {
		//TODO: Agregar el que falta
		return  "(A: " + this.casas.get(0).getUbicacion() + ", " + this.casas.get(0).getNacionalidad() + ", " + this.casas.get(0).getCigarro() + ", " + this.casas.get(0).getBebida() + ", " + this.casas.get(0).getMascota()
				+ "/ B: " + this.casas.get(1).getUbicacion() + ", " + this.casas.get(1).getNacionalidad() + ", " + this.casas.get(1).getCigarro() + ", " + this.casas.get(1).getBebida() + ", " + this.casas.get(1).getMascota()
				+ "/ C: " + this.casas.get(2).getUbicacion() + ", " + this.casas.get(2).getNacionalidad() + ", " + this.casas.get(2).getCigarro() + ", " + this.casas.get(2).getBebida() + ", " + this.casas.get(2).getMascota()
				+ "/ D: " + this.casas.get(3).getUbicacion() + ", " + this.casas.get(3).getNacionalidad() + ", " + this.casas.get(3).getCigarro() + ", " + this.casas.get(3).getBebida() + ", " + this.casas.get(3).getMascota()
				+ "/ E: " + this.casas.get(4).getUbicacion() + ", " + this.casas.get(4).getNacionalidad() + ", " + this.casas.get(4).getCigarro() + ", " + this.casas.get(4).getBebida() + ", " + this.casas.get(4).getMascota()

				+ ") Apto: " + this.aptitud();
	}
	
	public int indicePor(String atributo, String valor){
		
		if(atributo == "Nombre"){
		    
			for (Casa casa : this.casas) {
		        if (casa.getUbicacion().equals(valor)) {
		            return this.casas.indexOf(casa);
		        }        
			}
		
		}
		
		if(atributo == "Trabajo"){
		    
			for (Casa casa : this.casas) {
		        if (casa.getBebida().equals(valor)) {
		            return this.casas.indexOf(casa);
		        }        
			}
		
		}
		
		if(atributo == "ColorDePelo"){
		    
			for (Casa casa : this.casas) {
		        if (casa.getNacionalidad().equals(valor)) {
		            return this.casas.indexOf(casa);
		        }        
			}
		
		}
		
		if(atributo == "ColorDeZuecos"){
		    
			for (Casa casa : this.casas) {
		        if (casa.getCigarro().equals(valor)) {
		            return this.casas.indexOf(casa);
		        }        
			}
		
		}
		
		if(atributo == "Mascota"){
		    
			for (Casa casa : this.casas) {
		        if (casa.getMascota().equals(valor)) {
		            return this.casas.indexOf(casa);
		        }        
			}
		
		}
		
		return 0;
	}
	
	@Override
	public double aptitud() {
		int aptitud = 0;/*
	�	Sniff tiene zuecos rojos. Hecho.
	�	Prop tiene gansos por mascotas. Hecho.
	�	Poddy es el que empaqueta los regalos. Hecho.
	�	El pintor y Poddy no son vecinos. Hecho.
	�	Stump vive junto al que tiene zuecos rojos. Hecho.
	�	El elfo de pelo casta�o cuida de los renos de Sta. Claus. Hecho.
	�	Puk tiene el pelo gris. Hecho.
	�	El elfo de pelo gris vive entre el Sniff y el due�o de un ganso. Hecho.
	�	El de zuecos rojos es vecino de Stump. Hecho.
	�	El de zuecos negros es vecino del de pelo negro. Hecho.
	�	El elfo panadero vive junto al que tiene cerdos como mascota. Hecho.
	�	El pelirrojo junto al due�o de unos zuecos verdes. Hecho.
	�	El due�o de los gansos es vecino del que tiene el pelo negro. Hecho.
	�	El due�o del pato vive junto al que tiene zuecos blancos. Hecho.
	�	El de zuecos blancos es vecino del elfo de pelo cano y del de los zuecos rojos. Hecho.
	�	El de zuecos blancos no es vecino del due�o del gato. Hecho.
	�	El due�o del gato vive junto al carpintero. Hecho.
		*/
		
		//Sniff tiene zuecos rojos
		if(this.casas.get(this.indicePor("Nombre", "Sniff")).getCigarro() == "Rojos"){
			aptitud +=10;
		}else{
			aptitud -=10;
		}
		
		//Prop tiene gansos por mascotas
		if(this.casas.get(this.indicePor("Nombre", "Prop")).getMascota() == "Gansos"){
			aptitud +=10;
		}else{
			aptitud -=10;
		}
		
		//Poddy es el que empaqueta los regalos
		if(this.casas.get(this.indicePor("Nombre", "Poddy")).getBebida() == "Empaquetador"){
			aptitud +=10;
		}else{
			aptitud -=10;
		}
		
		//El pintor y Poddy no son vecinos
		//Primero me fijo si el pintor se encuentra en un extremo para que al hacer
		//el get no me tire error
		if(this.indicePor("Trabajo", "Pintor") == 0){
			
			//El pintor es el primero
			if(this.casas.get(1).getUbicacion() != "Poddy"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.indicePor("Trabajo", "Pintor") == 4){
			
			//El pintor es el �ltimo
			if(this.casas.get(3).getUbicacion() != "Poddy"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.casas.get(this.indicePor("Trabajo", "Pintor")+1).getUbicacion() != "Poddy" && this.casas.get(this.indicePor("Trabajo", "Pintor")-1).getUbicacion() != "Poddy"){
			
			//El pintor est� en el medio
			aptitud +=10;
		
		} else {
			
			aptitud -=10;
			
		}
		
		
		//Stump vive junto al que tiene zuecos rojos.
		//Primero me fijo si Stump se encuentra en un extremo para que al hacer
		//el get no me tire error por pasarme del tama�o de la lista
		if(this.indicePor("Nombre", "Stump") == 0){
			
			//Stump es el primero
			if(this.casas.get(1).getCigarro() == "Rojos"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.indicePor("Nombre", "Stump") == 4){
			
			//Stump es el �ltimo
			if(this.casas.get(3).getCigarro() == "Rojos"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.casas.get(this.indicePor("Nombre", "Stump")+1).getCigarro() == "Rojos" || this.casas.get(this.indicePor("Nombre", "Stump")-1).getCigarro() == "Rojos"){
			
			//Stump est� en el medio
			aptitud +=10;
		
		} else {
			
			aptitud -=10;
			
		}
		
		//El elfo de pelo casta�o cuida de los renos de Sta. Claus
		if(this.casas.get(this.indicePor("ColorDePelo", "Casta�o")).getBebida() == "Cuidador"){
			aptitud +=10;
		}else{
			aptitud -=10;
		}
		
		//Puk tiene el pelo gris
		if(this.casas.get(this.indicePor("Nombre", "Puk")).getNacionalidad() == "Gris"){
			aptitud +=10;
		}else{
			aptitud -=10;
		}
		
		//El elfo de pelo gris vive entre el Sniff y el due�o de un ganso
		//Me fijo si el de color de pelo gris est� primero o �ltimo, no se podr�a cumplir la condicion de ser as�
		if(this.indicePor("ColorDePelo", "Gris") == 0 || this.indicePor("ColorDePelo", "Gris") == 4){
			aptitud -=10;
		} else if((this.casas.get(this.indicePor("ColorDePelo", "Gris")-1).getUbicacion() == "Sniff" && this.casas.get(this.indicePor("ColorDePelo", "Gris")+1).getMascota() == "Gansos") || (this.casas.get(this.indicePor("ColorDePelo", "Gris")-1).getMascota() == "Gansos" && this.casas.get(this.indicePor("ColorDePelo", "Gris")+1).getUbicacion() == "Sniff")){
			aptitud +=10;
		}else{
			aptitud -=10;
		}
		
		//El de zuecos rojos es vecino de Stump
		//Primero me fijo si el de zuecos rojos se encuentra en un extremo para que al hacer
		//el get no me tire error
		if(this.indicePor("ColorDeZuecos", "Rojos") == 0){
			
			//El de zuecos rojos es el primero
			if(this.casas.get(1).getUbicacion() == "Stump"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.indicePor("ColorDeZuecos", "Rojos") == 4){
			
			//El de zuecos rojos es el �ltimo
			if(this.casas.get(3).getUbicacion() == "Stump"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.casas.get(this.indicePor("ColorDeZuecos", "Rojos")+1).getUbicacion() == "Stump" || this.casas.get(this.indicePor("ColorDeZuecos", "Rojos")-1).getUbicacion() == "Stump"){
			
			//El de zuecos rojos est� en el medio
			aptitud +=10;
		
		} else {
			
			aptitud -=10;
			
		}
		
		//El de zuecos negros es vecino del de pelo negro.
		//Primero me fijo si el de zuecos negros se encuentra en un extremo para que al hacer
		//el get no me tire error
		if(this.indicePor("ColorDeZuecos", "Negros") == 0){
			
			//El de zuecos negros es el primero
			if(this.casas.get(1).getNacionalidad() == "Negro"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.indicePor("ColorDeZuecos", "Negros") == 4){
			
			//El de zuecos negros es el �ltimo
			if(this.casas.get(3).getNacionalidad() == "Negro"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.casas.get(this.indicePor("ColorDeZuecos", "Negros")+1).getNacionalidad() == "Negro" || this.casas.get(this.indicePor("ColorDeZuecos", "Negros")-1).getNacionalidad() == "Negro"){
			
			//El de zuecos negros est� en el medio
			aptitud +=10;
		
		} else {
			
			aptitud -=10;
			
		}
		
		//El elfo panadero vive junto al que tiene cerdos como mascota.		
		//Primero me fijo si el panadero se encuentra en un extremo para que al hacer
		//el get no me tire error
		if(this.indicePor("Trabajo", "Panadero") == 0){
			
			//El panadero es el primero
			if(this.casas.get(1).getMascota() == "Cerdos"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.indicePor("Trabajo", "Panadero") == 4){
			
			//El panadero es el �ltimo
			if(this.casas.get(3).getMascota() == "Cerdos"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.casas.get(this.indicePor("Trabajo", "Panadero")+1).getMascota() == "Cerdos" || this.casas.get(this.indicePor("Trabajo", "Panadero")-1).getMascota() == "Cerdos"){
			
			//El panadero est� en el medio
			aptitud +=10;
		
		} else {
			
			aptitud -=10;
			
		}
		
		//El pelirrojo junto al due�o de unos zuecos verdes.
		//Primero me fijo si el pelirrojo se encuentra en un extremo para que al hacer
		//el get no me tire error
		if(this.indicePor("ColorDePelo", "Pelirrojo") == 0){
			
			//El pelirrojo es el primero
			if(this.casas.get(1).getCigarro() == "Verdes"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.indicePor("ColorDePelo", "Pelirrojo") == 4){
			
			//El pelirrojo es el �ltimo
			if(this.casas.get(3).getCigarro() == "Verdes"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.casas.get(this.indicePor("ColorDePelo", "Pelirrojo")+1).getCigarro() == "Verdes" || this.casas.get(this.indicePor("ColorDePelo", "Pelirrojo")-1).getCigarro() == "Verdes"){
			
			//El pelirrojo est� en el medio
			aptitud +=10;
		
		} else {
			
			aptitud -=10;
			
		}
		
		//El due�o de los gansos es vecino del que tiene el pelo negro.
		//Primero me fijo si el due�o de los gansos se encuentra en un extremo para que al hacer
		//el get no me tire error
		if(this.indicePor("Mascota", "Gansos") == 0){
			
			//El due�o de los gansos es el primero
			if(this.casas.get(1).getNacionalidad() == "Negro"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.indicePor("Mascota", "Gansos") == 4){
			
			//El due�o de los gansos es el �ltimo
			if(this.casas.get(3).getNacionalidad() == "Negro"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.casas.get(this.indicePor("Mascota", "Gansos")+1).getNacionalidad() == "Negro" || this.casas.get(this.indicePor("Mascota", "Gansos")-1).getNacionalidad() == "Negro"){
			
			//El due�o de los gansos est� en el medio
			aptitud +=10;
		
		} else {
			
			aptitud -=10;
			
		}
		
		//El due�o del pato vive junto al que tiene zuecos blancos.
		//Primero me fijo si el due�o del pato se encuentra en un extremo para que al hacer
		//el get no me tire error
		if(this.indicePor("Mascota", "Pato") == 0){
			
			//El due�o del pato es el primero
			if(this.casas.get(1).getCigarro() == "Blancos"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.indicePor("Mascota", "Pato") == 4){
			
			//El due�o del pato es el �ltimo
			if(this.casas.get(3).getCigarro() == "Blancos"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.casas.get(this.indicePor("Mascota", "Pato")+1).getCigarro() == "Blancos" || this.casas.get(this.indicePor("Mascota", "Pato")-1).getCigarro() == "Blancos"){
			
			//El due�o del pato est� en el medio
			aptitud +=10;
		
		} else {
			
			aptitud -=10;
			
		}
		
		//El de zuecos blancos es vecino del elfo de pelo cano y del de los zuecos rojos.
		//Me fijo si el de color de zuecos blancos no est� primero o �ltimo, no se podr�a cumplir la condicion de ser as�
		if(this.indicePor("ColorDeZuecos", "Blancos") == 0 || this.indicePor("ColorDeZuecos", "Blancos") == 4){
			aptitud -=10;
		} else if((this.casas.get(this.indicePor("ColorDeZuecos", "Blancos")-1).getNacionalidad() == "Cano" && this.casas.get(this.indicePor("ColorDeZuecos", "Blancos")+1).getCigarro() == "Rojos") || (this.casas.get(this.indicePor("ColorDeZuecos", "Blancos")-1).getCigarro() == "Rojos" && this.casas.get(this.indicePor("ColorDeZuecos", "Blancos")+1).getNacionalidad() == "Cano")){
			aptitud +=10;
		}else{
			aptitud -=10;
		}
		
		//El de zuecos blancos no es vecino del due�o del gato
		//Primero me fijo si el de zuecos blancos se encuentra en un extremo para que al hacer
		//el get no me tire error
		if(this.indicePor("ColorDeZuecos", "Blancos") == 0){
			
			//El de zuecos blancos es el primero
			if(this.casas.get(1).getMascota() != "Gato"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.indicePor("ColorDeZuecos", "Blancos") == 4){
			
			//El de zuecos blancos es el �ltimo
			if(this.casas.get(3).getMascota() != "Gato"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.casas.get(this.indicePor("ColorDeZuecos", "Blancos")+1).getMascota() != "Gato" && this.casas.get(this.indicePor("ColorDeZuecos", "Blancos")-1).getMascota() != "Gato"){
			
			//El de zuecos blancos est� en el medio
			aptitud +=10;
		
		} else {
			
			aptitud -=10;
			
		}
		
		//El due�o del gato vive junto al carpintero
		//Primero me fijo si el due�o del gato se encuentra en un extremo para que al hacer
		//el get no me tire error
		if(this.indicePor("Mascota", "Gato") == 0){
			
			//El due�o del gato es el primero
			if(this.casas.get(1).getBebida() == "Carpintero"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.indicePor("Mascota", "Gato") == 4){
			
			//El due�o del gato es el �ltimo
			if(this.casas.get(3).getBebida() == "Carpintero"){
				aptitud +=10;
			} else {
				aptitud -=10;
			}
			
		} else if(this.casas.get(this.indicePor("Mascota", "Gato")+1).getBebida() == "Carpintero" || this.casas.get(this.indicePor("Mascota", "Gato")-1).getBebida() == "Carpintero"){
			
			//El due�o del gato est� en el medio
			aptitud +=10;
		
		} else {
			
			aptitud -=10;
			
		}
		
		return aptitud;
	}
}
