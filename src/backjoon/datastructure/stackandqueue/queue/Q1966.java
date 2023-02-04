package backjoon.datastructure.stackandqueue.queue;
import java.io.*;
import java.util.*;

public class Q1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine()," ");
            Document[] arr = new Document[A];
            for(int j = 0; j<A; j++) {
                arr[j] = new Document(Integer.parseInt(st.nextToken()));
            }
            Document target = arr[B];

            Queue<Document> queue = new LinkedList<>(Arrays.asList(arr));
            Arrays.sort(arr,(a,b) -> b.getPriority() - a.getPriority());
            int count = 0;
            for (Document document : arr) {
                while (queue.peek().getPriority() != document.getPriority()) {
                    queue.offer(queue.poll());
                }
                count++;
                if (target == queue.poll()) {
                    sb.append(count).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }

    static class Document {
        private final int priority;

        public Document(int priority) {
            this.priority = priority;
        }

        public int getPriority() {
            return priority;
        }
    }
    // 다른 사람의 풀이
    /*
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());	// 테스트 케이스

        while (T-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> q = new LinkedList<>();	// Queue로 활용 할 연결리스트
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                // {초기 위치, 중요도}
                q.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
            }

            int count = 0;	// 출력 횟수

            while (!q.isEmpty()) {	// 한 케이스에 대한 반복문

                int[] front = q.poll();	// 가장 첫 원소
                boolean isMax = true;	// front 원소가 가장 큰 원소인지를 판단하는 변수

                // 큐에 남아있는 원소들과 중요도를 비교
                for(int i = 0; i < q.size(); i++) {

                    // 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클 경우
                    if(front[1] < q.get(i)[1]) {

                        // 뽑은 원소 및 i 이전의 원소들을 뒤로 보낸다.
                        q.offer(front);
                        for(int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }

                        // front원소가 가장 큰 원소가 아니였으므로 false를 하고 탐색을 마침
                        isMax = false;
                        break;
                    }
                }

                // front 원소가 가장 큰 원소가 아니였으므로 다음 반복문으로 넘어감
                if(isMax == false) {
                    continue;
                }

                // front 원소가 가장 큰 원소였으므로 해당 원소는 출력해야하는 문서다.
                count++;
                if(front[0] == M) {	// 찾고자 하는 문서라면 해당 테스트케이스 종료
                    break;
                }

            }

            sb.append(count).append('\n');

        }
        System.out.println(sb);
    }
     */
}
