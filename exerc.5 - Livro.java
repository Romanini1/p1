public class Livro {
    
    int isbn;
    String autor;
    String nomeLivro;
    int numPaginas;
    String categoria;
    String emprestado;

    public Livro(int isbn, String autor, String nomeLivro, int numPaginas, String categoria, String emprestado) {
        this.isbn = isbn;
        this.autor = autor;
        this.nomeLivro = nomeLivro;
        this.numPaginas = numPaginas;
        this.categoria = categoria;
        this.emprestado = emprestado;
    }
    
    @Override
    public String toString(){
        
        return "Isbn: "+this.isbn+" Autor: "+this.autor+" Numero de paginas: "+ this.numPaginas+" Categoria: "+this.categoria+" Emprestado por: "+this.emprestado;
        
    }
    
}
