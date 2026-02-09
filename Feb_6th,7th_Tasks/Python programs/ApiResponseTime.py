response_times = [1200, 2500, 1800, 3000, 900]

slow_apis = [t for t in response_times if t > 2000]
average = sum(response_times) / len(response_times)

print("Slow APIs (>2000 ms):", slow_apis)
print("Average Response Time:", average)
