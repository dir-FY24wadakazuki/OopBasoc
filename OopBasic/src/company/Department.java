package company;

public class Department {
    private final String name;
    private final String departmentID;
    private int budget;
    
    public Department(String name, String departmentID, int budget) {
        this.name = name;
        this.departmentID = departmentID;
        this.budget = budget;
    }
    
    public void meeting(){
        System.out.println("部内会議を開催します。部署：" + name + "予算：" + budget);
    }
        
    public String getName() {
        return name;
    }
    
    public double getBudget() {
        return budget;    
    }
    
    public void setBudget(int budget){
        if(budget < 0) {
        throw new IllegalArgumentException("予算はマイナスにできません。");
        }
        
        this.budget = budget;
    }
        
}
