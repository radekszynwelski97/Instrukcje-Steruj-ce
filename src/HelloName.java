public class HelloName {
    public static void main(String[] args) {
        final String name1 = "Krzysiek";
        final String name2 = "Maciek";

        String name = "Piotrek";

        switch (name){
            case name1:
                System.out.println("Siema Krzychu , witaj w aplikacji!");
                break;
            case name2:
                System.out.println("Witam Panie prezesie , jak mija dzień ?");
                break;
                default:
                System.out.println("Witaj nieznany użytkowniku");

        }

    }



}
