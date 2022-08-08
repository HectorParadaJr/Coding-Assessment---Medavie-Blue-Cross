# Coding-Assessment---Medavie-Blue-Cross

Simple ceiling fan application with these characteristics:

•    The unit has 2 pull cords:   One increases the speed each time it is pulled.  There are 3 speed settings, and an “off” (speed 0) setting.   If the cord is pulled        on speed 3, the fan returns to the “off” setting. 

•    One reverses the direction of the fan at the current speed setting. Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.

•    You can assume the unit is always powered (no wall switch)

# UNIT TEST PLAN AND RESULTS

|Project Name|Module Name|Designed By|Executed By| Design Date|Execution Date|
|---|---|---|---|---|---|
|Fan Assessment - Medavie-Blue-Cross|Main Menu|Hector Parada|Hector Parada|August 3, 2022|August 8, 2022|

|Test Case # |	Title	|Test Data (and steps) |	Expected Result |	Actual Result	Success | (Y/N) |
|---|---|---|---|---|---|
|1|	User Selects correct option (Ceiling Fan Application) |	  1.	User enters 1 and hits enter|Ceiling Fan application open |	Menu for ceiling application has been displayed |	Y |
|2| User enters incorrect option  |	1.	User enters a random number (not an option) and hits enter.  2.	Hit enter to get back to the main menu|	Error message will display and loop back to the main menu |	Error message appeared and looped back to menu |	Y |
|3| User Enters Letters instead of numbers for option  |	1.	User enters any letter   2.	Hit enter to acknowledge the error message.|	Error message appears and loops back to main menu |	Invalid error message appears and loops back to main menu |	Y |
|4|	User exits the application |	  1.	User enters 2 to exit application|Application has ended|	Application exits |	Y |
--------------------------------------------------------------------------------------

|Project Name|Module Name|Designed By|Executed By| Design Date|Execution Date|
|---|---|---|---|---|---|
|Fan Assessment - Medavie-Blue-Cross|Ceiling Fan Application – Speed Cord|Hector Parada|Hector Parada|August 3, 2022|August 8, 2022|

|Test Case # |	Title	|Test Data (and steps) |	Expected Result |	Actual Result	Success | (Y/N) |
|---|---|---|---|---|---|
|1|	User Selects option 1 (Pull Speed Cord) |	1.	User Enter 1 to pull speed cord	|Fan speed increase by 1 |	Fan speed has increased |	Y |
|2| User selects option 1 (fan speed returns to 0 speed) |	1.	User enter 1 to pull speed cord (if fan speed is currently at 3) |	Fan speed decreased back to 0  |	Fan speed returned to 0 |	Y |

---------------------------------------------------------------------------------------

|Project Name|Module Name|Designed By|Executed By| Design Date|Execution Date|
|---|---|---|---|---|---|
|Fan Assessment - Medavie-Blue-Cross|Ceiling Fan Application – Reverse Cord|Hector Parada|Hector Parada|August 3, 2022|August 8, 2022|

|Test Case # |	Title	|Test Data (and steps) |	Expected Result |	Actual Result	Success | (Y/N) |
|---|---|---|---|---|---|
|1|	User Selects option 2 (Reverse Cord - clockwise)|	1.	User Enter 2 to pull Reverse cord (if fan spinning clockwise)	|Fan rotation will reverse to spin counter- clockwise|	Fan reversed to counter-clockwise |	Y |
|2| User selects option 2 (reverse cord – counter-clockwise) |	1.	User Enter 2 to pull Reverse cord (if fan spinning counter- clockwise) |	Fan rotation will reverse to spin clockwise |	Fan reversed to clockwise |	Y |

-----------------------------------------------------------------------------------------------

|Project Name|Module Name|Designed By|Executed By| Design Date|Execution Date|
|---|---|---|---|---|---|
|Fan Assessment - Medavie-Blue-Cross|Main Menu|Hector Parada|Hector Parada|August 3, 2022|August 8, 2022|

|Test Case # |	Title	|Test Data (and steps) |	Expected Result |	Actual Result	Success | (Y/N) |
|---|---|---|---|---|---|
|1|	User Selects correct option (1 or 2) |	  1.	User enters 1 or 2 and hits enter|Message will display and application will run |	Fan displayed and application running as expected |	Y |
|2| User enters incorrect option  |	1.	User enters a random number (not an option) and hits enter 2.	Hit enter to get back to the main menu |	Error message will display and loop back to the main menu |	Error message appeared and looped back to menu |	Y |
|3| User Enters Letters instead of numbers for option  |	1.	User enters any letter   2.	Hit enter to acknowledge the error message.|	Error message appears and loops back to main menu |	Invalid error message appears and loops back to main menu |	Y |
|4|	User exits application |	  1.	User enters 3 to exit application|Application will end and return back to main menu|	Returned back to menu|	Y |


[Unit Test Plan and Results.docx](https://github.com/HectorParadaJr/Coding-Assessment---Medavie-Blue-Cross/files/9285149/Unit.Test.Plan.and.Results.docx)

