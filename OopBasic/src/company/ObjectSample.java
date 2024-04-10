package company;

public class ObjectSample {
    
    public static void main(String args[]) {
        // インスタンス作成
        var salesdepartment = new Department("営業部", "××", 1000000);
        Employee sales = new Sales("鈴木", salesdepartment, "課長", 100);
        
        // インスタンスメソッドの呼び出し
        sales.report();
        sales.report(2);
        sales.joinMeeting();
        
        // 一行空ける
        System.out.println("");
        
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Engineer("田中", devDepartment, "一般社員", 88, "Java"); // 変更
        
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware(); //　追加
        
        // 追記(ここから)
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");
        
        projectManager.report();
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {
            ((Engineer) projectManager).developSoftware();
        }
        
        
        //ここから追記
        //　一行空ける
        System.out.println("");
        
        var parttimeWorker = new ParttimeWorker("太田", salesdepartment);
        
        ((Workable) sales).work();
        ((Workable) engineer).work();
        ((Workable) projectManager).work();
        ((Workable) parttimeWorker).work();

     }
            
}
