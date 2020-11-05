package chapter19;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:43 2020/6/4
 */
public enum Meal2 {
    Fruit(chapter19.Food.Fruit.class),
    Meal(chapter19.Food.Meal.class),
    Dessert(Food.Dessert.class);
    private chapter19.Food[] values;

    private Meal2(Class<? extends chapter19.Food> kind) {
        values = kind.getEnumConstants();
    }

    public chapter19.Food randomSelect() {
        return Enums.random(values);
    }

    public interface Food {
        enum Fruit implements chapter19.Food {
            APPLE, ORANGE, BANANA;
        }

        enum Meal implements chapter19.Food {
            BREAKFAST, LUNCH, SUPPER;
        }

        enum Dessert implements chapter19.Food {
            COKE, COFFEE;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (Meal2 value : Meal2.values()) {
                chapter19.Food food = value.randomSelect();
                System.out.println(food);
            }
            System.out.println("---------------");
        }
    }
}
