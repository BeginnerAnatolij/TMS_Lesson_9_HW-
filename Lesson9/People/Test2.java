package Lesson9.People;

public class Test2 {
    public static void main(String[] args) {
        /*Получение должности по Id человека*/
        PersonId x = new PersonId(4);
        IPosition iposition = getPersonById(x.getCode());
        iposition.position();
    }

    private static IPosition getPersonById(int id) {
        IPosition iPosition;
        if (id == 1) {
            iPosition = new Director();
        } else if (id == 2) {
            iPosition = new Accountant();
        } else {
            iPosition = new Worker();
        }
        return iPosition;
    }
}
