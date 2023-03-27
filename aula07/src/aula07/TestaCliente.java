package aula07;
public class TestaCliente {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("João Silva", "joao.silva@gmail.com", "Rua das Flores, 123", "(11) 98765-4321", 30);
        Cliente cliente2 = new Cliente("Maria Santos", "maria.santos@gmail.com", "Avenida das Árvores, 456", "(11) 91234-5678", 25);
        
       
        System.out.println("Cliente 1:");
        cliente1.visualizar();
        
        System.out.println("\nCliente 2:");
        cliente2.visualizar();
    }
}

