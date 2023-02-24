public class Pilot extends CrewMember{

    private String licenseNo;

    public Pilot(String name, ListOfCrewMembers role, String licenseNo) {
        super(name, role);
        this.licenseNo = licenseNo;
    }

    public String getLicenseNo(){
        return this.licenseNo;
    }

    public String hasLicenseNumber() {
        return this.licenseNo;
    }
}
