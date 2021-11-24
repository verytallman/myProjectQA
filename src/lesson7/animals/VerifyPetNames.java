package lesson7.animals;

public class VerifyPetNames {
    public static void main(String[] args) {
        Pet cat = new Pet();
        cat.name = "Mike";
        cat.voice = "miay";
        cat.id = 1;


        Pet catSecond = new Pet();

        catSecond.name = "Mike";
        catSecond.voice = "miay";
        catSecond.id = 1;
        //
        //        System.out.println(cat == catSecond);
        //        System.out.println(cat.equals(catSecond));

        Pet catThird = catSecond;
        catThird.name = "Hulk";
        System.out.println(catSecond.name);

        //        System.out.println(catSecond == catThird);
        //        System.out.println(catSecond.equals(catThird));


    }


}
