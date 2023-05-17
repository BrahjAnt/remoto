
public class Estudiante {
	private String name;
	private String lastName;
	private String  birthDate;
	private String dni;
	private String study;
	private String telephone;
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Estudiante(String name, String lastName, String birthDate, String dni, String study, String telephone) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.dni = dni;
		this.study = study;
		this.telephone = telephone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Estudiante [name=" + name + ", lastName=" + lastName + ", birthDate=" + birthDate + ", dni=" + dni
				+ ", study=" + study + ", telephone=" + telephone + "]";
	}
	
	public void showStudent() {
		System.out.println("Nombre: "+this.name+
				"\r\nApellido: "+this.name+
				"\r\nFecha de nacimiento: "+this.birthDate+
				"\r\nDni: "+this.dni +
				"\r\nEstudios: "+this.study +
				"\r\nTeléfono : "+this.telephone);
	}
	
}
