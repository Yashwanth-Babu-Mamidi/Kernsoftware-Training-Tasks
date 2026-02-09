source = [10, 20, 30, 40]
destination = [10, 25, 30, 50]

if source == destination:
    print("Arrays are identical")
else:
    print("Mismatched indexes:")
    for i in range(len(source)):
        if source[i] != destination[i]:
            print(f"Index {i}: {source[i]} != {destination[i]}")
