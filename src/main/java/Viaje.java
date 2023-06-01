import java.util.ArrayList;

public class Viaje {
	private ArrayList<String> pasajeros;
	private String ciudadDeOrigen;
	private String ciudadDeDestino;
	private String horaDeSalida;
	private String horaDeLlegada;
	private Bus bus;
	public Viaje(String ciudadDeOrigen, String ciudadDeDestino, String horaDeSalida, String horaDeLlegada) {
		this.ciudadDeOrigen = ciudadDeOrigen;
		this.ciudadDeDestino = ciudadDeDestino;
		this.horaDeLlegada = horaDeLlegada;
		this.horaDeSalida = horaDeSalida;
		this.pasajeros = new ArrayList<>();
	}

	public ArrayList<String> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<String> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public String getCiudadDeOrigen() {
		return this.ciudadDeOrigen;
	}

	public void setCiudadDeOrigen(String ciudadDeOrigen) {
		this.ciudadDeOrigen = ciudadDeOrigen;
	}

	public String getCiudadDeDestino() {
		return this.ciudadDeDestino;
	}

	public void setCiudadDeDestino(String ciudadDeDestino) {
		this.ciudadDeDestino = ciudadDeDestino;
	}

	public String getHoraDeSalida() {
		return this.horaDeSalida;
	}

	public void setHoraDeSalida(String horaDeSalida) {
		this.horaDeSalida = horaDeSalida;
	}

	public String getHoraDeLlegada() {
		return this.horaDeLlegada;
	}

	public void setHoraDeLlegada(String horaDeLlegada) {
		this.horaDeLlegada = horaDeLlegada;
	}

	public void agregarPasajeros(String pasajero) {
		this.pasajeros.add(pasajero);
	}
}