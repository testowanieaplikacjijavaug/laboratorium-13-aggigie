Calculate difference between Earth and Mars

Narrative:
In order to calculate time difference between earth and other planet
As a user
I want to use calculation algorithm
					 
Scenario:  Time difference of earth and mars
Given Instantiated TimeCalculator object
When Set amount of seconds on earth to <time>
Then After calculation I get <result> with calculation error <error>

Examples:
|time|result|error|
|1|1.68E-8|0.1E-8|
|2|3.36E-8|0.1E-8|
|60|1.01E-6|0.1E-8|
