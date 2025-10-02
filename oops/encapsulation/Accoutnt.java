class AcHolder {

   // data member
   private long accNo;
   private String name;
   private String email;
   private float amount;

   // getter seter
   public long getAccNo() {
      return accNo;
   }

   public void setAccNo(long accNo) {
      this.accNo = accNo;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public float getAmount() {
      return amount;
   }

   public void setAmmount(float amount) {
      this.amount = amount;
   }

}

public class Accoutnt {
   public static void main(String[] args) {
      AcHolder ach = new AcHolder();
      ach.setAccNo(1234567890);
      ach.setName("mukeah");
      ach.setEmail("mukesh@gmail.com");
      ach.setAmmount(20000);
      System.out.println(" A/c NO : " + ach.getAccNo());
      System.out.println("name : " + ach.getName());
      System.err.println(" Email : " + ach.getEmail());
      System.err.println("Amount : " + ach.getAmount());
   }

}
