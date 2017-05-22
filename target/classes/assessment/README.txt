Task 1:
Run the code (from Vending Machine) and select no.
Enter an amount of money in pence.
The console will return the output of the coins received in change.

Task 2:
Run the code (from Vending Machine) and select yes.
Enter the filepath of your coin-inventory.properties file.
This was built on a mac so the filepath may not work correctly on Windows. If it does not work, edit the FileHandler class where 'String trueFilePath = "//";' and replace it with 'String trueFilePath = "";'.	
Once read, enter an amount of money in pence
The console will return the amount of money give, the change you will receive, the number of coins and what they are.
If there is insufficient coins in the machine, it will tell you.
The coin-inventory.properties file will be updated.

Exception:
If there is no coins in the machine, the program will output it to the console and exit.