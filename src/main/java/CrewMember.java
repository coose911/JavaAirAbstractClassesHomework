public abstract class CrewMember {

    private String name;
    private ListOfCrewMembers role;

    public CrewMember(String name, ListOfCrewMembers role){
        this.name = name;
        this.role = role;
    }

    public String getName(){
        return this.name;
    }

    public ListOfCrewMembers getRole(){
        return this.role;
    }



}
