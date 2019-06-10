

package conceito;


public class Pessoa {
    
    private String nome;
    private String nomeMae;
    private String nomePai;
    Endereco endereco;

    public Pessoa() {
        this.nome = "";
        this.nomeMae = "";
        this.nomePai = "";
        this.endereco = new Endereco();
    }
    
    public Pessoa(String nome){
        this.nomeMae = "";
        this.nomePai = "";
        this.endereco = null;
    }
    
    public Pessoa(String nome, String nomeMae, String nomePai) throws PessoaException{
        this.setNome(nome);
        this.setNomeMae(nomeMae);
        this.setNomePai(nomePai);
    }
    /**
     * @return the nome
     */
    public final String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     * @throws conceito.PessoaException
     */
    public final void setNome(String nome) throws PessoaException {
        if (nome.length() >= 3){
            this.nome = nome;
        } else {
            throw new PessoaException ("Nome inválido");
        }
    }

    /**
     * @return the nomeMae
     */
    public final String getNomeMae() {
        return nomeMae;
    }

    /**
     * @param nomeMae the nomeMae to set
     * @throws conceito.PessoaException
     */
    public final void setNomeMae(String nomeMae) throws PessoaException {
        if (nomeMae.length() >= 3){
            this.nomeMae = nomeMae;
        } else {
            throw new PessoaException ("Nome da Mae Inválido");
        }
    }

    /**
     * @return the nomePai
     */
    public final String getNomePai() {
        return nomePai;
    }

    /**
     * @param nomePai the nomePai to set
     * @throws conceito.PessoaException
     */
    public final void setNomePai(String nomePai) throws PessoaException {
        if (nomePai.length() >= 3){
            this.nomePai = nomePai;
        } else {
            throw new PessoaException ("Nome do Pai Inválido");
        }
    }

    public final String getRua(String rua) {
        return this.endereco.getRua();
    }

    /**
     * @throws conceito.EnderecoException 
     */
    public final void setRua(String rua) throws EnderecoException {
        this.endereco.setRua(rua);
    }

    /**
     * @param numero
     * @return the numero
     */
    public final int getNumero(int numero) {
        return this.endereco.getNumero();
    }

    /**
     */
    public final void setNumero(int numero) {
        this.endereco.setNumero(numero);
    }

    /**
     * @param bairro
     * @return the bairro
     */
    public final String getBairro(String bairro) {
        return this.endereco.getBairro();
    }

    /**
     * @throws conceito.EnderecoException
     */
    public final void setBairro(String bairro) throws EnderecoException {
        this.endereco.setBairro(bairro);
    }

    /**
     * @param cidade
     * @return the cidade
     */
    public final String getCidade(String cidade) {
        return this.endereco.getCidade();
    }

    /**
     * @throws conceito.EnderecoException
     */
    public final void setCidade(String cidade) throws EnderecoException {
        this.endereco.setCidade(cidade);
    }

    /**
     * @param cep
     * @return the cep
     */
    public final String getCep(String cep) {
        return this.endereco.getCep();
    }

    /**
     * @param cep the cep to set
     * @throws conceito.EnderecoException
     */
    public final void setCep(String cep) throws EnderecoException {
        this.endereco.setCep(cep);
    }

    /**
     * @param uf
     * @return the uf
     */
    public final String getUf(String uf) {
        return this.endereco.getUf();
    }

    /**
     * @param uf the uf to set
     * @throws conceito.EnderecoException
     */
    public final void setUf(String uf) throws EnderecoException {
        this.endereco.setUf(uf);
    }
    
    
}
