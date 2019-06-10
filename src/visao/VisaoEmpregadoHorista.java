

package visao;

import conceito.Empregado;
import conceito.EmpregadoHorista;
import conceito.Endereco;
import conceito.PessoaException;
import javax.swing.JOptionPane;


public class VisaoEmpregadoHorista implements IVisaoEmpregado {
    
    private EmpregadoHorista emp;
    private Endereco endereco;

    public VisaoEmpregadoHorista() {
        emp = new EmpregadoHorista();
        endereco = new Endereco();
    }

    @Override
    public void lerDados() {
        boolean continuaLoop = true;
        do{
            try{
                emp.setNome(JOptionPane.showInputDialog("Forneça o nome: "));
                emp.setCargo(JOptionPane.showInputDialog("Forneça o cargo: "));
                emp.setNumeroHora(Integer.parseInt(JOptionPane.showInputDialog("Forneça o numero de horas trabalhadas: ")));
                emp.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Forneça o valor da hora trabalhada: ")));
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
