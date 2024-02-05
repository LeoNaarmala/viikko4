package main;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student student=new Student();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit) {
            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Anna opiskelijan nimi?");
                        String name = sc.nextLine();
                        System.out.println("Anna opiskelijan opiskelijanumero:");
                        String snum = sc.nextLine();
                        student.addStudent(name,snum);
                        break;
                    case 2:
                        student.listStudent();
                        break;
                    case 3:
                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:

                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;

                }
            }

        }

    }
}
