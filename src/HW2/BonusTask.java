package HW2;
//(*). Сумма покупки составляет а$. Если а больше 1000$, то предоставляется скидка 15%.
// Вывести на экран сумму покупки с учетом скидки либо сообщение о том, что скидка не предоставляется.


import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

public class BonusTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму покупки:");
        char bucks = '$';
        int purchaseSum = scanner.nextInt();
        if (purchaseSum > 1000) {
            float discountedSum = (float) (purchaseSum * 15 / 100);
            System.out.println("Вам предоставляется скидка 15%");
            System.out.println("К оплате: " +(purchaseSum-discountedSum)+bucks);
        }else{
            System.out.println("Ваша сумма покупки "+purchaseSum+bucks);
            System.out.println("К оплате: "+purchaseSum+bucks);
        }
    }
}
