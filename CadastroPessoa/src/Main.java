public class Main {
	
public static void main(String[] args) {


Pessoa pessoa1 = new Pessoa(1, "Victoria", 12, "F");
Pessoa pessoa2 = new Pessoa(2, "Victor", 20, "M");

Endereco endereco1 = new Endereco(1, "Rua das Cam�lias", "Pedra Branca", 120);
Endereco endereco2 = new Endereco(2, "Rua das Saracuras", "Pagani", 22);





System.out.println("O nome da primeira pessoa � " + pessoa1.getNome() + ".");
System.out.println("A idade da primeira pessoa � " + pessoa1.getIdade() + " anos.");
System.out.println("O sexo da primeira pessoa � " + pessoa1.getSexo() + ".");
System.out.println("A rua da primeira pessoa � " + endereco1.getRua() + ".");
System.out.println("O bairro da primeira pessoa � " + endereco1.getBairro() + ".");
System.out.println("O numero da casa da primeira pessoa � " + endereco1.getNumero() + ". \n");

System.out.println("O nome da segunda pessoa � " + pessoa2.getNome() + ".");
System.out.println("A idade da segunda pessoa � " + pessoa2.getIdade() + " anos.");
System.out.println("O sexo da segunda pessoa � " + pessoa2.getSexo() + ".");
System.out.println("A rua da segunda pessoa � " + endereco2.getRua() + ".");
System.out.println("O bairro da segunda pessoa � " + endereco2.getBairro() + ".");
System.out.println("O numero da casa da segunda pessoa � " + endereco2.getNumero() + ".");



}
}