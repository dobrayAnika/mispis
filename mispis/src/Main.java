import classes.Faculty;
import classes.Institute;
import classes.ResearchAssociate;


public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("ФКН");
        Institute tst = new Institute("ЦТ", "311п");
        Institute itu = new Institute("ИТУ", "312п");
        Institute piit = new Institute("ПиИТ", "380");
        Institute tozi = new Institute("ТОиЗИ", "297");
        Institute is = new Institute("ИС", "387");
        fkn.setInstitutes(new Institute[]{tozi, is, tst, itu, piit});
        ResearchAssociate emp1 = new ResearchAssociate(1234, "Бебнева Светлана Владимировна",
                "Основы компьютерной бухгалтерии");
        ResearchAssociate emp2 = new ResearchAssociate(1234, "Громковский Андрей Анатольевич",
                "Моделирование бизнес-процессов");
        ResearchAssociate emp3 = new ResearchAssociate(1234, "Копытина Екатерина Александровна",
                "Системы подготовки электронных документов");
        ResearchAssociate emp4 = new ResearchAssociate(1234, "Матвеев Михаил Григорьевич",
                "Решение бизнес-задач");
        ResearchAssociate emp5 = new ResearchAssociate(1234, "Соломатин Алексей Иванович",
                "Программирование в 1С");
        itu.setEmployees(new ResearchAssociate[]{emp1, emp2, emp3, emp4, emp5});
        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("Кафедры факультета " + fkn.getName() + ": \n");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println(fkn_institutes[i].getName());
        }
        System.out.println("\n");
        ResearchAssociate[] itu_employees = itu.getEmployees();
        System.out.println("Сотрудники кафедры " + itu.getName() + ": \n");
        for (int i = 0; i < itu_employees.length; i++) {
            System.out.println(itu_employees[i].getName());
        }
    }
}
