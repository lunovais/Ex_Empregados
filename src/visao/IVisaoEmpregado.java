/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import conceito.Empregado;
import conceito.Endereco;

public interface IVisaoEmpregado {
    
    void lerDados();
    void mostraDados();
    String obterDados();
    
    Empregado getEmpregado();
    
}