package modul;

public class BuisnessContact extends Contact {

   public BuisnessContact(String name, String companyName){
       this.name = name;
       this.companyName = companyName;
   }

   public BuisnessContact(){
       super();
   }
   private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BuisnessContact{" +
                "companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
