## A2OJ Ladder-13 Solutions

### [1. Choosing Teams](https://codeforces.com/problemset/problem/432/A)

```java
static class Solver {
    public void solve(int testCase, InputReader in) {
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            if (t + k <= 5) {
                count++;
            }
        }
        System.out.println(count / 3);
    }
}
```

### #Update Below - TBD

### [1. Young Physicist](https://codeforces.com/problemset/problem/69/A)

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

### [2. Beautiful Matrix](https://codeforces.com/problemset/problem/263/A)

```java
static class Solver {
    public void solve(int testCase, InputReader in) {
        int row = 0;
        int column = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int n = in.nextInt();
                if (n == 1) {
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(Math.abs(row - 2) + Math.abs(column - 2));
    }
}
```

### [3. Queue at the School](https://codeforces.com/problemset/problem/266/B)

```java
static class Solver {
    public void solve(int testCase, InputReader in) {
        int len = in.nextInt();
        int t = in.nextInt();
        StringBuilder sb = new StringBuilder(in.next());
        for (int i = 0; i < t; i++) {
            for (int j = len - 1; j > 0; j--) {
                if (sb.charAt(j) == 'G' && sb.charAt(j - 1) == 'B') {
                    sb.setCharAt(j, 'B');
                    sb.setCharAt(j - 1, 'G');
                    j--;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
```

### [4. Borze](https://codeforces.com/problemset/problem/32/B)

```java
static class Solver {
    public void solve(int testCase, InputReader in) {
        String code = in.next();
        int i = 0;
        StringBuilder result = new StringBuilder();
        while (i < code.length()) {
            if (code.charAt(i) == '.') {
                result.append('0');
            } else if (i + 1 < code.length()) {
                if (code.charAt(i + 1) == '.') {
                    result.append('1');
                } else {
                    result.append('2');
                }
                i++;
            }
            i++;
        }
        System.out.println(result.toString());
    }
}
```

### [5. Beautiful Year](https://codeforces.com/problemset/problem/271/A)

```java
static class Solver {
    public void solve(int testCase, InputReader in) {
        int year = in.nextInt();
        year++;
        while (!checkIfAllDigitsAreUnique(year)) {
            year++;
        }
        System.out.println(year);
    }

    private boolean checkIfAllDigitsAreUnique(int number) {
        Set<Integer> digits = new HashSet<>();

        while (number > 0) {
            int r = number % 10;
            if (digits.contains(r)) {
                return false;
            } else {
                number = number / 10;
                digits.add(r);
            }
        }
        return true;
    }
}
```

### [6. Lights Out](https://codeforces.com/problemset/problem/275/A)

```java
static class Solver {
    public void solve(int testCase, InputReader in) {
        List<List<Integer>> grid = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            List<Integer> row = new ArrayList<>(3);
            for (int j = 0; j < 3; j++) {
                row.add(in.nextInt());
            }
            grid.add(row);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int numberOfTimesToggled = grid.get(i).get(j);
                if (j + 1 < 3) {
                    numberOfTimesToggled += grid.get(i).get(j + 1);
                }
                if (j - 1 >= 0) {
                    numberOfTimesToggled += grid.get(i).get(j - 1);
                }
                if (i + 1 < 3) {
                    numberOfTimesToggled += grid.get(i + 1).get(j);
                }
                if (i - 1 >= 0) {
                    numberOfTimesToggled += grid.get(i - 1).get(j);
                }
                if ((numberOfTimesToggled & 1) != 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
```

### [7. Word](https://codeforces.com/problemset/problem/59/A)

```java
static class Solver {
    public void solve(int testCase, InputReader in) {
        String word = in.next();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCaseCount++;
            } else {
                lowerCaseCount++;
            }
        }
        if (upperCaseCount > lowerCaseCount) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}
```

### [8. Word Capitalization](https://codeforces.com/contest/281/problem/A)

```java
static class Solver {
    public void solve(int testCase, InputReader in) {
        StringBuilder sb = new StringBuilder(in.next());
        if (Character.isLowerCase(sb.charAt(0))) {
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        }
        System.out.println(sb.toString());
    }
}
```

### [9. Nearly Lucky Number](https://codeforces.com/problemset/problem/110/A)

```java
static class Solver {
    public void solve(int testCase, InputReader in) {
        String number = in.next();
        int luckyNumberCount = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '4' || number.charAt(i) == '7') {
                luckyNumberCount++;
            }
        }
        if (luckyNumberCount > 0 && checkLuckyNumber(luckyNumberCount)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private boolean checkLuckyNumber(int num) {
        while (num > 0) {
            int r = num % 10;
            if (r != 4 && r != 7) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}
```