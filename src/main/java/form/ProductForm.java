package form;

public class ProductForm
{
    private Long id;
    private String name;
    private String description;
    private String price;

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public String getPrice()
    {
        return price;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }
}
