

package conceito;


public class EmpregadoComissao extends Empregado {
    
    private float totalVenda;
    private float pComissao;

    public EmpregadoComissao() {
        super();
    }

    public EmpregadoComissao(float totalVenda, float pComissao, String cargo, 
            String nomeEmpresa, String nome, String nomeMae, String nomePai) 
            throws PessoaException {
        super(cargo, nomeEmpresa, nome, nomeMae, nomePai);
        this.setTotalVenda(totalVenda);
        this.setpComissao(pComissao);
    }

    /**
     * @return the totalVenda
     */
    public final float getTotalVenda() {
        return totalVenda;
    }

    /**
     * @param totalVenda the totalVenda to set
     * @throws conceito.PessoaException
     */
    public final void setTotalVenda(float totalVenda) throws PessoaException {
        if (totalVenda >= 0){
        this.totalVenda = totalVenda;
    } else {
            throw new PessoaException ("Total de Vendas deve ser maior ou "
                    + "igual a zero");
        }
        
    }

    /**
     * @return the pComissao
     */
    public final float getpComissao() {
        return pComissao;
    }

    /**
     * @param pComissao the pComissao to set
     * @throws conceito.PessoaException
     */
    public final void setpComissao(float pComissao) throws PessoaException {
        if (pComissao > 0 && pComissao < 100) {
        this.pComissao = pComissao;
    } else {
            throw new PessoaException ("Percentual de Comissao Inválido");
        }
    }

    @Override
    public float calcularSalario(){
        return totalVenda * (pComissao / 100) + totalVenda;
    }    

    
}
