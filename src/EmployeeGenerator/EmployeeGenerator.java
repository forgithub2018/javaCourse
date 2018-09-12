public class EmployeeGenerator {
    public static void main(String[] args) {

        int size = 10;

        Employee[] mockEmployees = MockEmployeesGenerator.generate(size);
        for (int i = 0; i < size; i++) {
            mockEmployees[i].showAllFieds();
        }


    }

}



