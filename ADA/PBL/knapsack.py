# To implement the 0/1 Knapsack problem using Dynamic Programming in Python and
# construct the DP table to determine the optimal solution.

def knapsack(weights, values, capacity):
    n = len(weights)
    dp = [[0 for _ in range(capacity + 1)] for _ in range(n + 1)]
    
    for i in range(1, n + 1):
        for w in range(capacity + 1):
            if weights[i - 1] <= w:
                dp[i][w] = max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1])
            else:
                dp[i][w] = dp[i - 1][w]
    
    return dp[n][capacity], dp

# Example usage:
weights = [3, 4, 5, 6] # w=8
values = [2, 3, 4, 1]
capacity = 8
max_value, dp_table = knapsack(weights, values, capacity)
print(f"Maximum value in Knapsack = {max_value}")
print("DP Table:")
for row in dp_table:
    print(row)

# Output:
# Maximum value in Knapsack = 6
# DP Table:
# [0, 0, 0, 0, 0, 0, 0, 0, 0]
# [0, 0, 0, 2, 2, 2, 2, 2, 2]
# [0, 0, 0, 2, 3, 3, 3, 5, 5]
# [0, 0, 0, 2, 3, 4, 4, 5, 6]
# [0, 0, 0, 2, 3, 4, 4, 5, 6]