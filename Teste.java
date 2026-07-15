public class Teste{
	public static void main(String[] args){

Pessoa[] p = new Pessoa[3];
Livro [] l = new Livro[3];


p[0] = new Pessoa("Pedro", 22, "M");
p[1] = new Pessoa("Maria", 25, "F");
p[2] = new Pessoa("João", 30, "M");

l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
l[1] = new Livro("POO para iniciantes", "Pedro Francisco", 500, p[1]);
l[2] = new Livro("Java avançado", "Maria Candido", 800, p[0]);
l[0].folhear(280);
l[0].avancarPag();
System.out.println(l[0].detalhes());
System.out.println(l[2].detalhes());


}

}