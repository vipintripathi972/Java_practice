class Encap{
    private String email;
    private int accountNumber;

    public void setEmail(String e)
    {
        email = e;
    }

    public String getEmail()
    {
        return email;
    }
    

    public static void main(String args[])
    {
        Encap obj = new Encap();
        obj.setEmail("raunak@gmail.com");
        String r = obj.getEmail();

        System.out.println(r);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}