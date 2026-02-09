num = int(input("Enter number: "))
prime = True

if num <= 1:
    prime = False

for i in range(2, num//2 + 1):
    if num % i == 0:
        prime = False
        break

print("Prime" if prime else "Not Prime")
