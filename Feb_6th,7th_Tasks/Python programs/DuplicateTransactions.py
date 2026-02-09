transactions = [101, 202, 303, 101, 404, 202]

seen = set()
duplicates = set()

for t in transactions:
    if t in seen:
        duplicates.add(t)
    else:
        seen.add(t)

print("Duplicate Transactions:", duplicates)
