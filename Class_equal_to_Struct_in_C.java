import javax.swing.JOptionPane;

class account // классы (структуры) необязательно объявлять перед мейн классом!
{
    String name;
    String address;
    int balance;
}

public class Class_equal_to_Struct_in_C
{
    public static void main(String[] args)
    {
        account mine = new account();

        do
        {
            mine.name = JOptionPane.showInputDialog("Введите своё имя:");
        }
        while (mine.name == null);

        do
        {
            mine.address = JOptionPane.showInputDialog("Введите свой адрес:");
        }
        while (mine.address == null);

        do
        {
            String balanceInput = JOptionPane.showInputDialog("Введите кол-во средств на счёте:");
            if (balanceInput != null)
            {
                mine.balance = Integer.parseInt(balanceInput);
            }
        }
        while (mine.balance == 0);
        
        JOptionPane.showMessageDialog
        (null, 
        "name: " + mine.name + ".\n" +
        "address: " + mine.address + ".\n" +
        "balance: " + mine.balance + " USD."
        );
    

    }
}