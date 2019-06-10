

package conceito;


public class PessoaException extends Exception {
    
    public PessoaException(){
        super ("ERRO AO MANIPULAR PESSOA/EMPREGADO");
    }
    
    public PessoaException(String mensagem){
        super (mensagem);
    }

}
