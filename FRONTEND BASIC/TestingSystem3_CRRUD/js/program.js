

$(function(){
    $(".header").load("header.html"); 
    $(".main").load("home.html");
    $(".footer").load("footer.html");
});
function clickNavHome(){
    $(".main").load("home.html");
}
function clickNavViewListEmployee(){
    $(".main").load("listEmployee.html");
    buildTable();
}

var employees =[];

function Employee(id,name,department,phone){
    this.id = id;
    this.name = name;
    this.department = department;
    this.phone = phone;
}

function getListEmployees() {
    // call API from server
    // $.get("https://6123c957124d880017568497.mockapi.io/api/vti/App/user/", function(data, status)
    $.get("http://localhost:8080/api/v1/employees/", function(data, status) {

        // reset list employees
        employees = [];

        // error
        if (status == "error") {
            // TODO
            alert("Error when loading data");
            return;
        }

        // success
        parseData(data);
        fillEmployeeToTable();
    });
}

function parseData(data){
    // employees = data;
    data.forEach(function(item) {
        employees.push(new Employee(item.id, item.name, item.department, item.phone));
    });
}

function fillEmployeeToTable() {
    employees.forEach(function(item) {
        $('tbody').append(
            '<tr>' +
                '<td>' + item.name + '</td>' +
                '<td>' + item.department + '</td>' +
                '<td>' + item.phone + '</td>' +
                '<td>' +
                    '<a class="edit" title="Edit" data-toggle="tooltip" onclick="openUpdateModal(' + item.id + ')"><i class="material-icons">&#xE254;</i></a>' +
                    '<a class="delete" title="Delete" data-toggle="tooltip" onClick="openConfirmDelete(' + item.id + ')"><i class="material-icons">&#xE872;</i></a>' +
                '</td>' +
            '</tr>')
    });
}

function buildTable(){
    $('tbody').empty();
    getListEmployees();
}

function openAddModal(){
    resetForm();
    openModal();
}

function resetForm(){
    document.getElementById("id").value = "";
    document.getElementById("name").value = "";
    document.getElementById("dept").value = "";
    document.getElementById("phone").value = "";
}

function openModal(){
    $('#myModal').modal('show');
}

function hideModal(){
    $('#myModal').modal('hide');
}

function addEmployee(){
    var name = document.getElementById("name").value;
    var dept = document.getElementById("dept").value;
    var phone = document.getElementById("phone").value;
    
    //TODO validate
    // then fail validate ==> return;

    var employee = {
        name: name,
        department: dept,
        phone: phone
    };

    // $.post("https://6123c957124d880017568497.mockapi.io/api/vti/App/user/", employee,
    $.post("http://localhost:8080/api/v1/employees/", employee,
    function(data, status) {
        // error
        if (status == "error") {
            alert("Error when loading data");
            return;
        }

        // success
        hideModal();
        showSuccessAlert();
        buildTable();
    });
}

function openUpdateModal(id){
    
    //Get index from employee's ID
    var index = employees.findIndex(x => x.id == id);
    
    //fill Data
    document.getElementById("id").value = employees[index].id;
    document.getElementById("name").value = employees[index].name;
    document.getElementById("dept").value = employees[index].department;
    document.getElementById("phone").value = employees[index].phone;

    openModal();
}

function save(){
    var id = document.getElementById("id").value;

    if(id == null || id ==""){
        addEmployee();
    }else{
        updateEmployee();
    }
}

function updateEmployee(){
    var id = document.getElementById("id").value;
    var name = document.getElementById("name").value;
    var department = document.getElementById("dept").value;
    var phone = document.getElementById("phone").value;

    // TODO validate
    // then fail validate ==> return;

    var employee = {
        name: name,
        department: department,
        phone: phone
    };

    $.ajax({
        url: 'http://localhost:8080/api/v1/employees/' + id,
        type: 'PUT',
        data: employee,
        success: function(result) {
            // error
            if (result == undefined || result == null) {
                alert("Error when loading data");
                return;
            }

            // success
            hideModal();
            showSuccessAlert();
            buildTable();
        }
    });
}

function openConfirmDelete(id){
    // get index from employee's id
    var index = employees.findIndex(x => x.id == id);
    var name = employees[index].name;
    
    var result = confirm("Want to delete " + name + "?");
    if (result) {
        deleteEmployee(id);
    }
}

function deleteEmployee(id){
    // TODO validate
    // var index = employees.findIndex(x => x.id === id);
    // employees.splice(index, 1);

    // showSuccessAlert();
    // buildTable();
    $.ajax({
        url: 'http://localhost:8080/api/v1/employees/' + id,
        type: 'DELETE',
        success: function(result) {
            // error
            if (result == undefined || result == null) {
                alert("Error when loading data");
                return;
            }

            // success
            showSuccessAlert();
            buildTable();
        }
    });
}

function showSuccessAlert() {
    $("#success-alert").fadeTo(2000, 500).slideUp(500, function() {
        $("#success-alert").slideUp(500);
    });
}
