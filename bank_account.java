public class bank_account {
    private int acc_no;
    private int balance;
    private String Customer_name;
    private String email;
    private int phone_no;

    //-------------- account number----------------------

    public int setAcc_no(int acc_no) {
        int acc_no_lenght = String.valueOf(acc_no).length();
        if (acc_no_lenght == 6) {
            return this.acc_no = acc_no;
        } else {
            return -1;
        }

    }

    public int getAcc_no() {
        return this.acc_no;
    }

    //-------------- balance-----------------------------

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public int depBalance(int depBalance) {
        this.balance += depBalance;
        return this.balance;

    }

    public int withBalance(int withBalance) {
        if (withBalance <= this.balance) {
            int desceasedBalance = this.balance - withBalance;
            return desceasedBalance;
        } else {
            return -1;
        }
    }


    public void setCustomer_name(String customer_name) {

        this.Customer_name = customer_name;
    }

    public String getCustomer_name() {

        return this.Customer_name;
    }


    public void setEmail(String email) {

        this.email = email;
    }

    public String getEmail() {

        return this.email;
    }


    public void setPhone_no(int phone_no) {

        this.phone_no = phone_no;
    }

    public int getPhone_no() {

        return this.phone_no;
    }
}
