#filename = CountFlips
<<<<<<< HEAD
#filename = PrintVowelsAndNonVowels
=======
filename = PrintVowelsAndNonVowels
>>>>>>> program-two
#filename = TheTwelveDaysOfChristmas
filename = OneHundredBottlesOfBeer

all: compile run

compile:
	javac $(filename).java
run:
	java $(filename)
clean:
	rm $(filename).class
