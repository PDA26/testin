import java.util.*;

class Main {
    static void helper(){
        double[] node = new double[]{3900, 1};
        // node : {price, possibility}
        Queue<double[]> q = new LinkedList<>();
        q.offer(node);
        int cnt = 0;
        while(cnt < 3){
            // inside of the loop is one layer in the tree
            int n = q.size();
            for (int i = 0; i < n; i++) {
                double[] curr = q.poll();
                // code to print or display
                System.out.println("price: " + curr[0] + ", chance: " + curr[1]);
                // code to prepare for next iteration
                q.offer(new double[] { curr[0] + 1.05, curr[1] / 2 });
                q.offer(new double[] { curr[0] - 0.96, curr[1] / 2 });
            }
        }
    }

    public static void main(String[] args) {
        helper();
    }
}