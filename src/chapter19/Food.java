package chapter19;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 17:13 2020/6/3
 */
public interface Food {
    enum Fruit implements Food {
        APPLE, ORANGE, BANANA;
    }

    enum Meal implements Food {
        BREAKFAST, LUNCH, SUPPER;
    }

    enum Dessert implements Food {
        COKE, COFFEE;
    }
}

enum Course {
    Fruit(Food.Fruit.class),
    Meal(Food.Meal.class),
    Dessert(Food.Dessert.class);


    private Food[] values;

    private Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public Food randomSelect() {
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (Course value : Course.values()) {
                Food food = value.randomSelect();
                System.out.println(food);
            }
        }
    }
}

class TypeFood {
    public static void main(String[] args) {
        Food food = Food.Fruit.APPLE;
        food = Food.Meal.LUNCH;

    }

}