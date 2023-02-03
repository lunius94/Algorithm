package backjoon.bruteforce.silver;
import java.io.*;
import java.util.*;

public class Q7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Person[] arr = new Person[N];
        for(int i = 0 ; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i] = new Person(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        int[] rank = new int[N];
        Arrays.fill(rank,1);
        for(int i = 0; i < N; i++) {
            for(int j = 0; j<N; j++) {
                if(Person.compare(arr[i],arr[j])>0) {
                    rank[j]++;
                }
            }
        }
        for(int i =0; i<N; i++) {
            System.out.println(rank[i]);
        }



    }
    static class Person{
        private int weight;
        private int height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public int getWeight() {
            return weight;
        }
        public int getHeight() {
            return height;
        }

        public static int compare(Person o1, Person o2) {
            if(o1.getWeight()>o2.getWeight() && o1.getHeight()>o2.getHeight()) return 1;
            else if(o1.getWeight()<o2.getWeight() && o1.getHeight()<o2.getHeight()) return -1;
            else return 0;
        }
    }
}
