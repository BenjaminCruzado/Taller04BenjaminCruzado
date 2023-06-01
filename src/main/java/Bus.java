import java.util.ArrayList;

public class Bus {
	private String patente;
	private String marca;
	private String modelo;
	private Empresa empresa;
	private Conductor conductor;
	private ArrayList<Viaje> viajes = new ArrayList<Viaje>();

	public ArrayList<Viaje> getViajes() {
		throw new UnsupportedOperationException();
	}

	public void setViajes(ArrayList<Viaje> viajes) {
		throw new UnsupportedOperationException();
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

	public Bus(String patente, String marca, String modelo) {
		throw new UnsupportedOperationException();
	}
}