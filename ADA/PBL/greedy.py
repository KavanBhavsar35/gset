# To implement the Activity Selection problem using the Greedy strategy in Python and
# determine the maximum number of non-overlapping activities

def activity_selection(start_times, finish_times):
    activities = sorted(zip(start_times, finish_times), key=lambda x: x[1])
    selected_activities = []
    last_finish_time = 0
    
    for start, finish in activities:
        if start >= last_finish_time:
            selected_activities.append((start, finish))
            last_finish_time = finish
            
    return selected_activities

# Example usage:
start_times = [1, 3, 0, 5, 8, 5]
finish_times = [2, 4, 6, 7, 9, 9]
selected = activity_selection(start_times, finish_times)
print("Selected activities (start, finish):")
for activity in selected:
    print(activity)

# Output:
# Selected activities (start, finish):
# (1, 2)
# (3, 4)
# (5, 7)
# (8, 9)
