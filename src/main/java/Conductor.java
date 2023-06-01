public class Conductor {
	private String nombre;
	private String apellido;
	private int numeroDeTelefono;
	private String tipoDeLicencia;
	private Bus bus;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeroDeTelefono() {
		return this.numeroDeTelefono;
	}

	public void setNumeroDeTelefono(int numeroDeTelefono) {
		this.numeroDeTelefono = numeroDeTelefono;
	}

	public String getTipoDeLicencia() {
		return this.tipoDeLicencia;
	}

	public void setTipoDeLicencia(String tipoDeLicencia) {
		this.tipoDeLicencia = tipoDeLicencia;
	}

	public Conductor(String nombre, String apellido, int numeroDeTelefono, String tipoDeLicencia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroDeTelefono = numeroDeTelefono;
		this.tipoDeLicencia = tipoDeLicencia;
	}
}