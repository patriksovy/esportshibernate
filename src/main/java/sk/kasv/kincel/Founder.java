package sk.kasv.kincel;

import jakarta.persistence.*;


    @Entity
    @Table(name = "founder")
    public class Founder {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

        @Column(name = "name")
        private String name;

        public Founder(String name) {
            this.name = name;
        }

        public Founder(){

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
    }
