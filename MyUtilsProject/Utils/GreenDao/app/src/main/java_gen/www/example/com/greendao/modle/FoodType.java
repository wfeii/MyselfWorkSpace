package www.example.com.greendao.modle;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "FOOD_TYPE".
 */
public class FoodType {

    private Long id;
    /** Not-null value. */
    private String name;

    public FoodType() {
    }

    public FoodType(Long id) {
        this.id = id;
    }

    public FoodType(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(String name) {
        this.name = name;
    }

}