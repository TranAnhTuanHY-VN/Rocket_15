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
        accounts.push (new Account(1,"1@gmail.com","one","account1",departments[0].departmentID,positions[1].positionID,new Date("2020-10-20")));
        accounts.push (new Account(2,"2@gmail.com","two","account2",departments[2].departmentID,positions[0].positionID,new Date("2020-10-10")));
        accounts.push (new Account(3,"3@gmail.com","three","account3",departments[1].departmentID,positions[2].positionID,new Date("2020-11-20")));
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

function  departmentsInfo(){
    let departmentsInfo = "Department's Info: <br>";
    departments.forEach(function(item){
        departmentsInfo += item.departmentID + " : " + item.departmentName + "<br>" ;
    });
    document.getElementById("departmentInfo").innerHTML = departmentsInfo;
    //C2:
    // departments.forEach(function(item){
    //     $('p').append(
    //         item.departmentID +" : " + item.departmentName + '<br>')
    // });
}

function positionInfo(){
    let positionInfo = "Position's Info: <br>";
    positions.forEach(function(item){
        positionInfo += item.positionID + " : " + item.positionName + "<br>";
    });
    document.getElementById("positionInfo").innerHTML = positionInfo;
}

function accountInfo(){
    $("div#accountInfo").load("accountInfoTable.html");
    buildTableAccountInfo();
}

function buildTableAccountInfo(){
    setTimeout(function name(params) {
        $("tbody#accountTable").empty();
        accounts.forEach(function(item) {
            $("tbody#accountTable").append(
                '<tr>' +
                    '<td>' + item.accountID + '</td>' +
                    '<td>' + item.email + '</td>' +
                    '<td>' + item.username + '</td>' +
                    '<td>' + item.fullName + '</td>' +
                    '<td>' + item.departmentID + '</td>' +
                    '<td>' + item.positionID + '</td>' +
                    '<td>' + item.createDate + '</td>' +
                '</tr>')
        });
    },500);
}

function groupInfo(){
    $("div#groupInfo").load("groupTable.html");
    setTimeout(function name(params) {
        $("tbody#groupTable").empty();
        groups.forEach(function(item) {
            $("tbody#groupTable").append(
                '<tr>' +
                    '<td>' + item.groupID + '</td>' +
                    '<td>' + item.groupName + '</td>' +
                    '<td>' + item.creatorID + '</td>' +
                    '<td>' + item.createDate + '</td>' +
                '</tr>')
        });
    },500);
}

function groupAccountInfo(){
    $("div#groupAccountInfo").load("groupAccountTable.html");
    setTimeout(function name(params) {
        $("tbody#groupAccountTable").empty();
        groupAccount.forEach(function(item) {
            $("tbody#groupAccountTable").append(
                '<tr>' +
                    '<td>' + item.groupID + '</td>' +
                    '<td>' + item.accountID + '</td>' +
                    '<td>' + item.joinDate + '</td>' +
                '</tr>')
        });
    },500);
}






