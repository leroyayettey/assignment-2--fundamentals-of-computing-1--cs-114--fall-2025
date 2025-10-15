#filename = CountFlips
<<<<<<< HEAD
<<<<<<< HEAD
#filename = PrintVowelsAndNonVowels
=======
filename = PrintVowelsAndNonVowels
>>>>>>> program-two
#filename = TheTwelveDaysOfChristmas
filename = OneHundredBottlesOfBeer
=======
#filename = PrintVowelsAndNonVowels
filename = TheTwelveDaysOfChristmas
#filename = OneHundredBottlesOfBeer
>>>>>>> program-three

all: compile run

compile:
	javac $(filename).java
run:
	java $(filename)
clean:
	rm $(filename).class
