public class Pizza {
    private int price = 0;
    private String bill = "  XYZ Pizza Shop \n ";

    private boolean isVeg =  false;
    private boolean extraChees=false;

    private boolean extraTopping = false;


    private boolean take = false;

    public Pizza(boolean isVeg){
     this.isVeg = isVeg;
     // true for veg and false for non-veg
     if(isVeg){
         price += 300;

     }else{
         price += 400;
     }
 }

    public int getPrice() {
        return this.price;
    }

    public void addCheese(){
        if(this.extraChees){
            return;
        }
         price+=80;
        this.extraChees = true;
    }

    public void addTopping(){
     if(extraTopping){
         return;
     }

     if(isVeg){
         price+=80;

     }else{
         price+=120;
     }
     extraTopping = true;
    }

    public void addTakeaway(){
     if(this.take){
         return;
     }
     price+=20;
     take = true;
    }

    public String getBill(){
     if(isVeg){
         bill += "300 for veg-Pizza \n";
     }else{
         bill += "400 for non-veg-Pizza \n";
     }
     if(extraChees){
         bill += "80 for cheese \n";
     }
     if(extraTopping){
         if(!isVeg){
             bill += "120 for non-veg Pizza \n";
         }else{
             bill += "80 for veg Pizza \n";
         }
     }
     if(take){
         bill+="20 for paper bag \n";
     }
     String totalPrice = Integer.toString(price);
     bill+= " Total:" + totalPrice;
     return bill;
    }

}
