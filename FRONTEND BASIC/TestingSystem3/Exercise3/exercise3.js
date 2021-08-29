"use strict";
function countWords(a) {
    if (a == null) {
        return -1;
    }
    let dem = 0;
    let size = a.length;
    let checkLoopSpace = true;
    let space = ' ';
    for (let i = 0; i < size; i++) {
        if (a.charAt(i) != space) {
            if (checkLoopSpace) {
                dem++;
                checkLoopSpace = false;
            }
        } else {
            checkLoopSpace = true;
        }
    }
    return dem;
}

function Q1(){
    let x = prompt("Mời nhập chuỗi: ","");
    let i = countWords(x);
    window.alert("Chuỗi vừa nhập có " + i + " từ.");
}

function Q2(){
    let x = prompt("Nhập xâu 1: ");
    let y = prompt("Nhập xâu 2: ");
    let z = x + y;
    window.alert("Ghép hai xâu vừa nhập ta được" + z);
}

function Q3(){
    let name = prompt("Nhập vào tên: ");
    let firstCharacter = name.charAt(0).toUpperCase();
    let leftCharacter = name.substring(1,name.length);
    window.alert("Tên của bạn là: " + firstCharacter+leftCharacter); 
}

function Q4(){
    let name = prompt("Nhập vào tên: ");
    let text =""
    for(let i=0;i<=name.length-1;i++){
        text+= "Ký tự thứ 1 là: " + name.charAt(i) + "\n";
    }
    window.alert(text);
}

function Q5(){
    let fullName = prompt("Nhập vào họ và tên của bạn: ");
    let lastName = "";
    let firstName = "";
    let middleName ;
    let indexLastName = 0;
    let indexFirstName = 0;
    fullName = fullName.trim();
    for (let i = 0; i < fullName.length; i++){
        if (fullName.charAt(i) != ' '){
            firstName = firstName + fullName.charAt(i);
            indexFirstName = i+1;
        }else {
            break;
        }
    }
    for (let j = (fullName.length-1); j >= 0; j--){
        if (fullName.charAt(j) != ' ') {
            lastName = fullName.charAt(j) + lastName;
            indexLastName = j-1;
        } else {
            break;
        }
    }
    middleName = fullName.substring(indexFirstName,indexLastName);
    middleName = middleName.trim();
    window.alert(
        "Họ là: " + firstName +
        "\nHọ đệm là: " + middleName + 
        "\nTên là: " + lastName 
    );
}

function Q6(){
    let fullName = prompt("Nhập họ tên đầy đủ:");
// remove space characters
    fullName = fullName.trim();
    fullName = fullName.replaceAll("\\s+", " ");
    let words = fullName.split(" ");
    fullName = "";
    words.forEach(function(word){
        let firstCharacter = word.substring(0, 1).toUpperCase();
        let leftCharacter = word.substring(1);
        word = firstCharacter + leftCharacter;
        fullName += word + " ";
    });

    window.alert("Tên sau khi chuẩn hóa: " + fullName);
}

function Q7(){
    let string1 = prompt("Nhập chuỗi 1:");
    let string2 = prompt("Nhập chuỗi 2:");
    let stringCompare ="";
    for(let i = string1.length;i>=0;i--){
        stringCompare+=string1.charAt(i);
    }
    if(stringCompare == string2){
        window.alert("Hai chuỗi này là hai chuỗi đảo ngược nhau!");
    }else{
        window.alert("Hai chuỗi này không đảo ngược nhau!")
    }
}

function Q8(){
    let string = prompt("Nhập chuỗi:");
    let number =0;
    for(let i = 0; i<string.length;i++){
        if(string.charAt(i)=="a"||string.charAt(i)=="A")
        {
            number = number +1;
        }
    }
    window.alert("Chuỗi vừa nhập có "+ number + " ký tự a/A");
}

function Q9(){
    let string = prompt("Nhập chuỗi:");
    let stringReverse ="";
    for(let i = string.length;i>=0;i--){
        stringReverse+=string.charAt(i);
    }
    window.alert("Chuỗi đã đảo ngược là: "+ stringReverse);
}

function Q10(){
    let string = prompt("Nhập chuỗi: ");
    let text ="TRUE";
    for(let i= 0;i< string.length;i++){
        if(string.charCodeAt(i)>=48&&string.charCodeAt(i)<=57){
            text = "FALSE"
            break;
        }
    }
    window.alert(text);
}