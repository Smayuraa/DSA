import java.util.*;

public class ChocolateProblem {
    public static void main(String[] args) {
        Integer costVer[] = {2, 1, 3, 1, 4};
        Integer costHor[] = {4, 1, 2};

        // Sort the cost arrays in descending order
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int v = 0, h = 0, cost = 0;
        int vp = 1, hp = 1; // Vertical and horizontal pieces

        // Calculate the minimum cost
        while (v < costVer.length && h < costHor.length) {
            if (costVer[v] >= costHor[h]) {
                cost += costVer[v] * hp;
                vp++;
                v++;
            } else {
                cost += costHor[h] * vp;
                hp++;
                h++;
            }
        }

        // Add remaining vertical cuts
        while (v < costVer.length) {
            cost += costVer[v] * hp;
            v++;
        }

        // Add remaining horizontal cuts
        while (h < costHor.length) {
            cost += costHor[h] * vp;
            h++;
        }

        System.out.println("Total cost: " + cost);
    }
}
