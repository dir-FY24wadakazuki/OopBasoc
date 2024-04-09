package company;

import java.lang.invoke.VarHandle;

public class ObjectSample {
    
    public static void main(String args[]) {
        // インスタンス作成
        var department = new Department("営業部", "××", 1000000);
        var employee = new Employee("鈴木", department, "課長", 100);
        
        // インスタンスメソッドの呼び出し
        employee.report(1);
        employee.report(2);
        employee.JoinMeeting();
        
        // 一行空ける
        System.out.println("");
        
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Employee("田中", department, "一般社員", 88);
        
        engineer.report();
        engineer.JoinMeeting();
    }
}
