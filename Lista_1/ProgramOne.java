import java.util.Scanner; 

public class ProgramOne {
    public static void main(String args[]) {

        ClassProgramOne autor = new ClassProgramOne();
        
        Scanner scanner;
        scanner = new Scanner(System.in);

        scanner.nextLine();
        System.out.println("Digite o nome do Autor: ");
        autor.nome = scanner.nextLine(); //fgets
        
        System.out.println("Digite o ID do Autor: ");
        autor.id = scanner.nextInt(); // scanf

        System.out.println("Nome: " + autor.nome);
        System.out.println("ID: " + autor.id);
   
    }
}