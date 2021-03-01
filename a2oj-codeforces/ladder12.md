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