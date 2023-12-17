user_input = input("Enter the numbers separated by commas: ")
arr = [int(num) for num in user_input.split(',')]
print(f"Entered list: {arr}")

arr[0], arr[len(arr) - 1] = arr[len(arr) - 1], arr[0]
print(f"List after interchanging elements: {arr}")
