package backend;

import entity.Exercise3.CPU;
import entity.Exercise3.Car;
import entity.Exercise3.NgayThangNam;
import entity.Exercise3.OuterClass;

public class Exercise3 {
    public void Q1() {
        CPU cpu = new CPU(1000000);
        CPU.Processor processor = new CPU.Processor(4, "abc");
        CPU.RAM ram = new CPU.RAM(8,"def");
        System.out.println("Processor's Cache: ");
        System.out.println(processor.getCache());
        System.out.println("Ram's Clock Speed: ");
        System.out.println(ram.getClockSpeed());
    }

    public void Q2() {
        Car car = new Car("Mazda","8WD");
        Car.Engine engine = new Car.Engine("Crysler");
        System.out.println(engine.getEngineType());
        System.out.println(car);
    }

    public void Q3() {
        OuterClass outerClass = new OuterClass();
        outerClass.show();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.show();
    }

    public void Q4() {
        NgayThangNam date = new NgayThangNam();
        date.nam = 2020;
        date.thang = 10;
        date.ngay = 20;
        NgayThangNam.GioPhutGiay time = date.new GioPhutGiay();
        time.gio =10;
        time.phut = 15;
        time.giay =40;

        time.xuatThongTin();
    }
}
