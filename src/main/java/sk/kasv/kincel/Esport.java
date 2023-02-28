package sk.kasv.kincel;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "esport")
public class Esport {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.REMOVE})
    @JoinTable(name = "team_esport", joinColumns = @JoinColumn(name = "esportId")
            , inverseJoinColumns = @JoinColumn(name = "teamId"))
    private List<Team> teams;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> team) {
        this.teams = team;
    }

    public Esport(String name) {
        this.name = name;
    }

    public Esport() {

    }

    public void addTeam(Team team){
        if(teams ==null){
            teams =new ArrayList<>();
        }
        teams.add(team);
    }
}
