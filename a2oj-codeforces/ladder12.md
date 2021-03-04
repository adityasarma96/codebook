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
### [Stones on the Table](https://codeforces.com/problemset/problem/266/A)
```python
int(input())
colours = input()
count = 0
for i, val in enumerate(colours[:-1]):
    if val == colours[i + 1]:
        count += 1
print(count)
```

### [Bit++](https://codeforces.com/problemset/problem/282/A)
```python
n = int(input())
count = 0
for i in range(n):
    if '+' == input()[1]:
        count += 1
    else:
        count -= 1
print(count)
```

### [Levko and Table](https://codeforces.com/problemset/problem/361/A)
```python
n,k = map(int,input().split())

row = [0]*n
for i in range(n):
    row[i] = k
    print(*row)
    row[i] = 0
```
### [Young Physicist](http://codeforces.com/problemset/problem/69/A)
```python
n = int(input())
cx = cy = cz = 0
for _ in range(n):
    x, y, z = map(int, input().split())
    cx += x
    cy += y
    cz += z
if cx ==0 and cy ==0 and cz ==0:
    print("YES")
else:
    print("NO")
```
### [Chips](https://codeforces.com/problemset/problem/92/A)
```python
n, m = map(int, input().split())

index = 1
while True:
    if m >= index:
        m -= index
    else:
        print(m)
        break
    index = index % n + 1
```
### [Tram](https://codeforces.com/problemset/problem/116/A)
```python
max_capacity = capacity = 0
for _ in range(int(input())):
    exit, enter = map(int,input().split())
    capacity += enter - exit
    max_capacity = max(max_capacity,capacity)
print(max_capacity)
```
### [Queue at the School](https://codeforces.com/problemset/problem/266/B)
```python
n, t = map(int, input().split())
seq = list(input())
for _ in range(t):
    for i, ch in enumerate(seq[:-1]):
        if ch == 'B' and seq[i+1] == 'G':
            seq[i], seq[i+1] = seq[i+1], seq[i]
print(''.join(seq))
```

### [Way Too Long Words](https://codeforces.com/problemset/problem/71/A)
```python
for _ in range(int(input())):
    s = input()
    if len(s) > 10:
        print(''.join([s[0], str(len(s)-2), s[-1]]))
    else:
        print(s)
```
