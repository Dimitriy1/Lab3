import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> customArrayList = new CustomArrayList<>();
        /*0*/
        customArrayList.add(0);

        /*0*/
        customArrayList.remove(new Integer(1));

        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.print(customArrayList.get(i) + " ");
        }

        System.out.println("\n");

        /*0 1 null 2 null*/
        customArrayList.add(1);
        customArrayList.add(null);
        customArrayList.add(2);
        customArrayList.add(null);

        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.print(customArrayList.get(i) + " ");
        }

        System.out.println("\n");

        /*0 1 null 2 null*/
        customArrayList.remove(new Integer(1000000));

        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.print(customArrayList.get(i) + " ");
        }

        System.out.println("\n");

        /*0 1 null 2 null 4*/

        customArrayList.add(4);

        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.print(customArrayList.get(i) + " ");
        }

        System.out.println("\n");

        /*0 1 2 null 4*/

        customArrayList.remove(null);

        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.print(customArrayList.get(i) + " ");
        }

        System.out.println("\n");

        /*0 1 2 null 2 4*/

        customArrayList.add(4,new Integer(2));

        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.print(customArrayList.get(i) + " ");
        }

        System.out.println("\n");

        /*false*/

        System.out.println(customArrayList.contains(9));

        customArrayList.add(7, new Integer(9));

        /*Exception in thread "main" java.lang.IndexOutOfBoundsException: Index < 0 or index > size isn't required*/
    }
}
