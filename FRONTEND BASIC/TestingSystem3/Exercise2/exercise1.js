"use strict";
var departments = [];
var positions = [];
var accounts = [];
var groups = [];
var groupAccount = [];


function Department(departmentID,departmentName){
    this.departmentID = departmentID;
    this.departmentName = departmentName;
}

// Department.getID = function(){
//     return this.departmentID;
// }


function initDepartment(){
    if (null == departments || departments.length == 0) {
        // init data
        departments.push (new Department(1,"CEO"));
        departments.push (new Department(2,"Accounting"));
        departments.push (new Department(3,"Human Resource"));
    }
}

function Position(positionID,positionName){
    this.positionID = positionID;
    this.positionName = positionName;
}

// Position.getID = function(){
//     return this.positionID;
// }

function initPosition(){
    if (null == positions || positions.length == 0){
        positions.push (new Position(1,"DEV"));
        positions.push (new Position(2,"TEST"));
        positions.push (new Position(3,"PM"));
    }
}

function Account(accountID,email,username,fullName,departmentID,positionID,createDate){
    this.accountID = accountID;
    this.email = email;
    this.username = username;
    this.fullName = fullName;
    this.departmentID = departmentID;
    this.positionID = positionID;
    this.createDate = createDate;
}



function initAccount(){
    if (null == accounts || accounts.length == 0){
        accounts.push (new Account(1,"1@gmail.com","one","account1",departments[0].departmentID,[positions[1].positionID],new Date("2020-10-20")));
        accounts.push (new Account(2,"2@gmail.com","two","account2",departments[2].departmentID,[positions[0].positionID],new Date("2020-10-10")));
        accounts.push (new Account(3,"3@gmail.com","three","account3",departments[1].departmentID,[positions[2].positionID],new Date("2020-11-20")));
    }
}

function Group(groupID,groupName, creatorID,createDate){
    this.groupID = groupID;
    this.groupName = groupName;
    this.creatorID = creatorID;
    this.createDate = createDate;
}

function initGroup(){
    if (null == groups|| groups.length == 0 ){
        groups.push (new Group(1,"Group1",accounts[1].accountID,new Date("2021-06-02")));
        groups.push (new Group(2,"Group2",accounts[0].accountID,new Date("2021-06-30")));
        groups.push (new Group(3,"Group3",accounts[2].accountID,new Date("2021-06-20")));
    }
}


function GroupAccount(groupID,accountID,joinDate){
    this.groupID = groupID;
    this.accountID = accountID;
    this.joinDate = joinDate;
}

function initGroupAccount(){
    if (null == groupAccount|| groupAccount.length == 0 ){
        groupAccount.push (new GroupAccount("1",[accounts[1].accountID,accounts[2].accountID],new Date("2021-07-02")));
        groupAccount.push (new GroupAccount("2",accounts[0].accountID,new Date("2021-07-30")));
        groupAccount.push (new GroupAccount("3",accounts[2].accountID,new Date("2021-07-20")));
    }
}



// init all object
$(function(){
    initDepartment();
    initPosition();
    initAccount();
    initGroup();
    initGroupAccount();
});

function Q1(){
    if((accounts[1].departmentID) == null){
        document.getElementById("ques1").innerHTML = "Nh??n vi??n n??y ch??a c?? ph??ng ban";
    }else{
        document.getElementById("ques1").innerHTML = "Ph??ng ban c???a nh??n vi??n n??y l??: " + accounts[2].departmentID;
    }
}

function Q2(){
    var numberPosition = accounts[1].positionID.length;
    if(numberPosition == 0){
        document.getElementById("ques2").innerHTML = "Nh??n vi??n n??y ch??a c?? v??? tr??";
    }else if(numberPosition == 1 || numberPosition ==2){
        document.getElementById("ques2").innerHTML = "Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher";
    }else if(numberPosition == 3){
        document.getElementById("ques2").innerHTML = "Nh??n vi??n n??y l?? ng?????i quan tr???ng, tham gia nhi???u v??? tr??";
    }else if(numberPosition >=4){
        document.getElementById("ques2").innerHTML = "Nh??n vi??n n??y l?? ng?????i h??ng chuy???n, tham gia t???t c??? c??c group";
    }
}

function Q3(){
    accounts[1].departmentID == null ? document.getElementById("ques3").innerHTML = "Nh??n vi??n n??y ch??a c?? ph??ng ban":
        document.getElementById("ques3").innerHTML = "Ph??ng ban c???a nh??n vi??n n??y l??: " + accounts[2].departmentID;
}

function Q4(){
    accounts[0].positionID == 1? document.getElementById("ques4").innerHTML = "????y l?? Developer":
                                 document.getElementById("ques4").innerHTML = "Ng?????i n??y kh??ng ph???i l?? Developer";
}

function Q5(){
    var numAccGr1 = groupAccount[0].accountID.length;
    switch(numAccGr1){
        case 1:
            document.getElementById("ques5").innerHTML = "Nh??m c?? m???t th??nh vi??n";
            break;
        case 2:
            document.getElementById("ques5").innerHTML = "Nh??m c?? hai th??nh vi??n";
            break;
        case 3:
            document.getElementById("ques5").innerHTML = "Nh??m c?? ba th??nh vi??n";
            break;
        default:
            document.getElementById("ques5").innerHTML = "Nh??m c?? nhi???u th??nh vi??n";
            break;
    }
}

function Q6(){
    var numberPosition = accounts[1].positionID.length;
    switch(numberPosition){
        case 0:
            document.getElementById("ques6").innerHTML = "Nh??n vi??n n??y ch??a c?? v??? tr??";
            break;
        case 1:
            document.getElementById("ques6").innerHTML = "Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher";
            break;
        case 2:
            document.getElementById("ques6").innerHTML = "Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher";
            break;
        case 3:
            document.getElementById("ques6").innerHTML = "Nh??n vi??n n??y l?? ng?????i quan tr???ng, tham gia nhi???u v??? tr??";
            break;
        default:
            document.getElementById("ques2").innerHTML = "Nh??n vi??n n??y l?? ng?????i h??ng chuy???n, tham gia t???t c??? c??c group";
            break;
    }
}

function Q7(){
    switch(accounts[0].positionID){
        case "DEV":
            document.getElementById("ques7").innerHTML = "????y l?? Developer";
            break;
        default:
            document.getElementById("ques7").innerHTML = "Ng?????i n??y kh??ng ph???i l?? Developer";
            break;
    }
}

function Q8(){
    var text = "<br>";
    var count = 1;
    accounts.forEach(function(item){
        var departmentIndex = item.departmentID - 1;
        text+= "Th??ng tin account th??? " + item[count] + "l??: <br>" +
                "Email: "+ item.email + " || " +
                "FullName: "+ item.fullName + " || " +
                "Ph??ng ban: " + departments[departmentIndex].departmentName +" <br>";
        count++;
    });
    document.getElementById("ques8").innerHTML = text;
}

function Q9(){
    let departmentsInfo = "";
    departments.forEach(function(item){
        departmentsInfo += item.departmentID + " : " + item.departmentName + "<br>" ;
    });
    document.getElementById("ques9").innerHTML = departmentsInfo;
}

function Q10(){
    var text = "<br>";
    for(let i = 0; i < accounts.length;i++){
        var departmentIndex = accounts[i].departmentID - 1;
        text+= "Th??ng tin account th??? " + (i+1) + "l??: <br>" +
                "Email: "+ accounts[i].email + " || " +
                "FullName: "+ accounts[i].fullName + " || " +
                "Ph??ng ban: " + departments[departmentIndex].departmentName +" <br>";
    };
    document.getElementById("ques10").innerHTML = text;
}

function Q11(){
    let departmentsInfo = "<br>";
    for(let i = 0; i < departments.length;i++){
        departmentsInfo += "Th??ng tin department th??? " + (i+1) + " l??: <br> " + 
                            "ID: " + departments[i].departmentID + "<br>" +
                            "Name: " + departments[i].departmentName + "<br><br>" ;
    };
    document.getElementById("ques11").innerHTML = departmentsInfo;
}

function Q12(){
    let departmentsInfo = "<br>Th??ng tin 2 department ?????u ti??n: <br><br>";
    for(let i = 0; i < departments.length;i++){
        if(i==2){break;}
        departmentsInfo += "Th??ng tin department th??? " + (i+1) + " l??: <br> " + 
                            "ID: " + departments[i].departmentID + "<br>" +
                            "Name: " + departments[i].departmentName + "<br><br>" ;
    };
    document.getElementById("ques12").innerHTML = departmentsInfo;
}

function Q13(){
    var text = "<br>";
    for(let i = 0; i < accounts.length;i++){
        if(i==1){continue;};
        var departmentIndex = accounts[i].departmentID - 1;
        text+= "Th??ng tin account th??? " + (i+1) + "l??: <br>" +
                "Email: "+ accounts[i].email + " || " +
                "FullName: "+ accounts[i].fullName + " || " +
                "Ph??ng ban: " + departments[departmentIndex].departmentName +" <br>";
    };
    document.getElementById("ques13").innerHTML = text;
}

function Q14(){
    var text = "<br>";
    for(let i = 0; i < accounts.length;i++){
        if(accounts[i].accountID < 4){
            var departmentIndex = accounts[i].departmentID - 1;
            text+= "Th??ng tin account th??? " + (i+1) + "l??: <br>" +
                    "Email: "+ accounts[i].email + " || " +
                    "FullName: "+ accounts[i].fullName + " || " +
                    "Ph??ng ban: " + departments[departmentIndex].departmentName +" <br>";
        };
    };
    document.getElementById("ques14").innerHTML = text;
}

function Q15(){
    var text = "";
    for(let i = 0;i<=20;i++){
        if(i%2==0){
            text+= "   " + i;
        }
    }
    document.getElementById("ques15").innerHTML = text;
}

function Q16_1(){
    let text = "";
    let i = 0;
    while(i < accounts.length){
        let departmentIndex = accounts[i].departmentID - 1;
        text+= "Th??ng tin account th??? " + (i+1) + "l??: <br>" +
                "Email: "+ accounts[i].email + " || " +
                "FullName: "+ accounts[i].fullName + " || " +
                "Ph??ng ban: " + departments[departmentIndex].departmentName +" <br>";
        i++;
    }
    document.getElementById("ques16_1").innerHTML = text;
}

function Q16_2(){
    let departmentsInfo = "<br>";
    let i = 0;
    while(i < departments.length){
        departmentsInfo += "Th??ng tin department th??? " + (i+1) + " l??: <br> " + 
                            "ID: " + departments[i].departmentID + "<br>" +
                            "Name: " + departments[i].departmentName + "<br><br>" ;
        i++;
    }
    document.getElementById("ques16_2").innerHTML = departmentsInfo;
}

function Q16_3(){
    let departmentsInfo = "<br>Th??ng tin 2 department ?????u ti??n: <br><br>";
    let i = 0;
    while(i < departments.length){
        if(i==2){break;}
        departmentsInfo += "Th??ng tin department th??? " + (i+1) + " l??: <br> " + 
                            "ID: " + departments[i].departmentID + "<br>" +
                            "Name: " + departments[i].departmentName + "<br><br>" ;
        i++;
    }
    document.getElementById("ques16_3").innerHTML = departmentsInfo;
}

function Q17_1(){
    let text = "<br>";
    let i = 0;
    do{
        if(i!=1){
            var departmentIndex = accounts[i].departmentID - 1;
            text+= "Th??ng tin account th??? " + (i+1) + " l??: <br>" +
                    "Email: "+ accounts[i].email + " || " +
                    "FullName: "+ accounts[i].fullName + " || " +
                    "Ph??ng ban: " + departments[departmentIndex].departmentName +" <br>";
        }
        i++;
    }while(i < accounts.length);
    document.getElementById("ques17_1").innerHTML = text;
}

function Q17_2(){
    var text = "<br>";
    let i = 0;
    do{
        if(accounts[i].accountID < 4){
            var departmentIndex = accounts[i].departmentID - 1;
            text+= "Th??ng tin account th??? " + (i+1) + " l??: <br>" +
                    "Email: "+ accounts[i].email + " || " +
                    "FullName: "+ accounts[i].fullName + " || " +
                    "Ph??ng ban: " + departments[departmentIndex].departmentName +" <br>";
        };
        i++;
    }while(i < accounts.length);

    document.getElementById("ques17_2").innerHTML = text;
}

function Q17_3(){
    let text = "";
    let i =0;
    do{
        if(i%2==0){
            text+= "   " + i;
        }
        i++;
    }while(i<=20)
    document.getElementById("ques17_3").innerHTML = text;
}