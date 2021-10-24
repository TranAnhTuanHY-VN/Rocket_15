class Department{
    private static counter:number =0;

    private id:number;
    private name:string;

    constructor(name:string){
        this.id = ++Department.counter;
        this.name = name;
    }

    getID():number{
        return this.id;
    }

    setID(id:number){
        this.id = id;
    }

    getName():string{
        return this.name;
    }

    setName(name:string){
        this.name = name;
    }
}

class Position{
    private static counter:number =0;

    private id:number;
    private name:string;

    constructor(name:string){
        this.id = ++Position.counter;
        this.name = name;
    }

    getID():number{
        return this.id;
    }

    setID(id:number){
        this.id = id;
    }

    getName():string{
        return this.name;
    }

    setName(name:string){
        this.name = name;
    }
}

class Account{
    private static counter:number =0;
    
    private id:number;
    private email:string;
    private username:string;
    private fullName:string;
    private department: Department;
    private position: Position;
    private createDate:Date;

    constructor(email:string,username:string,fullName:string,department:Department,position:Position,createDate:Date){
        this.id = ++Account.counter;
        this.email = email;
        this.username = username;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
    }

    getID():number{
        return this.id;
    }

    setID(id:number){
        this.id = id;
    }

    getEmail():string{
        return this.email;
    }

    setEmail(email:string){
        this.email = email;
    }

    getUsername():string{
        return this.username;
    }

    setUsername(username:string){
        this.username = username;
    }

    getFullName():string{
        return this.fullName;
    }

    setFullName(fullName:string){
        this.fullName = fullName;
    }

    getDepartment():string{
        return this.department.getName();
    }

    getPosition():string{
        return this.position.getName();
    }

    getCreateDate():Date{
        return this.createDate;
    }



    toString(){
        return this.id +"   "+this.email+"  "+this.username+"   "+this.fullName+"   "+this.getDepartment()+"    "+this.getPosition()+"  "+this.getCreateDate();
    }
}

class Group{
    private static counter: number = 0;
    
    private id:number;
    private name:string;
    private creator:Account;
    private createDate:Date;

    constructor (name:string,creator:Account,createDate:Date){
        this.id = ++Group.counter;
        this.name = name;
        this.creator = creator;
        this.createDate = createDate;
    }
}

class GroupAccount{
    private GroupID:Group;
    private AccountID:Account;
    private JoinDate:Date;

    constructor(GroupID:Group,AccountID:Account,JoinDate:Date){
        this.GroupID=GroupID;
        this.AccountID=AccountID;
        this.JoinDate = JoinDate;
    }
}

var department1 = new Department("Kế toán");
var department2 = new Department("Bảo vệ");
var department3 = new Department("Giám đốc");

var position1 = new Position("Trưởng phòng");
var position2 = new Position("Nhân viên");
var position3 = new Position("Quản lý");

var account1 = new Account("trantuan@gmail.com","tuantran01","Tran Anh Tuan", department1,position1,new Date());
console.log(account1.toString());