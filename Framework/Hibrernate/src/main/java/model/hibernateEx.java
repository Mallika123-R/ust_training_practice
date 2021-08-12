package model;

import javax.persistence.*;

public class hibernateEx {
    //import javax.persistence.*;

    @Entity
    @Table(name = "customer")
    public class Customer {
        @Id  // Specifies the primary key of an entity.
        @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
        private int id;
        @Column(name = "name")
        private String name;
        @Column(name = "phone")
        private long phone;
        @Column(name = "city")
        private String city;

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

        public long getPhone() {
            return phone;
        }

        public void setPhone(long phone) {
            this.phone = phone;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
}
