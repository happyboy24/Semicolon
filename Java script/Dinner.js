let evenNumbers = "";
for (let even = 1; even <= 100; even++) {
    if (even % 2 == 0) {
        evenNumbers += "This are even numbers from 1 to 100: " + even + " ";
    }
}
console.log(evenNumbers);

for (let odd = 50; odd <= 100; odd++) {
    if (odd % 2 != 0) {
        console.log("This are odd numbers from 50 to 100: " + odd + " ");
    }
}

let allNumbers = "";
for (let numbers = 1; numbers <= 100; numbers++) {
    allNumbers += numbers;
}
console.log("This are numbers from 1 to 100: " + allNumbers  + " ");

let squares = "";
for (let count = 0; count <= 20; count++) {
    let square = count * count;
    squares +=  square ;
}
console.log("This are the square of numbers from 1 to 200: " + squares + " ");

for (let number = 1; number <= 50; number++) {
    if (number % 3 == 0) {
        console.log("This are the multiples of 3 between 1 and 50: " + number + " ");
    }
}

let multiples = "";
for (let number = 0; number <= 100; number++) {
    if (number % 3 == 0 && number % 5 == 0) {
        multiples += number;
    }
}
console.log(multiples + " ");

let counter = 0;
for (let count = 1; count <= 100; count++) {
    if (count % 7 == 0) {
        counter++;
    }
}
console.log(counter);

let sum = 0;
for (let number = 1; number <= 50; number++) {
    sum += number;
}
console.log(sum);

let product = 0;
for (let number = 1; number <= 10; number++) {
    product *= number;
}
console.log(product);

let alphabet = "";
for (let character = 'A'.charCodeAt(0); character <= 'Z'.charCodeAt(0); character++) {
    alphabet += String.fromCharCode(character) + " ";
}
console.log(alphabet);

let number = 0;
let multiplication = 0;
for (let count = 0; count <= 12; count++) {
    multiplication = count * 4;
    console.log(multiplication);
}

let character = 'e';
let characters = 0;
let words = "shallee";

for (let count = 0; count < words.length; count++) {
    let letters = words.charAt(count);
    if (letters == character) {
        characters++;
    }
}
console.log(characters);