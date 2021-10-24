const caculate = (a,b,operation)=>{
    return operation(a,b);
}

const multiplier = (a,b) => a*b;
const sym = (a,b) => a+b;

let result = caculate(2,3,multiplier);
console.log(result);