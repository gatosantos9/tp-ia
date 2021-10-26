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
		ubicaciones.add("Cuarta");
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

		return  "(A: " + this.casas.get(0).getUbicacion() + ", " + this.casas.get(0).getColor() + ", " + this.casas.get(0).getNacionalidad() + ", " + this.casas.get(0).getCigarro() + ", " + this.casas.get(0).getBebida() + ", " + this.casas.get(0).getMascota()
				+ ") (B: " + this.casas.get(1).getUbicacion() + ", " + this.casas.get(1).getColor() + ", " + this.casas.get(1).getNacionalidad() + ", " + this.casas.get(1).getCigarro() + ", " + this.casas.get(1).getBebida() + ", " + this.casas.get(1).getMascota()
				+ ") (C: " + this.casas.get(2).getUbicacion() + ", " + this.casas.get(2).getColor() + ", " + this.casas.get(2).getNacionalidad() + ", " + this.casas.get(2).getCigarro() + ", " + this.casas.get(2).getBebida() + ", " + this.casas.get(2).getMascota()
				+ ") (D: " + this.casas.get(3).getUbicacion() + ", " + this.casas.get(3).getColor() + ", " + this.casas.get(3).getNacionalidad() + ", " + this.casas.get(3).getCigarro() + ", " + this.casas.get(3).getBebida() + ", " + this.casas.get(3).getMascota()
				+ ") (E: " + this.casas.get(4).getUbicacion() + ", " + this.casas.get(4).getColor() + ", " + this.casas.get(4).getNacionalidad() + ", " + this.casas.get(4).getCigarro() + ", " + this.casas.get(4).getBebida() + ", " + this.casas.get(4).getMascota()

				+ ") Apto: " + this.aptitud();
	}
	
	public int indicePor(String atributo, String valor){
		
		if(atributo == "Ubicacion"){
		    
			for (Casa casa : this.casas) {
		        if (casa.getUbicacion().equals(valor)) {
		            return this.casas.indexOf(casa);
		        }        
			}
		
		}

		if(atributo == "Color"){

			for (Casa casa : this.casas) {
				if (casa.getColor().equals(valor)) {
					return this.casas.indexOf(casa);
				}
			}

		}

		if(atributo == "Nacionalidad"){
		    
			for (Casa casa : this.casas) {
		        if (casa.getNacionalidad().equals(valor)) {
		            return this.casas.indexOf(casa);
		        }        
			}
		
		}
		
		if(atributo == "Cigarro"){
		    
			for (Casa casa : this.casas) {
		        if (casa.getCigarro().equals(valor)) {
		            return this.casas.indexOf(casa);
		        }        
			}
		
		}

		if(atributo == "Bebida"){

			for (Casa casa : this.casas) {
				if (casa.getBebida().equals(valor)) {
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
		int aptitud = 0;
		/*
		El británico vive en la casa roja.
		El sueco tiene un perro como mascota.
		El danés toma té.
		El noruego vive en la primera casa.
		El alemán fuma Prince.
		La casa verde está inmediatamente a la izquierda de la blanca.
		El dueño de la casa verde bebe café.
		El propietario que fuma Pall Mall cría pájaros.
		El dueño de la casa amarilla fuma Dunhill.
		El hombre que vive en la casa del centro bebe leche.
		El vecino que fuma Blends vive al lado del que tiene un gato.
		El hombre que tiene un caballo vive al lado del que fuma Dunhill.
		El propietario que fuma Bluemaster toma cerveza.
		El vecino que fuma Blends vive al lado del que toma agua.
		El noruego vive al lado de la casa azul.
		*/

		//El británico vive en la casa roja.
		if (this.casas.get(this.indicePor("Nacionalidad", "Britanico")).getColor() == "Roja") {
			aptitud += 10;
		} else {
			aptitud -= 10;
		}

		//El sueco tiene un perro como mascota.
		if (this.casas.get(this.indicePor("Nacionalidad", "Sueco")).getMascota() == "Perro") {
			aptitud += 10;
		} else {
			aptitud -= 10;
		}

		//El danés toma té.
		if (this.casas.get(this.indicePor("Nacionalidad", "Danes")).getBebida() == "Te") {
			aptitud += 10;
		} else {
			aptitud -= 10;
		}

		//El noruego vive en la primera casa.
		if (this.casas.get(this.indicePor("Nacionalidad", "Noruego")).getUbicacion() == "Primera") {
			aptitud += 10;
		} else {
			aptitud -= 10;
		}

		//El alemán fuma Prince.
		if (this.casas.get(this.indicePor("Nacionalidad", "Aleman")).getCigarro() == "Prince") {
			aptitud += 10;
		} else {
			aptitud -= 10;
		}

		//La casa verde está inmediatamente a la izquierda de la blanca.
		if (this.casas.get(this.indicePor("Color", "Blanca")).getUbicacion() == "Primera") {

			aptitud -= 10;

		} else if (this.casas.get(this.indicePor("Color", "Blanca")).getUbicacion() == "Segunda") {

			//La casa verde es la primera
			if (this.casas.get(this.indicePor("Color", "Verde")).getUbicacion() == "Primera") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Color", "Blanca")).getUbicacion() == "Tercera") {

			//La casa verde es la segunda
			if (this.casas.get(this.indicePor("Color", "Verde")).getUbicacion() == "Segunda") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Color", "Blanca")).getUbicacion() == "Cuarta") {

			//La casa verde es la tercera
			if (this.casas.get(this.indicePor("Color", "Verde")).getUbicacion() == "Tercera") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Color", "Blanca")).getUbicacion() == "Quinta") {

			//La casa verde es la cuarta
			if (this.casas.get(this.indicePor("Color", "Verde")).getUbicacion() == "Cuarta") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}
		}

		//El dueño de la casa verde bebe café.
		if (this.casas.get(this.indicePor("Color", "Verde")).getBebida() == "Cafe") {
			aptitud += 10;
		} else {
			aptitud -= 10;
		}

		//El propietario que fuma Pall Mall cría pájaros.
		if (this.casas.get(this.indicePor("Cigarro", "PallMall")).getMascota() == "Pajaros") {
			aptitud += 10;
		} else {
			aptitud -= 10;
		}

		//El dueño de la casa amarilla fuma Dunhill.
		if (this.casas.get(this.indicePor("Color", "Amarilla")).getCigarro() == "Dunhill") {
			aptitud += 10;
		} else {
			aptitud -= 10;
		}

		//El hombre que vive en la casa del centro bebe leche.
		if (this.casas.get(this.indicePor("Ubicacion", "Tercera")).getBebida() == "Leche") {
			aptitud += 10;
		} else {
			aptitud -= 10;
		}


		//El vecino que fuma Blends vive al lado del que tiene un gato.
		if (this.casas.get(this.indicePor("Cigarro", "Blends")).getUbicacion() == "Primera") {
			if (this.casas.get(this.indicePor("Mascota", "Gato")).getUbicacion() == "Segunda") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Cigarro", "Blends")).getUbicacion() == "Segunda") {
			if (this.casas.get(this.indicePor("Mascota", "Gato")).getUbicacion() == "Primera" || this.casas.get(this.indicePor("Mascota", "Gato")).getUbicacion() == "Tercera") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Cigarro", "Blends")).getUbicacion() == "Tercera") {
			if (this.casas.get(this.indicePor("Mascota", "Gato")).getUbicacion() == "Segunda" || this.casas.get(this.indicePor("Mascota", "Gato")).getUbicacion() == "Cuarta") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Cigarro", "Blends")).getUbicacion() == "Cuarta") {
			if (this.casas.get(this.indicePor("Mascota", "Gato")).getUbicacion() == "Tercera" || this.casas.get(this.indicePor("Mascota", "Gato")).getUbicacion() == "Quinta") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Cigarro", "Blends")).getUbicacion() == "Quinta") {
			if (this.casas.get(this.indicePor("Mascota", "Gato")).getUbicacion() == "Cuarta") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}
		}

		//El hombre que tiene un caballo vive al lado del que fuma Dunhill.
		if (this.casas.get(this.indicePor("Mascota", "Caballo")).getUbicacion() == "Primera") {
			if (this.casas.get(this.indicePor("Cigarro", "Dunhill")).getUbicacion() == "Segunda") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Mascota", "Caballo")).getUbicacion() == "Segunda") {
			if (this.casas.get(this.indicePor("Cigarro", "Dunhill")).getUbicacion() == "Primera" || this.casas.get(this.indicePor("Cigarro", "Dunhill")).getUbicacion() == "Tercera") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Mascota", "Caballo")).getUbicacion() == "Tercera") {
			if (this.casas.get(this.indicePor("Cigarro", "Dunhill")).getUbicacion() == "Segunda" || this.casas.get(this.indicePor("Cigarro", "Dunhill")).getUbicacion() == "Cuarta") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Mascota", "Caballo")).getUbicacion() == "Cuarta") {
			if (this.casas.get(this.indicePor("Cigarro", "Dunhill")).getUbicacion() == "Tercera" || this.casas.get(this.indicePor("Cigarro", "Dunhill")).getUbicacion() == "Quinta") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Mascota", "Caballo")).getUbicacion() == "Quinta") {
			if (this.casas.get(this.indicePor("Cigarro", "Dunhill")).getUbicacion() == "Cuarta") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}
		}

		//El propietario que fuma Bluemaster toma cerveza.
		if (this.casas.get(this.indicePor("Cigarro", "Bluemaster")).getBebida() == "Cerveza") {
			aptitud += 10;
		} else {
			aptitud -= 10;
		}

		//El vecino que fuma Blends vive al lado del que toma agua.
		if (this.casas.get(this.indicePor("Cigarro", "Blends")).getUbicacion() == "Primera") {
			if (this.casas.get(this.indicePor("Bebida", "Agua")).getUbicacion() == "Segunda") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Cigarro", "Blends")).getUbicacion() == "Segunda") {
			if (this.casas.get(this.indicePor("Bebida", "Agua")).getUbicacion() == "Primera" || this.casas.get(this.indicePor("Bebida", "Agua")).getUbicacion() == "Tercera") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Cigarro", "Blends")).getUbicacion() == "Tercera") {
			if (this.casas.get(this.indicePor("Bebida", "Agua")).getUbicacion() == "Segunda" || this.casas.get(this.indicePor("Bebida", "Agua")).getUbicacion() == "Cuarta") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Cigarro", "Blends")).getUbicacion() == "Cuarta") {
			if (this.casas.get(this.indicePor("Bebida", "Agua")).getUbicacion() == "Tercera" || this.casas.get(this.indicePor("Bebida", "Agua")).getUbicacion() == "Quinta") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Cigarro", "Blends")).getUbicacion() == "Quinta") {
			if (this.casas.get(this.indicePor("Bebida", "Agua")).getUbicacion() == "Cuarta") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}
		}

		//El noruego vive al lado de la casa azul.
		if (this.casas.get(this.indicePor("Nacionalidad", "Noruego")).getUbicacion() == "Primera") {
			if (this.casas.get(this.indicePor("Color", "Azul")).getUbicacion() == "Segunda") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Nacionalidad", "Noruego")).getUbicacion() == "Segunda") {
			if (this.casas.get(this.indicePor("Color", "Azul")).getUbicacion() == "Primera" || this.casas.get(this.indicePor("Color", "Azul")).getUbicacion() == "Tercera") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Nacionalidad", "Noruego")).getUbicacion() == "Tercera") {
			if (this.casas.get(this.indicePor("Color", "Azul")).getUbicacion() == "Segunda" || this.casas.get(this.indicePor("Color", "Azul")).getUbicacion() == "Cuarta") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Nacionalidad", "Noruego")).getUbicacion() == "Cuarta") {
			if (this.casas.get(this.indicePor("Color", "Azul")).getUbicacion() == "Tercera" || this.casas.get(this.indicePor("Color", "Azul")).getUbicacion() == "Quinta") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}

		} else if (this.casas.get(this.indicePor("Nacionalidad", "Noruego")).getUbicacion() == "Quinta") {
			if (this.casas.get(this.indicePor("Color", "Azul")).getUbicacion() == "Cuarta") {
				aptitud += 10;
			} else {
				aptitud -= 10;
			}
		}

		return aptitud;
	}
}
