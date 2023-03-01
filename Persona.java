package herencia;

public abstract class Persona {

	private String nombre;
	
	public abstract String getNombre();
	public abstract String[][] setAtributos2(String array[]);
	public abstract int[][] conteoValores (String[][]mat1, String[][]mat2, String[][]mat3, String[][]mat4, String[][]mat5, String[][]mat6, String[][]mat7, String[][]mat8, String[][]mat9, String[][]mat10, String[]arrayAtr);
	
	public Persona (String nombre) {
		this.nombre= nombre;
	}
	
	
}
