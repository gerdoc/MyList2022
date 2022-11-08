package gutierrez.galan.german.mylist.model;

import java.io.Serializable;

public class MyData implements Serializable
{
    private String name;
    private int image;

    public MyData()
    {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
