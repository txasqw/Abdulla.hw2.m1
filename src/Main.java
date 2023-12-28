import java.util.Random;

public class Main {
    public static void main(String[] args) {

                System.out.println("результат 1:" +AgeAndTemperature (generateRandomAge(),15));
                System.out.println("результат 2:" + AgeAndTemperature(generateRandomAge(),27));
                System.out.println("результат 3:" + AgeAndTemperature(generateRandomAge(), -8));
                System.out.println("результат 4:" + AgeAndTemperature(generateRandomAge(), -5));
                System.out.println("результат 5:" + AgeAndTemperature(generateRandomAge(),19));
            }

            public static String AgeAndTemperature(int AgeOfHuman, int Temperature) {
                String goToWalk = "Можно идти гулять";
                String stayHome = "Останьтесь Дома";
                if (AgeOfHuman >= 20 && AgeOfHuman <= 45 && Temperature >= -20 && Temperature <= 30) {
                    return goToWalk;
                }

                else if (AgeOfHuman < 20 && Temperature >= 0 && Temperature <= 28) {
                    return goToWalk;
                }


                else if (AgeOfHuman>45 && Temperature >=-10 && Temperature <=25){
                    return goToWalk;

                }

                else {
                    return stayHome;
                }

            }
            public static int generateRandomAge(){
                Random random = new Random();
                int ageOfPerson = random.nextInt(100);
                return ageOfPerson;

            }

        }


