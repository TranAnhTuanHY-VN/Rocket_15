function Q1(){
    let i = 0 ;
    let text = "";
    while(i<10){
        if(i%2==0){
            text+= i + "   ";
        }
        i++;
    }
    document.getElementById("ques1").innerHTML = text;
}
function Q2(){
    let i = 0 ;
    let text = "";
    while(i<10){
        text+= ++i + "   ";
    }
    document.getElementById("ques2").innerHTML = text;
}