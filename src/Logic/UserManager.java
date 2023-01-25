package Logic;
import Info.User;

public class UserManager {

    public static void main(String[] args) {
        User user = new User("Jan" , "Kowalski");
        System.out.println("Wybierz opcje : ");
        System.out.println("0-wyjście z programu : ");
        System.out.println("1-wyświetl dodatkowe informacje o użytkowniku :");
        System.out.println("2-modyfikuj dane użytkownika ");
        int option = 5 ;

        if (option == 0 ){
            System.out.println("Bye bye ");

        } else if (option ==  1) {
            System.out.println("Użytkownik : " + user.getName() + " " +  user.getSurname());
        } else if (option == 2 ) {
           user.setName("Marian");
           user.setSurname("Powolny");
            System.out.println("Zmodyfikowane dane uzytkownika to  : " + user.getName() + " " +  user.getSurname() );
        } else {
            System.out.println("Błędna opcja : ");
        }

    }





}
