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
    }

// //     devolucoes = [
// { pedido: 1001, motivo: "Defeito", valor: 899.90 },
// { pedido: 1002, motivo: "Arrependimento", valor: 129.90 },
// { pedido: 1003, motivo: "Defeito", valor: 2499.00 },
// { pedido: 1004, motivo: "Avaria no transporte", valor: 349.90 },
// { pedido: 1005, motivo: "Arrependimento", valor: 59.90 },
// { pedido: 1006, motivo: "Defeito", valor: 189.90 },
// { pedido: 1007, motivo: "Avaria no transporte", valor: 1299.00 },
// // ]
}
