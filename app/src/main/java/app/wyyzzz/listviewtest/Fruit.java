package app.wyyzzz.listviewtest;

/**
 * Created by wuyuanyang on 26/09/2017.
 */

public class Fruit {

    private String name;

    private int imageId;

    public Fruit(String name , int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
