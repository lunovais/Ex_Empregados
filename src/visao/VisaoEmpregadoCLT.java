

package visao;

import conceito.Empregado;
import conceito.EmpregadoCLT;
import conceito.Endereco;
import conceito.PessoaException;
import javax.swing.JOptionPane;


public class VisaoEmpregadoCLT implements IVisaoEmpregado {
    
        private EmpregadoCLT emp;
        private Endereco endereco;

    public VisaoEmpregadoCLT() {
        emp = new EmpregadoCLT();
        endereco = new Endereco();
    }
         
    /**
     *
     */
    @Override
        public void lerDados(){
            boolean continuaLoop = true;
            do{
                try{
                    emp.setNome(JOptionPane.showInputDialog("Forneca o nome:"));
                    emp.setCargo(JOptionPane.showInputDialog("Forneca o cargo:"));
                    emp.setSalarioBase(Float.parseFloat(JOptionPane.showInputDialog("Forneca o "
                            + "valor do salário base")));
                    emp.setpINSS(Float.parseFloat(JOptionPane.showInputDialog("Forneca o "
                            + "percentual do INSS:")));
                    emp.setpIR(Float.parseFloat(JOptionPane.showInputDialog("Forneca o "
                            + "percentual do IR:")));
                    emp.setValorSalarioFamilia(Float.parseFloat(JOptionPane.showInputDialog(""
                            + "Forneca o valor do salário da família:")));
                    emp.setNumeroFilhos(Integer.parseInt(
                            JOptionPane.showInputDialog("Forneca o numero de filhos:")));
                    continuaLoop = false;
                } catch (PessoaException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());  
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Erro de digitacao");
                }
                
            } while (continuaLoop);
        }

        @Override
        public void mostraDados(){
            JOptionPane.showMessageDialog(null, this.obterDados(), "Resultados", 
                    JOptionPane.PLAIN_MESSAGE);
        }
        
        @Override
        public String obterDados(){
            return "Nome: " + emp.getNome() + "\nCargo: " + emp.getCargo() 
                    + "\nSalario: " + emp.calcularSalario();
        }
        
        @Override
        public Empregado getEmpregado(){
            return emp;
        }
        
        public Endereco getEnderecoCompleto(){
            return endereco;
        }
}
