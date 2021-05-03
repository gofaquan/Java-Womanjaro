package poly.array.examine;

public class ShowEmp {
    public static void main(String[] args) {
        ordinary_employee xiao_qiang = new ordinary_employee("xiao_qiang", 99999);

        Manager guang_tou_qiang_tou_qiang = new Manager("guang_tou_qiang", 50,99);

        ShowEmp showEmp = new ShowEmp();
        showEmp.ShowEmpAnnual(xiao_qiang);
        showEmp.testWork(xiao_qiang);
        showEmp.ShowEmpAnnual(guang_tou_qiang_tou_qiang);
        showEmp.testWork(guang_tou_qiang_tou_qiang);
    }


    public void ShowEmpAnnual(Employee employee){
        employee.getAnnual();
    }

    public void testWork(Employee employee){
        if (employee instanceof ordinary_employee){
            ((ordinary_employee) employee).work();
        }else if (employee instanceof Manager){
            ((Manager) employee).manage();
        }else {
            System.out.println("wtf ,you're wrong!");
        }
    }

}
