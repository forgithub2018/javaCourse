import java.util.Random;

public class MockEmployeesGenerator {
    // method should generate mock eployees.
    // data should be more-or-less relevant. Normal names, Acceptable salary, age.

    final static String[] MALE_NAME = {"MYKOLA", "DMYTRO", "VOLODYMYR", "VASYL'", "PETRO", "STEPAN"};
    final static String[] FEMALE_NAME = {"GANNA", "OKSANA", "OLENA", "NADIYA'", "VALENTYNA"};

    final static char[] vowelLetters = {'A', 'O', 'E', 'I'};
    final static char[] consonantsLetter = {'V', 'N', 'B', 'P', 'D', 'M', 'T'};
    final static Random random = new Random();

    static String getRandomMaleName() {

        return MALE_NAME[random.nextInt(MALE_NAME.length)];
    }

    static String getRandomFemaleName() {
        return FEMALE_NAME[random.nextInt(FEMALE_NAME.length)];
    }

    static boolean isVowelsLetter(char letter) {
        boolean result = false;
        for (char vowel : vowelLetters) {
            if (vowel == letter) {
                return true;
            }
        }
        return result;
    }


    static String generateLastName() {
        String lastName = "";
        int lengthLastName = 5 + random.nextInt(5);
        char[] charLastName = new char[lengthLastName];

        if (random.nextInt(2) == 0) {
            charLastName[0] = vowelLetters[random.nextInt(vowelLetters.length)];
        }

        for (int i = 1; i < lengthLastName; i++) {
            if (isVowelsLetter(charLastName[i - 1])) {
                charLastName[i] = consonantsLetter[random.nextInt(consonantsLetter.length)];
            } else {
                charLastName[i] = vowelLetters[random.nextInt(vowelLetters.length)];
            }
        }
        for (char ch : charLastName) {
            lastName += ch;
        }
        return lastName;
    }

    static String generateFemaleLastName() {
        String lastName = generateLastName();
        char lastChar = lastName.charAt(lastName.length() - 1);
        if (!isVowelsLetter(lastChar))
            lastName = lastName + vowelLetters[0];
        return lastName;
    }

    static String generateMaleLastName() {
        String lastName = generateLastName();
        char lastChar = lastName.charAt(lastName.length() - 1);
        if (isVowelsLetter(lastChar))
            lastName = lastName + consonantsLetter[0];
        return lastName;
    }

    static Employee[] generate(int size) {
        Employee[] randomEmployees = new Employee[size];


        Random random = new Random();
        for (int i = 0; i < size; i++) {
            String firstName;
            String lastName;
            if (random.nextInt(2) == 0) {
                firstName = getRandomMaleName();
                lastName = generateMaleLastName();
            } else {
                firstName = getRandomFemaleName();
                lastName = generateFemaleLastName();
            }
            int id = random.nextInt(size + 1000);
            double salary = 1000 + 100 * random.nextDouble();
            randomEmployees[i] = new Employee(id, firstName, lastName, salary);
        }

        return randomEmployees;
    }


}
