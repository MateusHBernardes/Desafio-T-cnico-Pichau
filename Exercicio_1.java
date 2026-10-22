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
        

        List<String> BIPADOS = new ArrayList<>();

        BIPADOS.add("SSD-1TB-KG");
        BIPADOS.add("SSD-1TB-KG");
        // BIPADOS.add("MEM-16-DDR5");
        // BIPADOS.add("MEM-16-DDR5");
        BIPADOS.add("FNT-650W");
        BIPADOS.add("GAB-AIR-01");
        BIPADOS.add("GAB-AIR-0111111");
        
        for (Produto produto : pedido) {
            
            int contador = 0;

            for (String bipado : BIPADOS) {    

                if (bipado.equals(produto.sku)) {
                    contador++;
                }   
            }

            if (contador < produto.quantidade) {
                System.out.println("FALTANDO: " + produto.sku);
            } else if (contador > produto.quantidade) {
                System.out.println("SOBRANDO: " + produto.sku);
            } else if (contador == produto.quantidade){
                System.out.println("OK: " + produto.sku);
            }

        }
        for (String bipado : BIPADOS) {
            boolean encontrado = false;
         
            for (Produto produto :  pedido) {
                if (bipado.equals(produto.sku)) {
                    encontrado = true;
                    break;
                }
            }
        
            if (!encontrado) {
                System.out.println("SKU não pertence ao pedido: " + bipado);
            }
        }  
    }
}