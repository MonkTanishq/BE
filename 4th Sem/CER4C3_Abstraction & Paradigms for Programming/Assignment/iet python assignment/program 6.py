first_user_input = input("Enter the first list separated by commas: ")
second_user_input = input("Enter the second list separated by commas: ")

first_list = [int(num) for num in first_user_input.split(',')]
second_list = [int(num) for num in second_user_input.split(',')]

merged_list = first_list + second_list
print(f"Merged list: {merged_list}")
