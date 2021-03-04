## A2OJ Ladder-12 Solutions

### [Arrival of the General](https://codeforces.com/problemset/problem/144/A)
```python
n = int(input())
heights = list(map(int, input().split()))
max_index = heights.index(max(heights))
min_index = len(heights) - 1 - heights[::-1].index(min(heights))
time = max_index + len(heights) - 1 - min_index

if min_index < max_index:
    time -= 1
print(time)
```

### [Beautiful Matrix](https://codeforces.com/problemset/problem/263/A)
```python
x, y = -1, -1
for i in range(1, 6):
    try:
        y = input().split().index("1") + 1
        x = i
    except ValueError:
        pass
print(abs(3-x) + abs(3-y))
```

### [Ultra-Fast Mathematician](https://codeforces.com/problemset/problem/61/A)
```python
x = input()
y = input()
print(''.join([str(int(a) ^ int(b)) for a, b in zip(x, y)]))
```

### [Blackjack](https://codeforces.com/problemset/problem/104/A)
```python
n = int(input())

if n == 20:
    print(15)
elif 1 <= n - 10 <= 9 or n - 10 == 11:
    print(4)
else:
    print(0)
```

### [HQ9+](https://codeforces.com/problemset/problem/133/A)
```python
p = input()
print("YES") if 'H' in p or 'Q' in p or '9' in p else print("NO")
```

### [I_love_%username%](https://codeforces.com/problemset/problem/155/A)
```python
n = int(input())
scores = list(map(int, input().split()))
count = 0
mini, *rest = scores
maxi = mini

for i in rest:
    if i > maxi:
        maxi = i
        count += 1
    if i < mini:
        mini = i
        count += 1
print(count)
```

### [Petya and Strings](https://codeforces.com/problemset/problem/112/A)
```python
a = input().lower()
b = input().lower()

if a<b:
    print("-1")
elif a > b:
    print("1")
else:
    print("0")
```

### [Cookies](https://codeforces.com/problemset/problem/129/A)
```python
n = int(input())
bags = list(map(int, input().split()))
total_sum = sum(bags)
count = 0
for i in bags:
    if ((total_sum - i)&1) == 0:
        count += 1
print(count)
```

### [Candy Bags](https://codeforces.com/problemset/problem/334/A)
```python
n = int(input())
starting = 1
ending = n * n
for _ in range(n):
    print(*[starting + i if i < n // 2 else ending + i - n + 1for i in range(n)])
    starting += n // 2
    ending -= n // 2
```

### [Drinks](https://codeforces.com/problemset/problem/200/B)
```python
n = int(input())
oj_percent = list(map(int,input().split()))
print(sum(oj_percent)/n)
```

### [Vasily the Bear and Triangle](https://codeforces.com/problemset/problem/336/A)
```python
x, y = map(int, input().split())
m = 1 if x*y < 0 else -1
c = y - m * x
print(-1 * c // m, 0, 0, c) if -1 * c // m < 0 else print(0, c, -1 * c // m, 0)
```

### [Lunch Rush](https://codeforces.com/problemset/problem/276/A)
```python
def joy(f, t, k): return f - t + k if t > k else f


n, x = map(int, input().split())
max_joy = joy(*(map(int, input().split())), x)
for i in range(1, n):
    max_joy = max(joy(*(map(int, input().split())), x), max_joy)
print(max_joy)
```

### [Cakeminator](https://codeforces.com/problemset/problem/330/A)
```python
r,c = map(int, input().split())
count = 0
grid = []
for _ in range(r):
    row = input()
    if 'S' not in row:
        count += c
    else:
        grid.append(list(row))

for t in zip(* grid):
    if 'S' not in t:
        count += len(t)
print(count)
```