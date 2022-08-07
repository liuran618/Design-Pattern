
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
�����������ԭ���� SchoolManager �еĴ�ӡ CollegeEmployee �Ĳ��֣���װ�� CollegeManager ��
 */


//ѧУ�ܲ�Ա��
class Employee2{
    private String id;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
}

//ѧԺԱ��
class CollegeEmployee2{
    private String id;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
}

//����ѧԺԱ���Ĺ�����
class CollegeManager2{
    //����ѧԺ����Ա��
    public List<CollegeEmployee2> getAllEmployee(){
        List<CollegeEmployee2> list = new ArrayList<CollegeEmployee2>();
        for( int i = 0;i < 20;i++){
            CollegeEmployee2 emp = new CollegeEmployee2();
            emp.setId("ѧԺԱ��ID = "+i);
            list.add(emp);
        }
        return list;
    }

    public void printEmployee(){
        List<CollegeEmployee2> list1 = getAllEmployee(); //�˴������˾ֲ������� CollegeEmployee ��Υ�������ط���
        System.out.println("--------ѧԺԱ��--------");
        for(CollegeEmployee2 e:list1){
            System.out.println(e.getId());
        }
    }
}

//ѧУ�Ĺ�����
class SchoolManager2{
    //����ѧУ�ܲ�����Ա��
    public List<Employee2> getAllEmployee(){
        List<Employee2> list = new ArrayList<Employee2>();
        for( int i = 0;i < 20;i++){
            Employee2 emp = new Employee2();
            emp.setId("ѧУ�ܲ�Ա��ID = "+i);
            list.add(emp);
        }
        return list;
    }

    //���ѧУ�ܲ���ѧԺԱ����Ϣ
    void printAllEmployee(CollegeManager2 sub){
        sub.printEmployee();
        List<Employee2> list2 = this.getAllEmployee();
        System.out.println("--------ѧУ�ܲ�Ա��--------");
        for(Employee2 e:list2){
            System.out.println(e.getId());
        }
    }

}
