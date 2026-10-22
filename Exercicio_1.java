import java.util.ArrayList;
import java.util.List;

public class Exercicio_1 {

    static class Produto {
        String sku;
        int quantidade;

        Produto(String sku, int qtd) {
            this.sku = sku;
            this.quantidade = qtd;
        }
    }

    public static void main(String[] args) {
        List<Produto> pedido = new ArrayList<>();

        pedido.add(new Produto("SSD-1TB-KG", 2));
        pedido.add(new Produto("MEM-16-DDR5", 2));
        pedido.add(new Produto("FNT-650W", 1));
        pedido.add(new Produto("GAB-AIR-01", 1));
        

        
    }
}