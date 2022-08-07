
package demeter;

import java.util.ArrayList;
import java.util.List;

public class DemeterImprove {
    public static void main(String[] args) {
        SchoolManager2 schoolManager = new SchoolManager2();
        schoolManager.printAllEmployee(new CollegeManager2());
    }
}
/*
解决方案，将原来在 SchoolManager 中的打印 CollegeEmployee 的部分，封装到 CollegeManager 中
 */


//学校总部员工
class Employee2{
    private String id;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
}

//学院员工
class CollegeEmployee2{
    private String id;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
}

//管理学院员工的管理类
class CollegeManager2{
    //返回学院所有员工
    public List<CollegeEmployee2> getAllEmployee(){
        List<CollegeEmployee2> list = new ArrayList<CollegeEmployee2>();
        for( int i = 0;i < 20;i++){
            CollegeEmployee2 emp = new CollegeEmployee2();
            emp.setId("学院员工ID = "+i);
            list.add(emp);
        }
        return list;
    }

    public void printEmployee(){
        List<CollegeEmployee2> list1 = getAllEmployee(); //此处引用了局部变量类 CollegeEmployee 。违反迪米特法则
        System.out.println("--------学院员工--------");
        for(CollegeEmployee2 e:list1){
            System.out.println(e.getId());
        }
    }
}

//学校的管理类
class SchoolManager2{
    //返回学校总部所有员工
    public List<Employee2> getAllEmployee(){
        List<Employee2> list = new ArrayList<Employee2>();
        for( int i = 0;i < 20;i++){
            Employee2 emp = new Employee2();
            emp.setId("学校总部员工ID = "+i);
            list.add(emp);
        }
        return list;
    }

    //输出学校总部和学院员工信息
    void printAllEmployee(CollegeManager2 sub){
        sub.printEmployee();
        List<Employee2> list2 = this.getAllEmployee();
        System.out.println("--------学校总部员工--------");
        for(Employee2 e:list2){
            System.out.println(e.getId());
        }
    }

}
