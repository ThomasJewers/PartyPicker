public class Friend extends Person{
    private String foodToBring;

    public Friend(String firstName, String lastName, boolean isInvited, String foodToBring) {
        super(firstName, lastName, isInvited);
        this.foodToBring = foodToBring;
    }

    @Override
    public String toString(){
        String status = null;
        if (super.getIsInvited() == true) {
            status = "";
        } else {
            status = "NOT";
        }
        return super.getFullName()+" is bringing "+this.foodToBring+". They are "+status+"invited.";
    }
}
