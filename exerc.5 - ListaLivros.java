public class ListaLivros {
    
    Livro lista[] = new Livro[2000];
    int ponteiroFinal = -1;
    
    public void inserir(Livro l){
        
        if(ponteiroFinal == -1 || ponteiroFinal < (lista.length-1)){
            
            ponteiroFinal++;
            lista[ponteiroFinal] = l;
            System.out.println("Elemento inserido com sucesso!");
            
        }else{
            
            System.out.println("Houve um erro, tente novamente");
            
        }
        
        
    }
    
    public String buscar(String nome){
        
        for(int i = 0; i <= ponteiroFinal; i++){
            
            if(lista[i].nomeLivro.contains(nome)){
                
                return lista[i].toString();
                
            }
            
        }
        
        return null;
        
    }
    
    public void imprimir(){
        
        for(int i = 0; i <= ponteiroFinal; i++){
            
            System.out.println(lista[i].toString());
            
        }
 
    }
    
}
