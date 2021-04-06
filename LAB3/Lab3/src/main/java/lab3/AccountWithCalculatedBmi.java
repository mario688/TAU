package lab3;

public class AccountWithCalculatedBmi {

    private boolean active;
    private int age;
    private double height;
    private double weight;
    private double bmi=0;
    public AccountWithCalculatedBmi(){
        this.active = false;
    }
    public AccountWithCalculatedBmi(long height, long weight) {
        this.height = height;
        this.weight = weight;
        this.active = false;
    }

    public void activateAccount(){
        this.active = true;
    }
    public boolean isActive(){
        return this.active;
    }
    public double CalculateBmi(AccountWithCalculatedBmi accountWithCalculatedBmi){
        double height = accountWithCalculatedBmi.height * 0.01;
        if(accountWithCalculatedBmi.isActive() == true){
            bmi = accountWithCalculatedBmi.weight / (height*height);
        }


       return bmi;
    }
    public String CheckBmi(double bmi){
        if(bmi>18.5 && bmi<25){
            return "good weight";
        }else
            return "bad weight";
    }




    public static void main(String[] args) {
        AccountWithCalculatedBmi accountWithCalculatedBmi = new AccountWithCalculatedBmi(190,90);
        accountWithCalculatedBmi.activateAccount();
        System.out.println(accountWithCalculatedBmi.isActive());
        System.out.println(accountWithCalculatedBmi.CalculateBmi(accountWithCalculatedBmi));
        System.out.println(accountWithCalculatedBmi.CheckBmi(24.5));
    }
}
