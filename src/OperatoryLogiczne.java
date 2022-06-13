// działają na wartościach logicznych zwracając również wartości logiczne

public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = 2 > 1;
        boolean secondValue = 2 < 1;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && -> true wtedy gdy wyrazenia skladowe sa rowne true
        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue); //  true

        // || lub -> true gdy conajmniej jedno lub drugie true
        System.out.println(firstValue || secondValue); // true
        System.out.println(secondValue || thirdValue); // false
        System.out.println(firstValue || fourthValue); // true

        // ! negacja -> zwraca wartość przeciwną do wyrażenia przed któym się znajduje
        System.out.println(!firstValue); // false
        System.out.println(!thirdValue); // true
        System.out.println(!(firstValue&&secondValue)); //true
    }
}
