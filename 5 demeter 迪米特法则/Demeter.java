package demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter {
    public static void main(String[] args) {
        SchoolManager1 schoolManager = new SchoolManager1();
        schoolManager.printAllEmployee(new CollegeManager1());
    }
}

//学校总部员工
class Employee1{
    private String id;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
}

//学院员工
class CollegeEmployee1{
    private String id;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
}

//管理学院员工的管理类
class CollegeManager1{
    //返回学院所有员工
    public List<CollegeEmployee1> getAllEmployee(){
        List<CollegeEmployee1> list = new ArrayList<CollegeEmployee1>();
        for( int i = 0;i < 10;i++){
            CollegeEmployee1 emp = new CollegeEmployee1();
            emp.setId("学院员工ID = "+i);
            list.add(emp);
        }
        return list;
    }
}

//学校的管理类
class SchoolManager1{
    //返回学校总部所有员工
    public List<Employee1> getAllEmployee(){
        List<Employee1> list = new ArrayList<Employee1>();
        for( int i = 0;i < 10;i++){
           Employee1 emp = new Employee1();
            emp.setId("学校总部员工ID = "+i);
            list.add(emp);
        }
        return list;
    }

    //输出学校总部和学院员工信息
    void printAllEmployee(CollegeManager1 sub){
        /*
        分析问题：
        此处的 CollegeEmployee 不是 SchoolManager 的直接朋友
        此处引用了局部变量类 CollegeEmployee 。违反迪米特法则
         */
        List<CollegeEmployee1> list1 = sub.getAllEmployee(); //此处引用了局部变量类 CollegeEmployee 。违反迪米特法则
        System.out.println("--------学院员工--------");
        for(CollegeEmployee1 e:list1){
            System.out.println(e.getId());
        }
        List<Employee1> list2 = this.getAllEmployee();
        System.out.println("--------学校总部员工--------");
        for(Employee1 e:list2){
            System.out.println(e.getId());
        }
    }

}
