public class seventhLesson {
    public static void main(String[] args) {
        double height = 180;
        double weight = 70;
        double indexBody = height / (weight * weight);
        if (indexBody == 16 || indexBody < 16) {
            System.out.println("Выраженный дефицит массы тела");
        }
        if (indexBody > 16 && indexBody < 18.5) {
            System.out.println("Недостаточная масса тела");
        }
        if (indexBody > 18.5 && indexBody < 25) {
            System.out.println("Норма");
        }
    }
}

// This lesson about logical operations &&, ||, !