 public class Pizza{
    String title;
     
    String servings;
    
    String total_time;
    
     String servings;
    
    String   toppings;
    String  crust;
    
   String size;
    
    
    String ingredients;
    
    String   price;
    int id;
    
    

    pubic Pizza(){

    }
    public Pizza( String notes, String ingredients, String price ,String serving,String topping,String size,String crust   ) {
       
        this.title = title;
       
        this.servings = servings;
       
        this.total_time = total_time;
       
        
        this.ingredients = ingredients;
     
 
         this.topping = topping;
         this.crust = crust;
         this.size = size;
       
        
        this.price = price;
    }


       public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
   public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }
   public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

   
    public String getServings() {
        return servings;
    }

    
    public String getTotal_time() {
        return total_time;
    }

    public void setTotal_time(String total_time) {
        this.total_time = total_time;
    }

    
   
    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    
    
     
         public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}

