

package conceito;


public class EnderecoException extends Exception {
    
    public EnderecoException (){
        super ("ERRO AO MANIPULAR ENDEREÇO");
    }
    
    public EnderecoException(String mensagem){
        super(mensagem);
    }

}
