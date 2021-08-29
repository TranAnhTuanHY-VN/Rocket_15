"use strict";
function Q1(){
    window.alert("Hello, world!");
}

function Q2(){
    document.write("Hello, world!");
}

function Q3(){
    console.log("Hello, world!");
}

function Q4(){
    confirm("Bạn có đồng ý yêu không?");
}

function Q5(){
    let name = document.getElementById("name").value;
    window.alert("Hello "+name);
}

function Q6(){
    let name = prompt("Input your name: ");
    let age = prompt("Input your age:")
    window.alert("Name: "+ name +"\nAge: "+ age);
}

function Q7(){
    var today = new Date();
    var time = today.getHours() + " giờ " + today.getMinutes() + " phút";
    window.alert(time);
}

function Object(){
    this.name = "VTI Academy";
    this.gender = "Male";
    this.email = "vitacademy@vti.com.vn";
}

function Q8(){
    let object = new Object;
    document.write("<p>Name:" + object.name+"<\p>");
    document.write("<p>Gender:" + object.gender+"<\p>");
    document.write("<p>Email:" + object.email+"<\p>");
}

function Q9(){
    var result = (5>10);
    document.write("Result: "+result);
}

function Q10(){
    let num1 = prompt("Nhập số thứ 1: ");
    let num2 = prompt("Nhập số thứ 2: ");
    let a = parseFloat(num1);
    let b = parseFloat(num2);
    document.write("<p>a*b = " + (a*b) +"<\p>");
    document.write("<p>a/b = " + (a/b) +"<\p>");
    document.write("<p>a%b = " + (a%b) +"<\p>");
    document.write("<p>a+b = " + parseFloat(a+b) +"<\p>");
    document.write("<p>a-b = " + (a-b) +"<\p>");

}