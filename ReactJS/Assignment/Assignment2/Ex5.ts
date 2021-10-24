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
function printInformation(name:string,email?:string){
    let text1:string =`Tôi là ${name}. Email của tôi là ${email}.`;
    let text2:string =`Tôi là ${name}. Tôi chưa có Email.`;
    if(email===undefined){
        console.log(text2);
    }else{
        console.log(text1);
        
    }
}

printInformation('Tuấn');
printInformation('Tuấn','tanhtuan12345@gmail.com');
