public class Livro implements Publicacao{

private String titulo;
private String autor;
private int totalPaginas;
private int pagAtual;
private boolean aberto;
private Pessoa leitor;

public String detalhes(){
return "======= DETALHES DO LIVRO ======== \n" + "titulo: " + titulo + "\nautor: " + autor + "\ntotal Paginas: " + totalPaginas +
"\npagAtual: " + pagAtual + "\naberto: " + aberto + "\nleitor:" + leitor.getNome() + " Idade:" + leitor.getIdade() + " Sexo:" + leitor.getSexo();
}

public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor){
this.titulo = titulo;
this.autor=autor;
this.totalPaginas = totalPaginas;
this.pagAtual = 0;
this.aberto = false;
this.leitor = leitor;
}

public String getTitulo(){
return titulo;
}

public void setTitulo(String titulo){
this.titulo = titulo;
}

public String getAutor(){
return autor;
}

public void setAutor(String autor){
this.autor = autor;
}


public int getTotalPaginas(){
return totalPaginas;
}

public void setTotalPaginas(int totalPaginas){
this.totalPaginas = totalPaginas;
}

public int getPagAtual(){
return pagAtual;
}

public void setPagAtual(int pagAtual){
this.pagAtual = pagAtual;
}

public boolean getAberto(){
return aberto;
}

public void setAberto(boolean aberto){
this.aberto = aberto;
}

public Pessoa getLeitor(){
return leitor;
}

public void setLeitor(Pessoa leitor){
this.leitor = leitor;
}

@Override
public void abrir(){
this.setAberto(true);
}

@Override
public void fechar(){
this.setAberto(false);
}

@Override
public void folhear(int p){
if(p> this.totalPaginas){
this.pagAtual = 0;
} else {
this.pagAtual = p;
}
}
@Override
public void avancarPag(){
this.pagAtual++;
}

@Override
public void voltarPag(){
this.pagAtual--;
}



}