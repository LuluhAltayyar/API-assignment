package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Devic {

    private String id;
    private String createdAt;


    private String name;
    private Data data;

    public Devic() {

    }
    public Devic(String name, Data data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Devic{" +
                "id='" + id + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}
