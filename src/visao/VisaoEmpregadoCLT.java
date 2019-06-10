

package visao;

import conceito.Empregado;
import conceito.EmpregadoCLT;
import conceito.Endereco;
import conceito.EnderecoException;
import conceito.PessoaException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                    emp.setNomeEmpresa(JOptionPane.showInputDialog("Forneça o nome da empresa:"));
                    endereco.setCep(JOptionPane.showInputDialog("Forneça o cep:"));
                    endereco.setBairro(JOptionPane.showInputDialog("Forneça o bairro:"));
                    endereco.setRua(JOptionPane.showInputDialog("Forneça a rua:"));
                    endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Forneça o número:")));
                    endereco.setCidade(JOptionPane.showInputDialog("Forneça a cidade:"));
                    endereco.setUf(JOptionPane.showInputDialog("Forneça a UF:"));
                    continuaLoop = false;
                } catch (PessoaException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());  
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Erro de digitacao");
                } catch (EnderecoException ex) {
                    Logger.getLogger(VisaoEmpregadoCLT.class.getName()).log(Level.SEVERE, null, ex);
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
        
}
