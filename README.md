# virtual-zoo

Virtual Zoo

We are going to create a virtual zoo

The Zoo will list of all of the Animals in the zoo

You will need an Animal super class
The Animal class will have an abstract method of Speak
All animals will have names

Sub classes of Animal will be Lion, Chipmunk and Snake
We will need different implementations of speak() in each of the sub classes
Speak() will output the animal sound to the console

We want a method in Zoo that will cause all of the animals in the Zoo to speak

Bonus
Give each animal a name
Add a hashmap to the Zoo class that allows us to retrieve an Animal by name
Make that animal speak

Extra Bonus
User Input
Users will be prompted to see if they want to add an animal to the zoo or make an animal speak.
If the user wants to add an animal they will be prompted to specify
	-animal type
	-animal name
The app will then create the appropriate animal, add it to the zoo and add it to the zoo hashmap

If the user wants to make an animal speak, they will be prompted for the name of the animal.
The app will then make that animal speak.
If the user enters "All" instead of the name of an animal, the app will make all of the animals 
speak
