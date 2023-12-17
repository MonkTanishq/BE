user_input = input("Enter the numbers separated by commas: ")
arr = [int(num) for num in user_input.split(',')]
print(f"Entered list: {arr}")

for num in arr:
    if num % 2 == 0:
        print(f"{num} is even number")
