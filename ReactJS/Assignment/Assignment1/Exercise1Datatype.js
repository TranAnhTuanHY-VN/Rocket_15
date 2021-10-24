var Department = /** @class */ (function () {
    function Department(name) {
        this.id = ++Department.counter;
        this.name = name;
    }
    Department.prototype.getID = function () {
        return this.id;
    };
    Department.prototype.setID = function (id) {
        this.id = id;
    };
    Department.prototype.getName = function () {
        return this.name;
    };
    Department.prototype.setName = function (name) {
        this.name = name;
    };
    Department.counter = 0;
    return Department;
}());
var Position = /** @class */ (function () {
    function Position(name) {
        this.id = ++Position.counter;
        this.name = name;
    }
    Position.prototype.getID = function () {
        return this.id;
    };
    Position.prototype.setID = function (id) {
        this.id = id;
    };
    Position.prototype.getName = function () {
        return this.name;
    };
    Position.prototype.setName = function (name) {
        this.name = name;
    };
    Position.counter = 0;
    return Position;
}());
var Account = /** @class */ (function () {
    function Account(email, username, fullName, department, position, createDate) {
        this.id = ++Account.counter;
        this.email = email;
        this.username = username;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
    }
    Account.prototype.getID = function () {
        return this.id;
    };
    Account.prototype.setID = function (id) {
        this.id = id;
    };
    Account.prototype.getEmail = function () {
        return this.email;
    };
    Account.prototype.setEmail = function (email) {
        this.email = email;
    };
    Account.prototype.getUsername = function () {
        return this.username;
    };
    Account.prototype.setUsername = function (username) {
        this.username = username;
    };
    Account.prototype.getFullName = function () {
        return this.fullName;
    };
    Account.prototype.setFullName = function (fullName) {
        this.fullName = fullName;
    };
    Account.prototype.getDepartment = function () {
        return this.department.getName();
    };
    Account.prototype.getPosition = function () {
        return this.position.getName();
    };
    Account.prototype.getCreateDate = function () {
        return this.createDate;
    };
    Account.prototype.toString = function () {
        return this.id + "   " + this.email + "  " + this.username + "   " + this.fullName + "   " + this.getDepartment() + "    " + this.getPosition() + "  " + this.getCreateDate();
    };
    Account.counter = 0;
    return Account;
}());
var Group = /** @class */ (function () {
    function Group(name, creator, createDate) {
        this.id = ++Group.counter;
        this.name = name;
        this.creator = creator;
        this.createDate = createDate;
    }
    Group.counter = 0;
    return Group;
}());
var GroupAccount = /** @class */ (function () {
    function GroupAccount(GroupID, AccountID, JoinDate) {
        this.GroupID = GroupID;
        this.AccountID = AccountID;
        this.JoinDate = JoinDate;
    }
    return GroupAccount;
}());
var department1 = new Department("Kế toán");
var department2 = new Department("Bảo vệ");
var department3 = new Department("Giám đốc");
var position1 = new Position("Trưởng phòng");
var position2 = new Position("Nhân viên");
var position3 = new Position("Quản lý");
var account1 = new Account("trantuan@gmail.com", "tuantran01", "Tran Anh Tuan", department1, position1, new Date());
console.log(account1.toString());
