import java.util.Scanner;
public class HouseHowards {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String house;
        String[] houselist=new String[]{"Gryffindor","Hufflepuf","Slytherin","Ravenclaw"};
        String[] atribute=new String[]{"Bravery","Loyalty","Cunning", "Intellec"};
        do {
            System.out.println("Escribre el nombre de una casa de Howards para saber su atributo:");
            System.out.println("Gryffindor / Hufflepuf / Slytherin / Ravenclaw.");
            house = sc.nextLine().toLowerCase();
            switch (house) {
                case "gryffindor":
                    System.out.println("The house " + houselist[0] + " is a " + atribute[0] + " house.");
                    break;
                case "hufflepuf":
                    System.out.println("The house " + houselist[1] + " is a " + atribute[1] + " house.");
                    break;
                case "slytherin":
                    System.out.println("The house " + houselist[2] + " is a " + atribute[2] + " house.");
                    break;
                case "ravenclaw":
                    System.out.println("The house " + houselist[3] + " is a " + atribute[3] + " house.");
                    break;
                default:
                    System.out.println("It's not a valid house.");

            }
        }while (house!="gryffindor" || house!="hufflepuf" || house!="slytherin"|| house!="ravenclaw");
        //Quiero hacer que el bucle salga en cuanto detecte una de estas palabras en el string, pero sigue en el bucle.

    }
}
