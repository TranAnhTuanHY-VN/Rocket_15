var caculate = function (a, b, operation) {
    return operation(a, b);
};
var multiplier = function (a, b) { return a * b; };
var sym = function (a, b) { return a + b; };
var result = caculate(2, 3, multiplier);
console.log(result);
