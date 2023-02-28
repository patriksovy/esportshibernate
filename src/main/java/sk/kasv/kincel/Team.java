package sk.kasv.kincel;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Table
@Entity(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy = "team", cascade = {CascadeType.ALL})
    private List<Player> players;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "founderId")
    private Founder founder;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH})
    @JoinTable(name = "team_esport",joinColumns = @JoinColumn(name = "teamId")
            , inverseJoinColumns =@JoinColumn(name = "esportId") )
    private List<Esport> esports;


    public Team(String name) {
        this.name = name;
    }

    public Team() {

    }


    public void addPlayer(Player player) {
        if (players == null) {
            players = new ArrayList<>();
        }
        players.add(player);
        player.setTeam(this);
    }

    public void removePlayer(Player player)
    {
        if(players ==null){
            System.out.println("EMPTY");
        }
        players.remove(player);
        player.setTeam(null);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Founder getFounder() {
        return founder;
    }

    public void setFounder(Founder founder) {
        this.founder = founder;
    }

    public List<Esport> getEsports() {
        return esports;
    }

    public void setEsports(List<Esport> esports) {
        this.esports = esports;
    }
}
