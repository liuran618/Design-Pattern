package demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter {
    public static void main(String[] args) {
        SchoolManager1 schoolManager = new SchoolManager1();
        schoolManager.printAllEmployee(new CollegeManager1());
    }
}

//ѧУ�ܲ�Ա��
class Employee1{
    private String id;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
}

//ѧԺԱ��
class CollegeEmployee1{
    private String id;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
}

//����ѧԺԱ���Ĺ�����
class CollegeManager1{
    //����ѧԺ����Ա��
    public List<CollegeEmployee1> getAllEmployee(){
        List<CollegeEmployee1> list = new ArrayList<CollegeEmployee1>();
        for( int i = 0;i < 10;i++){
            CollegeEmployee1 emp = new CollegeEmployee1();
            emp.setId("ѧԺԱ��ID = "+i);
            list.add(emp);
        }
        return list;
    }
}

//ѧУ�Ĺ�����
class SchoolManager1{
    //����ѧУ�ܲ�����Ա��
    public List<Employee1> getAllEmployee(){
        List<Employee1> list = new ArrayList<Employee1>();
        for( int i = 0;i < 10;i++){
           Employee1 emp = new Employee1();
            emp.setId("ѧУ�ܲ�Ա��ID = "+i);
            list.add(emp);
        }
        return list;
    }

    //���ѧУ�ܲ���ѧԺԱ����Ϣ
    void printAllEmployee(CollegeManager1 sub){
        /*
        �������⣺
        �˴��� CollegeEmployee ���� SchoolManager ��ֱ������
        �˴������˾ֲ������� CollegeEmployee ��Υ�������ط���
         */
        List<CollegeEmployee1> list1 = sub.getAllEmployee(); //�˴������˾ֲ������� CollegeEmployee ��Υ�������ط���
        System.out.println("--------ѧԺԱ��--------");
        for(CollegeEmployee1 e:list1){
            System.out.println(e.getId());
        }
        List<Employee1> list2 = this.getAllEmployee();
        System.out.println("--------ѧУ�ܲ�Ա��--------");
        for(Employee1 e:list2){
            System.out.println(e.getId());
        }
    }

}
