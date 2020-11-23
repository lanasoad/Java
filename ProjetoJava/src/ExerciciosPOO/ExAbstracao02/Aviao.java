package ExAbstracao02;
/* 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
public class Aviao {
	private String modelo;
	private double tamanho;
	private int capacidadePassageiros;
	private String companhiaArea;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}
	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}
	public String getCompanhiaArea() {
		return companhiaArea;
	}
	public void setCompanhiaArea(String companhiaArea) {
		this.companhiaArea = companhiaArea;
	}
	@Override
	public String toString() {
		return "Avião [modelo = " + modelo + ", tamanho = " + tamanho + ", capacidadePassageiros = " + capacidadePassageiros
				+ ", companhiaArea = " + companhiaArea + "]";
	}
	
}
