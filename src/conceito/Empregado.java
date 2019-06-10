

package conceito;


public abstract class Empregado extends Pessoa {
    
    private String cargo;
    private String nomeEmpresa;
    Endereco enderecoEmpresa;

    public Empregado() {
        this.cargo = "";
        this.nomeEmpresa = "";
    }


    public Empregado(String cargo, String nomeEmpresa, String nome, 
            String nomeMae, String nomePai) throws PessoaException {
        super(nome, nomeMae, nomePai);
        this.cargo = "";
        this.nomeEmpresa = "";
    }

    /**
     * @return the cargo
     */
    public final String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     * @throws conceito.PessoaException
     */
    public final void setCargo(String cargo) throws PessoaException {
        if (cargo.length() >= 3) {
            this.cargo = cargo;
        } else {
            throw new PessoaException ("Cargo Inválido");
        }
    }

    
    /**
     * @return the nomeEmpresa
     */
    public final String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * @param nomeEmpresa the nomeEmpresa to set
     * @throws conceito.PessoaException
     */
    public final void setNomeEmpresa(String nomeEmpresa) throws PessoaException {
        if (nomeEmpresa.length() >= 3) {
            this.nomeEmpresa = nomeEmpresa;
        } else {
            throw new PessoaException ("Nome Empresa Inválido");
        }
    }
    
    
    public final String getRuaEmpresa(String rua){
        return this.enderecoEmpresa.getRua();
    }
    
    public final void setRuaEmpresa(String rua) throws EnderecoException{
       if (rua.length() > 3){
            this.enderecoEmpresa.setRua(rua);
        } else {
            throw new EnderecoException ("Rua deve ter mais que 3 caracteres");
        }
    }
    
    
    public final int getNumeroEmpresa(int numero) {
        return this.enderecoEmpresa.getNumero();
    }
    
    public final void setNumeroEmpresa(int numero) throws EnderecoException{
        this.enderecoEmpresa.setNumero(numero);
    }
    
    
    public final String getBairroEmpresa(String bairro){
        return this.enderecoEmpresa.getBairro();
    }
    
    public final void setBairroEmpresa(String bairro) throws EnderecoException{
        if (bairro.length() > 3){
            this.enderecoEmpresa.setBairro(bairro);
        } else {
            throw new EnderecoException ("Bairro deve ter mais que 3 caracteres");
        }
    }
    
    
    public final String getCidadeEmpresa(String cidade){
        return this.enderecoEmpresa.getCidade();
    }
    
    public final void setCidadeEmpresa(String cidade) throws EnderecoException{
        if (cidade.length() > 3){
            this.enderecoEmpresa.setCidade(cidade);
        } else {
            throw new EnderecoException ("Cidade deve ter mais que 3 caracteres");
        }
    }

    
    public final String getCepEmpresa(String cep){
        return this.enderecoEmpresa.getCep();
    }
    
    public final void setCepEmpresa(String cep) throws EnderecoException{
        if (cep.length() == 10){
            this.enderecoEmpresa.setCep(cep);
        } else {
            throw new EnderecoException ("CEP deve conter 10 caracteres");
        }
    }
    
    
    public final String getUfEmpresa(String uf){
        return this.enderecoEmpresa.getUf();
    }
    
    public final void setUfEmpresa(String uf) throws EnderecoException{
        if (uf.length() == 2){
            this.enderecoEmpresa.setUf(uf);
        } else {
            throw new EnderecoException ("UF deve conter 2 caracteres");
        }
    }
    
    
    public abstract float calcularSalario();
    

}
