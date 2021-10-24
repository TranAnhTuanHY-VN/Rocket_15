//Question 1
// function multiply1(a:number,b?:number){
//     if(b===undefined){
//         b = 1;
//     }
//     console.log(a*b);
// }
// multiply1(18);
// multiply1(18,2);
//Question2
// function multiply2(...args){
//     let tong:number = 0;
//     args.forEach(element => {
//         tong+=element;
//     });
//     console.log(tong);
// }
// multiply2(1);
// multiply2(1,2);
// multiply2(1,2,3);
//Question3
function printInformation(name, email) {
    var text1 = "T\u00F4i l\u00E0 " + name + ". Email c\u1EE7a t\u00F4i l\u00E0 " + email + ".";
    var text2 = "T\u00F4i l\u00E0 " + name + ". T\u00F4i ch\u01B0a c\u00F3 Email.";
    if (email === undefined) {
        console.log(text2);
    }
    else {
        console.log(text1);
    }
}
printInformation('Tuấn');
printInformation('Tuấn', 'tanhtuan12345@gmail.com');
