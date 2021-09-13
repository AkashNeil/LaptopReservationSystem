package io.github.seebaware.lrs.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "laptops")
public class Laptops {



    private String name;
    private String model;





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
