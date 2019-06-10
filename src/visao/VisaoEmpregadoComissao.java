

package visao;

import conceito.Empregado;
import conceito.EmpregadoComissao;
import conceito.Endereco;
import conceito.PessoaException;
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
                continuaLoop = false;
            } catch (PessoaException e){
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
    
    public Endereco getEnderecoCompleto(){
        return endereco;
    }
}
