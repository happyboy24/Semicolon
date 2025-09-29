
CURRENT_POPULATION = 8231613070  # Approximate world population for 2025
GROWTH_RATE = 0.0085             # Constant annual growth rate (0.85%)
PROJECTION_YEARS = 100


DOUBLE_POPULATION = CURRENT_POPULATION * 2
QUADRUPLE_POPULATION = CURRENT_POPULATION * 4


population = CURRENT_POPULATION
double_year = None
quadruple_year = None
previous_population = CURRENT_POPULATION


print(f"--- World Population Growth Projection (Constant Growth Rate: {GROWTH_RATE * 100:.2f}%) ---")
print(f"Starting Population: {CURRENT_POPULATION:,.0f}\n")


header = f"{'Year':<5} | {'Anticipated Population':<25} | {'Annual Increase':<20}"
separator = "-" * len(header)
print(header)
print(separator)


for year in range(1, PROJECTION_YEARS + 1):
    
    new_population = population * (1 + GROWTH_RATE)
    
    
    annual_increase = new_population - population
    
    
    population = new_population
    
    
    if population >= DOUBLE_POPULATION and double_year is None:
        double_year = year

    if population >= QUADRUPLE_POPULATION and quadruple_year is None:
        quadruple_year = year
        
    
    print(f"{year:<5} | {population:,.0f}:<25} | {annual_increase:,.0f}:<20}")


print("\n" + "="*50)
print("             POPULATION MILESTONES")
print("="*50)


if double_year is not None:
    print(f"**Double Population ({DOUBLE_POPULATION:,.0f})** is anticipated in Year: **{double_year}**")
else:
    print(f"Double Population ({DOUBLE_POPULATION:,.0f}) is NOT reached within {PROJECTION_YEARS} years.")


if quadruple_year is not None:
    print(f"**Quadruple Population ({QUADRUPLE_POPULATION:,.0f})** is anticipated in Year: **{quadruple_year}**")
else:
    print(f"Quadruple Population ({QUADRUPLE_POPULATION:,.0f}) is NOT reached within {PROJECTION_YEARS} years.")