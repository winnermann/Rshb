package at.web.reusableClasses;

public class Logs {

    /**
     *
     * @param action - String
     * @param actualResult - String
     * @param expectedResult - String
     */
    public static void stepResultLog (String action, String actualResult, String expectedResult){

        /**
         * Log - Выдает в консоль результат прохождения шага
         * OK - шаг пройден успешно
         * FAIL - шаг пройден неуспешно
         */
        if (actualResult.equals(expectedResult)){
            System.out.println(action + actualResult);
            System.out.println("Шаг пройден: OK ✅");
        }else {
            System.out.println(action + actualResult);
            System.out.println("Шаг пройден: FAIL ❌");
        }

    }

    /**
     *
     * @param action - String
     * @param actualResult - Integer
     * @param expectedResult - Integer
     */
    public static void stepResultLog (String action, Integer actualResult, Integer expectedResult){
        /**
         * Log - Выдает в консоль результат прохождения шага
         * OK - шаг пройден успешно
         * FAIL - шаг пройден неуспешно
         */
        if (actualResult.equals(expectedResult)){
            System.out.println(action + actualResult);
            System.out.println("Шаг пройден: OK ✅");
        }else {
            System.out.println(action + actualResult);
            System.out.println("Шаг пройден: FAIL ❌");
        }

    }

    /**
     *
     * @param action1 - String
     * @param elementCondition1 - boolean
     * @param action2 - String
     * @param elementCondition2 - boolean
     */
    public static void stepResultLog(String action1, boolean elementCondition1, String action2, boolean elementCondition2){

        /**
         * Log - Выдает в консоль результат прохождения шага
         * OK - шаг пройден успешно
         * FAIL - шаг пройден неуспешно
         */
        if (elementCondition1 && elementCondition2){
            System.out.println(action1 + elementCondition1);
            System.out.println(action2 + elementCondition2);
            System.out.println("Шаг пройден: OK ✅");
        }else {
            System.out.println(action1 + elementCondition1);
            System.out.println(action2 + elementCondition2);
            System.out.println("Шаг пройден: FAIL ❌");
        }
    }

}
