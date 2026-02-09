error_codes = [404, 500, 404, 403, 500, 404]

frequency = {}
for code in error_codes:
    frequency[code] = frequency.get(code, 0) + 1

print("Error Code Count:", frequency)

most_frequent = max(frequency, key=frequency.get)
print("Most Frequent Error Code:", most_frequent)
