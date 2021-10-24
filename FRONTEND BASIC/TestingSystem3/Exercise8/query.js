function clickMe(e){
    const num1 = parseFloat(document.getElementById("num1").value);
    const num2 = parseFloat(document.getElementById("num2").value);
    if(e.id=="+"){
        document.getElementById("result").innerHTML = num1+num2;
    }else if(e.id=="-"){
        document.getElementById("result").innerHTML = num1-num2;
    }else if(e.id=="x"){
        document.getElementById("result").innerHTML = num1*num2;
    }else if(e.id=="/"){
        document.getElementById("result").innerHTML = num1/num2;
    }else if(e.id=="%"){
        document.getElementById("result").innerHTML = num1%num2;
    }
}
function Q1(){
    $("#ques1").load("ques1.html");
}

function tinhCS(){
    const l = parseFloat(document.getElementById("long").value);
    const w = parseFloat(document.getElementById("width").value);
    let C = (l+w)*2;
    let S = l*w;
    document.getElementById("C").innerHTML = C;
    document.getElementById("S").innerHTML = S;
}

function Q2(){
    $("#ques2").load("ques2.html");
}

function GPTB2()
{
    const a = parseFloat(document.getElementById("a").value);
    const b = parseFloat(document.getElementById("b").value);
    const c = parseFloat(document.getElementById("c").value);
    const delta =  b*b - 4*a*c;
    if(delta<0){
        document.getElementById("result").innerHTML = "Phương trình vô nghiệm!";
    }else if(delta==0){
        document.getElementById("result").innerHTML = "Phương trình có nghiệm kép: x1=x2=" + (-b/(2*a)); 
    }else{
        const x1 = ((-b+Math.sqrt(delta))/(2*a));
        const x2 = ((-b-Math.sqrt(delta))/(2*a));
        document.getElementById("result").innerHTML = "Phương trình có hai nghiệm : <br>" +
                                                        "x1=" + x1 + "<br>"+
                                                        "x2=" + x2;
    }
}

function Q3(){
    $("#ques3").load("ques3.html");
}

function calculate(){
    const num1 = parseFloat(document.getElementById("num1").value);
    const num2 = parseFloat(document.getElementById("num2").value);
    let operator = $("#operator option:selected").index();
    let result = 0;
    if (operator == 0){
        result = num1 + num2;
    }else if(operator == 1){
        result = num1 - num2;
    }else if(operator == 2){
        result = num1/num2;
    }else if(operator == 3){
        result = num1*num2;
    }
    $("#result").val(result.toFixed(2));
}

function Q4(){
    $("#ques4").load("ques4.html");
}

function tinhGT(){
    const n = document.getElementById("num").value;
    let gt = 1;
    for(let i = n;i>0;i--){
        gt = gt *i;
    }
    window.alert("Giai thừa của "+n + " là: "+ gt);
}

function Q5(){
    $("#ques5").load("ques5.html");
}

function show(){
    const name = document.getElementById("Name").value;
    const phone = document.getElementById("Phone").value;
    const gender = $("input:checked").val();
    const hobby = $("input[name=hobby]:checked").map(function() {
        return this.value;
    }).get().join(",")
    alert("Họ và tên: " + name+ "\nSố điện thoại: " + phone + "\nGiới tính:" + gender +
        "\nSở thích: " + hobby);
}

function Q6(){
    $("#ques6").load("ques6.html");
}

function Q9(){
    $("#ques9").load("ques9.html");
}

