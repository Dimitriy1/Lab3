public class Main {
    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList();
        /*0*/
        customArrayList.add(0);

        /*0*/
        customArrayList.remove(1);

        for (int i = 0; i < customArrayList.getSize() ; i++) {
            System.out.print(customArrayList.get(i) +" ");
        }

        System.out.println("\n");

        /*0 1 1000000 2 1000000*/
        customArrayList.add(1);
        customArrayList.add(1000000);
        customArrayList.add(2);
        customArrayList.add(1000000);

        for (int i = 0; i < customArrayList.getSize() ; i++) {
            System.out.print(customArrayList.get(i) + " ");
        }

        System.out.println("\n");

        /*0 1 2 1000000*/
        customArrayList.remove(1000000);

        for (int i = 0; i < customArrayList.getSize() ; i++) {
            System.out.print(customArrayList.get(i)+" ");
        }

        System.out.println("\n");

        /*0 1 2 1000000 4*/

        customArrayList.add(4);

        for (int i = 0; i < customArrayList.getSize() ; i++) {
            System.out.print(customArrayList.get(i)+" ");
        }

        System.out.println("\n");

        /*0 1 2 1000000*/

        customArrayList.remove(4);

        for (int i = 0; i < customArrayList.getSize() ; i++) {
            System.out.print(customArrayList.get(i)+" ");
        }

        System.out.println("\n");

        /*0 1 4 2 1000000*/

        customArrayList.add(4,2);

        for (int i = 0; i < customArrayList.getSize() ; i++) {
            System.out.print(customArrayList.get(i)+" ");
        }

        /*false*/

        System.out.println(customArrayList.contains(9));

        customArrayList.add(9,6);
        /*Exception in thread "main" java.lang.IndexOutOfBoundsException: Index < 0 or index > size isn't required*/
    }
}
