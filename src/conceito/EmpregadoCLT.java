

package conceito;


public class EmpregadoCLT extends Empregado {
    
    private float salarioBase;
    private float pINSS;
    private float pIR;
    private int numeroFilhos;
    private float valorSalarioFamilia;

    public EmpregadoCLT() {
        super();
    }

    public EmpregadoCLT(float salarioBase, float pINSS, float pIR, 
        int numeroFilhos, float valorSalarioFamilia, String cargo, 
        String nomeEmpresa, String nome, String nomeMae, String nomePai) 
        throws PessoaException {
        super(cargo, nomeEmpresa, nome, nomeMae, nomePai);
        this.setSalarioBase(salarioBase);
        this.setpINSS(pINSS);
        this.setpIR(pIR);
        this.setNumeroFilhos(numeroFilhos);
        this.setValorSalarioFamilia(valorSalarioFamilia);
    }
    
    
    /**
     * @return the salarioBase
     */
    public float getSalarioBase() {
        return salarioBase;
    }

    /**
     * @return the pINSS
     */
    public float getpINSS() {
        return pINSS;
    }

    /**
     * @return the pIR
     */
    public float getpIR() {
        return pIR;
    }

    /**
     * @return the numeroFilhos
     */
    public int getNumeroFilhos() {
        return numeroFilhos;
    }

    /**
     * @return the valorSalarioFamilia
     */
    public float getValorSalarioFamilia() {
        return valorSalarioFamilia;
    }
    
    
     /**
     * @param salarioBase the salarioBase to set
     * @throws conceito.PessoaException
     */
    public final void setSalarioBase(float salarioBase) throws PessoaException {
        if (salarioBase > 0){
        this.salarioBase = salarioBase;
    } else {
            throw new PessoaException ("Salario Base Inválido");
        }
        
    }        
    
    /**
     * @param pINSS the pINSS to set
     * @throws conceito.PessoaException
     */
    public final void setpINSS(float pINSS) throws PessoaException {
        if (pINSS >= 0 && pINSS <= 100){
            this.pINSS = pINSS;
        } else {
            throw new PessoaException ("Percentual de INSS Inválido");
        }
    }
    

    /**
     * @param pIR the pIR to set
     * @throws conceito.PessoaException
     */
    public final void setpIR(float pIR) throws PessoaException {
        if(pIR >= 0 && pIR <= 100) {
           this.pIR = pIR;
        } else {
            throw new PessoaException ("Percentual de IR Inválido");
        }
    }

    /**
     * @param numeroFilhos the numeroFilhos to set
     * @throws conceito.PessoaException
     */
    public final void setNumeroFilhos(int numeroFilhos) throws PessoaException{
        if (numeroFilhos >= 0){
        this.numeroFilhos = numeroFilhos;
    } else {
            throw new PessoaException ("Numero de filhos Inválido");
        }
    }    


    /**
     * @param valorSalarioFamilia the valorSalarioFamilia to set
     * @throws conceito.PessoaException
     */
    public final void setValorSalarioFamilia(float valorSalarioFamilia) throws 
            PessoaException {
        if (valorSalarioFamilia >= 0){
        this.valorSalarioFamilia = valorSalarioFamilia;
    } else {
            throw new PessoaException ("Salario Família Inválido");
        }
    }

    /**
     *
     * @return
     */
    @Override
    public float calcularSalario(){
        float totalSalarioFamilia;
        float totalINSS;
        float totalIR;
        
        if (getNumeroFilhos() <= 3){
            totalSalarioFamilia = getValorSalarioFamilia() * getNumeroFilhos();
        } else {
            totalSalarioFamilia = getValorSalarioFamilia() * 3;
        }
        
        totalINSS = getSalarioBase() * (getpINSS() / 100);
        totalIR = getSalarioBase() * (getpIR() / 100);
        
        return getSalarioBase() + totalSalarioFamilia - totalINSS - totalIR;
    }


}
