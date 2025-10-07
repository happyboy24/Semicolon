def future_investment_values(investment_amount, monthly_interest_rate, years):
	numbers_of_months = years*12
	future_investment_values = investment_amount*(1 + monthly_interest_rate)**numbers_of_months


	return round(future_investment_values, 2)


print(future_investment_values(1000, 0.01,5))