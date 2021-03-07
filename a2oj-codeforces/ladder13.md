## A2OJ Ladder-13 Solutions

### [Young Physicist](https://codeforces.com/problemset/problem/69/A)
```java
static class Solver {
    public void solve(int testCase, InputReader in) {
        int input = in.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 0; i < input; i++) {
            x += in.nextInt();
            y += in.nextInt();
            z += in.nextInt();
        }
        if (x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

### [Beautiful Matrix](https://codeforces.com/problemset/problem/263/A)
```java
    static class Solver {
        public void solve(int testCase, InputReader in) {
            int row = 0;
            int column = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                   int n = in.nextInt();
                   if (n == 1){
                       row = i;
                       column = j;
                   }
                }
            }
            System.out.println(Math.abs(row -2 )+ Math.abs( column - 2));
        }
    }
```