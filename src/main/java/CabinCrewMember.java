public class CabinCrewMember extends CrewMember{

    private String message;

    public CabinCrewMember(String name, ListOfCrewMembers role, String message) {
        super(name, role);
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}
