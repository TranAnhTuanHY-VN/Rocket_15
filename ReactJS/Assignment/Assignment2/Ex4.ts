//Question 1
var plus100 = a => a+100;
console.log(plus100(100));

//Question 2
var x = (a,b) => a+b+100;
console.log(x(100,50));

var y = (a,b) => {
    let chuck = 42;
    return a+b+chuck;
}
console.log(y(100,50));


var bob = a => a+100;
console.log(bob(10));

