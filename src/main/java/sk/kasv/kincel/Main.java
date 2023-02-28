package sk.kasv.kincel;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileNotFoundException;
import java.sql.SQLException;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws SQLException, FileNotFoundException {

        RunScript.runSqlScripts();

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Team.class)
                .addAnnotatedClass(Player.class)
                .addAnnotatedClass(Founder.class)
                .addAnnotatedClass(Esport.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {

            //Create a team

//            session.beginTransaction();
//            Team team=new Team("G2 Esports");
//            session.persist(team);
//            Player player1=new Player("Matthew \"Nadeshot\" Haag");
//            Player player2=new Player("Carlos \"Ocelote\" Rodríguez Santiago");
//            team.addPlayer(player1);
//            team.addPlayer(player2);
//            Founder founder=new Founder("Sam Mathews");
//            team.setFounder(founder);
//            Esport esport=session.get(Esport.class,5);
//            esport.addTeam(team);
//            session.getTransaction().commit();


//            //Remove a player
//
//            session.beginTransaction();
//            Team team=session.get(Team.class,1);
//            session.persist(team);
//            Player player=session.get(Player.class,2);
//            team.removePlayer(player);
//            session.delete(player);
//            session.getTransaction().commit();


//            //Update a team
//
//            session.beginTransaction();
//            Team team=session.get(Team.class,1);
//            team.setName("Evil Geniuses");
//            session.getTransaction().commit();


//            //Delete a team
//
//            session.beginTransaction();
//            Team team=session.get(Team.class,1);
//            session.remove(team);
//            session.getTransaction().commit();



//            //Create founder
//
//            session.beginTransaction();
//            Team team=session.get(Team.class,4);
//            Founder founder=new Founder("Alexander Garfield");
//            team.setFounder(founder);
//            session.getTransaction().commit();

//            //Update founder
//
//            session.beginTransaction();
//            Founder founder=session.get(Founder.class,3);
//            founder.setName("Mike \"hastr0\" Rufail");
//            session.getTransaction().commit();

//
//            //Delete a team and related entities
//
//            session.beginTransaction();
//            Team team=session.get(Team.class,1);
//            session.remove(team);
//            session.getTransaction().commit();



//            //Create an esport for a team
//
//            session.beginTransaction();
//            Team team=session.get(Team.class,4);
//            Esport esport=new Esport("FIFA");
//            session.persist(esport);
//            esport.addTeam(team);
//            session.getTransaction().commit();


//            //Read esport and assign it to a team
//
//            session.beginTransaction();
//            Team team=session.get(Team.class,4);
//            Esport esport=session.get(Esport.class,6);
//            esport.addTeam(team);
//            session.getTransaction().commit();


//            //Update an esport
//
//            session.beginTransaction();
//            Esport esport=session.get(Esport.class,6);
//            esport.setName("Madden");
//            session.getTransaction().commit();


//            //Delete an esport
//
//            session.beginTransaction();
//            Esport esport=session.get(Esport.class,6);
//            session.remove(esport);
//            session.getTransaction().commit();



        } finally {
            session.close();
        }
    }
}
