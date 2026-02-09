marks = [85, 110, 75, -5, 40, 60]

invalid = 0
pass_count = 0
fail_count = 0

for m in marks:
    if m < 0 or m > 100:
        invalid += 1
    elif m >= 50:
        pass_count += 1
    else:
        fail_count += 1

print("Invalid Marks:", invalid)
print("Passed:", pass_count)
print("Failed:", fail_count)
