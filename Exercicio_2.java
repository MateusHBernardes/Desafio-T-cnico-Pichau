import java.util.ArrayList;
import java.util.List;

public class Exercicio_2 {

    static class Devolucao {
        String motivo;
        double valor;
        int pedido;

        Devolucao(String motivo, double valor, int pedido) {
            this.motivo = motivo;
            this.valor = valor;
            this.pedido = pedido;
        }
    }

        public static void main(String[] args) {
        List<Devolucao> listaPedido = new ArrayList<>();

        listaPedido.add(new Devolucao("Defeito", 899.90, 1001));
        listaPedido.add(new Devolucao("Arrependimento", 129.90, 1002));
        listaPedido.add(new Devolucao("Defeito", 2499.00, 1003));
        listaPedido.add(new Devolucao("Avaria no transporte", 349.90, 1004));
        listaPedido.add(new Devolucao("Arrependimento", 59.90, 1005));
        listaPedido.add(new Devolucao("Defeito", 189.90, 1006));
        listaPedido.add(new Devolucao("Avaria no transporte", 1299.00, 1007));
        
        double totalArrependimento = 0;
        double totalAvaria = 0;
        double totalDefeito = 0;

        int devAcima500 = 0;
        
        double maiorTotal = totalArrependimento;
        String motivoMaior = "Arrependimento";
        
        for (Devolucao devolucao : listaPedido) {
            
            
            if (devolucao.motivo.equals("Arrependimento")) {
                totalArrependimento += devolucao.valor;
            } else if (devolucao.motivo.equals("Avaria no transporte")) {
                totalAvaria += devolucao.valor;
            } else if (devolucao.motivo.equals("Defeito")) {
                totalDefeito += devolucao.valor;
            }


            if (totalAvaria > maiorTotal) {
                maiorTotal = totalAvaria;
                motivoMaior = "Avaria no transporte";
            } else if (totalDefeito > maiorTotal) {
                maiorTotal = totalDefeito;
                motivoMaior = "Defeito";
            }

            if (devolucao.valor >= 500) {
                devAcima500++;
            }
            
        }
            System.out.println("Total de devoluções por motivo:");
            System.out.println("Arrependimento: R$" + totalArrependimento);
            System.out.println("Avaria no transporte: R$" + totalAvaria);
            System.out.println("Defeito: R$" + totalDefeito);
            System.out.println("Motivo com maior valor de devolução: " + motivoMaior);
            System.out.println("Número de devoluções acima de R$500: " + devAcima500);
    }

}
