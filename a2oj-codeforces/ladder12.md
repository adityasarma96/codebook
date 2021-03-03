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
maxi = mini = scores[0]

for i in scores:
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