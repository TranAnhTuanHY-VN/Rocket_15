package entity.Exercise3;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class OuterClass {
    public void show() {
        InnerClass innerClass = new InnerClass();
        innerClass.show();
    }

    public class InnerClass{
        public void show() {
            System.out.println("Đây là inner class");
        }
    }
}
