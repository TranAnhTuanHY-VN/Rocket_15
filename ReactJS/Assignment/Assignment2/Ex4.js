//Question 1
var plus100 = function (a) { return a + 100; };
console.log(plus100(100));
//Question 2
var x = function (a, b) { return a + b + 100; };
console.log(x(100, 50));
var y = function (a, b) {
    var chuck = 42;
    return a + b + chuck;
};
console.log(y(100, 50));
var bob = function (a) { return a + 100; };
console.log(bob(10));
