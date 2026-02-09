num = int(input())
temp = num
sum = 0

while temp != 0:
    digit = temp % 10
    sum += digit ** 3
    temp //= 10

print("Armstrong" if sum == num else "Not Armstrong")
