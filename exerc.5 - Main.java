public class Main {
    
    
    public static void main(String[] args) {
        
        ListaLivros lista = new ListaLivros();
        Livro l1 = new Livro(4002, "Percy Jackson", "O Ladrao de Raios", 123, "Mitologia", "Gustavo" );
        Livro l2 = new Livro(8922, "Chico Xavier", "Nosso Lar", 654, "Romance", "Romanini" );
        Livro l3 = new Livro(555, "Howling", "Pedra Filosofal", 12, "Ficcao", "Luiz" );
        
        lista.inserir(l1);
        lista.inserir(l2);
        lista.inserir(l3);
        
        lista.imprimir();
        
        System.out.println(lista.buscar("Terra X"));
        
        
    }
  
}
