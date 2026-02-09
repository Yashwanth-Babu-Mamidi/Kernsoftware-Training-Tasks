login_attempts = [1, 4, 2, 5, 3]

for i, attempts in enumerate(login_attempts):
    if attempts > 3:
        print(f"Alert: User {i} has {attempts} failed attempts")
