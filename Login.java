import java.util.Scanner;

public class Login 
{
    public static void main(String[] args) 
    {
        Scanner menu = new Scanner(System.in);
        boolean exit = false;
        int cont = 0;
        int numberOfAttemptsAllowed = 3;
        String correctPassword = "soluevo";

        while(!exit) {
            System.out.println("Informe sua senha: ");
            String password = menu.nextLine();
            if(password.equals(correctPassword)) {
                System.out.println("Logado com sucesso!");
                exit = true;
            } else {
                cont++;
                if(cont >= numberOfAttemptsAllowed) {
                    System.out.println("Você errou a senha muitas vezes, utilizador bloqueado. Contate do administrador");
                    exit = true;
                } else {
                    System.out.println("Senha incorreta, você tem mais " + (numberOfAttemptsAllowed - cont) + " tentativas.");
                }
            }
        }
        menu.close();
    }
}