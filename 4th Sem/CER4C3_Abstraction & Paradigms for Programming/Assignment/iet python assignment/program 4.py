user_input = input("Enter the numbers separated by commas: ")
arr = [int(num) for num in user_input.split(',')]
print(f"Entered list: {arr}")

first_element = arr[0]
last_element = arr[len(arr) - 1]
if first_element < last_element:
    print("List is sorted in ascending order")
else:
    print("List is sorted in descending order")