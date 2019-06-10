

package execucao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import visao.IVisaoEmpregado;
import visao.VisaoEmpregadoCLT;
import visao.VisaoEmpregadoComissao;
import visao.VisaoEmpregadoHorista;


public class TesteEmpregados {
    
    public static final String stringMenu = "Forneça uma das opções: \n \n" +
            "[1] Incluir Empregado CLT \n" +
            "[2] Incluir Empregado Comissao \n" +
            "[3] Incluir Empregado Horista \n" +
            "[4] Mostrar Dados \n" +
            "[5] Totalizar Salarios\n" +
            "[6] Sair \n";
    
    public static void main(String[] args) {
        int resp = 0;
        ArrayList <IVisaoEmpregado> listaEmpregado = new ArrayList();
        IVisaoEmpregado visaoEmpregadoTemp;
        
        double totalSalarios = 0;
        
        do{
            resp = exibirMenu();
            if  (resp == 1){
                visaoEmpregadoTemp = new VisaoEmpregadoCLT();
                visaoEmpregadoTemp.lerDados();
                listaEmpregado.add(visaoEmpregadoTemp);
                
            } else if (resp == 2 ){
                visaoEmpregadoTemp = new VisaoEmpregadoComissao();
                visaoEmpregadoTemp.lerDados();
                listaEmpregado.add(visaoEmpregadoTemp);
                
            } else if (resp == 3){
                visaoEmpregadoTemp = new VisaoEmpregadoHorista();
                visaoEmpregadoTemp.lerDados();
                listaEmpregado.add(visaoEmpregadoTemp);
                
            } else if (resp == 4){
                if (listaEmpregado.size() >= 5){
                    for (IVisaoEmpregado visao : listaEmpregado){
                    visao.mostraDados();
                    }
                } else {
                JOptionPane.showMessageDialog(null, "Lista deve ter no mínimo 5 empregados.");
            }
                
            } else if (resp == 5){
                totalSalarios = 0;
                for (IVisaoEmpregado visao : listaEmpregado){
                    totalSalarios += visao.getEmpregado().calcularSalario();
                }
                JOptionPane.showMessageDialog(null, "Total dos Salarios = "
                        +totalSalarios);
            }
            
    } while (resp != 6);
        
        
        System.exit(0);
            
    }

    private static int exibirMenu() {
        int resp = 0;
        
        do{
            try{
                resp = Integer.parseInt(JOptionPane.showInputDialog(null, stringMenu));
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Digitaçao inconsistente");
                resp = 0;
            }
        } while (resp < 1 || resp > 6);
        return resp;
    }


}
