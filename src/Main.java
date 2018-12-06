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

        /*0 1 1000000 2 1000000*/
        customArrayList.add(1);
        customArrayList.add(null);
        customArrayList.add(2);
        customArrayList.add(null);

        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.print(customArrayList.get(i) + " ");
        }

        System.out.println("\n");

        /*0 1 2 1000000*/
        customArrayList.remove(new Integer(1000000));

        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.print(customArrayList.get(i) + " ");
        }

        System.out.println("\n");

        /*0 1 2 1000000 4*/

        customArrayList.add(4);

        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.print(customArrayList.get(i) + " ");
        }

        System.out.println("\n");

        /*0 1 2 1000000*/

        customArrayList.remove(null);

        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.print(customArrayList.get(i) + " ");
        }

        System.out.println("\n");

        /*0 1 4 2 1000000*/

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
