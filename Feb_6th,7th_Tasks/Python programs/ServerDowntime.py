server_status = [1, 1, 0, 0, 0, 1, 0, 0]

downtime = server_status.count(0)

longest = 0
current = 0
for status in server_status:
    if status == 0:
        current += 1
        longest = max(longest, current)
    else:
        current = 0

print("Total Downtime Hours:", downtime)
print("Longest Continuous Downtime:", longest)
