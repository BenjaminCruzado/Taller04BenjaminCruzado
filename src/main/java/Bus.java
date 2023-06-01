import java.util.ArrayList;

public class Bus {
	private String patente;
	private String marca;
	private String modelo;
	private Empresa empresa;
	private Conductor conductor;
	private ArrayList<Viaje> viajes;
	public Bus(String patente, String marca, String modelo) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.viajes =new ArrayList<Viaje>();
	}

	public void agregarConductor(Conductor conductor){this.conductor = conductor;}
	public void agregarViaje(Viaje viaje){this.viajes.add(viaje);}
	public ArrayList<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(ArrayList<Viaje> viajes) {
		this.viajes = viajes;
	}

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}