

package visao;

import conceito.Empregado;
import conceito.EmpregadoComissao;
import conceito.Endereco;
import conceito.EnderecoException;
import conceito.PessoaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VisaoEmpregadoComissao implements IVisaoEmpregado {

    private EmpregadoComissao emp;
    private Endereco endereco;

    public VisaoEmpregadoComissao() {
        emp = new EmpregadoComissao();
        endereco = new Endereco();
    }

    @Override
    public void lerDados() {
        boolean continuaLoop = true;
        do{
            try{
                emp.setNome(JOptionPane.showInputDialog("Forneça o nome: "));
                emp.setCargo(JOptionPane.showInputDialog("Forneça o cargo: "));
                emp.setTotalVenda(Float.parseFloat(JOptionPane.showInputDialog(""
                        + "Forneça o total vendido: ")));
                emp.setpComissao(Float.parseFloat(JOptionPane.showInputDialog(""
                        + "Percentual da comissao: ")));
                emp.setNomeEmpresa(JOptionPane.showInputDialog("Forneça o nome da empresa:"));
                emp.setCepEmpresa(JOptionPane.showInputDialog("Forneça o cep:"));
                emp.setBairroEmpresa(JOptionPane.showInputDialog("Forneça o bairro: "));
                emp.setRuaEmpresa(JOptionPane.showInputDialog("Forneça a rua:"));
                emp.setNumeroEmpresa(Integer.parseInt(JOptionPane.showInputDialog("Forneça o número")));
                emp.setCidadeEmpresa(JOptionPane.showInputDialog("Forneça a cidade: "));
                emp.setUfEmpresa(JOptionPane.showInputDialog("Forneça a UF: "));
                continuaLoop = false;
            } catch (PessoaException | EnderecoException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Erro de digitação");
            }
        } while (continuaLoop);
    }

    @Override
    public void mostraDados() {
         JOptionPane.showMessageDialog(null, this.obterDados(), "Resultados", JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public String obterDados() {
        return "Nome: " + emp.getNome() + "\nCargo: " + emp.getCargo() + "\nSalario: " + emp.calcularSalario(); 
    }

    @Override
    public Empregado getEmpregado() {
        return emp;
    }
    
}
