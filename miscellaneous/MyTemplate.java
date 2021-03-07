import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MyTemplate {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader();
        Solver solver = new Solver();
        solver.solve(1, in);

    }

    static class Solver {
        public void solve(int testCase, InputReader in) {

        }
    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer tokenizer;

        public InputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }


}
