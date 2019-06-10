

package conceito;


public class Endereco {
    
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String cep;
    private String uf;

    public Endereco() {
        this.rua = "";
        this.bairro = "";
        this.cidade = "";
        this.cep = "";
        this.uf = "";
        
    }

    /**
     * @return the logradouro
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua
     * @throws conceito.EnderecoException
     */
    public final void setRua(String rua) throws EnderecoException {
        if (rua.length() > 3){
            this.rua = rua;
        } else {
            throw new EnderecoException ("Rua deve ter mais que 3 caracteres");
        }
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro
     * @throws conceito.EnderecoException
     */
    public final void setBairro(String bairro) throws EnderecoException {
        if (bairro.length() > 3){
            this.bairro = bairro;
        } else {
            throw new EnderecoException ("Bairro deve ter mais que 3 caracteres");
        }
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade
     * @throws conceito.EnderecoException
     */
    public final void setCidade(String cidade) throws EnderecoException {
        if (cidade.length() > 3){
            this.cidade = cidade;
        } else {
            throw new EnderecoException ("Cidade deve ter mais que 3 caracteres");
        }
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     * @throws conceito.EnderecoException
     */
    public void setCep(String cep) throws EnderecoException {
        if (cep.length() == 10){
            this.cep = cep;
        } else {
            throw new EnderecoException ("CEP deve conter 10 caracteres");
        }
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     * @throws conceito.EnderecoException
     */
    public void setUf(String uf) throws EnderecoException {
        if (uf.length() == 2){
            this.uf = uf;
        } else {
            throw new EnderecoException ("UF deve conter 2 caracteres");
        }
    }
    
    public String getEnderecoCompleto(){
        return "Endereço Completo: "+ rua + ", " + numero + " - " + bairro + 
                ". " + cidade + " - " + uf + ". " + cep + ".";
    }

}
