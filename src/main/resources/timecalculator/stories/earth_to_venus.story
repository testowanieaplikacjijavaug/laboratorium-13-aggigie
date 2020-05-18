Calculate difference between Earth and Venus

Narrative:
In order to calculate time difference between earth and other planet
As a user
I want to use calculation algorithm
					 
Scenario:  Time difference of earth and venus
Given Instantiated TimeCalculator object
When Set amount of seconds on earth to <time>
Then After calculation I get <result> with calculation error <error>

Examples:
|time|result|error|
|1|5.15E-8|0.1E-8|
|2|1.03E-7|0.1E-8|
|60|3.09E-6|0.1E-8|
