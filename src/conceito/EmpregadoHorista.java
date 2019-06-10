

package conceito;


public class EmpregadoHorista extends Empregado {

    private float valorHora;
    private int numeroHora;

    public EmpregadoHorista() {
        super();
    }

    public EmpregadoHorista(float valorHora, int numeroHora, String cargo, 
            String nomeEmpresa, String nome, String nomeMae, String nomePai) 
            throws PessoaException {
        super(cargo, nomeEmpresa, nome, nomeMae, nomePai);
        this.setNumeroHora(numeroHora);
        this.setValorHora(valorHora);
    }

    /**
     * @return the valorHora
     */
    public final float getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     * @throws conceito.PessoaException
     */
    public final void setValorHora(float valorHora) throws PessoaException {
        if (valorHora > 0){
        this.valorHora = valorHora;
    } else {
            throw new PessoaException ("Valor hora deve ser maior que zero");
        }
    }

    /**
     * @return the numeroHora
     */
    public final int getNumeroHora() {
        return numeroHora;
    }

    /**
     * @param numeroHora the numeroHora to set
     * @throws conceito.PessoaException
     */
    public final void setNumeroHora(int numeroHora) throws PessoaException {
        if (numeroHora > 0){
        this.numeroHora = numeroHora;
    } else {
            throw new PessoaException ("Número de horas deve ser maior que zero");
        }
    }
    
    @Override
    public float calcularSalario(){
        return this.valorHora * this.numeroHora;
    }

}
