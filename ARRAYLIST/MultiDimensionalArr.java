import java.util.ArrayList;

public class MultiDimensionalArr {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> Mainlist = new ArrayList<>();
        ArrayList<Integer> currList;

        // Adding some elements to list1 and list2 for demonstration
        list1.add(1);
        list1.add(2);
        list2.add(3);
        list2.add(4);

        Mainlist.add(list1);
        Mainlist.add(list2);

        for (int i = 0; i < Mainlist.size(); i++) {
            currList = Mainlist.get(i);

            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }

            System.out.println();
        }
    }
}
