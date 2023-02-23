import java.util.ArrayList;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Friend> Friends = new ArrayList<>();
        Friend friend = new Friend("john","casino", true, "bologna");
        JOptionPane.showMessageDialog(null,
                "Welcome to party picker. \nEnter person's name and the type of food they are likely to bring, \n" +
                        "indicate weather they are invited or not.", "Greeting", JOptionPane.INFORMATION_MESSAGE);
        boolean flag = true;
        do {
            String firstName = JOptionPane.showInputDialog("Enter first name");
            String lastName = JOptionPane.showInputDialog("Enter last name");
            String food = JOptionPane.showInputDialog("Enter the food they usually bring");
            Object[] options = {"Invited", "Not Invited"};
            int inviteDialog = JOptionPane.showOptionDialog(null,
                    "Choose if guest is invited or not", "PartyPicker", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            boolean isInvited = false;
            if (inviteDialog == 0 ){
                isInvited = true;
            }
            //instantiate friends
            Friends.add(new Friend(firstName, lastName, isInvited, food));
            int endProgram = JOptionPane.showConfirmDialog(null, "Enter another guest?", "Party Picker",
                    JOptionPane.YES_NO_OPTION);
            if (endProgram == 1){
                flag = false;
            }
        } while (flag);
        String guests = "";
        for (int i = 0;i<Friends.size();i++){
            guests = guests+Friends.get(i)+"\n";
        }
        JOptionPane.showMessageDialog(null, "Guests:\n\n"+guests);
        System.out.println(friend.getIsInvited());
        System.out.println(friend);
    }
}