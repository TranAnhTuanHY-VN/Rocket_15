function Q1(){
    let x = prompt("Nhập số bất kỳ", '');
    if(x %2 == 0){
        document.write("Số đã nhập là số chẵn");
    }else{
        document.write("Số đã nhập là số lẻ");
    }
}

function Q2(){
    let x = prompt("Nhập số bất kỳ[1-10]", '');
    if(x < 5){
        document.write("Học sinh yếu!");
    }else if(x<7){
        document.write("Học sinh TB");
    }else if(x<9){
        document.write("Học sinh Khá");
    }else{
        document.write("Học sinh giỏi");
    }
}

function Q3(){
    let x = prompt("Nhập quãng đường người đi bộ phải đi(mét): ","");
    let time = 0;
    if(x<=3000){
        time = x * 1;
        document.write("Thời gian đi hết quãng đường dó là : " + time + "s.");
    }else if(x>3000&&x<=5000){
        time = 3000 + (x-3000)*2;
        document.write("Thời gian đi hết quãng đường dó là : " + time + "s.");
    }else if(x>5000&&x<=6000){
        time = 3000 + 2000*2 + (x-5000)*3;
        document.write("Thời gian đi hết quãng đường dó là : " + time + "s.");
    }else if(x>6000){
        time = 3000 + 4000 + 3000 + (x-6000)*5;
        document.write("Thời gian đi hết quãng đường dó là : " + time + "s.");
    }
}

function Q4(){
    let x = prompt("Nhập ký tự bất kỳ(A-Z): ","");

    if (x=="A"||x=="a"){
        document.write("Điểm tín chỉ của sinh viên đó = 4");
    }else if(x=="B"||x=="b"){
        document.write("Điểm tín chỉ của sinh viên đó = 3");   
    }else if(x=="C"||x=="c"){
        document.write("Điểm tín chỉ của sinh viên đó = 2");
    }else if(x=="D"||x=="d"){
        document.write("Điểm tín chỉ của sinh viên đó = 1");
    }else{
        document.write("Sinh viên này đã thôi học");
    }
}

function Q5(){
    $("div#ques5").load("monthDayTable.html");
}

function tinhQ5(){
    let month = document.getElementById("month").value;
    let year = document.getElementById("year").value;
    let numberDay = 0;
    if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month ==10 || month ==12){
        numberDay = 31;
    }else if(month == 4 || month == 6 || month == 9 || month ==11){
        numberDay = 30;
    }else if(month == 2){
        if ((year % 4 == 0 && year % 100 !=0)||year % 400 == 0){
            numberDay = 29;
        }else{
            numberDay = 30;
        }
    }
    document.getElementById("resultQ5").innerHTML = numberDay;
}

function Q6(){
    let x = prompt("Nhập số nguyên dương bất kỳ: ","");
    let count = 0;
    for(let i = 1;i<=x;i++){
        if(i%2==0){
            count++;
        }
    }
    document.write("Có "+count+ " số nguyên dương chia hết cho 2 trong khoảng từ 1-n")
}

function Q7(){
    $("div#ques7").load("inputButton.html");
}

function tinhQ7(){
    let x = document.getElementById("number").value;
    let text = "";
    for(let i = 1;i<=x;i++){
        text+= i + "  ";
    }
    document.getElementById("resultQ7").innerHTML = text;
}