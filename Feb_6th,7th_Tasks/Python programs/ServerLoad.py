cpu_load = [65, 70, 55, 80, 90, 60, 75]

highest = max(cpu_load)
lowest = min(cpu_load)
average = sum(cpu_load) / len(cpu_load)

print("Highest Load:", highest)
print("Lowest Load:", lowest)
print("Average Load:", average)
